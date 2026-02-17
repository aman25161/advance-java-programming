package lambdaExpression;
interface Calc{
    void calculate(int n1, int n2);
}
public class MainFunctionalInterface {
    public static void main(String[] args){
        Calc a=(int n1,int n2)->{
            //int num1=10,num2=30;
            System.out.println("Sum is : "+(n1+n2));
        };
        a.calculate(10,30);
    }
}
