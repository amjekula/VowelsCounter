package org.example;

public class VowelsCounter {

    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        for(int x = str.length() - 1; x >= 0; x--){
            if(str.charAt(x) == 'a' || str.charAt(x) == 'e' || str.charAt(x) == 'i' || str.charAt(x) == 'o' || str.charAt(x) == 'u'){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
