package main.com.shuai.strategy;

/**
 * @description:
 * @author: LISHUAI
 * @createDate: 2021/4/14
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person[] person = new Person[]{new Person("l", 22, 178),
                new Person("ls", 25, 178),
                new Person("li", 23, 168),
                new Person("lis", 24, 175),
                new Person("lish", 20, 182)};
        SortUtil<Person> sortUtil = new SortUtil<Person>();
        sortUtil.sort(person, new Person.ComparatorHeight());
        for (int i = 0; i < person.length; i++)
            System.out.println(person[i]);
    }
}
