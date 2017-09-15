//These are example services which can be implemented
//This service should be passed with 2 parameters

class Service1 extends Service{
	Service1(String sname, int noOfParameters){
		super(sname, noOfParameters);
	}

	public String mainService(Object[] parameters){
		int num1 = (int)Parameters.parameterConversion(parameters[0],"String","int");
		int num2 = (int)Parameters.parameterConversion(parameters[1],"String","int");
		int value=service1(num1,num2);
		return "Value is "+value;
	}

	public static int service1(int a, int b){
		return a+b;
	}
}
