package com.starylwu.bitmap;

import com.alibaba.fastjson.JSON;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Auther: Wuyulong
 * @Date: 2018/9/16 20:43
 * @Description: 位图算法
 */
public class BitMapAlgorithm {

    private static int sizeOfNumberSet = 1000000;

    private static Random generator = new Random();

//    public static void main(String[] args) {
//
//        int error = 0;
//        HashSet<Integer> hashSet = new HashSet<Integer>();
//        BloomFilter<Integer> filter = BloomFilter.create(Funnels.integerFunnel(), sizeOfNumberSet);
//
//        for(int i = 0; i < sizeOfNumberSet; i++) {
//            int number = generator.nextInt();
//            if(filter.mightContain(number) != hashSet.contains(number)) {
//                error++;
//            }
//            filter.put(number);
//            hashSet.add(number);
//        }
//
//        System.out.println("Error count: " + error + ", error rate = " + String.format("%f", (float)error/(float)sizeOfNumberSet));
//    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        BitSet bitSet = new BitSet(10000000);
        BitSet bitSet2 = new BitSet(10000000);
        bitSet2.nextSetBit(0);
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(10000000);
        bitSet.xor(bitSet2);
        byte[] bytes = bitSet.toByteArray();
        String s = new String(bytes);
        List<Long> list = new ArrayList<>();
        for (long b : bytes){
            list.add(b);
        }
        System.out.println(s);

        BitSet bitSet3 = BitSet.valueOf(s.getBytes());
        System.out.println(bitSet3.get(1));
        System.out.println(bitSet3.get(2));
        System.out.println(bitSet3.get(10000000));
//        System.out.println(list);
    }
}
