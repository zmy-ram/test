public class HungrySingleton {
private final static HungrySingleton INSTANCE=new HungrySingleton();
private HungrySingleton(){}
public static HungrySingleton getInstance(){
    System.out.println("1233");
    return INSTANCE;

}
}
