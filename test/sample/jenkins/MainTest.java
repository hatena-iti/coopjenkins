package sample.jenkins;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class MainTest {

    @Test
    public void repeat���\�b�h��hoge��5��n������_hogehogehogehogehoge_���Ԃ��Ă��邱��() {
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