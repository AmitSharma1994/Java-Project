package com.string;

import java.util.HashMap;
import java.util.Map;

public class StringFreqHM{

    StringBuilder sb = new StringBuilder();

    String countFreq(String str) {

        HashMap<Character, Integer> hm = new HashMap();

        char[] ch = str.toCharArray();
        //{a,a,b,b,c,c,c}
        for (int i = 0; i < ch.length; i++) {

            if (hm.containsKey(ch[i])) {
                hm.put(ch[i], hm.get(ch[i]) + 1);

            } else {
                hm.put(ch[i], 1); //a ,2
            }

        }

        for (Map.Entry hm1 : hm.entrySet()) {
            sb.append(hm1.getKey()).append(hm1.getValue());
        }


        return sb.toString();

    }


    //Map.put(ab,);

    public static void main(String[] args) {

        StringFreqHM sf = new StringFreqHM ();
        System.out.println(sf.countFreq("aabba"));
       /* Input: aabbccc, output: a2b2c3
        Input: aabbaaa, output: a2b2a3
        Input: aabba, output: a2b2a1*/

    }
}
