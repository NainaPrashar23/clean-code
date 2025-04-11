package org.example.basic;

import java.time.LocalDate;

public class FoodItemInspection {

    private final LocalDate expirationDate;
    private final Boolean approvedForConsumption;
    private final Integer inspectorId;

    public FoodItemInspection(LocalDate expirationDate, Boolean approvedForConsumption, Integer inspectorId) {
        this.expirationDate = expirationDate;
        this.approvedForConsumption = approvedForConsumption;
        this.inspectorId = inspectorId;
    }

    public boolean isEdible()
    {
        return expirationDate.isAfter(LocalDate.now())
                && Boolean.TRUE.equals(approvedForConsumption)
                && inspectorId != null;
    }
}
