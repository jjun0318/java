// 인터페이스로 선언한 MyInterface
public interface MyInterface {

//    추상 메소드 선언
//    상속받는 클래스에서 반드시 오버라이딩 해야 함
    public void myMethod1();

//    디폴트 메소드 선언
//    상속받는 클래스에서 필요시에 오버라이딩 가능
//    public abstract void MyMethod2() {
    public default void myMethod2() {
        System.out.println("myMethod2 - method2() 호출");
    }
}
