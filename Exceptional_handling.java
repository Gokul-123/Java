import java.util.Scanner;
class Exceptional_handling
{
   public static void main(String args[])
   {
      try{
        Scanner Input = new Scanner(System.in);
         System.out.println("Enter the value of n1:");
         int n1 = Input.nextInt();
         System.out.println("Enter the value of n2:");
         int n2 = Input.nextInt();
          int output=n1+n2;
         System.out.println ("Result: "+output);
      }
      catch(ArithmeticException e){
         System.out.println ("You Shouldn't add a number ");
      }
   }
}
