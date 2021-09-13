public class Numerals {

    public static String toRoman(int number) {
        String result = "";

        if (number == 3) {
            result = "III";
        }

        if (number == 2) {
            result = "II";
        }

        if (number == 1) {
            result = "I";
        }

        return result;
    }

}