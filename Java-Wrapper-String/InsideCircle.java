/*
 * 3_22 : (Geometry: point in a circle?) 
 * Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the circle centered at 
 * (0, 0) with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the circle
 */

import java.util.*;
public class InsideCircle {
    public static void checkInsideCircle(int x,int y,int radius)
    {
        if(x>=10 || y>=10 || x <= -10 || y <= -10)
        {
            System.out.println("Outside the circle");
        }
        else {
            System.out.println("Inside the circle");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x coordinate of the circle");
        int x = sc.nextInt();
        System.out.println("Enter the y coordinate of the circle");
        int y = sc.nextInt();

        checkInsideCircle(x, y,10);
        sc.close();
	}
}
