package org.example.basic;

import java.time.LocalDate;
import java.util.List;

public class FlightArrivalProcess {

    private static final String STATUS_DELAYED = "Delayed";
    private static final String NEW_LINE = "\n";

    public String generateArrivalReport(List<LocalDate> arrivalDates) {
        StringBuilder report = new StringBuilder();

        for (LocalDate arrivalDate : arrivalDates) {
            if (arrivalDate.isAfter(LocalDate.now())) {
                report.append(arrivalDate).append(NEW_LINE);
            }
            else {
                report.append(STATUS_DELAYED).append(NEW_LINE);
            }
        }
        return report.toString();
    }
}
