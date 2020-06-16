package com.example.demo.Stream.count;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
*  stream流中的常用方法 count:用于统计Stream流中的个数
*  long count();
*  count方法是一个终结方法，返回值是一个long类型的整数
*  所以不能再继续调用Stream流中的其他方法了
*
*
* */
public class DemoCount {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        Stream<Object> stream = list.stream();
        long count = stream.count();
        System.out.println(count);
    }
}
