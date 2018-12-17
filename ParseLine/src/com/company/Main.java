package com.company;

public class Main {

    public static void main(String[] args) throws IncorrectLineException {
        String correctLine = "sdf=hjhjg&jhgjhg=jgjhg&jhgjhg=jhgjh";
        String incorrectLine = "sdf==-=hjhjg=jhgjhg=jgjhg&jhgjhg=jhgjh";

        new Main().parser(correctLine);

        // or incorrect one
        try {
            new Main().parser(incorrectLine);
        } catch (IncorrectLineException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void parser(String line) throws IncorrectLineException {

        int equels = 0;
        char[] splitedByampersantPair;

        String[] splitedbyampersantArray = line.split("&");
        for (int i = 0; i < splitedbyampersantArray.length; i++) {
            splitedByampersantPair = splitedbyampersantArray[i].toCharArray();
            for (int a = 0; a < splitedByampersantPair.length; a++) {
                equels = 0;
                if (splitedByampersantPair[a] == '=') {
                    equels++;
                }
            }
            if (equels == 1) {
                System.out.println("Line is correct");
            } else {
                throw new IncorrectLineException("Hello exception");
            }
        }
    }
}
