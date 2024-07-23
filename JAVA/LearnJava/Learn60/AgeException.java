package NewLearn.Learn60;

public class AgeException extends Exception{//自定义异常比Exception编译型异常的划分更细
    public AgeException() {
        super();//调用父类无参构造直到最高级
    }

    public AgeException(String message) {
        super(message);
    }
}
