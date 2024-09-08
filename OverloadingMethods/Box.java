package OverloadingMethods;

public class Box {
    double width,height,depth;
    Box(){
        width=height=depth=0;
    }
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    Box(double len){
        width=height=depth=len;
    }
    double volume(){
        return width*height*depth;
    }

    public static void main(String[] args) {
        Box b=new Box();
        Box b1=new Box(28.9,30.0,56.7);
        System.out.println(b1.volume());
    }
}
