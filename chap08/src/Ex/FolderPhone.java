package Ex;

public class FolderPhone extends Phone{
    public FolderPhone(String owner) {
        super(owner);
    }

    @Override
    void hangUp() {
        System.out.println("folder phone hang up");    
    }

    @Override
    void hangOut() {
        System.out.println("folder phone hang out");
    }

    @Override
    public String toString() {
        return "folder phone " + super.toString();
    }
}
