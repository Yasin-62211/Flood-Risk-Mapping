package floodrisk;

public class RiskCalculator {

    public static double calculateRiskScore(FloodArea area) {

        double score = 0;

        // Rainfall factor
        if (area.rainfall >= 200) {
            score += 30;
        } else if (area.rainfall >= 150) {
            score += 20;
        } else {
            score += 10;
        }

        // Elevation factor
        if (area.elevation <= 5) {
            score += 25;
        } else if (area.elevation <= 10) {
            score += 15;
        } else {
            score += 5;
        }

        // River distance factor
        if (area.riverDistance <= 1) {
            score += 25;
        } else if (area.riverDistance <= 3) {
            score += 15;
        } else {
            score += 5;
        }

        // Drainage factor
        if (area.drainage < 40) {
            score += 20;
        } else if (area.drainage < 70) {
            score += 10;
        } else {
            score += 5;
        }

        return score;
    }

    public static String getRiskLevel(double score) {

        if (score >= 70) {
            return "HIGH RISK";
        } else if (score >= 40) {
            return "MODERATE RISK";
        } else {
            return "LOW RISK";
        }
    }
}