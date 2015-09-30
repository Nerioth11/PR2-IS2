package práctica.pkg2.is2;

public class CalculateHistogram {

    public static <T> Histogram <T> calculateHistogram (T [] array){
       
        Histogram <T> histogram = new Histogram<>();
        
        for(T key : array){
            histogram.increase(key);
        }
        return histogram;
    }
}
