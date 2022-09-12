import java.util.Scanner;

/*
 * 
 * (Game: lottery) Lottery.java, to generate a lottery of a threedigit number. 
 * The program prompts the user to enter a three-digit number and determines whether the user wins according to the following rules:
 * 1. If the user input matches the lottery number in the exact order, the award is $10,000.
 * 2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
 * 
 */
import java.util.*;
public class Lottery {
    public static void checkLottery(String num, String lottery)
    {
        if(num.equals(lottery))
        {
            System.out.println("You won $"+10000);
        }
        else{

            int count = 0;
            for(int i=0;i<num.length();i++)
            {
                String s = "";
                s+=num.charAt(i);
                if(lottery.contains(s))
                {
                    count++;
                }
            }
           if(count==num.length()) System.out.println("You won $"+3000);
           else if(count>=1 && count<3) System.out.println("You won $"+1000);
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three digit number");
        int num = sc.nextInt();
        int lottery = 456;

        checkLottery(String.valueOf(num),String.valueOf(lottery));
        sc.close();
	}
}