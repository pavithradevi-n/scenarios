import java.util.Scanner;
class Candies {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
int candies=sc.nextInt();
        int students=sc.nextInt();
System.out.println("Each gets = " + (candies / students));
System.out.println("Remaining = " + (candies % students));
    }
}
