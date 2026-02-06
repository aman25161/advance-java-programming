package Polymorphism;
class Animal{
    String name;
    String sound;
    Animal(){
        this("","");
    }
    Animal(String name,String sound){
        this.name=name;
        this.sound=sound;
    }
    void getInfo(){
        System.out.println("Name= "+name);
        System.out.println("Sound= "+sound);
    }
    void getInfo(String name,String sound,int legs){
        System.out.println("Name= "+name);
        System.out.println("Sound= "+sound);
        System.out.println("Legs= "+legs);
    }
}
class Cat extends Animal{
    Cat(String name, String sound){
        super(name,sound);
    }
}
public class PolyMain {
    public static  void main(String args[]){
//        Animal a = new Animal("Horse","hingggg");
//        a.getInfo();
//        a.getInfo("Cat","Meowww",4);
        Cat c1 = new Cat("Cat1","meowww");
        c1.getInfo();
    }
}
