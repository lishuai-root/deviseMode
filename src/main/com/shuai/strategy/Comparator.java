package main.com.shuai.strategy;

/**
 * @description: 策略模式接口
 * @author: LISHUAI
 * @createDate: 2021/4/14
 * @version: 1.0
 */
public interface Comparator<T> {
    int compare(T t1, T t2);
}
