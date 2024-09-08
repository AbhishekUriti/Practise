package Day2Methods;
//block or group of statements which will perform certain task.
//we have to call the method through object

//Constructor in java is used to create the instance of the class.
// Constructors are almost similar to methods except for two things -
// its name is the same as the class name and it has no return type.
// Sometimes constructors are also referred to as special methods to initialize an
// object.
///Constructor name should be same as class name
//
public class met {
    int sid;
    String sname;
    char grad;

    void printStudentData(){
        System.out.println(sid+" "+sname+" "+grad);
    }

   void setStudentData(int id,String name,char gr){
        sid=id;
        sname=name;
        grad=gr;
   }

    public met(int sid, String sname, char grad) {
        this.sid = sid;
        this.sname = sname;
        this.grad = grad;
    }

    public static void main(String[] args) {
        met stu=new met(100,"Abhishek",'A');
//        stu.setStudentData(100,"Abhishek",'A');
        stu.printStudentData();

        met std=new met(110,"Abhishek",'B');
        std.printStudentData();
    }
}
