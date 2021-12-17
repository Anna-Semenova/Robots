package robots;

import java.util.ArrayList;
import java.util.Locale;

public class MainRobot {
    public static void main(String[] args) {

        System.out.println("Enter the name of the first robot !!!!");

        String name1 = WorkWithConsole.getNameFromConsole();
        Robot robot1 = new Robot(name1);

        System.out.println(String.format(" %s  health - %s "
                , robot1.getRobotName(), robot1.getRobotHealth()));

        System.out.println("Enter the name of the second robot !");

        String name2 = WorkWithConsole.getNameFromConsole();
        Robot robot2 = new Robot(name2);

        System.out.println(String.format(" %s  health - %s "
                , robot2.getRobotName(), robot2.getRobotHealth()));

        System.out.println();
        ArrayList<Robot> listRobots = new ArrayList<>();
        listRobots.add(robot1);
        listRobots.add(robot2);

        String symbol = "";
        String exit = "L";

        do {
            for (int i = 0; i < listRobots.size(); i++) {

                System.out.println(String.format("Robot shot %s, enter the letter one of the  QWEASDZXC  or the letter L to exit the game"
                        , listRobots.get(i).getRobotName()));

                symbol = WorkWithConsole.getSymbolFromConsole();

                while (listRobots.get(i).getKeys().indexOf(symbol) == -1) {

                    System.out.println("Please enter a valid character !");

                    System.out.println(String.format("Robot shot %s, enter the letter one of the  QWEASDZXC  or the letter L to exit the game"
                            , listRobots.get(i).getRobotName()));

                    symbol = WorkWithConsole.getSymbolFromConsole();
                }

                if (listRobots.get(i).getDamageKeys().contains(symbol)) {

                    System.out.println("Great shot " + listRobots.get(i).getRobotName() + " took damage -20 ");
                    System.out.println();

                    listRobots.get(i).hit(symbol);

                    if (listRobots.get(i).getRobotHealth() <= 0){
                        break;
                    }
                } else {

                    System.out.println("You missed, good luck next time");
                }
            }
            if (robot1.getRobotHealth() <= 0) {
                System.out.println(robot1.getRobotName() + " Not a victory");
                System.out.println(robot2.getRobotName() + " Victory !");
                System.out.println();
                System.out.println(robot2.getRobotName() + " health - " + robot2.getRobotHealth());
                break;
            }
            if (robot2.getRobotHealth() <= 0) {
                System.out.println(robot2.getRobotName() + " Not a victory");
                System.out.println(robot1.getRobotName() + " Victory !");
                System.out.println();
                System.out.println(robot1.getRobotName() + " health   " + robot1.getRobotHealth());
                break;
            }
            if (symbol.equalsIgnoreCase(exit)) {
                System.out.println(" GoodBye");
                break;
            }

            System.out.println(String.format("%s - %s ", robot1.getRobotName(), robot1.getRobotHealth()));
            System.out.println(String.format("%s - %s ", robot2.getRobotName(), robot2.getRobotHealth()));

        } while (!symbol.equalsIgnoreCase(exit));

    }

}
