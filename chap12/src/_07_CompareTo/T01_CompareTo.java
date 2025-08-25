package _07_CompareTo;

import java.util.TreeSet;

class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(age < o.age){
            return -1;
        }
        else if(age > o.age){
            return 1;
        }
        else{
            return 0;
        }
        //Integer.compare(age, o.age); //같은 코드
    }
}
public class T01_CompareTo {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person("홍길동", 45));
        persons.add(new Person("나자바", 24));
        persons.add(new Person("더조은", 32));
        System.out.println(persons);
    }
}
