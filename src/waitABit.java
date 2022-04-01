public class waitABit {
    public static void doIt(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
