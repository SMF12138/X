package NewLearn.Learn178;

public class Learn178 {
    public static void main(String[] args) {
        NoParameterNoReturn noParameterNoReturn = new NoParameterNoReturn() {
            @Override
            public void test() {
                System.out.println("无返回值无参数的方法执行了");
            }
        };
        noParameterNoReturn.test();

        NoParameterNoReturn np = () -> {
            System.out.println("无返回值无参数的方法执行了");
        };
        np.test();

        OneParameterNoReturn oneParameterNoReturn = new OneParameterNoReturn() {
            @Override
            public void test(Integer value) {
                System.out.println(value);
            }
        };
        oneParameterNoReturn.test(1000);

        OneParameterNoReturn op = (Integer value) -> {
            System.out.println(value);
        };

        MoreParameterNoReturn moreParameterNoReturn = new MoreParameterNoReturn() {
            @Override
            public void test(Integer value1, Integer value2) {
                System.out.println(value1 + value2);
            }
        };
        moreParameterNoReturn.test(100, 200);

        MoreParameterNoReturn mp = (Integer value1, Integer value2) -> {
            System.out.println(value1 + value2);
        };
        mp.test(300, 400);

        NoParameterHasReturn noParameterHasReturn = new NoParameterHasReturn() {
            @Override
            public Integer test() {
                return 300;
            }
        };
        noParameterHasReturn.test();

        NoParameterHasReturn hr = () -> {
            return 300;
        };
        hr.test();

        OneParameterHasReturn oneParameterHasReturn = new OneParameterHasReturn() {
            @Override
            public Integer test(Integer value) {
                return value;
            }
        };
        oneParameterHasReturn.test(300);

        OneParameterHasReturn oh = (Integer value) -> {
            return value;
        };
        oh.test(300);

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
    }

    @FunctionalInterface
    interface NoParameterNoReturn {
        void test();
    }

    @FunctionalInterface
    interface OneParameterNoReturn {
        void test(Integer value);
    }

    @FunctionalInterface
    interface MoreParameterNoReturn {
        void test(Integer value1, Integer value2);
    }

    @FunctionalInterface
    interface NoParameterHasReturn {
        Integer test();
    }

    @FunctionalInterface
    interface OneParameterHasReturn {
        Integer test(Integer value);
    }

    @FunctionalInterface
    interface MoreParameterHasReturn {
        Integer test(Integer value1, Integer value2);
    }
}