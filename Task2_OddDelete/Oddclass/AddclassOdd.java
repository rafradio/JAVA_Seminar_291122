package Oddclass;
import java.util.ArrayList;
import java.util.Random;   

public class AddclassOdd {
    public int from = 0;
    public int to = 100;
    public ArrayList<Integer> arrInit1 = new ArrayList<>();
    public ArrayList<Integer> arrFinal = new ArrayList<>();
    public AddclassOdd() {
        this.initSettings();
    }

    public void initSettings() {
        Random random = new Random();   

        int length = 10 + random.nextInt(10);  
        System.out.println(length);
        for (int i = 0; i < length; i++)  {
            arrInit1.add(random.nextInt(this.to));
        }

    }

    public void deleteOdd() {
        for (int i: this.arrInit1) {
            if (i % 2 != 0) {arrFinal.add(i);}
        }
    }


    public void printArray(String note, ArrayList<Integer> arr) {
        System.out.println(note);
        for (int i: arr) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");

    }
    
}
