package minmax;
import java.util.ArrayList;
import java.util.Random;   


public class Addclass {
    public int from = 0;
    public int to = 100;
    public ArrayList<Integer> arrInit1 = new ArrayList<>();
    public Addclass() {
        this.initSettings();

    }

    public void initSettings() {
        Random random = new Random();   

        int length = 1 + random.nextInt(10);  
        System.out.println(length);
        for (int i = 0; i < length; i++)  {
            arrInit1.add(random.nextInt(this.to));
        }

    }

    public void makeCalc() {
        int min = arrInit1.get(0), max = arrInit1.get(0);
        int sum = arrInit1.get(0);
        for (int i = 1; i < arrInit1.size(); i++) {
            if (arrInit1.get(i) > max) {max = arrInit1.get(i);};
            if (arrInit1.get(i) < min) {min = arrInit1.get(i);};
            sum += arrInit1.get(i);
        }
        System.out.println("Максимум списка: " + max);
        System.out.println("Минимум списка: " + min);
        float srArifmet = (float) sum / arrInit1.size();
        System.out.println("Среднее арифметическое списка: " + srArifmet);

    }

    public void printArray(String note, ArrayList<Integer> arr) {
        System.out.println(note);
        for (int i: arr) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");

    }
    
}
