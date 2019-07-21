package lib.trie;

import lib.hash.HashMap;
import lib.hash.Map;

public class Trie {
    Map<Character, Trie> nodes = new HashMap<>();
    boolean isEndOfWord;
    int count;

    public void add(String s) {
        count++;
        Trie child = this;
        for (char c : s.toCharArray()) {
            if (!child.nodes.containsKey(c)) {
                child.nodes.put(c, new Trie());
            }
            child = child.nodes.get(c);
            child.count++;
        }
        child.isEndOfWord = true;
    }

    public boolean search(String s) {
        return this.search(s, 0);
    }

    private boolean search(String s, int h) {
        if (s.length() == h) {
            return this.isEndOfWord;
        }

        char c = s.charAt(h);

        if (!nodes.containsKey(c)) {
            return false;
        }

        Trie child = nodes.get(c);
        return child.search(s, h + 1);
    }

    public boolean remove(String s) {
        if (!search(s)) {
            return false;
        }

        count--;
        Trie child = this;
        for (char c : s.toCharArray()) {
            child = child.nodes.get(c);
            child.count--;

            if (child.count == 0) {
                nodes.remove(c);
                return true;
            }
        }
        child.isEndOfWord = false;

        return true;
    }
}
