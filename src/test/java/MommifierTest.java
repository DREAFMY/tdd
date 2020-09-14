import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {

    @Test
    void is_number_of_vowels_more_than_thirty_percent() {
        Mommifier mommy = new Mommifier();
        String str = "aaaaaeeeeiisfddvr";
        Boolean bln = mommy.isMoreThan30(str);
        assertEquals(true,bln);
    }

    @Test
    void insert_mommy_for_each_continue_vowels_when_more_than_30_percent_vowels() {
        Mommifier mommy = new Mommifier();
        String str = "aaihefsuiie";
        String result = mommy.insertMommy(str);
        assertEquals("amommyamommyihefsumommyimommyimommye", result);
    }

}
