
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class D {


    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("b.dat")){
            FileChannel channel = fis.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1);

            channel.read(buffer);
            buffer.put("abc".getBytes());
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



































































//    public static void main(String[] args) {
//        try(RandomAccessFile r = new RandomAccessFile("b.dat", "rw")){
//            FileChannel fc = r.getChannel();
//            ByteBuffer b=ByteBuffer.allocate(2);
//            fc.read(b);
//            b.flip();
//            while(b.hasRemaining()){
//                System.out.print((char)b.get());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
}
