package org.example;

public class Rock {
        private int sampleNumber;
        String description;
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
            Rock rock = new Rock(101, 500.0);
            System.out.println("Sample Number: " + rock.getSampleNumber());
            System.out.println("Description: " + rock.getDescription());
            System.out.println("Weight: " + rock.getWeight() + " grams");
        }
    }


