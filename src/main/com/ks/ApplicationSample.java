package com.ks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Good luck :)
 */
public class ApplicationSample
{

    /**
     * Across Years
     * <p>
     * How many centuries have n years ?
     * <p>
     * Example Year 1 belongs to the 1st century Year 99 belongs to the 1st century Year 101 belongs to the 2nd century Year 2020 belongs to the 21st
     * century
     *
     * @param years years...
     * @return century on the years
     */
    public static int yearsToCenturies(int years)
    {
        double yearsDouble = years;
        yearsDouble/=100.0;
        int answer = (int)Math.ceil(yearsDouble);
        return answer;
    }

    /**
     * Scramble
     * <p>
     * This method search a text equality inside of another text like SCRAMBLE !!!
     * <p>
     * You don't need instructions, right?
     * <p>
     * in: hdsasdellsdasooawwadwdwawrl ,  helloworld hd    ell    oo w        rl -> hdelloowrl Yes, it doesn't look the same, but ordered you should get
     * the same word, you know, like scramble ...
     * <p>
     * *** You must have the same number of letters if you use them more than once ***
     *
     * @param str1 unknown text
     * @param str2 searched word
     * @return if all same words and same quantity from second string exists in first string
     */
    public static boolean scramble(String str1, String str2)
    {
        HashMap<String, Integer> letterList = new HashMap<String, Integer>();

        for(int i=0; i<str1.length(); i++){
            String letter = String.valueOf(str1.charAt(i));
            int value;
            if(!letterList.containsKey(letter)){
                value = 0;
                letterList.put(letter, value);
            }
            value = letterList.get(letter);
            letterList.put(letter, ++value);
        }

        for(int i=0; i<str2.length(); i++){
            
            String letter = String.valueOf(str2.charAt(i));

            if(!letterList.containsKey(letter)){
                return false;
            } else {
                if(letterList.get(letter)==0){
                    return false;
                }
                
                int value = letterList.get(letter);
                value--;
                letterList.put(letter, value);
            }
            
        }
        return true;

    }

    /**
     * Middle Char
     * <p>
     * Find a middle char(s) in a text
     * <p>
     * Example
     * <p>
     * in: yes (hint: odd) out: e
     * <p>
     * in: word (hint: pair) out: or
     * <p>
     * *** Always wait for a single word ***
     *
     * @param word is the resource
     * @return a middle char(s)
     */
    public static String getMiddle(String word)
    {
        int length = word.length();
        String midChars;

        if(length%2==0){
            midChars = word.substring((length/2)-1, (length/2)+1);
        }else {
            midChars = word.substring((length/2), (length/2)+1);
        }
        return midChars;
    }

    /**
     * Duplicated Count
     * <p>
     * This method is used to find how many letters are repeated
     * <p>
     * Example
     * <p>
     * in: AcCoMmOdatIOn out: 4
     * <p>
     * AcCoMmOdatIOn -> have (a:2, c:2, o:3, m:2, d:1, t:1, i:1, n:1) -> just more than one (a:2, c:2, o:3, m:2) -> sum them             ^    ^    ^    ^
     * -> 4
     * <p>
     * *** As you can see, case sensitive is irrelevant, spaces don't count ***
     *
     * @param text is the resource to search
     * @return how many words are repeated
     */
    public static int duplicateCount(String text)
    {
        text = text.toLowerCase();
        int answer = 0;
        HashMap<Character, Integer> letterList = new HashMap<Character, Integer>();

        for(int i=0; i<text.length(); i++){
            if(!letterList.containsKey(text.charAt(i))){
                letterList.put(text.charAt(i), 0);
            }
            int actual = letterList.get(text.charAt(i));
            letterList.put(text.charAt(i), ++actual);
            if(actual==2){
                answer++;
            }
        }
        return answer;
    }

    /**
     * VIPs Vocals
     * <p>
     * This method get how many times a vocals are in a text
     * <p>
     * Example
     * <p>
     * in : "vowel counting is not an everyday thing" ^ ^   ^^  ^   ^   ^  ^  ^ ^   ^    ^   -> 12
     * <p>
     * ***Always wait lowercase***
     *
     * @param str is a text to search
     * @return a number of how many times a vocals are in a text
     */
    public static int countVocals(String str)
    {
        str = str.toLowerCase();
        int count = 0;
        String vowels = "aeiou";

        for (int i=0; i<str.length(); i++){
            String letter = String.valueOf(str.charAt(i));
            if(vowels.contains(letter)){
                count++;
            }
        }
        
        return count;
    }

