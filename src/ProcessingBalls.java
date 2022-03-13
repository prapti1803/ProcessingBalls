import processing.core.PApplet;

public class ProcessingBalls extends PApplet {
    public static void main(String[] args) {
        PApplet.main("ProcessingBalls", args);
    }

    private int speed1 = 1;
    private int speed2 = 1;
    private int speed3 = 1;
    private int speed4 = 1;
    private final float WIDTH=640;
    private final float HEIGHT=480;
    @Override
    public void settings() {
        super.settings();
        size((int) WIDTH, (int) HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

    }

    @Override
    public void draw() {

        ellipse(speed1, HEIGHT/5, 50, 50);
        ellipse(speed2, HEIGHT*2/5, 50, 50);
        ellipse(speed3, HEIGHT*3/5, 50, 50);
        ellipse(speed4, HEIGHT*4/5, 50, 50);

        speed1 = speed1 +1;
        speed2 = speed2 +2;
        speed3 = speed3 +3;
        speed4 = speed4 +4;
    }

}
