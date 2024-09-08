package Day1;

public class Employeemain {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.eid=101;
        employee.ename="john";
        employee.job="Software";
        employee.sal=25000;

        employee.display();
        System.out.println("---------------------------------------------");
        employee.eid=102;
        employee.ename="David";
        employee.job="Engineer";
        employee.sal=56000;
        employee.display();
    }
}
