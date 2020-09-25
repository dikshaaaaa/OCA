package Day1;

public class Program4{
	 public static void main(String[] args) {
	 int x = 10;
	 int y = 2;
	 try {
	 for (int z = 2; z >= 0; z--) {
	 int ans = x / z;
	System.out.print(ans+ " ");
	 }
	 } catch (Exception e1) {
	 System.out.println("E1");
	 } catch (ArithmeticException e1) {
	 System.out.println("E2");
	 }
	 }
	}
//	Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
