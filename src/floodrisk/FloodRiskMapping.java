package floodrisk;

import java.util.Scanner;
import java.util.ArrayList;

public class FloodRiskMapping {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<FloodArea> areas = new ArrayList<>();
        ArrayList<Double> scores = new ArrayList<>();
        ArrayList<String> riskLevels = new ArrayList<>();

        System.out.println("====================================");
        System.out.println("        FLOOD RISK ASSESSMENT");
        System.out.println("====================================");

        System.out.print("How many areas do you want to analyze? ");
        int numberOfAreas = input.nextInt();
        input.nextLine();

        int highRisk = 0;
        int moderateRisk = 0;
        int lowRisk = 0;

        for (int i = 1; i <= numberOfAreas; i++) {

            System.out.println();
            System.out.println("---------- Area " + i + " ----------");

            System.out.print("Enter Area Name: ");
            String areaName = input.nextLine();

            System.out.print("Enter Rainfall (mm): ");
            double rainfall = input.nextDouble();

            System.out.print("Enter Elevation (m): ");
            double elevation = input.nextDouble();

            System.out.print("Enter Distance from River (km): ");
            double riverDistance = input.nextDouble();

            System.out.print("Enter Drainage Condition (%): ");
            double drainage = input.nextDouble();

            System.out.print("Enter Population: ");
            int population = input.nextInt();

            input.nextLine();

            FloodArea area = new FloodArea(
                    areaName,
                    rainfall,
                    elevation,
                    riverDistance,
                    drainage,
                    population
            );

            double score = RiskCalculator.calculateRiskScore(area);
            String riskLevel = RiskCalculator.getRiskLevel(score);

            areas.add(area);
            scores.add(score);
            riskLevels.add(riskLevel);

            System.out.println();
            System.out.println("Risk Score: " + score);
            System.out.println("Risk Level: " + riskLevel);

            if (riskLevel.equals("HIGH RISK")) {
                highRisk++;
            } else if (riskLevel.equals("MODERATE RISK")) {
                moderateRisk++;
            } else {
                lowRisk++;
            }
        }

        System.out.println();
        System.out.println("====================================");
        System.out.println();
        System.out.println("========================================================");
        System.out.println("                 FLOOD RISK REPORT");
        System.out.println("========================================================");

        System.out.printf("%-15s %-12s %-18s %-12s%n",
                "Area", "Score", "Risk Level", "Population");

        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < areas.size(); i++) {

            System.out.printf("%-15s %-12.1f %-18s %-12d%n",
                    areas.get(i).areaName,
                    scores.get(i),
                    riskLevels.get(i),
                    areas.get(i).population);
        }

        System.out.println("========================================================");
        System.out.println("          FLOOD RISK SUMMARY");
        System.out.println("====================================");

        System.out.println("Total Areas: " + numberOfAreas);
        System.out.println("High Risk Areas: " + highRisk);
        System.out.println("Moderate Risk Areas: " + moderateRisk);
        System.out.println("Low Risk Areas: " + lowRisk);

        System.out.println();
        System.out.println("Risk assessment completed successfully.");

        input.close();
    }
}