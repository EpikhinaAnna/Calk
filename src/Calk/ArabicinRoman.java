package Calk;

import java.util.List;

 class ArabicinRoman {
    public static int arabicinRoman(String input){
    String romanNumeral = input.toUpperCase();
    int result = 0;

    List<RomanAnn> romanNumerals = RomanAnn.getReverseSortedValues();

    int i = 0;

    while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
        RomanAnn symbol = romanNumerals.get(i);
        if (romanNumeral.startsWith(symbol.name())) {
            result += symbol.getValue();
            romanNumeral = romanNumeral.substring(symbol.name().length());
        } else {
            i++;
        }
    }

    if (romanNumeral.length() > 0) {
        throw new IllegalArgumentException(input + " нельз перевести в римскую цифру");
    }

    return result;
}
}
