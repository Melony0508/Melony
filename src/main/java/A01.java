public class A01 implements Runnable {

    @Override
    public void run() {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(i);
        }
    }
}
