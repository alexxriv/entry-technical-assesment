# ✔ TECHNICAL ASSESSMENT

This project contains programming challenges that can be solved by using the language of your choice, preferred Java, Go, JavaScript or Ruby.

You´re welcome to look inside /src/ folder. You may find helpful the code already implemented in **ApplicationSample** and **ApplicationSampleTest**
classes.

## 📑 Instructions

1. Create a fork of this repository into your own account.
2. There are 9 challenges described below. Read them and think for a solution.
3. Code your solution for each challenge. (Preferred using Java, Go, JavaScript or Ruby)
4. Test your solution. You are free to test the project as you wish.
5. Commit your code and push it to your own repository.
6. Create a pull request to the main repo([Skills Project](https://github.com/mpcalzada/skills-project)).

## 🥋 Challenges

### Across Years

#### Resume

Providing an input (years) and assuming it´s always an int, return the number of centuries for provided input. **How many centuries have N years?**

#### Testing cases

`yearsToCenturies(1)` ==> `1` why? 1st century

`yearsToCenturies(99)` ==> `1` why? 1st century

`yearsToCenturies(101)` ==> `2` why? 2nd century

`yearsToCenturies(2020)` ==> `21` why? 21st century

### Scramble

#### Resume

This method search a text equality inside another text like SCRAMBLE. You can only use the amount of letters provided in the original word for your
searching string. No more instructions needed, right?

#### Testing cases

`scramble("hdsasdellsdasooawwadwdwawrl", "helloworld")` ==> `True`

`scramble("dsasdeldasooawwadwdwaw", helloworld)` ==> `False` (There is no "h")

`scramble("hd ell oo w rl", "helloworld")` ==> `True`

### Middle Char

#### Resume

Find a middle char(s) (max 2) in a text. **Always expect a single word without spaces**.

#### Testing cases

`getMiddle("pair")` ==> `ai`

`getMiddle("odd")` ==> `d`

`getMiddle("finish")` ==> `ni`

### Duplicated Count

#### Resume

Find how many letters are repeated into a word. **Note that case-sensitive is irrelevant and spaces don´t count**.

#### Testing cases

`duplicateCount("hey")` ==> `0` No word is repeated

`duplicateCount("hello")` ==> `1` Letter 'l' is repeated

`duplicateCount("AcCoMmOdatIOn")` ==> `4` Letters 'a', 'c', 'o' and 'm' are repeated.

### VIPs Vocals

#### Resume

Count the number of vocals that are contained in the provided text. **Consider multiple words and upper/lower cases.**

#### Testing cases

`countVocals("n0n3")` ==> `0`

`countVocals("aeiou AEIOU")` ==> `10`

`countVocals("vowel counting is not an everyday thing")` ==> `12`

### Recursive Multiplier

#### Resume

You should recursively multiply all numbers contained in certain number until you have a 1-digit number.

#### Testing cases

`recursiveMultiply(20)` ==> `0` why? [2 * 0] = 0

`recursiveMultiply(236)` ==> `8` why? [2 * 3 * 6] = 36 [3 * 6] = 18 [1 * 8] = **8**

### Recursive Sum

#### Resume

You must recursively sum all numbers contained in certain number until you have a 1-digit number.

#### Testing cases

`recursiveSum(20)` ==> `2` why? [2 + 0] = 2

`recursiveSum(236)` ==> `2` why? [2 + 3 + 6] = 11 [1 + 1] = 2

### Array Couple

#### Resume

You must return an array of paired chars for the provided input phrase. **Spaces and odd phrases are valid**

#### Testing cases

`coupleArray("hey")` ==> `["he", "y"]`

`coupleArray("hello world")` ==> `["he", "ll", "o ", "wo", "rl", "d"]`

`coupleArray("Give me some pairs please")` ==> `["Gi","ve"," m","e ","so","me"," p","ai","rs"," p","le","as","e_"]`

### Give me this IP

#### Resume

This method convert a long into a valid IP address.

How?

1. Convert a `long` in `binary` (you will always get `32 bits` or fewer, if there is less just apply the pad to the left with zero).
2. Get 4 bytes (4 groups of 8 bits will give you 4 bytes).
3. Converts each byte to a decimal number.
4. Apply the IP format to your 4 decimal numbers.

#### Testing cases

`longToIP(2147483467L)` ==> `127.255.255.75`