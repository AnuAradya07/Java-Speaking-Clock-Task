package com.speakingclock.controller;

import com.speakingclock.service.SpeakingClockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clock")
public class SpeakingClockController {

    @Autowired
    private SpeakingClockService speakingClockService;

    // Endpoint to get current time in words
    @GetMapping("/current")
    public String getCurrentTimeInWords() {
        return speakingClockService.convertCurrentTimeToWords();
    }

    // Endpoint to convert a given time in HH:mm format
    @GetMapping("/convert")
    public String convertTimeToWords(@RequestParam String time) {
        return speakingClockService.convertTimeToWords(time);
    }
}
