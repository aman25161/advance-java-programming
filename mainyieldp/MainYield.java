package mainyieldp;
import java.util.*;
public class MainYield {
    public static void main(String[] args){
        int day=1;
        String result=switch(day){
            case 1,4,5 -> {
                System.out.println("this is 1,4,5");
                yield "Monday";  //yield means return in switch
            }
            case 2 -> "Tuesday";
            default -> "No-Day";
        };
        System.out.println(result);
    }
}
