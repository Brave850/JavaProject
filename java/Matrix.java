import java.util.*; 
  
class multiplication { 
  
    public static void main(String[] args) {
	int m,n;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Row Values");
	m=sc.nextInt();

	System.out.println("Enter Column Values");
	n=sc.nextInt();

	int a[][] = new int[n][m];
	int b[][] = new int[n][m];
	int[][] sum = new int[n][m];
	int[][] mul = new int [n][m]; 
	
	System.out.println("Enter 1st Matrix index values");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			a[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("Enter 2nd Matrix index values");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			b[i][j] = sc.nextInt();
		}
	}
	System.out.println("Sum of two matrix is");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			sum[i][j] = a[i][j]+b[i][j];
			System.out.print(sum[i][j]+" ");
		}
		System.out.print("\n");
	}
	
	
	System.out.println("Multiplication of two matrix is");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			mul[i][j] = 0;
			for(int k=0;k<m;k++)
			{
				mul[i][j] += a[i][k]*b[k][j];
			}
			System.out.print(mul[i][j]+" ");
		}
		System.out.print("\n");
	}
	System.out.println("\n\nAll the Best!");
	
    } 
} 
