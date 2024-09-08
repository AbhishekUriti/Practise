package Encapsulation;


//wrapping up of data and methods into the single unit
// 1.All variables should be private
// 2.for every variable there should be 2 methods(get & set)
// 3.variables can be operated only through methods.
public class encaps {
    private int accno;
    private  String name;
    private double amount;

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        encaps acc=new encaps();
        acc.setAccno(2000);
        System.out.println(acc.getAccno());
    }
}


//The this keyword refers to the current object in a method or constructor. The most common use of the this keyword is to eliminate the
// confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).The this keyword refers to the current object in a method or constructor. The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).