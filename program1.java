import java.util.Scanner;
class Discount {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double price = sc.nextDouble();
            double discountPercent = sc.nextDouble();
            double discount = (price * discountPercent) / 100;
            double finalPrice = price - discount;
            System.out.println("Final Price = " + finalPrice);
        }
    }
}
