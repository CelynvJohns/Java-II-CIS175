package Tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.MemoUtil;


public class TestMemo2 {
    String memo = "Robert";
    MemoUtil memoUtil = new MemoUtil(memo);

    @Before
    public void setUp() throws Exception {
        // Set up any necessary test fixtures or configurations here
    }

    @Test
    public void test() {
        String memoMessage = "Hi Robert!";
        assertEquals(memoMessage, memoUtil.greetings());
    }
}
