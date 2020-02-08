import java.util.ArrayList;

class Client{
    int clientID;
    String clientName;

    public double totalSales(){
        return 0;
    }

    public String toString(){
        return null;
    }
}


public class Sales {

}
abstract class  Employee{

    private ArrayList<com.sun.security.ntlm.Client> clients;

    public boolean addClient(){
        return false;
    }

    public ArrayList<com.sun.security.ntlm.Client> getClients(){
        return null;
    }
}

class SalesManager extends Employee{
    String employeeName;
    ArrayList<Employee> employees;
    SalesManager manager;
    long salesID;

    public String toString(){
        return null;
    }

    double bonus(){
        return 0;
    }
}