import java.util.Scanner;
class Salary {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  double basic=sc.nextDouble();
        double hra=sc.nextDouble();
        double allowance=sc.nextDouble();
   double salary=basic + hra + allowance;
        System.out.println("Total Salary = " + salary);
    }
}

