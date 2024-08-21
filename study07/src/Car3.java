public class Car3 {

//    기존에는 Tire 클래스 타입의 변수와 객체를 각각 4개 생성
//    비슷한 데이터를 여러개 사용하므로 배열을 선언하여 사용하는 것이 효과적
    
//    Tire 클래스 타입의 배열 tires를 선언
    Tire[] tires = {
            new Tire("앞왼쪽", 6),
            new Tire("앞오른쪽", 2),
            new Tire("뒤왼쪽", 3),
            new Tire("뒤오른쪽", 4)
    };

    int run() {
        System.out.println("[자동차가 달립니다.]");

//        기존에는 if문을 4번 실행, for문을 사용하여 if문 반복 실행
                for(int i = 0; i < tires.length; i++) {
                    if (tires[i].roll() == false) {
                        stop();
                        return (i + 1);
                    }
                }
                return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
