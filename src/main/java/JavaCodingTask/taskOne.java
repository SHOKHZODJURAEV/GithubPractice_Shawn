package JavaCodingTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class taskOne {

    public static void main(String[] args) {


        String str = "AABBCCDDDFFFF"; // A2B2C2D3F4
       // System.out.println(freString(str));
        String name = new taskOne().frequencyOfChars2(str);
        System.out.println(name);

    }
   // solution 01
    public static String freString(String str){

        String unique = ""; //ABCDF
        String frequencyResult = "";

        for (int i = 0; i < str.length(); i++) {

            if(!unique.contains(""+str.charAt(i)))
            unique += str.charAt(i);
        }
        //ABCDF

        for (int i = 0; i < unique.length(); i++) { //1

            int count = Collections.frequency(Arrays.asList(str.split("")),""+ unique.charAt(i)); //ABCDF
                                              //
           // List <String> name =  new ArrayList<>(Arrays.asList("A", "A", "B", "B", "B", "C", "C"));

            frequencyResult += unique.charAt(i)+""+count;
        }
        return frequencyResult;
    }
    //solution 02
    public String frequencyOfChars1(String str) { // A2B2C2D3F4
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }
    //solution 03
    public String frequencyOfChars2(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }

        String expectedResult = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                }
            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }

        return expectedResult;
    }




}
