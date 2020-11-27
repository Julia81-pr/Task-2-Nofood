import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Bmi service = new Bmi();
        Scanner x = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double weight = x.nextDouble();

        System.out.println("Enter your height: ");
        double height = x.nextDouble();

        double index = service.calculate(weight, height);
        System.out.println("Your body mass index is: " + index);




    }
}
