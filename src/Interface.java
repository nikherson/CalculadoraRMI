import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {
    // Declaring the method prototype
    BigDecimal add(String x, String y) throws RemoteException;
    BigDecimal sub(String x, String y) throws RemoteException;
    BigDecimal mul(String x, String y) throws RemoteException;
    BigDecimal div(String x, String y) throws RemoteException;
}
