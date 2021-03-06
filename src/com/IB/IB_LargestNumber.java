package com.IB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IB_LargestNumber {

    public static void main(String[] args) {

    }

    public static String largestNumber(final List<Integer> A) {

        List<String> strs = new ArrayList<String>();
        for(Integer i : A){
            strs.add(String.valueOf(i));
        }

        Collections.sort(strs, new MyCompartor());

        StringBuffer strBuf = new StringBuffer();
        for(String s : strs){
            if("0".equals(s) && strBuf.length() != 0) {
                continue;
            }
            strBuf.append(s);
        }

        return strBuf.toString();
    }


}

class MyCompartor implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        String first = s1 + s2;
        String second = s2 + s1;
        return second.compareTo(first);
    }
}