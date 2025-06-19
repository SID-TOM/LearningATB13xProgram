package Test_19June;

public class ArithmaticOperations {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("a+b="+(a+b));
        System.out.println("b-a="+(b-a));
        System.out.println("a*b="+(a*b));
        System.out.println("b/a="+(b/a));
        System.out.println("b%a="+(b%a));

        //Assignment Operators below

        int x =10;
        System.out.println("x="+x);

        x +=5;
        System.out.println("x after +=5:" +x);

        x -=3;
        System.out.println("x after -=3:" +x);

        x *=2;
        System.out.println("x after *2:" +x);

        x /=2;
        System.out.println("x after /=2:" +x);
    }
}
