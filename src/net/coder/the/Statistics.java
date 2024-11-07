package net.coder.the;

import java.util.ArrayList;
import java.util.List;

public class Statistics {

    @SuppressWarnings("unused")
    @Deprecated
    private static double oldMean(short[] values) {
        double mean = values[0] + values[1];

        for (int i = 2; i < values.length; i++) {
            mean = mean + values[i];
        }

        return mean / values.length;
    }

    public static double mean(short[] values) {
        double mean = 0;

        for (short value : values) {
            mean += value;
        }

        return mean / values.length;
    }

    public static List<Double> deviations(short[] values, double mean) {
        List<Double> deviations = new ArrayList<>();

        for (short value : values) {
            double deviation = mean - value;

            deviations.add(deviation * deviation);
        }

        return deviations;
    }

    public static double variance(List<Double> deviations) {
        double sigma = 0;

        for (double deviation : deviations) {
            sigma += deviation;
        }

        return sigma / deviations.size();
    }

    public static double standardDeviation(double variance) {
        return Math.sqrt(variance);
    }

}
