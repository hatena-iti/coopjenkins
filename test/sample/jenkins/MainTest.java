package sample.jenkins;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class MainTest {

    @Test
    public void repeatƒƒ\ƒbƒh‚Éhoge‚Æ5‚ğ“n‚µ‚½‚ç_hogehogehogehogehoge_‚ª•Ô‚Á‚Ä‚­‚é‚±‚Æ() {
        // exercise
        String actual = Main.repeat("hoge", 5);

        // verify
        assertThat(actual, is("hogehogehogehogehoge"));
    }

    @Test
    public void repeat3() {
        // exercise
        String actual = Main.repeat("Test", 3);

        // verify
        assertThat(actual, is("TestTestTest"));
    }

}