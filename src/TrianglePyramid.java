import java.util.Scanner;

public class TrianglePyramid{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Rows You Want In Your Pyramid?");
		int noOfRows = sc.nextInt();
		int rowCount = 1;
		System.out.println("Here Is Your Pyramid");
		for (int i = noOfRows; i >= 1; i--)
		{
			//Printing i*2 spaces at the beginning of each row
			for (int j = 1; j <= i*2; j++)
			{
				System.out.print(" ");
			}
			//Printing j where j value will be from i to noOfRows
			for (int j = i; j <= noOfRows; j++)
			{
				System.out.print(j+" ");
			}
			for (int j = noOfRows-1; j >= i; j--)
			{
				System.out.print(j+" ");
			}
				System.out.println();
			//Incrementing the rowCount
			rowCount++;
		}
	}
 }
