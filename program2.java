import java.util.Scanner;
class MinutesToSeconds {public static void main(String[] args) {

        try (Scanner sc=new Scanner(System.in)) {
            int minutes=sc.nextInt();
            int seconds=minutes * 60;
    System.out.println("Seconds = " + seconds);
        }
    }
}
