package Assignment1;

public class Program3 {

	public static void main(String[] args) {
		// 3. WAP to print
		/*
		 
		 	***************
		 	******* *******
		    ******   ******
		    *****     *****
		    ****       ****
		    ***         ***
		    **           **
		    *             *
		    *             *
		    *             *
		    *             *
		    *             *
		    *             *
		    ***************          
		           
		 */
		
		int n=15;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==0||j==n-1||(i+j<=(n-1)/2)||(j-i>=(n-1)/2))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
