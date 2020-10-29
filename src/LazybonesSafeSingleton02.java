import org.jetbrains.annotations.Contract;

import java.util.Collections;
import java.util.Map;

import static java.util.Collections.synchronizedMap;

public class LazybonesSafeSingleton02 {
    private static volatile LazybonesSafeSingleton02 instance=null;

    @Contract(pure = true)
    public LazybonesSafeSingleton02() {
    }
    public static LazybonesSafeSingleton02 getInstance(){
         if (instance==null){
             synchronized (LazybonesSafeSingleton02.class){
                 if (instance==null){
                     instance=new LazybonesSafeSingleton02();

                 }
             }
         }
        return instance;
    }
}
