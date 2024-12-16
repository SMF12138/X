package NewLearn.Learn186;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public static List<Student> getStudents(){
        List<Student> studentList =new ArrayList<>();
        studentList.add(new Student("1",1,"1"));
        studentList.add(new Student("2",2,"2"));
        studentList.add(new Student("3",3,"3"));
        return studentList;
    }
}
