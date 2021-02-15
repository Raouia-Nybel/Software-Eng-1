public class Main {

    public static void main(String args[])
    {

        Person person=new Person();
        Person person2=new Person("Raouia","Lokbani","3529 Miskolc",0772);
        System.out.println("----Overloading----");
        person.toPresent();
        person2.toPresent();

        Student student=new Student("Raouia","Lokbani","3529 Miskolc",0772,"KGM9GI");
        System.out.println("----Overriding----");
        student.toPresent();
    }
}
