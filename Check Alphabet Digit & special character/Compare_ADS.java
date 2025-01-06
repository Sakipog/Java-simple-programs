import java.util.Scanner;

public class Compare_ADS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		if (ch >='a' && ch<='z' )
			System.out.println("lower case");
		else if (ch>='A' && ch<='Z')
			System.out.println("upper case");
		else if(ch>='0' && ch<='9')
			System.out.println("digit");
		else
			System.out.println("special character");
	}

}