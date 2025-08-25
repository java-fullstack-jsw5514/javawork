package _06_Ex_ArrayList;

import java.util.Scanner;

/*
BookRun
     new LibraryController(new Member("", , "")) 객체 생성
     책 넣기
     책 목록 출력
     책 검색	
 */
public class BookRun {
    public static void main(String[] args) {
        LibraryController ctrl = new LibraryController(
                new Member("홍길동",10,"남"));
        ctrl.insertBook();
        ctrl.insertBook(new Book());
        System.out.println("목록:"+ctrl.selectAll());
        System.out.print("검색할 책 제목 입력: ");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        Book result = ctrl.searchBook(title);
        System.out.println(result!=null?result:"제목이 "+title+"인 책을 찾지 못 했습니다.");
    }
}
