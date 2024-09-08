package OverloadingMethods;

//polymorphism
//one thing can have many forms.

// shape -> circle,square,triangle,rectangle
// water -> vapour,ice burgs
//we can achieve polymorphism using overloading
// 4 rules are applicable
// method names should be same
// number of parameters should be different
// data types of parameters should be different
// order of parameters should be different

public class overloading {
    int a=10,b=20;
    void sum(){
        System.out.println(a+b);
    }
    void sum(int x,int y){
        System.out.println(x+y);
    }
    void sum(int x,double y){
        System.out.println(x+y);
    }

    void sum(double x,int y){
        System.out.println(x+y);
    }

    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        overloading adder=new overloading();
        adder.sum(34,67);
    }
}
