package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Program that simulates ROUND-TRIP (OUTBOUND and RETURN) journeys
 * from position 0 to a series of targets.
 * - Validates that the target array does not contain invalid values (<= 0).
 * - For each target, performs the "OUTBOUND" trip by increasing the position
 *   until the target is reached, and then the "RETURN" trip by decreasing
 *   the position back to 0.
 * - Prints the step-by-step path to the console.
 */
public class ArrayIterationEnglish {
    public static void main(String[] args) {

        // Array of targets to reach in each trip (may contain invalid targets)
        int[] targets = {1, 2, 3, -5, 5, -6};

        // Initial position from where the trips start
        int startPosition = 0;

        // Initial message with the targets
        System.out.println("Starting OUTBOUND and RETURN trips for the elements: " + Arrays.toString(targets));

        // List to collect invalid numbers found in the array
        List<Integer> invalidNumbers = new ArrayList<>();

        // Iterate through targets and add those that are <= 0 (considered invalid)
        for (int number : targets) {
            if (number <= 0) {
                invalidNumbers.add(number);
            }
        }

        // If invalid numbers were found, report them and stop execution
        if (!invalidNumbers.isEmpty()) {
            System.err.println("The array contains negative numbers");
            System.err.println("The negative numbers in the program are: " + invalidNumbers);
            return;
        }

        // For each valid target, perform an OUTBOUND and RETURN trip
        for (int target : targets) {

            System.out.println("Starting OUTBOUND and RETURN trip for target: " + target);

            // OUTBOUND: increase position until reaching the target
            System.out.println("OUTBOUND");
            while (startPosition < target) {
                System.out.println(startPosition); // shows current position before moving
                startPosition++; // move one unit toward the target
            }

            // Show position when the target is reached
            System.out.println(startPosition);

            // RETURN: decrease position until returning to 0
            System.out.println("RETURN");
            while (startPosition > 0) {
                System.out.println(startPosition); // shows current position before moving back
                startPosition--; // move one unit back toward 0
            }

            // Show final position after return (should be 0)
            System.out.println(startPosition + "\n");
        }

        // Final message indicating all trips are completed
        System.out.println("Trips completed for all targets");
    }
}
