import java.util.concurrent.atomic.AtomicReference;

public class SingleTon {
    private static AtomicReference<SingleTon> instance = new AtomicReference<>();
    private SingleTon(){}
    public static SingleTon getInstance(){
        for(;;) {
            SingleTon singleTon = instance.get();
            if (singleTon != null) {
                return singleTon;
            } else {
                instance.compareAndSet(null,new SingleTon());
            }
        }
    }
}
