package task4.q1;

import java.util.Objects;

class age extends Exception{
    public age(String str){
        super(str);
    }
}
public class Student{
    int rollNo;
    String name;
    String course;
    int age;

    public Student(int rollNo, String name, String course, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public void display() {
       try{
           if (age <= 15 && age >= 21) {
               throw new age ("not valid");
           }
           else{
               System.out.println("Valid age");
           }
       } catch (task4.q1.age e) {
           throw new RuntimeException(e);
       }
    }
    public void check(){
        try{
            if (Objects.equals(name, ".@#$%^&*")) {
                throw new age("not valid");
            }
            else{
                System.out.println("valid name");
            }
        }catch (task4.q1.age e){
            throw new RuntimeException(e);
        }
    }

}

