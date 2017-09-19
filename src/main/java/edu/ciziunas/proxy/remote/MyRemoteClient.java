package edu.ciziunas.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * This is a client to get data from a remote service
 */
public class MyRemoteClient {

    /**
     * Looks up for a binded service in the host
     * @throws RemoteException
     * @throws NotBoundException
     * @throws MalformedURLException
     */
    static void go() throws RemoteException, NotBoundException, MalformedURLException {
        MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
        service.sayHello();
    }
}
