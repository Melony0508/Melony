import java.io.*;

public class A {
    public static void main(String[] args) {
        try(Writer writer = new FileWriter("a.txt");
        Reader reader = new FileReader("a.txt")){
            writer.write("hello world\n");
            writer.flush();

            char[] chars = new char[20];
            reader.read(chars);
            System.out.println(chars);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
