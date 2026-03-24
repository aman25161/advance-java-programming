package classPracticeUnit3;
import java.util.*;
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
        int secodHighest=descList.stream().sorted((a,b)->b-a).toList().get(1);
        System.out.println(secodHighest);
    }
}
