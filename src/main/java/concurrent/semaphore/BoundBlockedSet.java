package concurrent.semaphore;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class BoundBlockedSet {
    private Set<String> hashSet;
    private Semaphore semaphore;

    public BoundBlockedSet(int bound) {
        hashSet = Collections.synchronizedSet(new HashSet<String>());
        semaphore = new Semaphore(bound);
    }

    public void add(String s) throws InterruptedException {
        semaphore.acquire();
        boolean add = false;

        try {
           add = hashSet.add(s);
        } finally {
            if (!add) {
                semaphore.release();
            } else {
                // do nothing
            }
        }

    }

    private void remove(String s) {
        boolean remove = hashSet.remove(s);
        if (remove) {
            semaphore.release();
        } else {
            // do nothing
        }
    }

}
