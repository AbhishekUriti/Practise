package Constructors;

public class staticvariables {
    static String genes="canis";
    void printData(){
        staticvariables d=new staticvariables();
        System.out.println(staticvariables.genes);
    }

    public static void main(String[] args) {
        staticvariables st=new staticvariables();
        st.printData();
    }
}
