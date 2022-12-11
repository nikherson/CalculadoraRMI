import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {
    // Declaring the method prototype
    int add(int x, int y) throws RemoteException;
    int sub(int x, int y) throws RemoteException;
    int mul(int x, int y) throws RemoteException;
    int div(int x, int y) throws RemoteException;
}
