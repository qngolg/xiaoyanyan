package com.qngolg.xiaoyanyan.demo;

import org.apache.commons.codec.binary.StringUtils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StringDemo {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String a = "中文";
        System.out.println(convertToBinary(a,"GBK"));

        String rawString = "Entwickeln Sie mit Vergnügen";
        byte[] bytes = StringUtils.getBytesUtf8(rawString);

        String utf8EncodedString = StringUtils.newStringUtf8(bytes);
        System.out.println(rawString);
        System.out.println(utf8EncodedString);
    }

    static String convertToBinary(String input, String encoding)
            throws UnsupportedEncodingException {
        byte[] encoded_input = Charset.forName(encoding)
                .encode(input)
                .array();
        return IntStream.range(0, encoded_input.length)
                .map(i -> encoded_input[i])
                .mapToObj(e -> Integer.toBinaryString(e ^ 255))
                .map(e -> String.format("%1$" + Byte.SIZE + "s", e).replace(" ", "0"))
                .collect(Collectors.joining(" "));
    }

}
