public class C01 {

    public static void main(String[] args) {
        Thread thread = new Thread(new A01(10));
        thread.start();
    }









//    public static void main(String[] args) {
//        Thread t1 = Thread.startVirtualThread(new A01());
//        Thread t2 = Thread.startVirtualThread(new B01());
//
//        try {
//            t2.join();
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
//        Thread t3 = Thread.startVirtualThread(() -> {
//            int[] myArray = new int[10];
//            for (int i = 0; i < myArray.length; i++) {
//                System.out.println(i);
//            }
//        });
//        Thread t4 = Thread.startVirtualThread(() -> {
//            int i = 2;
//            for (int i1 = 0; i1 < 10; i1++) {
//                System.out.println("i" + "*" + "i1" + "=" + i * i1);
//            }
//        });
//
//        try {
//            t4.join();
//            t3.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
//        Thread t5 = Thread.ofVirtual().start(
//                () -> {
//            int[] myArray = new int[10];
//            for (int i = 0; i < myArray.length; i++) {
//                System.out.println(i);
//            }
//                }
//        );
//        Thread t6 = Thread.ofVirtual().start(
//                ()->{
//                    int i =2;
//                    for (int i1 = 0; i1 < 10; i1++) {
//                        System.out.println("i"+"*"+"i1"+"="+i*i1);
//                    }
//                }
//                );
//
//
//        try {
//            t6.join();
//            t5.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
