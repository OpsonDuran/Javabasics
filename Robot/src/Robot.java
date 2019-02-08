public class Robot {
    private int currentx;
    private int currenty;
    private int  previusx;
    private int  previusy;

    public Robot(){
        this.currentx =0;
        this.currenty =5;
    }
    public void moveX(int dx){
        this.previusy=this.currenty;
        this.previusx=this.currentx;
        this.currentx +=dx;

    }
    public void moveY(int dy){
        this.previusy=this.currenty;
        this.previusx=this.currentx;
        this.currenty +=dy;
    }
    public void printCurrentCordinates(){
        System.out.println(this.currentx+" "+this.currenty);
    }
    public void printPreviusCordinates(){
        System.out.println(this.previusx+" "+this.previusy);
    }
}
