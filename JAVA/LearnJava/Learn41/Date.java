package NewLearn.Learn41;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        this(1970,1,1);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return this.year+"年"+this.month+"月"+this.day+"日";
    }

    @Override
    public boolean equals(Object obj) {//这里用Object型不用Data型是重写需要与父类一致
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        /**
         * 上面这两个判断是视频里的，本人感觉没什么必要
         */
        if (obj instanceof Date){
            Date d = (Date)obj;
            return year==d.year&&month==d.month&&day==d.day;
        }
        return false;
    }
}
