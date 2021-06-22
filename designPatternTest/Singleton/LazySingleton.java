package SelfPractice.designPatternTest.Singleton;

public class LazySingleton {

    private LazySingleton(){}
    // to make sure object is created only when the
    private static LazySingleton lazySingleton;

    public static LazySingleton getInstance(){
        if (lazySingleton==null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
