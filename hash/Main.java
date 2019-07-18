package lib.hash;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("key", 100);
        map.put("key3", 1000);
        map.put("key", 1000);
        map.put("key3", 20);
        map.put("key111", 20);

        System.out.println(map.get("key"));
        System.out.println(map.get("key3"));
        System.out.println(map.get("key4"));
        System.out.println(map.get("key111"));

        System.out.println(map.remove("key"));
        System.out.println(map.remove("key4"));
        System.out.println(map.remove("key111"));

        System.out.println(map.get("key111"));
        System.out.println(map.size());
        System.out.println(map.get("key3"));
        System.out.println(map.remove("key3"));
        System.out.println(map.size());
    }
}
