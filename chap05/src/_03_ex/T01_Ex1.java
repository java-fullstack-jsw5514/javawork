package _03_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T01_Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("1.");
//        int[] intArr = new int[10];
//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = i;
//        }
//        for (int i = 0; i < intArr.length; i++) {
//            System.out.println(intArr[i]);
//        }
//        System.out.println();
//        
//        
//        System.out.println("2.");
//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = 10-intArr[i];
//        }
//        for (int i = 0; i < intArr.length; i++) {
//            System.out.println(intArr[i]);
//        }
//        System.out.println();
//        
//        
//        System.out.println("3.");
//        System.out.println("Enter array length: ");
//        int length = sc.nextInt();
//        int[] inputArr = new int[length];
//        for (int i = 0; i < length; i++) {
//            inputArr[i] = i;
//        }
//        for (int i = 0; i < length; i++) {
//            System.out.println(inputArr[i]);
//        }
//        System.out.println();
//        
//        
//        System.out.println("4.");
//        String[] strArr = new String[]{"사과","귤","포도","복숭아","참외"};
//        System.out.println(strArr[1]);
//        System.out.println();
//        
//        
//        System.out.println("5.");
//        System.out.println("Enter string : ");
//        String inputStr = sc.next();
//        System.out.println("Enter char you want to search: ");
//        char ch = sc.next().charAt(0);
//        char[] charArray = inputStr.toCharArray();
//        ArrayList<Integer> indexes = new ArrayList<>();
//        for (int i = 0; i < charArray.length; i++) {
//            if (charArray[i] == ch)
//                indexes.add(i);
//        }
//        System.out.println("number of indexes: " + indexes.size() + " indexes : " + indexes);
//        System.out.println();
//        
//        
//        System.out.println("6.");
//        char[] weekdays = new char[]{'월','화','수','목','금','토','일'};
//        System.out.println("Enter index of weekday: ");
//        int index = sc.nextInt();
//        if(index<0||index>6){
//            System.out.println("Invalid index");
//        }
//        System.out.println(weekdays[index]);
//        System.out.println();
//        
//        
//        System.out.println("7.");
//        System.out.println("Enter length of array: ");
//        length = sc.nextInt();
//        int[] arr = new int[length];
//        int sum = 0;
//        for (int i = 0; i < length; i++) {
//            System.out.println("Enter element " + i + " : ");
//            arr[i] = sc.nextInt();
//            sum += arr[i];
//        }
//        System.out.println("the sum of array elements: " + sum);
//        System.out.println();
//        
//        
//        System.out.println("8.");
//        System.out.println("Enter length of array(must be odd number over 2): ");
//        length = sc.nextInt();
//        while (length < 2 || length%2==0) {
//            System.out.println("Invalid length");
//            length = sc.nextInt();
//        }
//        int[] arr2 = new int[length];
//        for(int i = 0; i < length; i++){
//            if(i <= length/2){
//                arr2[i] = i+1;
//            }
//            else{
//                arr2[i] = arr2[i-1]-1;
//            }
//        }
//        for (int i = 0; i < length; i++) {
//            System.out.println(arr2[i]);
//        }
//        System.out.println();
//        
//        
//        System.out.println("9.");
//        String[] chickens = new String[]{"후라이드","양념"};
//        System.out.print("치킨이름을 입력하세요. : ");
//        String order = sc.next();
//        boolean found = false;
//        for (int i = 0; i < chickens.length; i++) {
//            if(chickens[i].equals(order)){
//                System.out.println(chickens[i]+"치킨 배달 가능");
//                found = true;
//                break;
//            }
//        }
//        if(!found){
//            System.out.println(order+"치킨은 없는 메뉴 입니다.");
//        }
//        System.out.println();
//        
//        
//        System.out.println("10.");
//        int min = 11;
//        int max = 0;
//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = (int)(Math.random()*10)+1;
//            System.out.println(intArr[i]+" ");
//            if(intArr[i]<min){
//                min = intArr[i];
//            }
//            if(intArr[i]>max){
//                max = intArr[i];
//            }
//        }
//        System.out.println("min: " + min + " max: " + max);
//        System.out.println();
//        
//        
        System.out.println("11.");
        int[] inputArr2 = new int[5];
        for (int i = 0; i < inputArr2.length; i++) {
            System.out.println("Enter element " + i + " : ");
            inputArr2[i] = sc.nextInt();
        }

        int maxVal = inputArr2[0];
        int maxIndex = 0;
        int temp;
        for (int j = 4; j > 0; j--) {
            for (int i = 1; i < inputArr2.length - 1; i++) {
                if (maxVal < inputArr2[i]) {
                    temp = maxVal;
                    maxVal = inputArr2[i];
                    inputArr2[i] = temp;
                    maxIndex = i;
                }
            }
            temp = inputArr2[maxIndex];
            inputArr2[maxIndex] = inputArr2[j];
            inputArr2[j] = temp;
        }
        System.out.println("sorted" + Arrays.toString(inputArr2));
        System.out.println();
        
        
        System.out.println("12.");
        //0 국어, 1 영어, 2 수학, 3 총점
        int[][] scores = new int[4][5];
        double[] averages = new double[5];
        String[] scoreName = new String[]{"국어", "영어", "수학"};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println((j+1)+"번 학생의" + scoreName[i] + " 점수를 입력하세요. : ");
                scores[i][j] = sc.nextInt();
            }
        }
        
        //1~5번 학생의 총점, 평균 계산   1~5 ->j
        for (int i = 0; i < 5; i++) {
            scores[3][i] = scores[0][i] + scores[1][i] + scores[2][i];
            averages[i] = (double)scores[3][i] / 3;
        }
        
        //출력
        System.out.println("  번호  국어  영어  수학  총점  평균");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.printf("   %d    %3d    %3d    %3d   %3d  %3.1f\n", i+1, scores[i][0], scores[i][1], scores[i][2], scores[i][3], averages[i]);
        }
        System.out.println("------------------------------------------");
        int[] scoreSum = new int[3];
        for (int i = 0; i < 5; i++) {
            scoreSum[i]+=scores[0][i];
        }
        for (int i = 0; i < 3; i++) {
            averages[i] = (double)scoreSum[i]/3;
        }
        System.out.printf("총점   %3d   %3d   %3d ", scoreSum[0], scoreSum[1], scoreSum[2]);
        System.out.printf("평균 %3.1f  %3.1f %3.1f", averages[0], averages[1], averages[2]);
    }
}
