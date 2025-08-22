package Ex;

public abstract class Phone {
    String owner;
    public Phone(String owner) {
        this.owner = owner;
    }
    abstract void hangUp();
    abstract void hangOut();
    @Override
    public String toString() {
        return "owner: " + owner;
    }
}
