interface Area{
    double pi=3.14;
    double getArea();
}

class Circle implements Area{
    double r;
    Circle(double r){
        this.r=r;
    }
    public double getArea(){
        double res=pi*r*r;
        return res;
    }
}
public class AreaMain {
    public static void main(String[] args){
        Circle c= new Circle(5.6);
        System.out.println("Area of circle = "+c.getArea());
        Area rectangle = new Area() {
            int l=10,b=40;
            @Override
            public double getArea() {
                return (l*b);
            }
        };
        System.out.println("Area of rectangle = "+rectangle.getArea());
    }
}
