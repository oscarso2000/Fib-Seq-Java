import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class fib{
	public static void delay (int x) throws InterruptedException{
	TimeUnit.MILLISECONDS.sleep(x);
	}
	public static void main (String [] args) throws InterruptedException{
		System.out.printf("Please enter number of fibonacci sequence numbers to print.\n");
		Scanner UserInput = new Scanner(System.in);
		int input = UserInput.nextInt();
		long x;
		long y = 1;
		long z = 1; 
		System.out.printf("\nHere is the sequence: \n\n");
		for (int i=0; i<input;i++){
			if (i==0){
				System.out.printf("%d\n",y);
			}else if (i!=0){
				System.out.printf("%d\n",z);
				x=y;
				y=z;
				z=x+y;
			}
			delay(55);
		}
		System.out.printf("\n");
	}
}
