package práctica.pkg2.is2;

public class Práctica2IS2 {
    
    public static void main(String[] args) {
        int [] array = {1,1,1,4,4,2,2,2,100};
        Histogram myHistogram = new Histogram(array);
        System.out.println(myHistogram.getHistogram());
    }
}
