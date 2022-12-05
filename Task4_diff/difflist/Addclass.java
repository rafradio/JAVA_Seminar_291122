package difflist;
import java.util.ArrayList;
import java.util.Random;   

public class Addclass {
    public int from = 0;
    public int to = 7;
    public ArrayList<Integer> arrInitA;
    public ArrayList<Integer> arrInitB;
    public ArrayList<Integer> arrAminusB;
    public ArrayList<Integer> arrBminusA;
    public Addclass() {
        // this.initSettings();
    }

    public ArrayList<Integer> initSettings() {
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();   

        int length = 1 + random.nextInt(5);  
        System.out.println(length);
        for (int i = 0; i < length; i++)  {
            arr.add(5 + random.nextInt(this.to));
        }
        return arr;

    }

    public ArrayList<Integer> arrDifferen(ArrayList<Integer> arrA, ArrayList<Integer> arrB) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i: arrA) {
            Boolean include = false;
            for (int j: arrB) {
                if (i == j) {include = true;}
            }
            if (!(include)) {arr.add(i);}
        }
        return arr;

    }

    public void printArray(String note, ArrayList<Integer> arr) {
        System.out.println(note);
        if (arr.size() == 0) {
            System.out.println("Список пустой");
        } else {
            for (int i: arr) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(" ");

    }

    
}
