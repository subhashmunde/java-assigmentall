import java.util.Scanner;
class Employee
{
	public static void main(String[] args)
     {

	/*
	int id;
	int hours;
	double rate;
	int age;
	*/

	Scanner sc= new Scanner(System.in);
        
	System.out.println("Enter id= ");
	int id= sc.nextInt();  

        System.out.println("Enter hours= ");
	int hours= sc.nextInt();  

        System.out.println("Enter rate= ");
	double rate= sc.nextDouble();
  
        System.out.println("Enter age= ");
	int age= sc.nextInt();  
	
	/*
	int id= Integer.parseInt(args[0]);
	int hours= Integer.parseInt(args[1]);
	double rate= Double.parseDouble(args[2]);
	int age= Integer.parseInt(args[3]);
	*/
		
	Income in = new Income(id,hours,rate,age);
	in.printEmployee();
	System.out.printf("Employee Income: %.2f%n",in.getSalary());
	System.out.printf("Employee Overtime Amount: %.2f%n",in.getNameIncome());
      }  
}

