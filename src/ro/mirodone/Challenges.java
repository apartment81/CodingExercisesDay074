package ro.mirodone;

public class Challenges {


    public int digital_root(int n) {

        if (n == 0) {
            return 0;
        }
        if (n % 9 == 0) {
            return 9;
        }
        return n % 9;

    }

    public int digRoot(int n) {
        int root = 0;

        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (n > 0 || root > 9) {
            if (n == 0) {
                n = root;
                root = 0;
            }

            root += n % 10;
            n /= 10;
        }
        return root;
    }

}
