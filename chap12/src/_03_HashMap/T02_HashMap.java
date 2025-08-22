package _03_HashMap;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class T02_HashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("id1","pw1");
        map.put("id2","pw2");
        map.put("id3","pw3");
        map.put("id4","pw4");
        map.put("id5","pw5");
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("id 입력: ");
            String id = sc.next();
            System.out.print("pw 입력: ");
            String pw = sc.next();
            if(map.containsKey(id)){
                if(Objects.equals(map.get(id), pw)){
                    System.out.println("로그인 되었습니다.");
                    break;
                }
                else {
                    System.out.println("pw가 일치하지 않습니다.");
                }
            }
            else {
                System.out.println("입력한 id는 없습니다.");
            }
        }
    }
}
