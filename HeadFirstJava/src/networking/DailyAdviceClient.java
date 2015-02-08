package networking;

import java.io.*;
import java.net.*;

public class DailyAdviceClient {

	public static void main(String[] args) {
		DailyAdviceClient launcher = new DailyAdviceClient();
		launcher.launch();
	}
	public void launch(){
		try{
			Socket s = new Socket("127.0.0.1", 4242);
			
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);
			
			String advice = reader.readLine();
			System.out.println("Today you should: " + advice);
			
			reader.close();
		}catch(IOException e){
				e.printStackTrace();
		}
			
		
	}

}
