public class A01 implements Runnable {
    private int num;
    public A01(int num) {
        this.num = num;
    }
    @Override
    public void run() {
        for (int i = 0; i < num; i++) {
            if (i==5){
                Thread t1 = new Thread(new A01('G'));
                t1.start();
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        }
    }


//    @Override
//    public void run() {
//        int[] myArray = new int[10];
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(i);
//        }
//    }
}
