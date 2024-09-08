package Basics;

public class numberrecta {
    public static void main(String[] args) {
        int N=6;
        int count = 0;

        // Iterate through all possible widths
        for (int w = 1; w <= Math.sqrt(N); w++) {
            if (N % w == 0) {
                int h = N / w;
                // Count the valid rectangles (w, h) and (h, w) if w <= h
                if (w <= h) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
