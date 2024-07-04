public class B01 implements Runnable {
    private final char c;

    public B01(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 'A'; i < c; i++) {
            System.out.printf("%-3c", (char)i);
        }
    }


//    @Override
//    public void run() {
//        int i =2;
//        for (int i1 = 0; i1 < 10; i1++) {
//            System.out.println("i"+"*"+"i1"+"="+i*i1);
//        }
//    }
}
