package learnjava;

public class Assign1e {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<11;i++) {
			
			for (int j=0;j<11;j++)
			{
				if(i==10||j==0||i==0||i+j<5||i+j==5&&i>=0&&j<5||i-j>5||i>5&&i-j==5&&j<5)
					System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.println();
		}

	}

}
