import java.util.*;

public class BinaryCalculator {
    private final static int BASE = 2;
    private final static Map<Integer, String> OCTALVALUES = new HashMap<>();

    static {
        OCTALVALUES.put(0, "000");
        OCTALVALUES.put(1, "001");
        OCTALVALUES.put(2, "010");
        OCTALVALUES.put(3, "011");
        OCTALVALUES.put(4, "100");
        OCTALVALUES.put(5, "101");
        OCTALVALUES.put(6, "110");
        OCTALVALUES.put(7, "111");
    }

    public BinaryCalculator () {
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
            int digit = Character.getNumericValue(character);
            answer.append(OCTALVALUES.get(digit));
        }

        return answer.toString();
    }
}
