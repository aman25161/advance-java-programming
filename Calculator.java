class Sum{
    void sum(int x,int y){
        int s=x+y;
        System.out.println("Sum is : "+s);
    }
}
class Multiply{
    int x,y;
    Multiply(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println("Product is : "+ (x*y));
    }
}
public class Calculator {
    public static void main(String[] args){
        Sum obj = new Sum();
        obj.sum(5,6);
        Multiply m= new Multiply(5,6);
    }
}
