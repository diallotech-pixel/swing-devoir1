package swing_devoir2;
import javax.swing.*;
import java.awt.*;

public class TextDisplay implements HourDisplay {
    JLabel label = new JLabel();

    public TextDisplay() {
        label.setFont(new Font("Arial", Font.BOLD, 40));
    }

    @Override
    public Component getComponent() {
        return label;
    }

    @Override
    public void oneSecondMore() {
        int h = Horloge.getHour();
        int m = Horloge.getMinute();
        int s = Horloge.getSecond();

        label.setText(h + ":" + m + ":" + s);
    }
}
