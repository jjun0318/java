import java.util.Scanner;

public class BuildingHeight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int heightFloor = 5;

        System.out.print("몇 층인지 입력하세요 >> ");
        int height = scanner.nextInt();

        int totalHeight = height * heightFloor;
        System.out.println(totalHeight+"m " + "입니다.");
    }
}
