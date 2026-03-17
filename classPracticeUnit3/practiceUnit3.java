package classPracticeUnit3;

import java.util.ArrayList;
import java.util.List;

public class practiceUnit3 {
    public static void main(String [] args){
        List<Integer> list=new ArrayList<>();
        list.addAll(List.of(10,15,20,25,30,11,17,16));
        List<Integer>res=list.stream().filter((n)->n%2==0).toList();
        System.out.print(res);
        List<String> st=new ArrayList<>();
        st.addAll(List.of("Amit","Ravi","Anil","Vikas","Ashok","Rahul"));
        List<String> str=st.stream().filter((n)->n.charAt(0)=='A').toList();
        System.out.print(str);
        List<Integer> l = new ArrayList<>();
        l.addAll(List.of(10,60,45,90,30,24,50,76));
        list.stream().filter((n)->n>50 && n<=60).forEach(System.out::println);
        List<String> ll=new ArrayList<>();
        ll.addAll(List.of("Java","Python","C","React","C#","Next.js","Node.js"));
        ll.stream().filter((n)->n.length()>4).forEach(System.out::println);
        List<String> lli=new ArrayList<>();
        lli.addAll(List.of("Java",null,"Python","C","React","C#","Next.js","Node.js"));
        List<String> result=new ArrayList<>();
        result=lli.stream().filter((n)->n!=null).toList();
        System.out.println(result);
    }
}
