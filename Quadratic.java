import java.util.Scanner;
public class Quatratic {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a,b,c,result,root1,root2;
    System.out.println("Enter Number for a,b,c");
    a= input.nextDouble();
    b=input.nextDouble();
    c=input.nextDouble();

    result = b*b- 4.0 * a * c ;
      if(result > 0.0){
        root1 = (-b+ Math.pow (result,0.5)) /(2.0*a);
        root2 = (-b- Math.pow (result,0.5)) /(2.0*a);
        System.out.println("The roots are " + root1 + " and " + root2);
       }
      else if (result == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
       }
      else {
           System.out.println("The equation has no real roots.");
       }






  }
}
