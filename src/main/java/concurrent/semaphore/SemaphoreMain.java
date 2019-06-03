package concurrent.semaphore;

public class SemaphoreMain {
    public static void main(String[] args) throws InterruptedException {
        BoundBlockedSet boundBlockedSet = new BoundBlockedSet(3);
        boundBlockedSet.add("1");
        boundBlockedSet.add("2");
        boundBlockedSet.add("3");

    }
}
