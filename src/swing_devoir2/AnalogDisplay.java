package swing_devoir2;

import javax.swing.*;
import java.awt.*;

public class AnalogDisplay extends JPanel implements HourDisplay {

    public AnalogDisplay() {
        setPreferredSize(new Dimension(200,200));
    }

    public Component getComponent() {
        return this;
    }

    public void oneSecondMore() {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int h = Horloge.getHour();
        int m = Horloge.getMinute();
        int s = Horloge.getSecond();

        g.drawOval(10,10,180,180);

        g.drawString("Heure : " + h + "h", 60, 50);
        g.drawString("Min   : " + m + "m", 60, 80);
        g.drawString("Sec   : " + s + "s", 60,110);
    }
}

