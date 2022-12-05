import Oddclass.AddclassOdd;

class Oddprogram {
    public static void main(String[] args) {
        AddclassOdd obj = new AddclassOdd();
        obj.printArray("Первоначальный список: ", obj.arrInit1);
        obj.deleteOdd();;
        obj.printArray("Обновленный список: ", obj.arrFinal);
        
    }
}