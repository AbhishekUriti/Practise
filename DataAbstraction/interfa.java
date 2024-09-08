package DataAbstraction;

interface Shape{
    int length=10;
    int width=20;
    void Circle();

    default void square(){
        System.out.println("this is square - default method");
    }
    static void rectangle(){
        System.out.println("this is rectangle - static method");
    }
}

public class interfa implements Shape{
  public void Circle(){
        System.out.println("this is circle - abstract method...");
    }
    void triangle(){
        System.out.println("this is triangle");
    }
    public static void main(String[] args) {
//        interfa idobj=new interfa();
//        idobj.Circle();
//        idobj.square();
//        Shape.rectangle();
        Shape sh=new interfa();
        sh.Circle();
        sh.square();
        Shape.rectangle();
        System.out.println(Shape.length*Shape.width);
    }
}
