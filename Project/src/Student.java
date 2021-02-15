public class Student extends Person{
    private String neptunCode;

    public Student(String firstName, String lastName, String address, double phoneNumber, String neptunCode) {
        super(firstName, lastName, address, phoneNumber);
        this.neptunCode=neptunCode;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    @Override
    //Overriding
    public void toPresent()
    {
        super.toPresent();
        System.out.println("My NeptunCode is : "+neptunCode);
    }
}
