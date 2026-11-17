public class getNumberOfZerosRecursion {
    public int getNumberOfZerosRecursion(int n){
        if (n == 0) {
            return 0;
        }

        if (n % 10 == 0) {
            return 1 + getNumberOfZerosRecursion(n / 10);
        }

        return getNumberOfZerosRecursion(n / 10);
    }
}
