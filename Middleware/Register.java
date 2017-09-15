import java.util.Arrays;

class Register{
	
	public static void registerService(String sname, Service obj){
		try{
			
			if(lookup(sname)==null){
				Server.sr[Server.last] = new ServiceRegistry(sname, obj); 
				(Server.last)++;
				System.out.println("Service: "+sname+" successfully registered..");
			}else{
				System.out.println("Service name: "+sname+" already exists. Use a different service name..");
			}
			
		}catch(Exception e){
			e.getMessage();
		}
	}

	public static Service lookup(String sname){
		String parts[] = sname.split(" ");
		
		try{
			
			for(int i=0;i<Server.sr.length && Server.sr[i]!=null;i++){
				
				if(parts[0].equals(Server.sr[i].name)){
					return Server.sr[i].service;
				}
			}
				
		}catch(Exception e){
			e.getMessage();
		}
					
		return null;
	}

	public static Object callService(String input, Service sobject){
		String parts[] = input.split(" ");

		try{
			if(sobject.noOfParameters==parts.length-1){
				if(parts.length==1 && sobject.noOfParameters==0){
					return sobject.mainService(null);
				}else{
					Object[] param = Arrays.copyOfRange(parts, 1, parts.length);
					return sobject.mainService(param);
				}
			}else{
				return new String("Invalid number of parameters. required: "+sobject.noOfParameters+" given: "+(parts.length-1));
			}
		}catch(Exception e){
			return new String("Error in calling the service");
		}
	}	
}
