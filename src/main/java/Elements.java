import javax.swing.*;
import java.awt.*;

public class Elements {

    private Image ball;
    private Image apple;
    private Image head;

    public void image() {
        ImageIcon ballImage = new ImageIcon("src/main/resources/body10.png");
        ball = ballImage.getImage();

        ImageIcon appleImage = new ImageIcon("src/main/resources/app10.png");
        apple = appleImage.getImage();

        ImageIcon headImage = new ImageIcon("src/main/resources/head10.png");
        head = headImage.getImage();
    }

    public Image getBall() {
        return ball;
    }

    public void setBall(Image ball) {
        this.ball = ball;
    }

    public Image getApple() {
        return apple;
    }

    public void setApple(Image apple) {
        this.apple = apple;
    }

    public Image getHead() {
        return head;
    }

    public void setHead(Image head) {
        this.head = head;
    }
}
