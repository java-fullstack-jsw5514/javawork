package Ex;

import java.util.ArrayList;

public class PhoneRun {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new FolderPhone("me"));
        phones.add(new SmartPhone("you"));
        
        for (Phone phone : phones) {
            System.out.println(phone);
            phone.hangUp();
            phone.hangOut();
        }
    }
}
