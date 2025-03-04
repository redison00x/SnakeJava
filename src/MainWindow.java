import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(400,400);
        add(new Game());
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        MainWindow window = new MainWindow();
    }
}
