package pract;

public class EE {
	public static void main(String[] args) {
		
		int[]a= {10,20,30};
		
		try {
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
		}
		finally
		{
			System.out.println("i am finally");
			System.out.println(a[1]+a[0]);
		}
	}

}
