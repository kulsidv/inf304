package Map;

public class Main {
    public static void main(String args[]) {
        Map<Integer, Integer> map = new Map<Integer, Integer>();
        map.put(9875, 90);
        System.out.println(map.get(9875));
        System.out.println(map.remove(9875));
        System.out.println(map.get(9875));
        System.out.println(map.get(45));
    }
}
