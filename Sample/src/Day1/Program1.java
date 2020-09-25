package Day1;

public class Program1 {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		if (num2==1 || num1/0==0)
			System.out.println(num1++);
		else
			System.out.println(++num2);
	}

}
 //output =0
	//	 num2==1 is true hence in or condition if any answer is true thn without testing futher it will give output