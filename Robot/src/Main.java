public class Main {

        // function to to find final position of

        public static void main(String[] args)
        {
            Robot robot1 = new Robot();
            robot1.printCurrentCoordinates();

            Robot  robot = new Robot(2,1);
            robot.printCurrentCoordinates();
            int dy=1,dx=1;
            for (int i =1; i<3;i++){
                robot.moveX(dx);
                robot.printLastMove();
                robot.printCurrentCoordinates();
                robot.moveY(dy);
                robot.printLastCoordinates();

                dx += i*i;
                dy -= i*i;
            }

         }
    }