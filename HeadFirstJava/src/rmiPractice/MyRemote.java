package rmiPractice;

import java.rmi.*;

public interface MyRemote extends Remote {
	public String sayHello(int ex) throws RemoteException;

}
