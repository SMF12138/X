package NewLearn.Learn166;

public class Learn166 {
    public static void main(String[] args) {

    }
}

@Deprecated(since = "9",forRemoval = true)//已过时注解，不建议使用，从9开始过时，true表示已移除
class M implements MM {
    @Deprecated//变量方法皆可标注
    public static int n;
    @Deprecated
    @Override//必须重写父类，只用于实例方法
    @SuppressWarnings("all")//抑制所有警告，不建议使用，此外还有抑制未使用泛型("rawtypes")，抑制未关闭资源("resource")，抑制使用已过时资源("deprecation")警告等
    public void M(){

    }
}