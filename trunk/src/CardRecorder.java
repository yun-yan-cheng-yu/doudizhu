import ui.frame.FFrame;
import ui.frame.Frame;
import ui.panel.FPanel;
import ui.panel.Panel;

import java.util.Arrays;

public class CardRecorder {//记牌器类
    /**
     *一些boolean型变量
     * true代表这张牌已经打出去了。
     */
    private boolean[] rest_hongtao = new boolean[13];
    private boolean[] rest_heitao = new boolean[13];
    private boolean[] rest_fangpian = new boolean[13];
    private boolean[] rest_meihua = new boolean[13];
    private boolean xiaowang = false;
    private boolean dawang = false;

    private int rest[] = new int [13];//这个变量用于不分花色统计的数字。eg:rest[9]=3就代表10有三张牌.惰性的，只有函数调用，该变量才会改变

    public CardRecorder(){

    }

    /**
     * //不分花色显示所有牌
     */
    public void showDetail(){
        System.out.println("--------当前剩余的牌是----------------");
        System.out.print("红桃:");
        for (int i = 0; i < 13; i++) {
            if(!rest_hongtao[i]){
                System.out.print(i+1+" ");
            }
        }
        System.out.println();

        System.out.print("黑桃:");
        for (int i = 0; i < 13; i++) {
            if(!rest_heitao[i]){
                System.out.print(i+1+" ");
            }
        }
        System.out.println();

        System.out.print("方片:");
        for (int i = 0; i < 13; i++) {
            if(!rest_fangpian[i]){
                System.out.print(i+1+" ");
            }
        }
        System.out.println();

        System.out.print("梅花:");
        for (int i = 0; i < 13; i++) {
            if(!rest_meihua[i]){
                System.out.print(i+1+" ");
            }
        }
        System.out.println();
        if(!xiaowang) System.out.print("小王    ");
        if(!dawang) System.out.println("大王    ");
        System.out.println("---------------------------------");
    }

    /**
     * 输出一个数字times次
     * @param num
     * @param times
     */
    private void print(int num,int times){
        for(int i = 0;i < times;i++){
            System.out.print(num+" ");
        }
    }

    /**
     * 更新rest数组
     */
    private void updateRest(){
        for(int i = 0; i < 13; i++){
            rest[i] = 0;//先把rest清空
            if(!rest_hongtao[i]){
                rest[i]++;
            }
            if(!rest_heitao[i]){
                rest[i]++;
            }
            if(!rest_fangpian[i]){
                rest[i]++;
            }
            if(!rest_meihua[i]){
                rest[i]++;
            }
        }
    }

    /**
     * 可能拥有的炸弹
     */
    public void maybeBomb(){
        updateRest();
        for(int i = 0;i < 13; i++){
            if(rest[i] == 4){
                System.out.println("可能拥有"+(i+1)+"炸");
            }
        }
        if((!xiaowang)&&(!dawang)){
            System.out.println("可能有王炸");
        }
    }

    /**
     * //分花色显示剩余的牌
     */
    public void showAll(){
        updateRest();
        System.out.println("------------------------");
        System.out.println("当前剩余的牌是:");
        for(int i = 0; i < 13; i++){
            print(i+1,rest[i]);
        }
        if(!xiaowang) System.out.print("小王  ");
        if(!dawang) System.out.println("大王    ");
        System.out.println("---------------------------------");
    }

    public void run(){
        Frame frame = FFrame.creatFrame(3,1);
        Panel p_dipai = FPanel.creatPanel();
    }

    @Override
    public String toString() {
        return "CardRecorder{" +
                "rest_hongtao=" + Arrays.toString(rest_hongtao) +
                ", rest_heitao=" + Arrays.toString(rest_heitao) +
                ", rest_fangpian=" + Arrays.toString(rest_fangpian) +
                ", rest_meihua=" + Arrays.toString(rest_meihua) +
                ", xiaowang=" + xiaowang +
                ", dawang=" + dawang +
                '}';
    }
}
