package main.com.shuai.singleton;

/**
 * @description:
 * @author: LISHUAI
 * @createDate: 2021/4/14
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            new Thread(new Runnable() {
                public void run() {
                    EnumSingleton.INSTANCE.fn();
                }
            }).start();
    }
}
