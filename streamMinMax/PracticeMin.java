package streamMinMax;

import java.util.*;

public class PracticeMin {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,5,40,15,35));
        List<Integer> sortedList=list.stream().sorted((a,b)->a-b).toList();
        Optional<Integer> res=sortedList.stream().min((a, b)->a-b);
        res.ifPresent(System.out::println);
        List<Integer> sortedDesc=list.stream().sorted((a,b)->b-a).toList();
        Optional<Integer> resDesc=sortedDesc.stream().min((a,b)->b-a);
        resDesc.ifPresent(System.out::println);
        Optional<Integer> resDescSec=sortedList.stream().limit(2).min((a,b)->b-a);
        resDescSec.ifPresent(System.out::println);
        Optional<Integer> resAscSec=sortedDesc.stream().limit(2).min((a,b)->a-b);
        resAscSec.ifPresent(System.out::println);
        List<Integer> li=list.stream().sorted(Comparator.reverseOrder()).skip(2).toList();
        System.out.println(li);
        Optional<Integer> multiply3=list.stream().map(n->n*3).min(Integer::compare);
        multiply3.ifPresent(System.out::println);
        list.stream().map(n->n*n).limit(4).toList().forEach(System.out::println);
        Optional<Integer> minOdd=list.stream().filter((n)->n>20).filter((n)->n%2!=0).min(Integer::compare);
        minOdd.ifPresent(System.out::println);

    }
}
