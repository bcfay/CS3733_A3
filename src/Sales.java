import java.util.ArrayList;

class Client{
    int clientID;
    String clientName;

    public double totalSales(){
        return 0;
    }
}

abstract class  Employee{

    private ArrayList<com.sun.security.ntlm.Client> clients;

    public boolean addClient(){
        return false;
    }

    public ArrayList<com.sun.security.ntlm.Client> getClients(){
        return null;
    }

    class SalesAssociate extends Employee{

      //fields
      String employeeName;
      SalesManager manager;
      long salesID;

      private double bonus(){
        return 0;
      }




    }
}