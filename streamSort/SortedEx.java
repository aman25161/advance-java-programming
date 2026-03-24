package streamSort;
import java.util.*;
public class SortedEx {
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(23,13,12,56,33,22,11);
        System.out.println(list);
        List<Integer> sortedList=list.stream().sorted().toList();
        List<Integer> sortedDescList=list.stream().sorted((a,b)->b-a).toList();
        System.out.println(sortedList);
        System.out.println(sortedDescList);
    }
}
