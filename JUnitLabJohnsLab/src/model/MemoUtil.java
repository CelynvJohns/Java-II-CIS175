package model;

public class MemoUtil {
    private String memo;

    public MemoUtil(String memo) {
        this.memo = memo;
    }

    // prints the memo
    public String printMemo() {
        return memo;
    }
    
    public String greetings() {
        return "Hi " + memo + "!";
    }
    
    public int returnMemoLength() {
        return memo.length();
    }
}
