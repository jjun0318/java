import java.util.Scanner;

public class ThreeSixNine {
    public static void main(String[] args) {
        String [] eng = {"student", "love", "java", "happy", "future"};
        String [] kor = {"학생", "사랑", "자바", "행복한", "미래"};

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("영어 단어를 입력하세요");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
