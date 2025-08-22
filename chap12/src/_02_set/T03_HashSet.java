package _02_set;

import java.util.HashSet;
import java.util.Objects;

class Member {
    String name;
    int age;
    Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return age == member.age && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "이름: " + name + " 나이: " + age;
    }
}
public class T03_HashSet {
    public static void main(String[] args) {
        HashSet<Member> set = new HashSet<Member>();
        set.add(new Member("홍길동",20));
        set.add(new Member("홍길동",20));
        set.add(new Member("홍길동",123));
        set.add(new Member("다른사람",20));
        
        System.out.println("size:"+set.size());
    }
}
