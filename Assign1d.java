package learnjava;

public class Assign1d {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<11;i++) {
			
			for (int j=0;j<11;j++)
			{
				if(i-j>5||i-j==5||i>=5&&j==0||i==10||i>=5&&j==10||i+j>15||i+j==15)
					System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.println();
		}

	}

}
