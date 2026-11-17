public class displayString {


    public String displayString(String str, int n) {
        if (n == 0) {
            return "";
        }

        return str + displayString(str, n - 1);
    }
}
