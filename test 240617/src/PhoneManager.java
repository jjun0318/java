import java.util.Scanner;

public class PhoneManager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("이름과 전화번호(번호는 연속적으로 입력)");
        String name1 = scanner.next();
        String tel1 = scanner.next();
        Phone phone1 = new Phone(name1, tel1);

        System.out.print("이름과 전화번호(번호는 연속적으로 입력)");
        String name2 = scanner.next();
        String tel2 = scanner.next();
        Phone phone2 = new Phone(name2, tel2);

        System.out.print("이름과 전화번호(번호는 연속적으로 입력)");
        String name3 = scanner.next();
        String tel3 = scanner.next();
        Phone phone3 = new Phone(name3, tel3);
    }
}
