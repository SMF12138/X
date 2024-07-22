package NewLearn.Learn59;

public class AgeException extends Exception{
    public AgeException() {
        super();//调用父类无参构造直到最高级
    }

    public AgeException(String message) {
        super(message);
    }
}
