public enum Choices {
    FROM_DECIMAL_TO_BINARY(1, "FROM DECIMAL TO BINARY"),
    FROM_OCTAL_TO_BINARY(2,  "FROM OCTAL TO BINARY"),
    FROM_HEX_TO_BINARY(3, "FROM HEX TO BINARY");

    private String text;
    private int value;

    Choices(int value, String text) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public int getValue() {
        return value;
    }

    public static Choices fromValue(int value) {
        for (Choices choice : Choices.values()) {
            if (choice.getValue() == value) {
                return choice;
            }
        }
        throw new IllegalArgumentException("Invalid choice: " + value);
    }
}
