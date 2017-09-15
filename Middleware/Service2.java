//This is an example service with no parameters

class Service2 extends Service{
	Service2(String sname, int noOfParameters){
		super(sname, noOfParameters);
	}

	public String mainService(Object[] parameters){
		return "Return value is "+expression();
	}
	public static int expression(){
		int a=10,b=20,c=5;
		return multiply(b,b)-multiply((multiply(4,a)),c);
	}

	public static int multiply(int num1,int num2){
		return num1+num2;
	}
}
