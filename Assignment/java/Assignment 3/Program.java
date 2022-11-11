import Hospital.Patient;
import Hospital.InHouse;
import java.util.Scanner;

class Program{
public static void main(String[] args) {

	Scanner s= new Scanner(System.in);

	System.out.printf("Enter Patient id= ");
	int id =s.nextInt();

	System.out.printf("Enter Patient BedType= ");
	int bed =s.nextInt();

	System.out.printf("Enter Patienti No of days = ");
	int day =s.nextInt();

	Patient p = new Patient(id,bed,day);
	//p.setId(120);
	//p.setBedType(2);
	//p.setnoOfDays(20);

	System.out.printf("Your bill is:%.2f%n",p.getBillAmount());

	InHouse a = new InHouse();
	System.out.printf("Your Inhouse bill is:%.2f%n",a.getBillAmount());

	
}



}


