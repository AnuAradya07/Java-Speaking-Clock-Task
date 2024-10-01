package com.speakingclock.service;

import org.springframework.stereotype.Service;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class SpeakingClockService {

    private static final String MIDDAY = "It's Midday";
    private static final String MIDNIGHT = "It's Midnight";

    public String convertCurrentTimeToWords() {
        LocalTime now = LocalTime.now();
        return convertTimeToWords(now.format(DateTimeFormatter.ofPattern("HH:mm")));
    }

    public String convertTimeToWords(String time) {
        if (time.equals("12:00")) {
            return MIDDAY;
        } else if (time.equals("00:00")) {
            return MIDNIGHT;
        }

        String[] timeParts = time.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);

        return "It's " + convertHourToWords(hour) + " " + convertMinutesToWords(minute);
    }

    private String convertHourToWords(int hour) {
        String[] hours = {"twelve", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven"};
        return hours[hour % 12];
    }

    private String convertMinutesToWords(int minute) {
        if (minute == 0) {
            return "o'clock";
        }

        String[] minutes = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
            "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine",
            "thirty", "thirty-one", "thirty-two", "thirty-three", "thirty-four", "thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine",
            "forty", "forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven", "forty-eight", "forty-nine",
            "fifty", "fifty-one", "fifty-two", "fifty-three", "fifty-four", "fifty-five", "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine"
        };

        return minutes[minute];
    }
}
