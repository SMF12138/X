package NewLearn.Learn179;

public class Learn179 {
    public static void main(String[] args) {
        MoreParameterHasReturn moreParameterHasReturn = new MoreParameterHasReturn() {
            @Override
            public Integer test(Integer value1, Integer value2) {
                return value1 + value2;
            }
        };
        moreParameterHasReturn.test(300, 400);

        MoreParameterHasReturn mh = (Integer value1, Integer value2) -> {
            return value1 + value2;
        };
        mh.test(300, 400);

        MoreParameterHasReturn mh2 = (value1, value2) -> value1 + value2;
        //表达式中形参可以同时全部省略，只有一个形参小括号也可省略
        //方法体只有一行语句可以省略大括号，如果为return语句省略时必须去掉return关键字
    }

    @FunctionalInterface
    interface MoreParameterHasReturn {
        Integer test(Integer value1, Integer value2);
    }
}

