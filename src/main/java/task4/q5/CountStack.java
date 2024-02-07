package task4.q5;

import java.util.Stack;

public class CountStack {
    public static void main(String []args){
        Stack<Integer> count= new Stack<>();
        //Integers are added to stack with push
        count.push(11);
        count.push(12);
        count.push(13);
        count.push(14);
        count.push(15);
        //Displaying an interger
        System.out.println("Stack contains:"+count);
        //Deleting an integer
        System.out.println("popping up value");
        count.pop();
        //Displaying after deleting an integer
        System.out.println("New stack ccntains:"+count);
    }

}
