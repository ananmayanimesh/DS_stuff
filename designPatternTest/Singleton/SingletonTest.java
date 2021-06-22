package SelfPractice.designPatternTest.Singleton;

public class SingletonTest {

    private SingletonTest(){}

    private final static SingletonTest singletonTest = new SingletonTest();

    public static SingletonTest getInstance(){
        return singletonTest;
    }

}
