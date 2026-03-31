import java.util.*;

class A2P3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice"); list.add("Bob"); list.add("Charlie");
        System.out.println("ArrayList: " + list);
        list.set(1, "Ben");
        list.remove("Charlie");
        System.out.println("After Update/Delete: " + list);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple"); map.put(2, "Banana"); map.put(3, "Cherry");
        System.out.println("HashMap: " + map);
        map.put(2, "Blueberry");
        map.remove(3);
        System.out.println("After Update/Delete: " + map);

        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(3, "Cat"); tree.put(1, "Ant"); tree.put(2, "Bat");
        System.out.println("TreeMap (sorted): " + tree);
        tree.put(1, "Ape");
        tree.remove(3);
        System.out.println("After Update/Delete: " + tree);
    }
}
