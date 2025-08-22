package ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String,User> db = new HashMap<>(); //db 시뮬레이션
    public static void main(String[] args) {
        //회원가입 시뮬레이션(임의의 유저 정보 저장)
        db.put("id1",new User("id1","pw1","name1","phone1"));
        db.put("id2",new User("id2","pw2","name2","phone2"));
        db.put("id3",new User("id3","pw3","name3","phone3"));
        db.put("id4",new User("id4","pw4","name4","phone4"));
        db.put("id5",new User("id5","pw5","name5","phone5"));
        
        System.out.print("검색할 유저 id를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        var input = sc.next();
        System.out.println(db.get(input));
    }
}
