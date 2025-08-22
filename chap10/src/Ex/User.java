package Ex;

import java.util.Objects;

public class User {
    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof User && name.equals(((User) obj).name)  && age == ((User) obj).age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age;
    }
}
