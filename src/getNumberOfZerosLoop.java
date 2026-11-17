public class getNumberOfZerosLoop {
    public int getNumberOfZerosLoop(int n){
        int count = 0;

        while (n > 0) {
            if (n % 10 == 0) {
                count++;
            }

            n = n / 10;
        }

        return count;
    }


}
