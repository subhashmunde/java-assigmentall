class Income
{	
	private int id;
	private int hours;
        private double rate;
        private int age;	
	
        /*
	public Income()
	{
	      id=123;
	      hours=200;
	      rate=250;
	      age=25;
	}
        */

	public Income(int ids, int hrs, double rt, int ag)
	{
	      id=ids;
	      hours= hrs;
	      rate=rt;
 	      age=ag;
	} 
 

	public void printEmployee()
	{
	    System.out.println("\n Employee id=" +id+  "\n Hours= " +hours+ "\n Rate= " +rate+ "\n Age= " +age);	
	} 
 	
	public double getSalary()
	{
           double salary;
	   salary = hours*rate;
	   return salary;	
	}

	public double getNameIncome()
	{
	  //if(hours>200)
	    return (hours-200)*100;
	}
	

}
