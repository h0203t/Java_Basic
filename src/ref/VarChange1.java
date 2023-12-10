package ref;

public class VarChange1 {

    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a = " + a + " b = " + b);

        a = 20;

        System.out.println("a변경");
        System.out.println("a = " + a + " b = " + b);

        b = 30;

        System.out.println("b변경");
        System.out.println("a = " + a + " b = " + b);



    }
}
