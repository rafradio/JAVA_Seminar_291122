package Task1_SortSliyanie.TempForMerge;

import java.util.ArrayList;

public class ArrayAnalyse {
    public ArrayList<Integer> arrPush;
    public ArrayList<Integer> arrAnother;
    public int index;
    public int temp;

    public ArrayAnalyse(int i, ArrayList<Integer> arr, ArrayList<Integer> arrAnother) {
        this.index = i;
        this.arrPush = arr;
        this.arrAnother = arrAnother;
    }

    public int findTemp() {
        if (this.index < this.arrPush.size()) {
            this.temp = this.arrPush.get(this.index);
            this.index += 1;
        } else {
            this.temp = this.arrAnother.get(this.arrAnother.size() - 1);
        }
        return this.temp;
    }

}
