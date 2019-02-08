public class Main {

        // function to to find final position of

        public static void main(String[] args)
        {
            Robot robot = new Robot();

            robot.moveX(1);
            robot.printPreviusCordinates();
            robot.printCurrentCordinates();
            robot.moveY(5);
            robot.printPreviusCordinates();
            robot.printCurrentCordinates();

         }
    }