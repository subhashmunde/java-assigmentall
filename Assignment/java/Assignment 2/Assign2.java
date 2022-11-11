import java.util.Scanner;
class Assign2{

	public static void main(String [] args){
	
	//int a= Integer.parseInt(args[0]);
	Scanner s= new Scanner(System.in);
	System.out.print("Enter the Number= ");
	int a=s.nextInt();


	System.out.println("========================================");
	//even check
	boolean number=MathUtil.isEven(a);
	if (number==true)
		System.out.println("The number " + a+ " is even");
	else
		System.out.println("Entered number is Not Even");


	//is odd check
	boolean number1=MathUtil.isOdd(a);
	if (number1==true)
		System.out.println("the number is not odd");
	else
		System.out.println("the number " +a+" is odd");


	//Prime No check
	boolean number2=MathUtil.isPrime(a);
	if (number2==true)
		System.out.println("the number " +a+ " is prime");
	else
		System.out.println("the number is not prime");
		

	//count no
	int number3=MathUtil.count(a);	
	System.out.println("No of cout is  = "+number3);




	//int number3=MathUtil.reverse(a);
	//System.out.printf("the number is  : %d" , MathUtil.reverse(a));
	//System.out.printf("the number is odd =%d%n ",a.isOdd(number));
	
	
	
	
	}




}
