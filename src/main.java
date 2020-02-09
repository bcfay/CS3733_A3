public class main {
    public static void main (String[] args){
        SalesManager tom = new SalesManager(1, "Tom");
        SalesManager jane = new SalesManager(2, "Jane");
        SalesAssociate harry = new SalesAssociate(28, "Harry");
        SalesAssociate nancy = new SalesAssociate(28, "Nancy");
        Client ann = new Client(51, "Ann");
        Client john = new Client(734, "John");
        Client susan = new Client(515, "Susan");
        Client david = new Client(921, "David");
        Client sarah = new Client(478, "Sarah");
        Client daniel = new Client(269, "Daniel");

        jane.addClient(john);
        jane.addClient(sarah);

        tom.addClient(david);

        harry.addClient(ann);

        nancy.addClient(daniel);
        nancy.addClient(susan);

       jane.addEmployee(harry);
       tom.addEmployee(nancy);

        System.out.println(ann.toString());
        System.out.println(nancy.toString());
        System.out.println(jane.toString());

    }
}
