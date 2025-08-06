package _02_for;

public class T02_nested_for {
    public static void main(String[] args) {
        for(int i=0; i<9; i++){
            for(int j=0; j<8; j++){
                System.out.printf("%d * %d = %2d  ", j+2, i+1, (j+2)*(i+1));
            }
            System.out.println();
        }
        
        System.out.println("\n--------------------------------------");
        for(int i=0; i<8; i++){
            for(int j=0; j<9; j++){
                System.out.printf("%d * %d = %d\n", i+2, j+1, ((i+2)*(j+1)));
            }
        }
    }
}
