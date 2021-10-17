import java.io.*;

public class Practice{
	
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int a[], n;
		System.out.println("Enter the size of the array \n");
		n= Integer.parseInt(br.readLine());
		//int a[] = new int a[n];
		a = new int[n];
		System.out.println("Enter the elements of the array \n");
		accept(a);
		System.out.println("Original array\n");
		display(a);
		sort(a);
		System.out.println("Sorted Array \n");
		display(a);
	}
	
	static void accept(int a[]) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int i;
		for(i=0;i<a.length;i++)
			a[i]=Integer.parseInt(br.readLine());
	}
	
	static void sort(int a[]) {
		int i,j;
		int temp=0;
		for(i=0;i<a.length;i++) {
			for(j=1;j<(a.length-i);j++) {
				if(a[j-1]>a[j])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	static void display(int a[]) {
		int i;
		for(i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}