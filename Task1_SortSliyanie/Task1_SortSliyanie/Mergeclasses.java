package Task1_SortSliyanie;
// import Task1_SortSliyanie.*;
import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

import Task1_SortSliyanie.TempForMerge.ArrayAnalyse;

public class Mergeclasses {
    public ArrayList<Integer> arrInit1;
    public ArrayList<Integer> arrInit2;
    public ArrayList<Integer> arrFinal = new ArrayList<Integer>();

    public Mergeclasses(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        this.arrInit1 = arr1;
        this.arrInit2 = arr2;
    }

    public void creatMerge() {
        if (this.arrInit1.size() > this.arrInit2.size()) {
            this.creatCalc(this.arrInit2, this.arrInit1);
        } else {
            this.creatCalc(this.arrInit1, this.arrInit2);
        }
    }

    public void creatCalc(ArrayList<Integer> arrShort, ArrayList<Integer> arrLong) {
        ArrayList<ArrayAnalyse> arrObjAn = new ArrayList<ArrayAnalyse>();
        
        arrObjAn.add(new ArrayAnalyse(0, arrShort, arrLong));
        arrObjAn.add(new ArrayAnalyse(0, arrLong, arrShort));
        
        // ArrayAnalyse arrObj1 = new ArrayAnalyse(0, arrShort, arrLong);
        // ArrayAnalyse arrObj2 = new ArrayAnalyse(0, arrLong, arrShort);
        int flag = 0, temp2 = 0;
        int temp1 = arrObjAn.get(0).findTemp();
    
        for (int i = 0; i < arrShort.size() + arrLong.size(); i++) {
            if (flag == 0) { temp2 = arrObjAn.get(1).findTemp();}
            if (flag == 1) { temp1 = arrObjAn.get(0).findTemp();}
            
            if (temp1 < temp2) {
                this.arrFinal.add(temp1);
                flag = 1;
            } else {
                this.arrFinal.add(temp2);
                flag = 0;
            }

        }

    }

    public void printMergedArray() {
        for (int i: this.arrFinal) {
            System.out.print(i + ", ");
        }

    }
    
}
