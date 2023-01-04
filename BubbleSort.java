
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,2,3,56,5,88,84};
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				}
			}
		}
				for(int ele:a)
				{
					System.out.println(ele);
				}
					
				
			}
		

	}


