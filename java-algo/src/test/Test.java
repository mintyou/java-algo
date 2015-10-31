package test;

import java.util.Random;

public class Test {
      public static void main(String[] args) {
            
             /** 1부터 10까지 각각 홀수, 짝수, 전체합 출력 */
             int oddSum = 0;
             int evenSum = 0;
             int totalSum = 0;

             for ( int i = 0; i <= 10; i++) {
                   if ( i % 2 == 1) {
                         oddSum = oddSum + i;
                  } else if ( i % 2 == 0) {
                         evenSum = evenSum + i;
                  }
            }
             totalSum = oddSum + evenSum;
            System. out.println( "짝수합:" + evenSum );
            System. out.println( "홀수합:" + oddSum );
            System. out.println( "전체합:" + totalSum );
             // 과 비교해서

             /** 1부터 10까지 각각 홀수, 짝수, 전체합 출력(continue) */
             oddSum = 0;
             evenSum = 0;
             totalSum = 0;

             for ( int i = 0; i <= 10; i++) {
                   if ( i % 2 == 0) {
                         evenSum = evenSum + i;
                         continue;
                  }
                   oddSum = oddSum + i;
            }

             totalSum = oddSum + evenSum;
            System. out.println( "짝수합:" + evenSum );
            System. out.println( "홀수합:" + oddSum );
            System. out.println( "전체합:" + totalSum );
             // 이 훨씬 간결하다
      }
}