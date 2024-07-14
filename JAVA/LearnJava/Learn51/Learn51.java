package NewLearn.Learn51;

public class Learn51 {
    public static void main(String[] args) {//args作用是接收命令行，供JVM调用
        if(args.length != 2){
            System.out.println("需提供用户名和密码，格式为java NewLearn.Learn51.Learn51(注意有包名所以要在根目录src运行)");
            return;
        }
        //在idea中可以通过编辑配置编辑默认参数
        String username = args[0];
        String password = args[1];
        if ("admin".equals(username) && "admin123".equals(password)){//equals时将变量放到函数内避免空指针异常
            System.out.println("登录成功");
        }else{
            System.out.println("用户名或密码错误");
            return;
        }
    }
}
