import java.util.ArrayList;


class Client{

  public Client(int clientID, String clientName) {
    this.clientID = clientID;
    this.clientName = clientName;
  }

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

  public String stringOutput(){
    return this.clientName + " " + this.clientID;
  }

  public String toString(){
    return "Client: " + this.clientName + ". Sales Employee: " + this.salesPerson.getEmployeeName() + " " + this.salesPerson.salesID;
  }
}




abstract class  Employee{

  private ArrayList<Client> clients = new ArrayList<>();
  String employeeName;
  long salesID;

  public long getSalesID() {
    return salesID;
  }

  public SalesManager getManager() {
    return manager;
  }

  public void setSalesID(long salesID) {
    this.salesID = salesID;
  }

  public void setManager(SalesManager manager) {
    this.manager = manager;
  }

  SalesManager manager;


  public void setClients(ArrayList<Client> clients) {
    this.clients = clients;
  }

  //setters
  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getEmployeeName() {
    return employeeName;
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
    return clients;
  }
}



class SalesManager extends Employee{

  //fields
  ArrayList<Employee> employees = new ArrayList<>();


  public SalesManager(int id, String name) {
    super();
    this.salesID=id;
    this.employeeName=name;
  }

  public void addEmployee(Employee employee){
    employee.setManager(this);
    employees.add(employee);
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
    String toReturn =  "Sales Manager: " + this.employeeName  + ". Employees:";


    for (int i = 0 ; i < getEmployees().size() ; i++){
      toReturn += " " + getEmployees().get(i).getEmployeeName();
    }
    toReturn += ". ";

    if(getClients().size()!=0) {
      toReturn += "Clients: ";
      for (Client client : getClients()) {
        toReturn += " " + client.stringOutput() + ",";

      }

      toReturn = toReturn.substring(0, toReturn.length() - 1);

    }

    toReturn = toReturn.substring(0, toReturn.length() - 1);

    toReturn += ". Bonus: " + this.bonus();
    return toReturn;
  }

  double bonus() {
    return this.getClients().size() * 2000 + this.getEmployees().size() * 5000;
  }
}



class SalesAssociate extends Employee{

  public SalesAssociate(int id, String name) {
    super();
    this.salesID=id;
    this.employeeName=name;
  }

  public void setManager(SalesManager manager) {
    this.manager = manager;
  }

  public void setSalesID(long salesID) {
    this.salesID = salesID;
  }

  public SalesManager getManager() {
    return manager;
  }

  public long getSalesID() {
    return salesID;
  }

  private double bonus(){
    return this.getClients().size() * 1000;
  }

  public String toString(){
    String toReturn =  "Sales Associate: " + this.getEmployeeName();

    toReturn += ". Clients: ";
    for (Client client: getClients()){
      toReturn += " " + client.stringOutput() + "," ;

    }

    toReturn = toReturn.substring(0, toReturn.length() - 1);

    toReturn += ". Bonus: " + this.bonus();
    return toReturn;
  }
}