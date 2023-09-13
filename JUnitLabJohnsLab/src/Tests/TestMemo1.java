package Tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.MemoUtil;

public class TestMemo1 {
    String memo = "Kelli";
    MemoUtil memoUtil = new MemoUtil(memo);

    @Before
    public void setUp() throws Exception {
        // Set up any necessary test fixtures or configurations here
    }

    @Test
    public void test() {
        assertEquals(memo, memoUtil.printMemo());
    }
    
    @Test
    public void testMemoLength() {
        int memoLength = memo.length();
        assertEquals(memoLength, memoUtil.returnMemoLength());
    }
    
    @Test
    public void testMemoNotNull() {
        assertNotNull(memoUtil.printMemo());
    }
}