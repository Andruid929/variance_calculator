package net.coder.the;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        short[] values = {20, 45, 345, 235, 60};

        double mean = Statistics.mean(values);

        List<Double> deviations = Statistics.deviations(values, mean);

        double variance = Statistics.variance(deviations);

        System.out.println(Statistics.standardDeviation(variance));
    }

}
