package NewLearn.Learn78;

public class Learn78 {
    public static void main(String[] args) {
        Season season = get();
        switch (season) {
            case SPRING -> {
                System.out.println("春");
                System.out.println(Season.SPRING.getDesc());
            }
            case SUMMER -> {
                System.out.println("夏");
                System.out.println(Season.SUMMER.getDesc());
            }
            case AUTUMN -> {
                System.out.println("秋");
                System.out.println(Season.AUTUMN.getDesc());
            }
            case WINTER -> {
                System.out.println("冬");
                System.out.println(Season.WINTER.getDesc());
            }
        }
        Season[] seasons = Season.values();//获得枚举值
        for (Season s : seasons) {
            System.out.println(s.getName() + s.getDesc());
            s.eat();
        }
    }

    private static Season get() {
        return Season.AUTUMN;//通过枚举类型返回值使代码更加清晰，避免返回错误值
    }
}
