package NewLearn.Learn78;

public enum Season implements Eatable {
    SPRING("春", "百花齐放") {
        @Override
        public void eat() {
            System.out.println("吃苹果");
        }
    },//枚举的构造方法不用new调用，并且只能在本类中调用
    SUMMER("夏", "天台闷热") {
        @Override
        public void eat() {
            System.out.println("吃西瓜");
        }
    },
    AUTUMN("秋", "秋高气爽") {
        @Override
        public void eat() {
            System.out.println("吃牛牛");
        }
    },
    WINTER("冬", "白雪皑皑") {
        @Override
        public void eat() {
            System.out.println("吃蛋蛋");
        }
    };

    static {
        System.out.println("枚举类型的静态代码块");
    }

    {
        System.out.println("构造代码块执行了");
    }

    private final String name;
    private final String desc;

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    //枚举可以像类一样写各种方法
    public final static int A = 10;
    private final int b = 10;

    public static int getA() {
        return A;
    }

    public int getB() {
        return b;
    }

    Season(String name, String desc) {//构造方法，默认是私有
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void eat() {
        System.out.println("吃啥都行");
    }//重写也可在各枚举值中单独实现
}
