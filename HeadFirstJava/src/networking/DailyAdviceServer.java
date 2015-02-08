package networking;

import java.io.*;
import java.net.*;

public class DailyAdviceServer {
	String[] adviceList = {"Take smaller bites", "Go for the tight jeans", "innapropriate",
			"Be honest", "Rethink your haircut", "tell your boss"};
	

	public static void main(String[] args) {
		DailyAdviceServer launcher = new DailyAdviceServer();
		launcher.launch();
	}
	public void launch(){
		try{
			ServerSocket serverSocket = new ServerSocket(4242);
		
			while(true){
				Socket sock = serverSocket.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
				
			
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	private String getAdvice(){
		int random = (int) (Math.random() * adviceList.length);
		return adviceList[random];
	}

}
