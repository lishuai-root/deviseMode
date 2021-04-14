package main.com.shuai.singleton;

/**
 * @description: 枚举单例可以防止反射创建新的对象，也可以防止反序列化创建新的对象
 * 在一般的类中也可以通过变量加上transient关键字和重新ReadResult()方法防止反序列化创建新对象
 * @author: LISHUAI
 * @createDate: 2021/4/14
 * @version: 1.0
 */
public enum EnumSingleton {
    INSTANCE;

    public void fn() {
        System.out.println("我是枚举单例");
    }
}
