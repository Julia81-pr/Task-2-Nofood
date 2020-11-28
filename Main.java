import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость билета:");
        int price = sc.nextInt();
        int miles = service.calculate(price,20);
        System.out.println("Полученные мили: " + miles);
    }
}

//
