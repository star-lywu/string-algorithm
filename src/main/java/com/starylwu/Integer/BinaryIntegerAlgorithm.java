package com.starylwu.Integer;

/**
 * @Auther: Wuyulong
 * @Date: 2018/9/16 19:44
 * @Description: 二进制算法
 */
public class BinaryIntegerAlgorithm {

    /**
     * 计算num所对应的二进制数中的1的个数
     * @param num
     * @return
     */
    public static int countBit(int num){
        int count = 0;
        for (;num > 0; count++){
            num &= num - 1;
        }
        return count;
    }

    /**
     * 获取num所对应的二进制数 第 i 位的值是否为0
     * @param num
     * @param index 从0开始
     * @return 返回 true | false
     */
    public static boolean getBit(int num, int index){
        if (index > Integer.toBinaryString(num).length() - 1){
            throw new ArrayIndexOutOfBoundsException("index is more than num's binary length, num=[" + num + "], index=[" + index + "].");
        }
        return (num & (1 << index)) == 0;
    }

    /**
     * 将num所对应的二进制的数中的index位设置为1
     * @param num
     * @param index
     * @return 设置后的num
     */
    public static int setBitOne(int num, int index){
        if (index > Integer.toBinaryString(num).length() - 1){
            throw new ArrayIndexOutOfBoundsException("index is more than num's binary length, num=[" + num + "], index=[" + index + "].");
        }
        return num | (1 << index);
    }

    /**
     * 将num所对应的二进制的数中的index位设置为0
     * @param num
     * @param index
     * @return 设置后的num
     */
    public static int setBitZero(int num, int index){
        if (index > Integer.toBinaryString(num).length() - 1){
            throw new ArrayIndexOutOfBoundsException("index is more than num's binary length, num=[" + num + "], index=[" + index + "].");
        }
        return num & (~(1 << index));
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(countBit(num));
        System.out.println(getBit(num, 2));
    }
}
