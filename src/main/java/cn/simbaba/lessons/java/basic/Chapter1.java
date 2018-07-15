package cn.simbaba.lessons.java.basic;

/**
 * 示例代码：第1章
 *
 * 编程基础知识：
 * .编码和进制
 * .数据类型
 * .输入和输出
 *
 * @author simbaba
 */
public class Chapter1 {

    /**
     * 带换行的输出
     * @param info
     */
    static void println(Object info) {
        System.out.println(info);
    }

    /**
     * 数字编码
     * .默认是10进制
     * .二进制
     * .八进制
     * .16进制
     *
     * @apiNote book_chapter1_code_1
     */
    static void digital_encoding() {
        println(10); // 输出10
        println(010); // 输出8
        println(0x10); // 输出16

        // 借助Integer的函数转换
        println(Integer.toBinaryString(10)); // 输出1010
    }

    public static void main(String[] args) {

        // book_chapter1_code_1
        digital_encoding();
    }
}
