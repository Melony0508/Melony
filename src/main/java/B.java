import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class B {
    public static void main(String[] args) {
        try(RandomAccessFile r = new RandomAccessFile("b.txt","rw") ){
            r.write("dfsbfkjbb".getBytes());
            byte[]bytes=new byte[10];
            var len=r.read(bytes);
            System.out.println(len);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
