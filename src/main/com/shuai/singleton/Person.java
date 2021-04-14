package main.com.shuai.singleton;

import java.io.Serializable;

/**
 * @description:
 * @author: LISHUAI
 * @createDate: 2021/4/14
 * @version: 1.0
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    //  加上transient关键字防止变量被反序列化
    private static transient Person person;

    private Person() {
    }

    public static Person getPerson() {
        if (person == null) {
            synchronized (SingletonMode.class) {
                if (person == null)
                    person = new Person();
            }
        }
        return person;
    }

    /**
     * 防止反序列化创建新的对象
     * 在反序列化的时候会默认调用这个方法，创建一个新的对象
     *
     * @return
     */
    private Person ReadResult() {
        return person;
    }
}
