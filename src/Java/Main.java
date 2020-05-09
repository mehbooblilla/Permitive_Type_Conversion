package Java;

public class Main {

    public static void main(String[] args) {
//         Java program to convert long to String
        long number=12345;
        String toString=String.valueOf(number);
        System.out.println("long to string="+toString);
//                Java program to convert String to long
        String value="12345";
        long number1=Long.parseLong(value);
        System.out.println("string to long conversion:"+number1);
//        Java program to convert double to String
        double number2=12.5;
        String value1=String.valueOf(number1);
        System.out.println("Double to string:"+value);
//        Java program for string to double conversion
        double number3=Double.parseDouble(value1);
        System.out.println("String to double conversion:"+number3);
//        Java program to convert int to String
        int number4=12;
        String value2=String.valueOf(number4);
        System.out.println("int to string conversion:"+value2);
//        Java program for String to int conversion
        String value3="123";
        int number5= Integer.parseInt(value3);

        System.out.println("string to integer conversion:"+number5);
//        Java Program to find ASCII value of a character
        char value4='Z';
        int ascii= value4;
        System.out.println("ASCII value of "+value4+"  "+ascii );
 //       Java int to long conversion
        int number6=12345;
        System.out.println("Integer to Long conversion:");
        long value5=number6;
        System.out.println(value5);
//        Java long to int conversion
        int number7=(int)value5;
        System.out.println("Long to Integer conversion:"+number7);
//        Java char to string conversion
        char charValue='1';
        String stringValue=String.valueOf(charValue);
        System.out.println("char to string conversion: "+stringValue);
//        Java char to int conversion
        int number8=charValue;
        System.out.println("char to integer conversion: "+number8);
//        Java int to char conversion
        char value6=(char)number8;
        System.out.println("Integer to char conversion: " + value6);
 //       Java program to convert boolean to String
        boolean boolValue=false;
        String value7=String.valueOf(boolValue);
        System.out.println("boolean to String conversion: "+ value7);
//        Java String to boolean conversion:
        boolean value8=Boolean.valueOf(value7);
        System.out.println("String to boolean conversion: "+ value8);
//        Java binary to octal conversion







    }
}
