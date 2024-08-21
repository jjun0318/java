import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- 문제 1)-----");
//        Song 클래스 타입의 객체 mySong 생성
        Song mySong = new Song("Nessun Dorma");
//        Song 클래스 타입의 객체 yourSong 생성
        Song yourSong = new Song("공주는 잠 못 이루고");
//        객체 mySong의 인스턴스 멤버 중 getTitle() 메소드를 사용
        System.out.println("내 노래는 " + mySong.getTitle());
        System.out.println("너 노래는 " + yourSong.getTitle());


        System.out.println("\n ----- 문제2) -----\n");
//        화면 출력이 먼저, 화면 출력 후 바로 뒤에 입력해야 하기 때문에 print() 사용
        System.out.print("이름과 전화번호 입력 >> ");
//        키보드 입력 받기
        String name = sc.next();
        String tel = sc.next();
//        입력받은 내용을 기반으로 Phone 클래스 타입의 객체 생성
        Phone Phone1 = new Phone(name, tel);

        System.out.print("이름과 전화번호 입력 >> ");
//        위에 이미 선언한 변수 재활용
        name = sc.next();
        tel = sc.next();
//        입력받은 내용을 기반으로 Phone 클래스 타입의 두번째 객체 생성
        Phone Phone2 = new Phone(name, tel);

        System.out.println(Phone1.getName() + "의 전화번호 : " + Phone1.getTel());
        System.out.println(Phone2.getName() + "의 전화번호 :  " + Phone2.getTel());


        System.out.println("\n ----- 문제3) -----\n");
//        Rect 클래스 타입의 배열 rect 생성, new Rect[4]를 사용하여 크기가 4인 배열 생성
//        Rect 클래스 타입의 배열을 생성한 것이지 Rect 클래스 타입의 객체를 생성한 것은 아님,
//        Rect 클래스 타입의 배열 요소는 현재 모두 null 임
        Rect [] rect = new Rect[4];

        for (int i = 0; i < 4; i++) {
        System.out.print("너비와 높이 >> ");
//        nextInt() 를 사용하여 키보드 입력을 정수로 받음
        int width = sc.nextInt();
        int height = sc.nextInt();
//        Rect 클래스 타입의 배열의 i번 index에 새로운 Rect 클래스 타입의 객체를 생성하여 저장
        rect[i] = new Rect(width, height);

            if (i + 1 == rect.length) {
                System.out.println("저장하였습니다.");
            }
        }

//        총합을 저장할 변수 선언
        int total = 0;
        
//        for문을 통해서 Rect 클래스 타입의 배열이 가지고 있는 모든 데이터 출력
        for (int i = 0; i < 4; i++) {
            total = total + rect[i].getArea();
        }
        System.out.println("사각형의 전체 합은 : " + total);

        System.out.println("\n ----- 문제4) -----\n");


        System.out.println("\n ----- 문제5) -----\n");


        System.out.println("\n ----- 문제6) -----\n");


    }
}
