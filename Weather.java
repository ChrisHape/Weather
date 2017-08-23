import java.util.Scanner; 

public class Weather {

	public static void main(String[] args) {
		
		System.out.println("Please enter your temperature in degrees Fahrenheit");  //asks what the temp is
	
	Scanner cin = new Scanner(System.in);
	
	int F = cin.nextInt();
	
	double c = 5 * ((double) F - 32) / 9;  //The way to convert it 
	
	if(F>=90) //if it is above 90 then it is very hot
	{
		System.out.println("It is very Hot");
	}
	if(F<=32) //if it is under 32 then it is very cold 
	{
		System.out.println("It is very cold");
	}
	{
		System.out.println("The Temperature is " + c + " in Celsius. Have a nice day");
	}
	
	cin.close();
}}