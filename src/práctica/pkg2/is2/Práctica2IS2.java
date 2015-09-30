package práctica.pkg2.is2;

public class Práctica2IS2 {
    
    public static void main(String[] args) {
        Integer [] array = {1,1,1,4,4,2,2,2,100};
        String[] array1 = {"Ana","Juan","Pedro","Ana","Juan"};
        Histogram myHistogram = new Histogram(array);
        System.out.println(myHistogram.getHistogram());
    }
}
