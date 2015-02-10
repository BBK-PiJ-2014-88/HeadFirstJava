package rmiPractice;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	@Override
	public String sayHello(int ex) throws RemoteException {
		return "Server says, 'Hey' " + ex;
	}
	
	public MyRemoteImpl() throws RemoteException{}
	
	public static void main(String[] args){
		try{
			Registry reg = LocateRegistry.createRegistry(1099);
			MyRemote service = new MyRemoteImpl();
			reg.rebind("RemoteHello", service);
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
