package lib.list;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] num = {7, 1, 2, 3, 4, 5};
        Arrays.sort(num, (o1, o2) -> o2 - o1);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(6);

        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list2.add("안녕ㅋㅋ: " + i);
        }

        System.out.println(list2);
        System.out.println("list2[0]: " + list2.get(0));
        System.out.println("list2[1]: " + list2.get(1));
        System.out.println(list2.remove(3));
        System.out.println(list2.remove(5));
        System.out.println(list2);

        System.out.println(list2);

        for (String s : list2) {
            System.out.print(s + "   ");
        }

    }
}
