package cn.simbaba.lessons.java.oo;


/**
 * 面向对象实例5.2
 *
 * 测试其它类
 */
public class Main {


    public static void main(String[] args) {

        double[][] points = {
                {-1, 0}, // A
                {4, 0},  // B
                {3, 2}   // C
        };

        Triangle t1 = new Triangle();
        t1.points = points;

        double S = t1.area();
        System.out.println("S="+t1.area());

        double[] highs = t1.high();
        System.out.printf("hAB=%f, hBC=%f, hAC=%f", highs[0],highs[1],highs[2]);
    }
}
