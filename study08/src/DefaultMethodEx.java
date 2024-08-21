public class DefaultMethodEx {
    public static void main(String[] args) {

        MyInterface mi1 = new MyClassA();
        mi1.myMethod1();
        mi1.myMethod2();

        System.out.println();

        MyInterface mi2 = new MyClassB();
        mi2.myMethod1();
        mi2.myMethod2();
    }
}
