package util;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random victim = new Random(12345); // 시드 몰라도 됨 (공격자 입장)
        double r1 = victim.nextDouble();
        double r2 = victim.nextDouble();
        System.out.println("관측된 난수: " + r1 + ", " + r2);

        // 2) 공격자가 역산 시도
        long mask = (1L << 48) - 1;
        long multiplier = 0x5DEECE66DL;
        long addend = 0xBL;

        // brute-force: 상위 16비트만 고정 → 가능
        // (실제 공격 코드는 더 최적화 가능)
        for (long seed = 0; seed < (1L << 48); seed++) {
            Random test = new Random();
            test.setSeed(seed);
            double t1 = test.nextDouble();
            double t2 = test.nextDouble();
            if (Math.abs(t1 - r1) < 1e-12 && Math.abs(t2 - r2) < 1e-12) {
                System.out.println("복구된 시드: " + seed);
                // 이후 값도 예측 가능
                System.out.println("다음 난수 예측: " + test.nextDouble());
                break;
            }
            else
                System.out.println(seed+"은(는) 아님.");
        }
        System.out.println("실제 다음 난수: "+victim.nextDouble());
    }
}
