package inheritance;

//acquiring all the properties and behaviour from one class to another
//objective
//re-usability
//Avoid duplication

//types
//1.single
//2.multi level
//3.hierarchy
//4.multiple


//The extends keyword extends a class (indicates that a class is inherited from another class).
// In Java, it is possible to inherit attributes and methods from one class to another.
// We group the "inheritance concept" into two categories: subclass (child) - the
// class that inherits from another class.
class A{
    int a=100;
    void display(){
        System.out.println(a);
    }
}

class B extends A{
    int b=200;
    void show(){
        System.out.println(b);
    }
}

class C extends B{
    int c=300;
    void print(){
        System.out.println(c);
    }
}

public class PassingParams {
    public static void main(String[] args) {
//            B b=new B();
//        System.out.println(b.a);
//        System.out.println(b.b);
//        b.display();
//        b.show();
        C cobj=new C();
        System.out.println(cobj.a);
        cobj.show();
        cobj.display();
        }
    }

