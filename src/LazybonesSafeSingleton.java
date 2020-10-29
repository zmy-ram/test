public class LazybonesSafeSingleton {
    private static LazybonesSafeSingleton instance=null;
    private LazybonesSafeSingleton(){}

    public static synchronized LazybonesSafeSingleton getInstance(){
        if (instance==null){
          instance=new LazybonesSafeSingleton();
    }
        return instance;
    }
}
