public class LazybonesSingleton {
    private static LazybonesSingleton instance=null;
    private LazybonesSingleton(){}

    public static LazybonesSingleton getInstance(){
        if (instance==null){
            instance=new LazybonesSingleton();
        }
        return instance;
    }
}
