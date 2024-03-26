package Iterator;

import java.util.function.Consumer;

public class MyConsumer<T> implements Consumer<T>{
    public void accept(T t) {
        System.out.println(t);
    }
}
