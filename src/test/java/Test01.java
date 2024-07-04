public class Test01 {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("begin");
//        Thread.sleep(600);
        Thread t1 = new Thread(()->{int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            Thread.yield();
            System.out.println(i);
        }});
        Thread t2 =new Thread( ()->{
            int i =2;
            for (int i1 = 0; i1 < 10; i1++) {
                System.out.println("i"+"*"+"i1"+"="+i*i1);
            }
        });
        t2.start();
        t1.start();

//        System.out.println("+++++++++++++++++++++++++++++++");


//        System.out.println("好帅阿");
    }

}
