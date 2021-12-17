package robots;

import java.util.Random;

public class Robot {

    private String robotName;
    private int robotHealth = 100;
    private String alphabet = "QWEASDZXC";
    private String keys = "QWEASDZXCL";
    private String damageKeys = "";

    public Robot(String robotName) {
        this.robotName = robotName;
        for (int i = 0; i < 5; i++) {
            damageKeys = damageKeys + getRandomKey();

        }
        System.out.println();

    }

    public void hit(String symbol) {

        this.robotHealth = robotHealth - 20;

        this.damageKeys = damageKeys.replace(symbol, "");

    }

    public String getRobotName() {
        return robotName;
    }

    public int getRobotHealth() {
        return robotHealth;
    }


    public String getAlphabet() {
        return alphabet;
    }

    public String getDamageKeys() {
        return damageKeys;
    }

    char getRandomKey() {
        int randIdx = new Random().nextInt(alphabet.length());
        char randChar = alphabet.charAt(randIdx);
        alphabet = alphabet.replace(String.valueOf(randChar), "");
        return randChar;
    }

    public String getKeys() {
        return keys;
    }
}
