package ui.panel;

import java.awt.*;

public class FPanel {

    /**
     * 创建一个有行数和列数的panel
     * @param rows 行数
     * @param columns 列数
     * @return panel
     */
    public static Panel creatPanel(int rows, int columns){
        Panel p = new Panel();

        p.p.setVisible(true);
        p.p.setLayout(new GridLayout(rows,columns));

        return p;
    }

    /**
     * 创建一个 1行1列的panel
     * @return panel
     */
    public static Panel creatPanel(){
        Panel p = new Panel();

        p.p.setVisible(true);
        p.p.setLayout(new GridLayout(1,1));

        return p;
    }
}
