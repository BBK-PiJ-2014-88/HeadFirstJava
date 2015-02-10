package rmiPractice;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().launch();
	}
	public void launch(){
		try{
			Registry reg = LocateRegistry.getRegistry("localhost", 1099);
			MyRemote service = (MyRemote) reg.lookup("RemoteHello");
			String s = service.sayHello(5);
			System.out.println(s);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
