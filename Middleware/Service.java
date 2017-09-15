abstract class Service{

	String name;
	int noOfParameters;
	
	Service(String sname, int noOfParameters){
		this.name = sname;
		this.noOfParameters = noOfParameters;
	}
	
	public abstract String mainService(Object[] parameters);

}
