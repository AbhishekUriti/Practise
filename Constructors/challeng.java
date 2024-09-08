package Constructors;

public class challeng {
    private String name;
    private int creditLimit;
    private String emailaddress;

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public challeng(String name, int creditLimit, String emailaddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailaddress = emailaddress;
    }

    public challeng() {
        this("Msd",50000,"xyz@gmail.com");
    }

    public challeng(String name, String emailaddress) {
        this(name,100000,emailaddress);
    }

    public static void main(String[] args) {
        challeng customers=new challeng("Dhoni",600000,"abc@gmail.com");
        System.out.println(customers.getName());
        System.out.println(customers.getCreditLimit());
        System.out.println(customers.getEmailaddress());
        challeng cust=new challeng();
        System.out.println(cust.getCreditLimit());
        System.out.println(cust.getEmailaddress());
        System.out.println(cust.getName());
        challeng mahi=new challeng("sachin","sachin@123jkk");
        System.out.println(mahi.getName());
        System.out.println(mahi.getEmailaddress());
        System.out.println(mahi.getCreditLimit());
    }
}
