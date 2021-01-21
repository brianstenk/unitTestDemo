package it;

import com.crystal.phase1.Lock;
import com.crystal.phase1.MyClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//gonna test the MyClass and Lock togather
public class MyClassIT {
    @Test
    public void intergrationKeyTest() {
        MyClass myClass = new MyClass();
        myClass.setSecret(5);
        myClass.setId(2);
        myClass.setName("Key");

        Lock lock = new Lock(10);
        //Unlock with right key
        assertTrue(lock.unlock(myClass.calculateKey()));
        assertEquals(false, lock.isLocked());

        //Lock
        lock.lock();
        myClass.setSecret(6);
        //with a wronk key
        assertEquals(false,
                lock.unlock(myClass.calculateKey()));
        assertEquals(true,
                lock.isLocked());

    }


}
