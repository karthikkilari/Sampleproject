package learnjava;

public class Assign1a{

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(i==0||i==4||j==2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for (int j=0;j<5;j++)
			{
				if(j==0||i==j||j==4)
					System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.print("  ");
			for (int j=0;j<5;j++)
			{
				if(i==0||j==0||i==2||i==4)
					System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.print("  ");
			for (int j=0;j<5;j++)
			{
				if(j==0||j==4||i==4)
					System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.print("  ");
			for (int j=0;j<5;j++)
			{
				if(i==0||j==0||i==2||j==4&&i<3||i==2||i==j&&i>2)
					System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.print("  ");
			for (int j=0;j<5;j++)
			{
				if(i==0||j==0||i==4||j==4)
					System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.print("  ");
			for (int j=0;j<5;j++)
			{
				if(i==j||j==0||j==4)
					System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.println();
	}
		}

}

