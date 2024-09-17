package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//Rock
    public class Rock {
        private int sampleNumber;
        private String description;
        private double weight; // Weight in grams

        // Constructor
        public Rock(int sampleNumber, double weight) {
            this.sampleNumber = sampleNumber;
            this.weight = weight;
            this.description = "Unclassified"; // Default description
        }

        // Getter for sampleNumber
        public int getSampleNumber() {
            return sampleNumber;
        }

        // Getter for description
        public String getDescription() {
            return description;
        }

        // Getter for weight
        public double getWeight() {
            return weight;
        }

        // Main method for testing
        public static void main(String[] args) {
            org.example.Rock rock = new org.example.Rock(101, 500.0);
            System.out.println("Sample Number: " + rock.getSampleNumber());
            System.out.println("Description: " + rock.getDescription());
            System.out.println("Weight: " + rock.getWeight() + " grams");
        }
    }
//IgneousRock
    public class IgneousRock extends org.example.Rock {
        public IgneousRock(int sampleNumber, double weight) {
            super(sampleNumber, weight);
            // Description for Igneous Rock
            this.description = "Igneous rocks are formed from the solidification of molten magma or lava.";
        }
    }

    //SedimentaryRock
    public class SedimentaryRock extends org.example.Rock {
        public SedimentaryRock(int sampleNumber, double weight) {
            super(sampleNumber, weight);
            // Description for Sedimentary Rock
            this.description = "Sedimentary rocks are formed by the accumulation and consolidation of sediments.";
        }
    }

    //MetamorphicRock
    public class MetamorphicRock extends org.example.Rock {
        public MetamorphicRock(int sampleNumber, double weight) {
            super(sampleNumber, weight);
            // Description for Metamorphic Rock
            this.description = "Metamorphic rocks are formed by the alteration of existing rock types through heat, pressure, or chemical processes.";
        }
    }

    //DemoRocks
    public class DemoRocks {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Prompt user for rock type
            System.out.println("Enter the type of Rock collected:");
            System.out.println("I - Igneous");
            System.out.println("S - Sedimentary");
            System.out.println("M - Metamorphic");
            System.out.println("Other - Create a default Rock");

            String rockType = input.nextLine().toUpperCase();

            // Default Rock values
            int sampleNumber = 0;
            double weight = 0.0;

            // Create the appropriate type of Rock
            org.example.Rock rock;
            switch (rockType) {
                case "I":
                    System.out.print("Enter sample number: ");
                    sampleNumber = input.nextInt();
                    System.out.print("Enter weight (in grams): ");
                    weight = input.nextDouble();
                    rock = new org.example.IgneousRock(sampleNumber, weight);
                    break;
                case "S":
                    System.out.print("Enter sample number: ");
                    sampleNumber = input.nextInt();
                    System.out.print("Enter weight (in grams): ");
                    weight = input.nextDouble();
                    rock = new org.example.SedimentaryRock(sampleNumber, weight);
                    break;
                case "M":
                    System.out.print("Enter sample number: ");
                    sampleNumber = input.nextInt();
                    System.out.print("Enter weight (in grams): ");
                    weight = input.nextDouble();
                    rock = new org.example.MetamorphicRock(sampleNumber, weight);
                    break;
                default:
                    // Create a default Rock if input is invalid
                    rock = new org.example.Rock(sampleNumber, weight);
                    break;
            }

            // Display the details of the Rock
            displayRockDetails(rock);

            input.close();
        }

        // Method to display Rock details
        private static void displayRockDetails(org.example.Rock rock) {
            System.out.println("Rock Details:");
            System.out.println("Sample Number: " + rock.getSampleNumber());
            System.out.println("Description: " + rock.getDescription());
            System.out.println("Weight: " + rock.getWeight() + " grams");
        }
    }








}