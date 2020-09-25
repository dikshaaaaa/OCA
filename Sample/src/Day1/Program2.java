package Day1;

 class Super {
	public static void display() {
		System.out.println("inside the parent class static method");
	}
}
 class sub extends Super{
	public static void display() {
		System.out.println("indise the child class static method");
	}
}

public class Program2 {
	public static void main(String args[]) {
		Super obj=new sub();
		obj.display();
	}

}
// inside parent class static method