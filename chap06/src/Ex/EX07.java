package Ex;


public class EX07 {
    //203p~206p
    /*
    1. 3
    2. 4
    3. 아래 참조
    4. 2
    5. 4
    6. 함수명은 같고 다른 매개변수 형태(타입, 갯수)를 가진 함수를 여러개 만드는 것
    7. println
    8. 출력값: 579
    9. 아래 참조
    10. this
    11. 아래 참조
    12. 1
     */
    public static void main(String[] args) {
        Exercise s1 = Exercise.getInstance();
        Exercise s2 = Exercise.getInstance();
        System.out.println(s1 == s2);
        
        int[] arr = new int[]{9,5,24,13,3,21};
        Math math = new Math();
        System.out.println("max value is " + math.max(arr));
        System.out.println("min value is " + math.min(arr));
        
    }
}
class Person{
    String name;
    String gender;
    int age;
    int height;
    int weight;
}
class Exercise{
    private static Exercise instance;
    
    private Exercise() {}
    public static Exercise getInstance(){
        if(instance == null){
            instance = new Exercise();
        }
        return instance;
    }
}
class Math{
    public static int max(int... nums){
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public static int min(int... nums){
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}