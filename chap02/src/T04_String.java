public class T04_String {
    public static void main(String[] args) {
        String str = "801호";
        String str2 = "java 풀스택";
        System.out.println(str + str2);
        
        //escape sequence(이스케이프 문자)
        /*
         \ + 문자 : 조합으로 특수 기능 수행
         \n : 줄바꿈
         \t : 탭
         \" : 쌍따옴표 출력
         \\ : 역슬래시 출력
         */
        System.out.println("강의실 : 801호\n강좌명 : \"java\t풀스택 웹&앱 개발자\"");
    }
}
