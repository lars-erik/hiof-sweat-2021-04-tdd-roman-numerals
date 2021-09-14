import java.util.LinkedHashMap;
import java.util.Map;

public class Numerals {

    public static String toRoman(int number) {
        String result = "";

        for(Map.Entry<Integer, String> numeral: numerals.entrySet()) {
            while (number >= numeral.getKey()) {
                result += numeral.getValue();
                number -= numeral.getKey();
            }
        }

        return result;
    }

    public static Map<Integer, String> numerals = new LinkedHashMap<>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};
}