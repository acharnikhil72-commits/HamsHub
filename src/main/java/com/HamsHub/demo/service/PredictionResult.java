package com.HamsHub.demo.service;

import java.util.List;

// NO @Bean, NO @Service, NO @Component — plain class
public class PredictionResult {
    private final int percent;
    private final String decision;
    private final List<String> reasons;

    public PredictionResult(int percent, String decision, List<String> reasons) {
        this.percent = percent;
        this.decision = decision;
        this.reasons = reasons;
    }

    public int getPercent() {
        return percent;
    }

    public String getDecision() {
        return decision;
    }

    public List<String> getReasons() {
        return reasons;
    }
}