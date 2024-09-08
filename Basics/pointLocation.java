package Basics;

public class pointLocation {
    public static void main(String[] args) {
        int x1=1;
        int y1=1;
        int x2=5;
        int y2=3;
        int x3=3;
        int y3=2;
        int crosspoint=(x2-x1)*(y3-y1)-(y2-y1)*(x3-x1);
        if(crosspoint>0){
            System.out.println("Left");
        } else if (crosspoint<0) {
            System.out.println("Right");
        }else {
            System.out.println("Touch");
        }
    }
}
