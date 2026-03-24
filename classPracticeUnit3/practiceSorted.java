package classPracticeUnit3;
import java.util.*;
class Employee{
    int eid;
    String name;
    int salary;
    String dept;

    public Employee(int eid, String name, int salary, String dept) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
public class practiceSorted {
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(12,5,33,9,21,1);
        List<Integer> sortAscList=list.stream().sorted((a,b)->a-b).toList();
        List<Integer> descList=list.stream().sorted((a,b)->b-a).toList();
        System.out.println(sortAscList);
        System.out.println(descList);
        List<Integer> top3List=descList.stream().limit(3).toList();
        System.out.println(top3List);
        List<Integer> evenList=list.stream().filter((n)->n%2==0).sorted().toList();
        System.out.println(evenList);
        List<Integer> removeDuplicate=list.stream().distinct().sorted().toList();
        System.out.println(removeDuplicate);
        int secondHighest=descList.stream().sorted((a,b)->b-a).toList().get(1);
        System.out.println(secondHighest);
        List<String> names=Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal","Akhilesh Kumar yadav");
        List<String> sortName=names.stream().sorted().toList();
        System.out.println(sortName);
        List<String> revnam=names.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(revnam);
        List<String> lengthSort=names.stream().sorted((a,b)->b.length()-a.length()).toList();
        System.out.println(lengthSort);
        List<Integer> fiveDivList=list.stream().filter((n)->n%5==0).sorted().toList();
        System.out.println(fiveDivList);
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(1,"Rahul",20000,"IT"));
        employeeList.add(new Employee(2,"Ayush",40000,"Testing"));
        employeeList.add(new Employee(3,"Akshilesh",30000,"Developer"));
        List<Employee> elist=employeeList.stream().sorted((e1,e2)->e1.salary- e2.salary).toList();
        System.out.println(elist);
    }
}
