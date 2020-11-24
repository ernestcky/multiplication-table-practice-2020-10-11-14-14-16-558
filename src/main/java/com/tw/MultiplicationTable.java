package com.tw;

public class MultiplicationTable {

    boolean isRangeValid(int input) {
        if (input > 0 && input <= 1000)
            return true;
        else
            return false;
    }

    boolean isStartAndEndNumValid(int startNumber, int endNumber) {
        if (startNumber > endNumber)
            return false;
        else
            return true;
    }

    boolean isInputValid(int startNumber, int endNumber) {
        boolean startNumInRange = isRangeValid(startNumber);
        boolean endNumInRange = isRangeValid(endNumber);
        boolean isStartAndEndNumValid = isStartAndEndNumValid(startNumber, endNumber);

        return startNumInRange && endNumInRange && isStartAndEndNumValid;
    }

    String generateExpression(int operand, int iteration) {
        String str = "";
        str += operand + "*" + iteration + "=" + operand*iteration;
        return str;
    }

    String generateTableLine(int startNumber, int endNumber) {
        String str = "";
        for (int i = startNumber; i <= endNumber; i++) {
            if (i != endNumber)
                str += generateExpression(i, endNumber) + "  ";
            else
                str += generateExpression(i, endNumber);
        }
        return str;
    }

    String generateMultiplicationTable(int startNumber, int endNumber) {
        String str = "";
        for (int i = startNumber; i <= endNumber; i++) {
            if (i != endNumber)
                str += generateTableLine(startNumber, i)  + "\r\n";
            else
                str += generateTableLine(startNumber, i);
        }
        return str;
    }

    public String create(int startNumber, int endNumber) {
        if (!isInputValid(startNumber, endNumber)) {
            return null;
        }
        else {
            return generateMultiplicationTable(startNumber, endNumber);
        }
    }
}
