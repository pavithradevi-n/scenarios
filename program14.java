import java.util.Scanner;
class PenOffer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int pens=sc.nextInt();
        int price=sc.nextInt();
int free=(pens / 5) * 2;
        int payFor=pens - free;
System.out.println("Pens to Pay = " + payFor);
        System.out.println("Total Cost = " + (payFor * price));
    }
}
