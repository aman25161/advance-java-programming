package Practice;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private int sid;
    private String name;
    private String mobile;
    private String course;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
public class StudentMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student st;
        ArrayList<Student> list = new ArrayList<>();
        for(int i=0;i<2;i++){
            st=new Student();
            st.setSid(sc.nextInt());
            sc.nextLine();
            st.setName(sc.nextLine());
            st.setMobile(sc.nextLine());
            st.setCourse(sc.nextLine());
            list.add(st);
        }
        for(Student s : list){
            System.out.println(s.toString());
        }
    }
}
