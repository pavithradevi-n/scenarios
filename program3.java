import java.util.Scanner;
class SplitBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double bill=sc.nextDouble();
        double share=bill / 3;
      System.out.println("Each friend pays = " + share);
    }
}
