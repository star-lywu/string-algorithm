package com.starylwu.string.LongestCommonPrefix;

import java.util.Arrays;

/**
 * @Auther: Wuyulong
 * @Date: 2018/9/8 09:42
 * @Description: 最长公共前缀 编写一个函数来查找字符串数组中的最长公共前缀。
 *              如果不存在公共前缀，返回空字符串 ""。
 */
public final class LongestCommonPrefixAlgorithm {

    /**
     * 直接查找较为复杂，先排序，再查找，直接比较第一个和最后一个字符串即可
     * @param strs
     * @return
     */
    public static String findLongestCommonPrefix(String[] strs){

        if (strs == null || strs.length <= 0){
            return "";
        }
        Arrays.sort(strs);
        char[] firstArray = strs[0].toCharArray();
        char[] lastArray = strs[strs.length - 1].toCharArray();
        StringBuilder builder = new StringBuilder();
        int len = firstArray.length > lastArray.length ? firstArray.length : lastArray.length;
        int index = 0;
        while (index < len){
            if (firstArray[index] == lastArray[index]){
                builder.append(firstArray[index]);
            } else {
                break;
            }
            index++;
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String commonStr1 = findLongestCommonPrefix(strs1);
        System.out.println(commonStr1);
        String[] strs2 = {"dog", "cat", "car"};
        String commonStr2 = findLongestCommonPrefix(strs2);
        System.out.println(commonStr2);
    }
}
