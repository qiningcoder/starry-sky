import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        AtomicLong counter = new AtomicLong(0L);
        long cnt = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i<10000000; i++) {
            counter.incrementAndGet();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
