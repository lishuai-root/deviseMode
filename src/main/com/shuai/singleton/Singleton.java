package main.com.shuai.singleton;

/**
 * @description:
 * @author: LISHUAI
 * @createDate: 2021/4/14
 * @version: 1.0
 */
public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return Message.SINGLETON;
    }

    private static class Message {
        private static final Singleton SINGLETON = new Singleton();
    }
}
