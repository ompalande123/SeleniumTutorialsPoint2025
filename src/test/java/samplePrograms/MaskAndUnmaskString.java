// a java program to mask a string value and if we provide unmask value then it should return original string value
package samplePrograms;

import java.util.Base64;

public class MaskAndUnmaskString {

public static String mask(String value){
    return Base64.getEncoder().encodeToString(value.getBytes());
}


public static String unmask(String maskedValue){
    return new String(Base64.getDecoder().decode(maskedValue));

}

public static void main(String[] args) {
    String originalValue = "HelloWorld@#_124";
    String maskedValue = mask(originalValue);
    System.out.println("Masked Value: " + maskedValue);

    
    String unmaskedValue = unmask(maskedValue);
    System.out.println("Unmasked Value: " + unmaskedValue);

}

}


