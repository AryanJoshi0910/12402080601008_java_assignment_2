import java.io.*;
import java.util.*;

class A2P5 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("input.txt");
        pw.println("hello world hello java world hello");
        pw.close();

        Map<String, Integer> count = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            for (String word : line.split("\\s+")) {
                count.put(word, count.getOrDefault(word, 0) + 1);
            }
        }
        br.close();

        System.out.println("Word Occurrences: " + count);
    }
}
