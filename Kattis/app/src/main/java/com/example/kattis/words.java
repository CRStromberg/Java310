package com.example.kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TooManyListenersException;

public class words {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter conversion = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        String phrase;

        while((phrase = reader.readLine())!= null){
            sb.append(phrase);
            parse(phrase);
            System.out.printf("%n");
        }
    }



    public static void parse(String phrase) {
        byte count = 0;
        int found;
        String temp, ans, finAns;
        String[] currencies = phrase.split(" ");

        for(int i = 0; i < currencies.length; i ++) {
            temp = currencies[i];
            if(!Character.isDigit(temp.charAt(0))) {
                System.out.printf(temp + " ");
            } else {
                found = Integer.parseInt(temp);
                ans = trans(found) + " ";

                if(count == 0) {
                    finAns = ans.substring(0, 1).toUpperCase() + ans.substring(1);
                    System.out.printf(finAns);
                } else { System.out.printf(ans); }
            }
            count++;
        }
    }

    public static String trans(int num) {
        int ones, tens;
        String number = "";
        String tempOnes, tempTens;

        ones = num % 10;
        tens = num / 10;

        tempTens = toTens(tens);
        tempOnes = toOnes(ones);

        switch (tens)
        {
            case 1:
                switch (ones)
                {
                    case 1:
                        number = "eleven";
                        break;
                    case 2:
                        number = "twelve";
                        break;
                    case 3:
                        number = "thirteen";
                        break;
                    case 4:
                        number = "fourteen";
                        break;
                    case 5:
                        number = "fifteen";
                        break;
                    case 6:
                        number = "sixteen";
                        break;
                    case 7:
                        number = "seventeen";
                        break;
                    case 8:
                        number = "eighteen";
                        break;
                    case 9:
                        number = "nineteen";
                        break;
                    default:
                        number = "ten";
                        break;
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if(ones == 0) { number = tempTens; }
                else { number = tempTens + "-" + tempOnes; }
                break;
            default:
                number += tempOnes;
                break;
        }
        return number;

    }

    public static String toTens(int tens) {
        String ans;

        switch (tens)
        {
            case 1:
                ans = "teen";
                break;
            case 2:
                ans = "twenty";
                break;
            case 3:
                ans = "thirty";
                break;
            case 4:
                ans = "forty";
                break;
            case 5:
                ans = "fifty";
                break;
            case 6:
                ans =  "sixty";
                break;
            case 7:
                ans =  "seventy";
                break;
            case 8:
                ans = "eighty";
                break;
            case 9:
                ans =  "ninety";
                break;
            default:
                ans = "zero";
                break;
        }
        return ans;
    }

    public static String toOnes(int ones) {
        String ans;

        switch (ones)
        {
            case 1:
                ans = "one";
                break;
            case 2:
                ans = "two";
                break;
            case 3:
                ans = "three";
                break;
            case 4:
                ans = "four";
                break;
            case 5:
                ans = "five";
                break;
            case 6:
                ans = "six";
                break;
            case 7:
                ans = "seven";
                break;
            case 8:
                ans = "eight";
                break;
            case 9:
                ans = "nine";
                break;
            default:
                ans = "zero";
                break;
        }
        return ans;
    }
}
