public class getMultiChar {
    public String getMultiChar(char ch, int n){
        if (n < 0) {
            return "";
        }

        return ch + getMultiChar(ch, n - 1);
    }

}
