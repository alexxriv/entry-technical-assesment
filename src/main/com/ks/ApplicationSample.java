package com.ks;

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
        //Here goes the magic
        return 0;
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
        //Here goes the magic
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
        //Here goes the magic
        return "MID_CHAR(s)";
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
        //Here goes the magic
        return 0;
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
        //Here goes the magic
        return 0;
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
        //Here goes the magic
        return 0;
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
        //Here goes the magic
        return 0;
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
        //Here goes the magic
        return new String[]{"PA", "IR", "ED", " V", "AL", "UE"};
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
        //Here goes the magic
        return "IP_ADDRESS";
    }
}
