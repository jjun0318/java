import java.util.Scanner;

public class CoffeeOrder {
    public static void main(String[] args) {
        int esPrice = 2000;
        int amPrice = 2500;
        int capuPrice = 3000;
        int calaPrice = 3500;

        Scanner scanner = new Scanner(System.in);

        System.out.print("커피 주문하세요 >> ");
        String drink = scanner.next();
        int count = scanner.nextInt();

        int price = 0;

        switch (drink) {
            case "에스프레소" :
                price = esPrice * count;
                break;
            case "아메리카노" :
                price = amPrice * count;
                break;
            case "카푸치노" :
                price = capuPrice * count;
                break;
            case "카페라떼" :
                price = calaPrice * count;
                break;
        }
        System.out.println(price + "원입니다. ");
    }
}
