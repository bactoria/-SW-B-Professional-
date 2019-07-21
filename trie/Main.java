package lib.trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.add("a");
//        trie.add("abce");

        final String STR = "cd";

        trie.add("cde");
        trie.add(STR);

        System.out.println(trie.search(STR));
        trie.remove(STR);
        System.out.println(trie.search(STR));
        System.out.println(trie.search("cde"));


    }
}
