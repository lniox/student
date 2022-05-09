package component;

import javax.swing.*;
import java.awt.*;

public class selectpanel extends JPanel {
    public selectpanel() {
        setLayout(new FlowLayout());
        setBorder(BorderFactory.createTitledBorder("请选择查找内容"));
        setVisible(true);
    }
}
