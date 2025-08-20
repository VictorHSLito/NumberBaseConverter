public class OctalCalculator {
    private final static int BASE = 8;

    public String fromDecimal(int number) {
        StringBuilder answer = new StringBuilder();

        int quotient = number;

        while (quotient >= BASE) {
            int resto = quotient % BASE;
            answer.insert(0, resto);
            quotient /= BASE;
        }

        answer.insert(0, quotient);

        return answer.toString();
    }
}
