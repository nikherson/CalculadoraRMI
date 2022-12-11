import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implementacao extends UnicastRemoteObject implements Interface {
    Implementacao() throws RemoteException { super(); }
    public int add(int x, int y) throws RemoteException {
        return x+y;
    }
    public int sub(int x, int y) throws RemoteException {
        return x-y;
    }
    public int mul(int x, int y) throws RemoteException {
        return x*y;
    }
    public int div(int x, int y) throws RemoteException {
        return x/y;
    }
}
