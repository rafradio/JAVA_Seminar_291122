import difflist.*;

class Difflistprog {
    public static void main(String[] args) {
        Addclass obj = new Addclass();
        obj.arrInitA = obj.initSettings();
        obj.arrInitB = obj.initSettings();
        obj.arrAminusB = obj.arrDifferen(obj.arrInitA, obj.arrInitB);
        obj.arrBminusA = obj.arrDifferen(obj.arrInitB, obj.arrInitA);
        obj.printArray("Первый список: ", obj.arrInitA);
        obj.printArray("Второй список: ", obj.arrInitB);
        obj.printArray("А минус B: ", obj.arrAminusB);
        obj.printArray("B минус A: ", obj.arrBminusA);
        for (int i: obj.arrBminusA) {obj.arrAminusB.add(i);}
        obj.printArray("А ^ B: ", obj.arrAminusB);
        
    }
}