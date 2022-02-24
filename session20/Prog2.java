
class Address{
    String city;
    String state;
    String country;
    Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Emp{
    int id;
    String name;
    Address address;
    Emp(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id+ " " + name);
        System.out.println(address.city+" "+address.state+ " "+address.country);
    }
}

public class Prog2{
    public static void main(String[] args){    

        Address address1 = new Address("gzb", "UP", "INDIA");
        Address address2 = new Address("gno", "UP", "INDIA");

        Emp emp1 = new Emp(1, "Varun", address1);    
        Emp emp2 = new Emp(2, "Arun", address2);

        emp1.display();
        emp2.display();    
    }
}