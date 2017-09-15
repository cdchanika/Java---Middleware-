class RegisterServices{		
	public static void startRegistering(){
		//Register service1
		String serviceName = "ADD";
		int numberOfParameters = 2;
		Service1 newServ = new Service1(serviceName, numberOfParameters);
		Register.registerService(serviceName,newServ);

		//Register service2
		String serviceName2 = "EXP";
		Service2 serv2 = new Service2(serviceName2,0);
		Register.registerService(serviceName2,serv2);	
	}
}
