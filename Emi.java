import java.io.*;

public class Emi {

    static float emi_calculator(float p,
        float r, float t) {
        float emi;

        r = r / (12 * 100); // one month interest
        t = t * 12; // one month period
        emi = (p * r * (float) Math.pow(1 + r, t)) /
            (float)(Math.pow(1 + r, t) - 1);

        return (emi);
    }

    static public void main(String[] args) {

        float principal, rate, time, emi;
        principal = 10000;
        rate = 10;
        time = 10;

        emi = emi_calculator(principal, rate, time);

        System.out.println("Monthly EMI is = " + emi);
    }
}