package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("The document number has the format xxxx-yyy-xxxx-yyy-xyxy \\ n \"+\n" +
                "                 \"where x is a number and y is a letter.");
        System.out.println("The first four digits cannot be 1111");
        //String regex = "(\d{4}\-\w{3}\-\d{4}\-\w{3}\+ [A-Za-z0-9]{4})";

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();

            Pattern pattern = Pattern.compile("(\\d{4}-\\w{3}-\\d{4}-\\w{3}-\\d{1}\\w{1}\\d{1}\\w{1}$)");
            Matcher matcher = pattern.matcher(str);

            for (int i = 0; i < 1; i++) {

                if (matcher.find())
                    System.out.println(matcher.group());
                else {
                    System.out.println("You entered the wrong format");
                    break;
                }
                boolean start;
                if (start = str.startsWith("1111")){
                    System.out.println("The first four digits cannot be 1111");
                    break;
                }

                Pattern pattern1 = Pattern.compile(("(\\d{4})"));
                Matcher matcher1 = pattern1.matcher(str);
                while (matcher1.find()) {
                    System.out.print(matcher1.group());

                }
                System.out.println();

                Pattern pattern2 = Pattern.compile("[a-zA-Z]{3}");
                Matcher matcher2 = pattern2.matcher(str);
                String str2 = matcher2.replaceAll("*");
                System.out.println(str2);


                Pattern pattern3 = Pattern.compile("([a-zA-Z]+)");
                Matcher matcher3 = pattern3.matcher(str);

                while (matcher3.find()) {
                    System.out.print(matcher3.group() + "/");
                }
            }
    }
}








