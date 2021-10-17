package com.acpb.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//D:\test\src\test.txt文件中出现字母的个数*/
//   System.out.println("找不到文件！");
//                System.exit(-1);
public class foreach {
        public static void main(String[] args) {
            FileReader fr = null;
            try {
                fr = new FileReader("//D:\\test\\src\\test.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader bf = new BufferedReader(fr);
            char in;
            int k = 0;// 字母个数
            int i=0;
            String s;
            try {
                while ((s=bf.readLine()) != null) {
                    for(;i<s.length();i++){
                        in = s.charAt(i) ;
                        if ((in >= 65 && in <= 90) || (in >= 97 && in <= 122)) {
                            k++;
                        }
                    }
                    i=0;
                }
                System.out.println("字母个数:"+k);
                bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

