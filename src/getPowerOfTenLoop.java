public class getPowerOfTenLoop {
    public long getPowerOfTen(int n){
        int result = 1;

        for (int i = 0; i < n; i++) {
            result = result * 10;
        }

        return result;
    }


}