    /**
     * Recursive Multiplier
     * <p>
     * This method solve a quantity of multiply all separated decimal numbers on a number recursively
     * <p>
     * in : 236 out: 8
     * <p>
     * how ?
     * <p>
     * 236 -> (2 * 3 * 6) = [36] -> (3 * 6) = [18] (1 * 8) = [8]
     *
     * @param n a number to find a digital root
     * @return how many times a decimal values in a number can be multiplied recursively
     */
    public static int recursiveMultiply(long n)
    {
        int answer = 1;
        String numberString = Long.toString(n);

        for(int i=0; i<numberString.length(); i++){
            int number = Character.getNumericValue(numberString.charAt(i));
            answer*= number;
        }
        
        if(answer>9){
            return recursiveMultiply(answer);
        }else{
            return answer;
        }
    }

    /**
     * Recursive Sum
     * <p>
     * This value sum all separated decimal numbers on a number recursively
     * <p>
     * in : 123456 out : 3
     * <p>
     * how ?
     * <p>
     * 123456 -> (1 + 2 + 3 + 4 + 5 + 6) = [21] -> (2 + 1) = [3]
     *
     * @param n a number to find a digital root
     * @return digital root from a number
     */
    public static int recursiveSum(int n)
    {
        int answer = 0;
        String numberString = Integer.toString(n);

        for(int i=0; i<numberString.length(); i++){
            int number = Character.getNumericValue(numberString.charAt(i));
            answer+= number;
        }
        
        if(answer>9){
            return recursiveSum(answer);
        }else{
            return answer;
        }
    }


    /**
     * Array Couple
     * <p>
     * This method return a char pair in array
     * <p>
     * Example in: "Give me some pairs please" out: [Gi, ve,  m, e , so, me,  p, ai, rs,  p, le, as, e_]
     * <p>
     * ***Spaces also count***
     *
     * @param s a text to evaluate
     * @return an array with pair of chars
     */
    public static String[] coupleArray(String s)
    {
        if(s.length()%2!=0){
            s = s.concat("_");
        }

        String[] answer = new String[s.length()/2];

        for(int i=0; i<answer.length; i++){
            String pair = s.substring(i*2, (i*2)+2);
            answer[i]= pair;
        }
        
        return answer;
    }

    /**
     * Give me this IP
     * <p>
     * This method convert a long in a valid ip
     * <p>
     * Example
     * <p>
     * in: 2147483467L -> out : 127.255.255.75
     * <p>
     * how ? 1.- Convert a long in binary (you will always get 32 bits or fewer, if there is less just apply the pad to the left with zero) 2.- Get 4 bytes
     * (4 groups of 8 bits will give you 4 bytes) 3.- Converts each byte to a decimal number 4.- Apply the ip format to your 4 decimal numbers
     *
     * @param ip is a 32 bits number maximum
     * @return an IP
     */
    public static String longToIP(long ip)
    {
        String validIP = "";
        String binario = Long.toBinaryString(ip);
        binario =  String.format("%32s", binario).replace(' ', '0');
        
        for(int i=0; i<binario.length(); i+=8){
            String subset = binario.substring(i, i+8);
            int decimal = Integer.parseInt(subset, 2);
            String group = String.valueOf(decimal).concat(".");
            validIP= validIP.concat(group);
        }

        validIP= validIP.substring(0, validIP.length()-1);

        return validIP;
    }

    public static void main(String[] args){
        System.out.println(yearsToCenturies(2020));
        System.out.println(scramble("hdsasdellsdasooawwadwdwawrl", "helloworld"));
        System.out.println(getMiddle("finish"));
        System.out.println(duplicateCount("AcCoMmOdatIOn"));
        System.out.println(countVocals("vowel counting is not an everyday thing"));
        System.out.println(recursiveMultiply(236));
        System.out.println(recursiveSum(236));
        System.out.println(Arrays.toString(coupleArray("Give me some pairs please")));
        System.out.println(longToIP(2147483467L));

    }
}
