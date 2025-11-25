public class numss {
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int bitmask = 1<<pos;

        if ( (bitmask & n) == 0) {
            System.out.println("the state was 0");
        }
        else {
            System.out.println("the state was 1");
        }
    }
}

