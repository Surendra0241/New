package pract;

public class Cl2 extends Cl1 {
	public void test() {
		 System.out.println("Hii this is child method..");
	}
	public void test3() {
		System.out.println("Hii this is extra method in Cl2");
	}
	
	String colour = "Red";
    
	public static void main(String[] args) {
		Cl1 Obj=new Cl2();                //upcasting
		Obj.test();
		Obj.test2();
//		Obj.test3();                   ..this is Overrided from superclass
		System.out.println(Obj.colour);
	}
}
