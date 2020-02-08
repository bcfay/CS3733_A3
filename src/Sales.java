import java.util.ArrayList;


class Client{
  int clientID;
  Employee salesPerson;
  String clientName;

  public void setSalesPerson(Employee salesPerson) {
    this.salesPerson = salesPerson;
  }

  public Employee getSalesPerson() {
    return salesPerson;
  }

  public void setClientID(int clientID) {
    this.clientID = clientID;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


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

  public void setClients(ArrayList<Client> clients) {
    this.clients = clients;
  }

  /**
   * Adds new client to teh employees list of clients sorted by ID number
   * @param newClient client to be added
   * @return true if client is successfully added, false if ID number is not unique
   */
  public boolean addClient(Client newClient){

    //link client to employee
    newClient.setSalesPerson(this);

    //sort by ID number
    for(int i =0; i<this.clients.size();i++){

      Client currentClient = this.clients.get(i);

      if(newClient.getClientID()<(currentClient.getClientID())){
        //adds client in location of first node it is smaller than
        clients.add(i,newClient);
        return true;
      }
      if(newClient.getClientID()==(currentClient.getClientID())){
        //if ID number is not unique return false
        return false;
      }
    }
    //add client to the end if ID number is larger than all other ID numbers
    clients.add(newClient);
    return true;
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