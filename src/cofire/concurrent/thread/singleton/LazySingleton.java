package cofire.concurrent.thread.singleton;

//问题：多线程下可能创建多个实例。
public class LazySingleton {
    public static LazySingleton lazySingleton;

    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    private LazySingleton() {

    }
}
