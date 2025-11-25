package Basics;

public class SecurityVault {

    private String password;
    public static final int MAX_ATTEMPTS = 3;
    static int accessCount = 0;

    SecurityVault(String password) {
        this.password = password;

    }

    boolean attemptLogin(String guess) {
        if (password.equals(guess)) {
            accessCount++;
            return true;
        }
        return false;
    }

    public final void showLog() {
        System.out.println("Global Access Count: " + accessCount);
    }

    public static void main(String[] args) {
        SecurityVault v1 = new SecurityVault("123");
        SecurityVault v2 = new SecurityVault("456");

        System.out.println("attempts: " + SecurityVault.MAX_ATTEMPTS);
        System.out.println("Login v1: " + v1.attemptLogin("123"));
        v2.attemptLogin("456");
        v2.showLog();

    }

}
