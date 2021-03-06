import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Roman_Numerals {

    @ParameterizedTest
    @MethodSource("numbers")
    public void Converts_From_Decimal_To_Roman(String expected, int input)
    {
        assertEquals(expected, Numerals.toRoman(input));
    }

    public static Stream numbers() {
        return Stream.of(
            Arguments.of("I", 1),
            Arguments.of("II", 2),
            Arguments.of("III", 3),
            Arguments.of("IV", 4),
            Arguments.of("V", 5),
            Arguments.of("VI", 6),
            Arguments.of("VII", 7),
            Arguments.of("VIII", 8),
            Arguments.of("IX", 9),
            Arguments.of("X", 10),
            Arguments.of("XII", 12),
            Arguments.of("XIX", 19),
            Arguments.of("XXIV", 24),
            Arguments.of("XXVIII", 28),
            Arguments.of("XXXIX", 39),
            Arguments.of("MCMXC", 1990),
            Arguments.of("MMVIII", 2008),
            Arguments.of("XCIX", 99),
            Arguments.of("XLVII", 47)
        );
    }
}
