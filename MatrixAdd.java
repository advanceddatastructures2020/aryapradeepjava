import java.util.Scanner;
public class MatrixAdd
{
	public static void main(String[] args)
	{
	    	int p,q,m,n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter number of rows in first matrix");
		p=s.nextInt();
		System.out.print("enter number of coloumn in first matrix");
		q=s.nextInt();
 		System.out.print("enter number of rows in second matrix");
		m=s.nextInt();
		System.out.print("enter number of coloumn in second matrix");
		n=s.nextInt();

if(p==m && q==n)
{
	int a[][]=new int[p][q];
	int b[][]=new int[m][n];
	int c[][]=new int[m][n];

System.out.println("enter all the elements of first matrix");
for(int i=0;i<p;i++)
	for(int j=0;j<q;j++)
		a[i][j]=s.nextInt();

System.out.println("enter all the elements of second matrix");
for(int i=0;i<m;i++)
	for(int j=0;j<n;j++)
		b[i][j]=s.nextInt();

System.out.println("first matrix");
for(int i=0;i<p;i++)
{
	for(int j=0;j<q;j++)
		System.out.print(a[i][j]+"_");
	System.out.print("");
}

System.out.println("second matrix");
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
{
		System.out.print(b[i][j]+"_");
}
	System.out.print("");
}

//do the sum

for(int i=0;i<p;i++)
	for(int j=0;j<n;j++)
		
		c[i][j]=a[i][j]+b[i][j];

System.out.println("matrix after addition");
for(int i=0;i<p;i++)
{
	for(int j=0;j<n;j++)
		System.out.print(c[i][j]+"_");
	System.out.print("");
}
}
else
{

System.out.println("Addition would not be possible");
}
}
}




 
 