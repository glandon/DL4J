package cn.simbaba.lessons.java.oo;

/**
 * 面向对象实例5.1
 *
 * 计算三角形面积
 * .底和高
 * .三点坐标
 * .各顶点的高度
 */
public class Triangle {

    /**
     * S=a*h/2
     * @param a
     * @param h
     * @return area
     */
    static double area(double a, double h) {
        return a*h/2;
    }

    /**
     * S=(x1y2+x2y3+x3y1-x1y3-x2y1-x3y2)/2
     * @param points
     * @return area
     */
    static double area(double[][] points) {
        double x1 = points[0][0];
        double y1 = points[0][1];

        double x2 = points[1][0];
        double y2 = points[1][1];

        double x3 = points[2][0];
        double y3 = points[2][1];

        return (x1*y2+x2*y3+x3*y1-x1*y3-x2*y1-x3*y2)/2;
    }

    public static void main(String[] args) {

        double[][] points = {
                {-1, 0}, // A
                {4, 0},  // B
                {3, 2}   // C
        };

        double a_AB = 5;
        double h_AB = 2;

        System.out.println("S1="+area(a_AB, h_AB));
        System.out.println("S2="+area(points));
    }
}