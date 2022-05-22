package pract;

public class ReturnType {
	public int addition(int a, int b) {
		int c= a+b;
		return c;
		
	}
	
	public String name() {
		String k= "Velocity";
		return k;
		
	}

	public static void main(String[] args) {
		ReturnType obj= new ReturnType ();
		int d =obj.addition(40,50);
		String k="Velocity A";
		System.out.println(d*2);
		System.out.println(d-10);
		System.out.println(d+20);
		System.out.println(k);
		
	
	}

}
