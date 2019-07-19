package lib.bitMask;

/**
 * @author Sooduck, Park
 * @since 2019-07-16 [2019.7월.16]
 */

public class BitMask {
    public static void main(String[] args) {
        // 비트카운트
        System.out.println(Integer.bitCount(1));
        System.out.println(Integer.bitCount(5));
        System.out.println(Integer.bitCount(7));


        int num1 = 0b101011;
        int num2 = 0b110010;

        // 합집합
        int union = num1 | num2;
        // 교집합
        int intersection = num1 & num2;
        //차집합
        int differenceSet = num1 - (num1 & num2);

        p(union);
        p(intersection);
        p(differenceSet);


//        사람 15명이 있어. 1번 ~ 15번. 3,7번이 visited 했어. 방문 안한 사람 출력
        final int visitor1 = 3;
        final int visitor2 = 7;
        final int N = 15;

        // 방법1. boolean[]
        boolean[] visited = new boolean[N];

        visited[visitor1 - 1] = true;
        visited[visitor2 - 1] = true;

        for (int i = 0; i < N; i++) {
            if (!visited[i]) System.out.print((i + 1) + " ");
        }
        System.out.println();

        // 방법2. 비트마스크
        int visitedd = 0;
        visitedd |= (1 << (visitor1 - 1));
        visitedd |= (1 << (visitor2 - 1));

        for (int i = 0; i < N; i++) {
            if ((visitedd & (1 << i)) == 0) System.out.print((i + 1) + " ");
        }

    }

    private static void p(int i) {
        System.out.println(Integer.toBinaryString(i));
    }

}
