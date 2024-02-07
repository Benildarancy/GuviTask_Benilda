package task4.q3;

import java.util.ArrayList;


public class Days {
    public void main(String[] args) {
        String[] arr = new String[7];
        arr[0] = "Monday";
        arr[1] = "Tuesday";
        arr[2] = "Wednesday";
        arr[3] = "Thrusday";
        arr[4] = "Friday";
        arr[5] = "Saturday";
        arr[6] = "Sunday";
        try {
            arr[10]="Weekadys";
                System.out.print(arr[10]);

        } catch (Exception e) {
            System.out.println("Array out of bounds");
        }
    }
}
