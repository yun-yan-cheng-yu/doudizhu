package ui.frame;

import java.awt.*;

public class FFrame {

    /**
     * 创建一个Frame框架
     * @return 一个框架
     */
    public static Frame creatFrame(){
        return creatFrame(1,1);
    }

    /**
     * 创一个有行数和列数的Frame
     * @param rows 行数
     * @param columns 列数
     * @return Frame
     */
    public static Frame creatFrame(int rows,int columns){
        Frame f = new Frame();

        f.frame.setVisible(true);
        f.frame.setLayout(new GridLayout(rows,columns));

        return f;
    }
}
