package edu.ciziunas.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Remote service implementation. To start it some register steps are needed 'rmic', but this is not in the scope.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {


    protected MyRemoteImpl() throws RemoteException {}

    @Override
    public String sayHello() {
        return "Server says hello";
    }

    /**
     * Starts and runs remote service. "rebind" is used for the users which will look for your service in the registry with binded name
     * @param args
     * @throws RemoteException
     * @throws MalformedURLException
     */
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        MyRemote service = new MyRemoteImpl();
        Naming.rebind("RemoteHello", service);
    }
}
