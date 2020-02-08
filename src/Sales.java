import java.util.ArrayList;


class Client{
  int clientID;

  public void setClientID(int clientID) {
    this.clientID = clientID;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  String clientName;

  public double totalSales(){
    return 0;
  }

  public int getClientID() {
    return clientID;
  }

  public String getClientName() {
    return clientName;
  }

  public String toString(){
    return null;
  }
}

abstract class  Employee{

  private ArrayList<Client> clients;

  public boolean addClient(){
    return false;
  }

  public ArrayList<Client> getClients(){
    return null;
  }
}

class SalesManager extends Employee{

  //fields
  String employeeName;
  ArrayList<Employee> employees;
  SalesManager manager;
  long salesID;

  //setters
  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public void setEmployees(ArrayList<Employee> employees) {
    this.employees = employees;
  }

  public void setManager(SalesManager manager) {
    this.manager = manager;
  }

  public void setSalesID(long salesID) {
    this.salesID = salesID;
  }
  //getters
  public String getEmployeeName() {
    return employeeName;
  }

  public ArrayList<Employee> getEmployees() {
    return employees;
  }

  public SalesManager getManager() {
    return manager;
  }

  public long getSalesID() {
    return salesID;
  }



  public String toString(){
    return null;
  }

  double bonus() {
    return 0;
  }


}
class SalesAssociate extends Employee{

  //fields
  String employeeName;
  SalesManager manager;
  long salesID;

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public void setManager(SalesManager manager) {
    this.manager = manager;
  }

  public void setSalesID(long salesID) {
    this.salesID = salesID;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public SalesManager getManager() {
    return manager;
  }

  public long getSalesID() {
    return salesID;
  }

  private double bonus(){
    return 0;
  }
}