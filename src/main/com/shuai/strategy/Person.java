package main.com.shuai.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description:
 * @author: LISHUAI
 * @createDate: 2021/4/14
 * @version: 1.0
 */
@Data
@AllArgsConstructor
public class Person {

    private String name;

    private int age;

    private int height;

    public static class ComparatorName implements Comparator<Person> {

        public int compare(Person t1, Person t2) {
            if (!(t1 instanceof Person) || !(t2 instanceof Person))
                throw new ClassCastException("Arguments t1 or t2 is not Person Class!!!");
            if (t1 == null || t2 == null || t1.name == null || t2.name == null)
                throw new NullPointerException("Arguments t1 or t2 variable name is null!!!");
            return t1.name.compareTo(t2.name);
        }
    }

    public static class ComparatorAge implements Comparator<Person> {

        public int compare(Person t1, Person t2) {
            if (!(t1 instanceof Person) || !(t2 instanceof Person))
                throw new ClassCastException("Arguments t1 or t2 is not Person Class!!!");
            if (t1 == null || t2 == null)
                throw new NullPointerException("Arguments t1 or t2 is null!!!");
            if (t1.age > t2.age)
                return 1;
            else if (t1.age < t2.age)
                return -1;
            else
                return 0;
        }
    }

    public static class ComparatorHeight implements Comparator<Person> {

        public int compare(Person t1, Person t2) {
            if (!(t1 instanceof Person) || !(t2 instanceof Person))
                throw new ClassCastException("Arguments t1 or t2 is not Person Class!!!");
            if (t1 == null || t2 == null)
                throw new NullPointerException("Arguments t1 or t2 is null!!!");
            if (t1.height > t2.height)
                return 1;
            else if (t1.height < t2.height)
                return -1;
            else
                return 0;
        }
    }
}
