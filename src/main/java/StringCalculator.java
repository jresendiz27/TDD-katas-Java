public class StringCalculator {
    public int add(String values) {
        int value = 0;
        if (values.length() > 0) {
            value = Integer.parseInt(values);
            return value;
        }
        return 0;
    }
}