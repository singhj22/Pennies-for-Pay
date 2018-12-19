import java.util.Scanner;

/**
 * 
 * @author Jugat Singh
 *Pennies for Pay
 */
public class pennies_for_pay 
{

	public static void main(String[] args) 
	{
		Scanner user= new Scanner(System.in);
		System.out.println("How many days would you like to work: ");
		int days= user.nextInt();
		double pay= 0.01;
		
		System.out.println("Day\tPay");
		System.out.println("_________________");
		for (int day=1; day<=days;day++)
		{
			pay*=2;
			System.out.println(day+"\t"+pay);
		}
	}

}
