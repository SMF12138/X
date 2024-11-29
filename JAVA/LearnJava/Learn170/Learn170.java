package NewLearn.Learn170;

import java.io.File;
import java.lang.reflect.Field;

public class Learn170 {
    private static String classpathRoot;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        //扫描类路径中所有文件，找到.class结尾的文件，获取其全限定类名
        classpathRoot = Thread.currentThread().getContextClassLoader().getResource(".").getPath();
        System.out.println("类路径的根" + classpathRoot);
        File file = new File(classpathRoot);
        generateCreateStatement(file);//自定义建表函数
        System.out.println(sb);
    }

    private static void generateCreateStatement(File file) {
        if (file.isFile()) {//file如果是文件则递归结束
            String classFileAbsolutePath = file.getAbsolutePath();
            if (classFileAbsolutePath.endsWith(".class")) {//判断路径是否以.class结尾
                String classname = classFileAbsolutePath.substring(classpathRoot.length() - 1, classFileAbsolutePath.length() - ".class".length()).replace("\\", ".");
                //截取修改字符串，获得全限定类名
                try {
                    Class<?> clazz = Class.forName(classname);
                    if (clazz.isAnnotationPresent(Table.class)) {//判断是否有指定注解
                        Table tableAnnotation = clazz.getAnnotation(Table.class);
                        String tableName = tableAnnotation.value();
                        sb.append("create table");
                        sb.append(tableName);
                        sb.append("(");
                        Field[] fields = clazz.getDeclaredFields();//获取所有字段
                        for (Field field : fields) {
                            if (field.isAnnotationPresent(Column.class)) {//判断字段上是否存在指定注解
                                Column columnAnnotation = field.getAnnotation(Column.class);
                                String columnName = columnAnnotation.name();//获取字段注解的名字和类型
                                String columnType = columnAnnotation.type();
                                sb.append(columnName);
                                sb.append(" ");
                                sb.append(columnType);
                                sb.append(",");
                            }
                        }
                        sb.deleteCharAt(sb.length() - 1);
                        sb.append(");\n");

                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
            return;
        }
        File[] files = file.listFiles();//获取所有子文件
        for (File f : files) {
            generateCreateStatement(f);
        }
    }
}
