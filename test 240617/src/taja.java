import java.util.Scanner;

public class taja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 >> ");
        String taja1 = sc.nextLine();
        String replacedTaja1 = taja1.replaceAll("q", "e");
        System.out.println("출력 >> " + replacedTaja1);

        System.out.print("입력 >> ");
        String taja2 = sc.nextLine();
        String replacedTaja2 = taja2.replaceAll("q", "e");
        System.out.println("출력 >> " + replacedTaja2);
    }
}
