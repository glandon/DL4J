package cn.simbaba.lessons.java.basic;

/**
 * 示例代码：第2章
 *
 * 编程基础知识：
 * .编码和进制
 * .数据类型
 * .输入和输出
 *
 * @author simbaba
 */
public class Chapter2 {

    /**
     * 带换行的输出
     * @param info
     */
    static void println(Object info) {
        System.out.println(info);
    }

    /**
     * 请务必添加static以便在main函数使用
     * Java每个class都可以定义main函数
     *
     * @apiNote book_chapter2_code_1
     */
    static void _if_else() {
        int n = 1234;
        String s;

        if (n > 1000) {
            s = n / 1000 + "." + n % 1000 + "*10^3";
        } else if (n > 100) {
            s = n / 100 + "." + n % 100 + "*10^2";
        } else if (n > 10) {
            s = n / 10 + "." + n % 10 + "*10";
        } else {
            s = n + ".";
        }

        println(s);
    }

    public static void main(String[] args) {

        // book_chapter2_code_1
        _if_else();
    }
}
