import java.util.Scanner;
public class switch {
	public static void main(String[] args)
	{
    Scanner Input = new Scanner(System.in);
    System.out.println("Enter the grade:");
    char grade = Input.next().charAt(0);
    String bonus;


		switch (grade) {
		case 'A':
			bonus = "60%";
			break;
		case 'B':
			bonus = "20%";
			break;
		case 'C':
			bonus = "40%";
			break;
		case 'D':
			bonus = "50%";
			break;
		case 'E':
			bonus = "90%";
			break;
		default:
			bonus = "Invalid grade";
		}
		System.out.println(bonus);
	}
}
