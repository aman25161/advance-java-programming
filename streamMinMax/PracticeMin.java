package streamMinMax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PracticeMin {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,5,40,15));
        List<Integer> sortedList=list.stream().sorted((a,b)->a-b).toList();
        Optional<Integer> res=sortedList.stream().min((a, b)->a-b);
        res.ifPresent(System.out::println);
        List<Integer> sortedDesc=list.stream().sorted((a,b)->b-a).toList();
        Optional<Integer> resDesc=sortedDesc.stream().min((a,b)->b-a);
        resDesc.ifPresent(System.out::println);
    }
}
