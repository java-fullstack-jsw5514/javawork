package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class T04_BoardRun {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();
        
        Board b1 = new Board("제목1","내용1","글쓴이1");
        list.add(b1);
        list.add(new Board("2","2","2"));
        list.add(new Board("3","3","3"));
        list.add(new Board("4","4","4"));
        list.add(new Board("5","5","5"));
        
        System.out.println("size:"+list.size());
        Board one = list.get(1);
        System.out.println(one);
        
        for(Board board:list){
            System.out.println(board);
        }
        for(Iterator<Board> it = list.iterator();it.hasNext();){
            Board board = it.next();
            System.out.println(board);
            it.remove();
        }
    }
}
