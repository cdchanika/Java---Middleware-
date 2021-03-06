import java.io.*;
import java.net.*;

class Client
{
	public static void main(String args[]) throws Exception{

		int port = 9000;
		String host = "localhost";
	        if(args.length > 0){
	            port = Integer.parseInt(args[0]);
	        }
		
		if(args.length == 2){
            	    port = Integer.parseInt(args[0]);
	    	    host = args[1];
        	}		

		String sentence;
		String modifiedSentence;
		
		Socket clientSocket = new Socket(host, port);
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		modifiedSentence = inFromServer.readLine();
		System.out.println("FROM SERVER: " + modifiedSentence);		

		while(true){
			BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in));
			DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
			inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			sentence = inFromUser.readLine();
			outToServer.writeBytes(sentence + '\n');
			
			//while((modifiedSentence = inFromServer.readLine())!=null){
			//	System.out.println("FROM SERVER: " + modifiedSentence);	
				//modifiedSentence = inFromServer.readLine();
			//}

			modifiedSentence = inFromServer.readLine();
			if(modifiedSentence==null){ break;}
			System.out.println("FROM SERVER: " + modifiedSentence);
			
		}
		
		clientSocket.close();
		System.out.println("Connection closed by foreign host..");
	}
}

