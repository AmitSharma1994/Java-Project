package com.string;

/* Input: aabbccc, output: a2b2c3
        Input: aabbaaa, output: a2b2a3
        Input: aabba, output: a2b2a1*/
public class StringFreq {

    //aabba
    String freqCount(String str) {
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();

        int count = 1;
        int i;
        for (i = 1; i < ch.length; i++) {
            if (ch[i] == ch[i - 1]) {
                count++;
            } else {
                sb.append(ch[i - 1]).append(count);
                count = 1;
            }

        }
        sb.append(ch[i - 1]).append(count);
        return sb.toString();
    }

    public static void main(String[] args) {

        StringFreq sf = new StringFreq();

        System.out.println(sf.freqCount("aabbccc") + "Matching with" + "a2b2c3");
        System.out.println(sf.freqCount("aabbaaa") + "Matching with" + "a2b2a3");
        System.out.println(sf.freqCount("aabba") + "Matching with" + "a2b2a1");

    }
}
