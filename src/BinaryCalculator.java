import java.util.*;

public class BinaryCalculator {
    private final static int BASE = 2;
    private final static Map<Character, String> OCTALVALUES = new HashMap<>(8);
    private final static Map<Character, String> HEXVALUES = new HashMap<>(16);

    static {
        OCTALVALUES.put('0', "000");
        OCTALVALUES.put('1', "001");
        OCTALVALUES.put('2', "010");
        OCTALVALUES.put('3', "011");
        OCTALVALUES.put('4', "100");
        OCTALVALUES.put('5', "101");
        OCTALVALUES.put('6', "110");
        OCTALVALUES.put('7', "111");

        HEXVALUES.put('0', "0000");
        HEXVALUES.put('1', "0001");
        HEXVALUES.put('2', "0010");
        HEXVALUES.put('3', "0011");
        HEXVALUES.put('4', "0100");
        HEXVALUES.put('5', "0101");
        HEXVALUES.put('6', "0110");
        HEXVALUES.put('7', "0111");
        HEXVALUES.put('8', "1000");
        HEXVALUES.put('9', "1001");
        HEXVALUES.put('A', "1010");
        HEXVALUES.put('B', "1011");
        HEXVALUES.put('C', "1100");
        HEXVALUES.put('D', "1101");
        HEXVALUES.put('E', "1110");
        HEXVALUES.put('F', "1111");
    }

    public String fromDecimal(int number) {
        StringBuilder answer = new StringBuilder();
        if (number == 0) return "0";

        int quotient = number;

        while (quotient >= BASE) {
            int rest = quotient % BASE;
            answer.insert(0, rest);
            quotient = quotient / BASE;
        }

        answer.insert(0, quotient);

        return answer.toString();
    }

    public String fromOctal(int number) {
        StringBuilder answer = new StringBuilder();

        String stringNumber = String.valueOf(number);

        for (char character: stringNumber.toCharArray()) {
            answer.append(OCTALVALUES.get(character));
        }

        return answer.toString();
    }

    public String fromHex(String number) {
        StringBuilder answer = new StringBuilder();

        for (char character: number.toUpperCase().toCharArray()) {
            answer.append(HEXVALUES.get(character));
        }
        return answer.toString();
    }
}
