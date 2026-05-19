package cofire.concurrent.thread.singleton;

//特点：懒加载（用到 Holder 才初始化）；由 JVM 类初始化机制保证线程安全；写法干净。
//注意：单纯这种模式仍可能被反射 newInstance 等方式绕过构造私有化（要看你是否要防反射）。
public class HolderSingleton {
    private static class Holder {
        static final HolderSingleton instance = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.instance;
    }


    private HolderSingleton() {

    }
}
