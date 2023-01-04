
public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] b= {1,4,6};
	int [] a= {1,2,4,3,5,6};
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[j]==a[i])
				System.out.println("print common array elements in array a:"+a[i]);
		}
	}
	

	}

}
