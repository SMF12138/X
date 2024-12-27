package NewLearn.Learn197;

public class Learn197 {
    public static void main(String[] args) {
        //Java15新增密封类，密封接口
    }
}

sealed class T implements A permits T1, T2, T3 {//只允许某些子类继承

}

non-sealed class T1 extends T {//子类必须加修饰符，表示不密封

}

final class T2 extends T {//子类必须加修饰符，表示不继承

}

sealed class T3 extends T permits T4 {//子类必须加修饰符，表示允许继承

}

non-sealed class T4 extends T3 {

}

sealed interface A permits T, B {
}//只允许T实现这个接口，但是如果使用密封则必须实现

record B() implements A{

}//record默认被final修饰因此可以做密封接口的实现类，但不能继承别的(密封)类因为已经继承了Record(Java只支持单继承)