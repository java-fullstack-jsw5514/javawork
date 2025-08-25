package ex2.second;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookRun {
    private static Scanner sc =  new Scanner(System.in);
    private static LibraryController lc =  new LibraryController();

    public static void main(String[] args) {
        int input = 100;
        while(input != 0){
            System.out.println("*************** 메뉴 *************\n" +
                    "1. 새 도서 추가\n" +
                    "2. 전체 도서 조회\n" +
                    "3. 도서 검색\n" +
                    "4. 도서 삭제\n" +
                    "5. 도서명 오름차순 정렬\n" +
                    "0. 종료");
            input = sc.nextInt();
            sc.nextLine();
            doMenu(input);
        }
    }
    private static void doMenu(int menuVal){
        switch(menuVal){
            case 1-> { // 새 도서 추가
                System.out.print("추가할 도서의 제목을 입력해주세요: ");
                String title = sc.nextLine();
                System.out.print("추가할 도서의 작가를 입력해주세요: ");
                String author = sc.nextLine();
                System.out.print("추가할 도서의 범주를 입력해주세요: ");
                String category = sc.nextLine();
                System.out.print("추가할 도서의 가격을 입력해주세요: ");
                int price = sc.nextInt();
                sc.nextLine();
                lc.insertBook(new Book(title, author, category, price));
            }
            case 2->{ // 전체 도서 조회
                System.out.println(lc);
            }
            case 3->{ // 도서 검색
                System.out.print("검색어를 입력해주세요: ");
                ArrayList<Book> result = lc.searchBook(sc.nextLine());
                System.out.println(result!=null?result:"해당하는 책을 찾을 수 없습니다.");
            }
            case 4->{ // 도서 삭제
                System.out.print("삭제할 도서의 제목을 입력해주세요: ");
                String title = sc.nextLine();
                System.out.print("삭제할 도서의 작가를 입력해주세요: ");
                String author = sc.nextLine();
                Book result = lc.deleteBook(title, author);
                System.out.println(result!=null?
                        "삭제가 완료되었습니다.\n" +
                        "삭제된 책 정보\n"
                        +result
                        :"해당 책을 찾을 수 없습니다.");
            }
            case 5->{ // 도서명 기준 오름차순 정렬
                lc.ascTitle();
                System.out.println(lc);
            }
            case 0->{ // 종료
                System.out.println("종료합니다.");
            }
            default -> {
                System.out.println("잘못된 메뉴번호 입니다.");
            }
        }
    }
}
