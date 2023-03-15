package com;

import java.io.*;

public class MdToMds {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\No one\\Desktop\\MySQL数据库笔记.md");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = "";
        String name = "";

        while ((str = bufferedReader.readLine()) != null) {

            if (str.contains("### 第")) {
               name = str.substring(4);
            }
            if (name != ""){
                FileWriter fileWriter = new FileWriter(name + ".md",true);
//                System.out.println(str);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(str + "\r\n");
                bufferedWriter.close();
                fileWriter.close();
            }

        }


    }
}
