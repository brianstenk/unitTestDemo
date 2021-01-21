package unit;

import com.crystal.phase1.MyClass;
import org.junit.Assert;
import org.junit.Test;

public class myClassTest {
    @Test
    public void testKey(){
        MyClass myClass = new MyClass();
        myClass.setId(2);
        myClass.setName("My Secret Key");
        myClass.setSecret(5);

        Assert.assertEquals(myClass.calculateKey().intValue(), 10);
    }
}
