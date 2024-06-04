package intro;

import java.text.DecimalFormat;

public class Velocidades {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("00.00");
        double kph, mps, mph, pps;

        kph = 0.0;

        System.out.println("kph\tmps\tmps\tpps");
        while (kph <= 50.0){
            mps = 0.2778*kph;
            mph = 0.6214*kph;
            pps = 0.9113*kph;
            System.out.println(df.format(kph) + "\t" + df.format(mps) + "\t" + df.format(mph) + "\t" + df.format(pps));
            //System.out.printf("%.2g\t%.2g\t%.2g\t%.2g\n", kph, mps, mph, pps);
            kph += 0.5;
        }

    }
}
