package SelfPractice.designPatternTest;

import SelfPractice.designPatternTest.Singleton.LazySingleton;
import SelfPractice.designPatternTest.Singleton.SingletonTest;

public class AppTest {

    public static void main(String[] args) {

        //================================================================
        SingletonTest singletonTest = SingletonTest.getInstance();
        SingletonTest singletonTest1 = SingletonTest.getInstance();

        System.out.println(singletonTest.hashCode());
        System.out.println(singletonTest1.hashCode());

        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();

        System.out.println(lazySingleton.hashCode());
        System.out.println(lazySingleton1.hashCode());
        //==============================================================                                    
    }

}
