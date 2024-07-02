public class B01 implements Runnable {

    @Override
    public void run() {
        int i =2;
        for (int i1 = 0; i1 < 10; i1++) {
            System.out.println("i"+"*"+"i1"+"="+i*i1);
        }
    }
}
