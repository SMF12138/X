package NewLearn.Learn23;

public class Student {
    private String name;
    private String no;
    private Course course;

    public Student(String name, String no) {
        this.name = name;
        this.no = no;
    }

    public Student(String name, String no, Course course) {
        this.name = name;
        this.no = no;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    public void selection(Course course){
        this.setCourse(course);
        System.out.println(this.getName()+"选课成功，课程是"+course.getName());
    }
    public void cancal(){
        System.out.println(this.getName()+"退课成功，课程是"+course.getName());
        this.setCourse(null);
    }
    public void display(){
        if (this.getCourse()==null){
            System.out.println("学号:"+this.getNo()+"，姓名:"+this.getName()+"，还未选课");
        }else {
            System.out.println("学号:"+this.getNo()+" 姓名:"+this.getName()+" 所选课程:"+this.getCourse().getName()+" 授课老师:"+this.getCourse().getTeacher());
        }
    }
}
