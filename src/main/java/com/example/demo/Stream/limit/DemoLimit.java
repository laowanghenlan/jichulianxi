package com.example.demo.Stream.limit;

import java.util.stream.Stream;

/*
*  Stream流中的常用方法 limit: 用于截取流中的元素
*  limit方法可以对流进行截取，只取用前n个。
*  方法签名： Stream<T> limit(long maxSize);
*   参数是一个long形，如果i盒当前长度大于参数则进行截取，否则不进行操作
*   limit方法是一个延迟方法，只是对流中的元素进行截取，返回的是一个新的流，所以可以继续调用Stream流中的其他方法
*
* */
public class DemoLimit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("撒啊的", "阿斯蒂芬", "asdad", "adad","俄文俄文");

        //使用limit对Stream流中的元素进行截取，只要前3个元素
        Stream<String> limit = stream.limit(3);
        //遍历limit流
        limit.forEach(name-> System.out.println(name));
    }
}
