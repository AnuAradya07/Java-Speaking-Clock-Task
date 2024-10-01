package com.speakingclock.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpeakingClockServiceTest {

    private final SpeakingClockService service = new SpeakingClockService();

    @Test
    void testConvertTimeToWords_Midday() {
        String result = service.convertTimeToWords("12:00");
        assertEquals("It's Midday", result);
    }

    @Test
    void testConvertTimeToWords_Midnight() {
        String result = service.convertTimeToWords("00:00");
        assertEquals("It's Midnight", result);
    }

    @Test
    void testConvertTimeToWords_NormalTime() {
        String result = service.convertTimeToWords("08:34");
        assertEquals("It's eight thirty four", result);
    }

    @Test
    void testConvertTimeToWords_InvalidTime() {
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            service.convertTimeToWords("invalid");
        });
        assertEquals("For input string: \"invalid\"", exception.getMessage());
    }
}
