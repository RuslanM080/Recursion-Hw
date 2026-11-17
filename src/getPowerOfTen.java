public class getPowerOfTen {
    public long getPowerOfTen(int n){
        if (n == 0) {
            return 1;
        }

        return 10 * getPowerOfTen(n - 1);
    }


}
