# 🌊 Flood Risk Mapping System

## 📌 Project Overview

The **Flood Risk Mapping System** is a Java-based project designed to assess flood risk for different areas using environmental and geographic factors.

The system analyzes rainfall, elevation, distance from a river, drainage condition, and population to calculate a flood risk score and classify each area as **Low Risk, Moderate Risk, or High Risk**.

## 🎯 Objectives

* Analyze flood-related factors
* Calculate a flood risk score
* Classify areas according to their risk level
* Analyze multiple areas
* Generate a simple flood risk report

## ⚙️ Technologies Used

* Java
* IntelliJ IDEA
* Object-Oriented Programming
* Java Collections
* Console-based input/output

## 📊 Risk Factors

The system considers four major factors:

| Factor         | Description                             |
| -------------- | --------------------------------------- |
| Rainfall       | Higher rainfall increases flood risk    |
| Elevation      | Lower elevation increases flood risk    |
| River Distance | Areas closer to rivers have higher risk |
| Drainage       | Poor drainage increases flood risk      |

Population is also recorded for each area as supporting information.

## 🧮 Risk Classification

| Risk Score  | Risk Level    |
| ----------- | ------------- |
| 70 or above | High Risk     |
| 40–69       | Moderate Risk |
| Below 40    | Low Risk      |

## 🔄 How It Works

```text
User Input
     ↓
Flood Area Data
     ↓
Risk Score Calculation
     ↓
Risk Classification
     ↓
Multiple Area Analysis
     ↓
Flood Risk Report
```

## 💻 Main Features

* Interactive user input
* Multiple area analysis
* Automatic risk score calculation
* Automatic risk classification
* Flood risk summary
* Tabular risk report

## 📁 Project Structure

```text
Flood-Risk-Mapping/
│
├── src/
│   └── floodrisk/
│       ├── FloodArea.java
│       ├── RiskCalculator.java
│       └── FloodRiskMapping.java
│
├── README.md
└── .gitignore
```

## ⚠️ Disclaimer

This project is developed for **educational and demonstration purposes**. The risk scoring model is a simplified project model and should not be used as an official flood forecasting or emergency decision-making system.

## 👨‍💻 Author

**Md. Yasin**

BSc in Computer Science & Engineering
