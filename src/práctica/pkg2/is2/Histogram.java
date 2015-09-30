package práctica.pkg2.is2;

import java.util.HashMap;

public class Histogram <T>{
    
    public Histogram(T[] array) {
        this.array = array;
    }
    
    private final T[] array;

    public T[] getArray() {
        return array;
    }
    
    public HashMap<T,Integer> getHistogram(){
        
        HashMap<T, Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < array.length; i++) {
            
            if(!histogram.containsKey(array[i])){
                histogram.put(array[i], 0);
            }
            histogram.put(array[i], histogram.get(array[i])+1);
        }
        return histogram;
    }
}
