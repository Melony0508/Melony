import java.io.*;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("a.txt"));
        String line;
        while ((line = reader.readLine())!= null) {
            // 处理读取到的行
            System.out.println(line);
        }
        reader.close();








//        try (RandomAccessFile r=new RandomAccessFile("a.txt","rw")){
//            r.seek(401);
//            System.out.println((char)r.read() );
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
