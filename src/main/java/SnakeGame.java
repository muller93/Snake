import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class SnakeGame extends JFrame{
    boolean asd = false;


    public SnakeGame() {
        initUI();
    }

    public void graph(){
        /*JFrame frame = new JFrame();

        JButton start = new JButton();
        start.setBounds(50,50,80,50);
        start.setText("start");
        frame.add(start);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(200, 200);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);

        frame.setLayout(null);
        frame.setVisible(true);

        start.addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e) {
                frame.setVisible(false);
                asd = true;*/
                //initUI(); //need a fix
                //setVisible(true);
            //}
        //});
    }

    public void initUI() {
        add(new Board());
        setResizable(false);
        pack();
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame ex = new SnakeGame();
            ex.setVisible(true);
            SnakeGame snakeGame = new SnakeGame();
            snakeGame.graph();
        });
    }
}
