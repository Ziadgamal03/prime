public class Calc {

    public static boolean primen(int n) {
        if (n <= 1) {
                return false;
        }
        else if (n <= 3) {
            return true;
        }
        else if (n%2==0 || n%3==0) {
            return false;
        }


        return true;
    }
}
