package unit;

import com.crystal.phase1.Lock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LockTest {
   @Test
    public void testLock(){
       Lock lock = new Lock(10);
       assertEquals(true, lock.isLocked());
       assertEquals(true, lock.unlock(10));
       assertEquals(false, lock.isLocked());

       lock.lock();
       assertEquals(true, lock.isLocked());
       assertEquals(false, lock.unlock(1));
       assertEquals(true, lock.isLocked());
   }
}
