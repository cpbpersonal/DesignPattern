package com.acpb.test;

import java.io.File;

public class Photo {
    public static void foreach() {
        String path = "D:\\test\\src";
        File file1 = new File(path);
        if (file1.exists()) {
            File[] files = file1.listFiles();
            for (File file2 : files) {
                if (file2.getName().indexOf("jpg") != -1) {
                    System.out.println(file2.getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        Photo.foreach();
    }
}