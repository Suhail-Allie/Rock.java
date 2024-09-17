package org.example;
import java.util.Scanner;

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
            Rock rock;
            switch (rockType) {
                case "I":
                    System.out.print("Enter sample number: ");
                    sampleNumber = input.nextInt();
                    System.out.print("Enter weight (in grams): ");
                    weight = input.nextDouble();
                    rock = new IgneousRock(sampleNumber, weight);
                    break;
                case "S":
                    System.out.print("Enter sample number: ");
                    sampleNumber = input.nextInt();
                    System.out.print("Enter weight (in grams): ");
                    weight = input.nextDouble();
                    rock = new SedimentaryRock(sampleNumber, weight);
                    break;
                case "M":
                    System.out.print("Enter sample number: ");
                    sampleNumber = input.nextInt();
                    System.out.print("Enter weight (in grams): ");
                    weight = input.nextDouble();
                    rock = new MetamorphicRock(sampleNumber, weight);
                    break;
                default:
                    // Create a default Rock if input is invalid
                    rock = new Rock(sampleNumber, weight);
                    break;
            }

            // Display the details of the Rock
            displayRockDetails(rock);

            input.close();
        }

        // Method to display Rock details
        private static void displayRockDetails(Rock rock) {
            System.out.println("Rock Details:");
            System.out.println("Sample Number: " + rock.getSampleNumber());
            System.out.println("Description: " + rock.getDescription());
            System.out.println("Weight: " + rock.getWeight() + " grams");
        }
    }


