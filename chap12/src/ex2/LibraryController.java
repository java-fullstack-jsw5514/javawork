package ex2;

import java.util.ArrayList;

/*
   LibraryController
      속성 :
		member (Member 객체를 저장하는 필드)
		ArrayList<Book> aList 객체 생성
     생성자 :
		Member 객체를 매개변수로 받는 생성자 {
			인스턴스변수 member에 넣기 
		}
     메소드 :
		void info{member의 toString() 출력}
		void insertBook() {
			aList.add(  )
			aList.add(  )
			aList.add(  )
		}
		void insertBook(Book book) {
			받은 book을 aList에 추가
		}
		ArrayList<Book> selectAll() {
			return aList;
		}
		Book searchBook(String bookTitle) {
			Book book = null;
			for() {

			}
			return book;
		}
 */
public class LibraryController {
    Member member;
    ArrayList<Book> aList =  new ArrayList<>();
    public LibraryController(Member member) {
        this.member = member;
    }
    public void info(){
        System.out.println(member);
    }
    public void insertBook() {
        aList.add(new Book("sample book 1","sample author","sample publisher"));
        aList.add(new Book("sample book 2","sample author","sample publisher"));
        aList.add(new Book("sample book 3","sample author","sample publisher"));
    }
    public void insertBook(Book book) {
        aList.add(book);
    }
    public ArrayList<Book> selectAll() {
        return aList;
    }
    public Book searchBook(String bookTitle) {
        Book book = null;
        for(int i = 0; i < aList.size(); i++) {
            if(aList.get(i).getTitle().equals(bookTitle)) {
                book = aList.get(i);
                break;
            }
        }
        return book;
    }
}
