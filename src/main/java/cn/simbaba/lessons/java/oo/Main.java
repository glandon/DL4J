package cn.simbaba.lessons.java.oo;

import static cn.simbaba.lessons.java.oo.Triangle.area;
import static cn.simbaba.lessons.java.oo.Triangle.high;

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

        double a_AB = 5;
        double h_AB = 2;

        System.out.println("S1="+ area(a_AB, h_AB));
        System.out.println("S2="+area(points));

        double[] highs = high(points);

        System.out.printf("hAB=%f, hBC=%f, hAC=%f", highs[0],highs[1],highs[2]);
    }
}
