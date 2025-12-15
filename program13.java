import java.util.Scanner;
class MangoOffer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int bought=sc.nextInt();
        int price=sc.nextInt();
int free=bought / 3;
        System.out.println("Total Mangoes = " + (bought + free));
        System.out.println("Amount to Pay = " + (bought * price));
    }
}

