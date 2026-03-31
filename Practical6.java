import java.io.*;

class A2P6 {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] files = dir.listFiles();

        if (files != null) {
            for (File f : files) {
                System.out.println((f.isDirectory() ? "[DIR] " : "[FILE] ") + f.getName());
            }
        } else {
            System.out.println("Directory not found.");
        }
    }
}
