package Assignment1;

public class Program1 
{
	public static void main(String args[])
	{
		//1.Write a program(WAP) to print INEURON using pattern programming logic.
		
		int n = 10;
		for(int i=0;i<n;i++) 
		{
			//code for letter I
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==(n-1)/2 || i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			
			//code for letter N
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==j || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			
			//code for letter E
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==(n-1)/2 || i==n-1 || j==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			
			//code for letter U
			for(int j=0;j<n;j++)
			{
				if((j==0 && i!=n-1)||(i==n-1 && j!=0 && j!=n-1) || (j==n-1 && i!=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			
			//code for letter R
			for(int j=0;j<n;j++)
			{
				if(j==0 || (i==0 && j!=n-1)||(j==n-1 && i>0 && i<(n-1)/2) || i==(n-1)/2 && j!=n-1 || (i==j && i>(n-1)/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			
			//code for letter O
			for(int j=0;j<n;j++)
			{
				if((i==0 && j!=0 && j!=n-1) || (i==n-1 && j>0 && j<n-1) || (j==0 && i!=0 &&i!=n-1) || (j==n-1 && i!=0 &&i!=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			
			//code for letter N
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==j || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("  ");
			
		}
		
	}

}
