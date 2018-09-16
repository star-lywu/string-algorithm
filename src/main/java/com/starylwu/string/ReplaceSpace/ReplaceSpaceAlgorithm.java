package com.starylwu.string.ReplaceSpace;

/**
 * @Auther: Wuyulong
 * @Date: 2018/9/8 09:32
 * @Description: 将字符串中的空格替换为%20的算法
 */
public final class ReplaceSpaceAlgorithm {

    /**
     * 在java中，%20会被替换为空格，所以直接将空格替换是有问题的，无法输出
     * @param oldString
     * @return
     */
    public static String replaceSpace(String oldString){
        StringBuilder builder = new StringBuilder();
        int len = oldString.length() - 1;
        for (int i = len; i >= 0; i--){
            if (oldString.charAt(i)==' '){
                builder.append("02%");
            } else {
                builder.append(oldString.charAt(i));
            }
        }
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        String oldString = "We are family!";
        String newString = replaceSpace(oldString);
        System.out.println(newString);
    }
}
