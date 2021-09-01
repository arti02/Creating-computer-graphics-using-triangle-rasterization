package objects.zadanie1;

public class Person {

     private int age;
     private String name;

    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void setAge(int age){
         this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void inform(){
        System.out.println("hi my name "+ this.name+" i have "+this.age);
    }
    public String yo(){

        if(this.age<18){
            return "Maloi";
        }else{
            return "bolshoi";
        }
    }
}
