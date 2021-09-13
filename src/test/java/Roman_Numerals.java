import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Roman_Numerals {

    @Test
    public void Converts_From_Decimal_To_Roman()
    {
        assertEquals("I", Numerals.toRoman(1));
    }
}
