package cofire.concurrent.thread.singleton;

//问题：多线程下可能创建多个实例。
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {

    }
}
