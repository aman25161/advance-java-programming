import java.util.*;
public class StreamUse {
    public static void main(String[] args){
        int data[] = new int[]{23,45,67};
        List<Integer> list = Arrays.stream(data).boxed().toList();
        System.out.println(list);
        //for each method + lambda
        list.forEach((value)->System.out.println(value));
        //using method referencing
        list.forEach(System.out::println);

    }
}
