package com.epam.training.student_Oleksii_Oliinyk;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(OutputCaptureExtension.class)
public class HelloAutocodeTest {

    @Test
    void testAutocode(CapturedOutput capture) throws Exception {
        HelloAutocode.main(new String[]{});
        assertThat(capture.toString()).isEqualToIgnoringNewLines("Hello, Autocode!");
    }
}