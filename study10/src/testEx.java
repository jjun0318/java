import java.util.Scanner;

public class testEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요");
        String input = sc.nextLine();

        String [] numbers = input.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        int sum = a + b;

        System.out.print(a + " + " + b + " 은 " + sum);
    }
}
