package lambdaExpression;
@FunctionalInterface
interface Calc{
    //void calculate(int n1, int n2);
    //int square(int n1);
    //String square(int n1);
    void calculate(int n1);
}
public class MainFunctionalInterface {
    public static void main(String[] args){
        Calc a = n1 -> {
            if(n1>=18){
                System.out.println("You can vote");
            }else{
                System.out.println("You cannot vote");
            }
        };
        a.calculate(30);
    }
}
