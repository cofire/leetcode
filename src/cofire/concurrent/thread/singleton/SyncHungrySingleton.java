package cofire.concurrent.thread.singleton;

//特点：最简单；线程安全（由类初始化保证）。
//缺点：不用也会占用资源（通常可忽略）。
public class SyncHungrySingleton {
    public static SyncHungrySingleton hungrySingleton;

    public static synchronized SyncHungrySingleton getInstance() {
        if (hungrySingleton == null) {
            hungrySingleton = new SyncHungrySingleton();
        }
        return hungrySingleton;
    }

    private SyncHungrySingleton() {

    }
}
