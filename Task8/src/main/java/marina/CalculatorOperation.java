package marina;

public enum CalculatorOperation {
    Addition, Subtraction, Multiplication, Division, Unknown, EXIT;

    public static CalculatorOperation parse(String s) {
        if (s == null || "".equals(s)) return Unknown;
        else if ("+".equals(s)) return Addition;
        else if ("-".equals(s)) return Subtraction;
        else if ("*".equals(s)) return Multiplication;
        else if ("/".equals(s)) return Division;
        else if ("r".equals(s)) return EXIT;
        else return Unknown;
    }
}
