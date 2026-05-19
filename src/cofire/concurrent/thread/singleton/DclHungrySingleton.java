package cofire.concurrent.thread.singleton;

//要点：内层二次判断 + volatile，避免「半初始化对象」被别的线程看见。
//特点：按需创建；并发性能通常好于「整个方法同步」。
public class DclHungrySingleton {
    public static volatile DclHungrySingleton dclHungrySingleton;

    public static DclHungrySingleton getInstance() {
        if (dclHungrySingleton == null) {
            synchronized (DclHungrySingleton.class) {
                if (dclHungrySingleton == null) {
                    dclHungrySingleton = new DclHungrySingleton();
                }
            }

        }
        return dclHungrySingleton;
    }

    private DclHungrySingleton() {

    }
}
