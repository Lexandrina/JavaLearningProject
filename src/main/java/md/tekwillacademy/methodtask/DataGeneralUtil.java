package md.tekwillacademy.methodtask;

import java.util.Random;
import java.util.UUID;

public class DataGeneralUtil {
    private static Random random = new Random();

    public static int generateRandomInt(int limit) {
        return random.nextInt(limit);
    }

    public static int generateRandomInt(int min, int max) {
        if (max > min) {
            return random.nextInt(min, max);
        } else {
            return 0;
        }
    }

    public static String returtRandomString(String domain) {
        String uuid = UUID.randomUUID().toString();
        return uuid + "@" + domain;
    }

    public static String returtRandomString() {
        String uuid = UUID.randomUUID().toString();
        return uuid + "@gmail.com";
    }
}
