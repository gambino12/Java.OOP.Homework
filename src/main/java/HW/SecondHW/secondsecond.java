package HW.SecondHW;

public class secondsecond {
    public static void main(String[] args) {
        int[] intArray={1,2,3,2,1};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (RuntimeException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}

