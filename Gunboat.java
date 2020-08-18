import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter discance to target: \n");
    double d = reader.nextDouble();
    System.out.println("Enter height of battery: \n");
    double h = reader.nextDouble();
    System.out.println("Enter velocity of projectile: \n");
    double v = reader.nextDouble();

    double a = -4.9*(d/v)*(d/v);
    double b = d;
    double c = a + h;
    
    double tanTheta = (-b + Math.sqrt((b*b) - (4*a*c)))/(2*a);
    double angle = Math.atan(tanTheta)*180/Math.PI;
    System.out.println(angle);

  }
}