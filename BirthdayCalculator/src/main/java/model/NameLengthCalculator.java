package model;

public class NameLengthCalculator {

    private String nameOne;
    private String nameTwo;

    public NameLengthCalculator(String nameOne, String nameTwo) {
        this.nameOne = nameOne;
        this.nameTwo = nameTwo;
    }

    public String getLongerName() {
        int length1 = nameOne.length();
        int length2 = nameTwo.length();

        if (length1 > length2) {
            return nameOne;
        } else if (length2 > length1) {
            return nameTwo;
        } else {
        	String same = "They were the same length";
            return same;
        }
    }
}
