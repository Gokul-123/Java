import java.util.Scanner;
class fibanacci {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n1=0,n2=1,n3,i,count;
    System.out.println("Enter The Number :");
    count=input.nextInt();
    System.out.println("The Fibanacci Series Is:");
    System.out.print(n1+" "+n2);
    i=2;
    while(i<count)
    {
      n3=n2+n1;
      System.out.print(" "+n3);
      n1=n2;
      n2=n3;
      i++;
    }
  }
}
