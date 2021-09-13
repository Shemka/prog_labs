import static java.lang.Math.*;

public class LabMath{
    public static void main(String[] args){
        double min_b = -12.0, max_b = 2.0;

        short[] a = new short[10];
        float[] x = new float[10];

        for(short i = 5, j = 0; i <= 23; i+=2, j++){
            a[j] = i;
            x[j] = (float) getRandom(min_b, max_b);
        }

        float[][] new_a = new float[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                switch (a[i]) {
                    case 13:
                        float c = (float) atan(pow((x[j] - 5) / 14, 2)) - 1;
                        float b = (float) pow(atan((x[j] - 5) / 14), 2 * (1 - exp(x[j])));
                        new_a[i][j] = (float) pow(sin(cbrt(x[j])), c/b);
                        break;
                    case 5:
                    case 11:
                    case 15:
                    case 19:
                    case 21:
                        new_a[i][j] = (float) pow(2 * cbrt(cos(x[j])), 2.0);
                        break;
                    default:
                        new_a[i][j] = (float) cos(cos(cos(pow((3 - x[j]) / 2, x[j]))));
                        break;
                }
                System.out.printf("%.2f\t", new_a[i][j]);
            }
            System.out.println();
        }
        
    }
    private static double getRandom(double min, double max){
        return Math.random()*((max-min)+1.0)+min;
    }

}