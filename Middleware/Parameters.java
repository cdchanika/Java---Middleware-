//This class is implemented to convert parameters to different types so that the user can convert parameters using one function
//Considered most common conversions that can happen

class Parameters{
	public static Object parameterConversion(Object parameter, String oldtype, String newtype){
		if(oldtype.equals("String")){
			if(newtype.equals("byte")){
				return Byte.parseByte((String)parameter);
			}else if(newtype.equals("short")){
				return Short.parseShort((String)parameter);
			}else if(newtype.equals("int")){
				return Integer.parseInt((String)parameter);
			}else if(newtype.equals("long")){
				return Long.parseLong((String)parameter);
			}else if(newtype.equals("float")){
				return Float.parseFloat((String)parameter);
			}else if(newtype.equals("double")){
				return Double.parseDouble((String)parameter);
			}else if(newtype.equals("char")){
				return ((String)parameter).charAt(0);
			}
		}
		
		if(newtype.equals("String")){
			if(oldtype.equals("byte")){
				return Byte.toString((byte)parameter);
			}else if(oldtype.equals("short")){
				return Short.toString((short)parameter);
			}else if(oldtype.equals("int")){
				return Integer.toString((int)parameter);
			}else if(oldtype.equals("long")){
				return Long.toString((long)parameter);
			}else if(oldtype.equals("float")){
				return Float.toString((float)parameter);
			}else if(oldtype.equals("double")){
				return Double.toString((double)parameter);
			}else if(oldtype.equals("char")){
				return Character.toString((char)parameter);
			}
		}
		return null;
	}
}
