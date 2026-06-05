// Encapsulation
class Person{
    // private data members (attributes)
    private String name;
    private int age;

    // constructor 
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    // getter methods (accesors)
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    // setter methods (mutators)
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age >= 0){
            this.age = age;
        }
    }
}

public class Encapsulation{
    public static void main(String[] args){
        Person newPerson = new Person("prithiraj",20);

        System.out.println(newPerson.getName());
        System.out.println(newPerson.getAge());

        newPerson.setAge(21);

        System.out.println(newPerson.getAge());
    }
}