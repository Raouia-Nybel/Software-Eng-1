public class Person {

    private String firstName;
    private String lastName;
    private String address;
    private double phoneNumber;

    // Constructor Overloading

    Person()
    {
        firstName="X";
        lastName="XX";
        address="XXXXXXXX";
        phoneNumber=0000000000;

    }
    Person(String firstName, String lastName, String address, double phoneNumber)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }


    public void toPresent()
    {
        System.out.println("Hello my name is "+firstName+" " + lastName +"\n I live in "+address+" \n And my phone Number is "+phoneNumber);   }

}
