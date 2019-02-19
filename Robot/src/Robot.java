public class Robot{
    private int currentX;
    private int currentY;
    private int previousX;
    private int previousY;


    public Robot(){
        this.currentX=0;
        this.currentY=5;
        this.previousX=0;
        this.previousY=0;
    }
    public Robot(int currentX, int currentY) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.previousX = 0;
        this.previousY = 0;
    }

    public void moveX(int dx) {
        previousY = currentY;
        previousX = currentX;
        currentX += dx;

    }

    public void moveY(int dy) {
        previousY = currentY;
        previousX = currentX;
        currentY += dy;
    }

    public void printCurrentCoordinates() {
        System.out.println(this.currentX + " " + this.currentY);
    }

    public void printLastCoordinates() {
        System.out.println(this.previousX + " " + this.previousY);
    }


    public void printLastMove(){
        if(currentX!=previousX){
            System.out.println("x "+(currentX-previousX));
        }else if(currentY!=previousY){
            System.out.println("y "+(currentY-previousY));
        }
    }
}