package streamApi;

import java.util.*;
import java.util.stream.Stream;
import java.util.function.Consumer;
public class FilterAPI {
    public static void main(String[] args){
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.addAll(List.of(23,56,77,56,55));
//        System.out.println(list);
//        Stream listStream= list.stream();
//        listStream.forEach((element)-> System.out.print(element+" "));
//        list.stream().forEach(System.out::println);
        ArrayList<String> list=new ArrayList<>();
        list.add("aman");
        list.add("ayush");
        list.addAll(List.of("aditya","mohit"));
        list.stream().forEach(System.out::println);
        list.forEach((element)-> System.out.print(element+" "));
    }
}
