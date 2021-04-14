package main.com.shuai.singleton;

/**
 * @description:
 * @author: LISHUAI
 * @createDate: 2021/4/14
 * @version: 1.0
 */
public class SingletonMode {

    private static volatile SingletonMode singletonMode;

    private SingletonMode() {
    }

    public static SingletonMode getInstance() {
        if (singletonMode == null) {
            synchronized (SingletonMode.class) {
                if (singletonMode == null)
                    singletonMode = new SingletonMode();
            }
        }
        return singletonMode;
    }
}
