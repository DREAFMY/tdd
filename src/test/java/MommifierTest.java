import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {

    @Test
    void is_number_of_vowels_more_than_thirty_percent() {
        Mommifier mommy = new Mommifier();
        String str1 = "aaaaaeeeeiisfddvr";
        Boolean bln = mommy.mommyInsert(str1);
        assertEquals(true,bln);
    }

}
