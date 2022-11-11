import series.*;
import java.util.Scanner;
class Program {
 
	public static double FinalEmi(Loan temp){
		if (temp instanceof Discountable p){
			return temp.getEmi() * p.getDiscount();
		}
		 if (temp instanceof Taxable t){
			return temp.getEmi() * t. getTax();
		}
		return 0;
	}

public static void main(String[] args){

	Scanner s=new Scanner(System.in);

	System.out.println("==========================================");
	System.out.print("Enter Principle = ");
	double pri=s.nextDouble();
	System.out.print("Enter Period = ");
	float pr=s.nextFloat();


	Loan pl =  CallLoan.CallPersonal(pri, pr);
	Loan hl =  CallLoan.CallHome(pri, pr);
	
	System.out.printf("Perosnal Loan EMI is:%.2f%n",pl.getEmi());

	System.out.printf("HomeLoan  EMI is:%.2f%n",hl.getEmi());

	System.out.printf("HomeLoan EMI after discount is is:%.2f%n",FinalEmi(hl));

	System.out.printf("PersonaLoan EMI after Tax is:%.2f%n",FinalEmi(pl));

	System.out.println("==========================================");
}



}
