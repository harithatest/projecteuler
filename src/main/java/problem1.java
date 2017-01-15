/**
 * Created by haritha on 1/15/2017.
 */
public class problem1 {

    public static int run(int n) {
        int sum = 0;

        for (int i=0; i < n; i++) {
            if ((i % 3 == 0) || (i % 5 ==0)) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(run(1000));
    }
}


