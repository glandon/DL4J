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

    double[][] points;

    /**
     * 这是代码块
     */
    {
        System.out.println("欢迎使用三角形计算");
    }

    /**
     * S=a*h/2
     * @param a
     * @param h
     * @return area
     */
    double area(double a, double h) {
        return a*h/2;
    }

    /**
     * S=(x1y2+x2y3+x3y1-x1y3-x2y1-x3y2)/2
     * @param points
     * @return area
     */
    double area(double[][] points) {
        double x1 = points[0][0];
        double y1 = points[0][1];

        double x2 = points[1][0];
        double y2 = points[1][1];

        double x3 = points[2][0];
        double y3 = points[2][1];

        return Math.abs((x1*y2+x2*y3+x3*y1-x1*y3-x2*y1-x3*y2)/2);
    }

    /**
     * h = 2S/a
     * @param points
     * @return
     */
    double[] high(double[][] points) {
        double S = area(points);

        double L01 = Math.sqrt(Math.pow(points[1][0]-points[0][0],2)+Math.pow(points[1][1]-points[0][1],2));
        double L12 = Math.sqrt(Math.pow(points[2][0]-points[1][0],2)+Math.pow(points[2][1]-points[1][1],2));
        double L20 = Math.sqrt(Math.pow(points[2][0]-points[0][0],2)+Math.pow(points[2][1]-points[0][1],2));

        return new double[]{2*S/L01, 2*S/L12, 2*S/L20};
    }

    /**
     * 使用points存储坐标
     * @return
     */
    double area() {
        return area(points);
    }

    double[] high() {
        return high(points);
    }


    public static void main(String[] args) {

        double[][] points1 = {
                {-1, 0}, // A
                {4, 0},  // B
                {3, 2}   // C
        };

        Triangle t1 = new Triangle();
        t1.points = points1;

        double[][] points2 = {
                {0, 0}, // A
                {0, 4},  // B
                {3, 0}   // C
        };

        Triangle t2 = new Triangle();
        t2.points = points2;
        t2.high();

    }
}
