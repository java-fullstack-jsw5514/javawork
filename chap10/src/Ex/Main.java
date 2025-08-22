package Ex;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("name", 5);
        User user2 = new User("name", 5);
        System.out.println("user1: "+user1);
        System.out.println("user2: "+user2);
        System.out.println("equals: "+user1.equals(user2));
        System.out.println("user1 hash: "+user1.hashCode());
        System.out.println("user2 hash: "+user2.hashCode());
        System.out.println("user1 identity hash: " + System.identityHashCode(user1));
        System.out.println("user2 identity hash: " + System.identityHashCode(user2));
    }
}
