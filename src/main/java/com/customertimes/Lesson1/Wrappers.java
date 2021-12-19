package com.customertimes.Lesson1;

import java.util.Arrays;
import java.util.List;

public class Wrappers {
    public static void main(String[] args) {
        wrapersTypes();
        arrayExample();
        bigArray1();
        bigArray2();
    }

    /*
   Array with com.customertimes.Lesson2.Methods
   */
    public static void arrayExample() {

        int[] arrayNew = {15, 10, 6};//
        int count = arrayNew.length;                        //method 1 Calculates the length
        int sum = Arrays.stream(arrayNew).sum();            //method 2 Sums the values in an array
        List list = Arrays.asList(arrayNew);                //method 3 Updating array to list
        boolean containsElement = list.contains(arrayNew);
        System.out.println("Elements in massive: " + count); //return method1
        System.out.println("Sum: " + sum);                   //return method2
        System.out.println("List: " + containsElement);      //return method3
        System.out.println("Element 0: " + arrayNew[0]);     //Element 1
        System.out.println("Element 1: " + arrayNew[1]);     //Element 2
        System.out.println("Element 2: " + arrayNew[2]);     //Element 3

    }

    /*
        Two dimensional array 3x3
        Type1
    */
    public static void bigArray1() {

        int[][] Array = new int[3][3];         //array
        Array[0][0] = 1;
        Array[0][1] = 2;
        Array[0][2] = 3;
        Array[1][0] = 4;
        Array[1][1] = 5;
        Array[1][2] = 6;
        Array[2][0] = 7;
        Array[2][1] = 8;
        Array[2][2] = 9;
        String a = Arrays.deepToString(Array);//full array method
        System.out.println("Big Array!!! " + a);
        System.out.println("Get element: " + Array[2][0]);

    }

    /*
        Two dimensional array 3x3
        Type2
    */
    public static void bigArray2() {

        int[][] Array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//array
        String b = Arrays.deepToString(Array);            //full array method
        System.out.println("2)Big Array!!! " + b);
        System.out.println("2)Get element: " + Array[1][2]);
    }

    /*
    Class wrappers for each data type
    */
    public static void wrapersTypes() {

        boolean primitiveBool = false;
        Boolean a0 = Boolean.valueOf(primitiveBool);
        System.out.println("Wrapper bool: " + a0);                         //return wrapper bool
        Boolean b0 = a0.equals(false);   //method1 Equals values with object values
        String c0 = a0.toString(a0);    //method2 Update boolean value in string
        int d0 = a0.compareTo(false);   //method3 Compare false with boolean if result <0 not equal String value, 0 equal String value
        System.out.println("Equal to false value?: " + b0);                          //return method1
        System.out.println("String: " + c0);                         //return method2
        System.out.println("Compare to: " + d0);                      //return method3
        System.out.println("\n");

        char primitiveChar = 'A';
        Character a1 = Character.valueOf(primitiveChar);
        System.out.println("Wrapper char: " + a1);//return wrapper Character
        Character b1 = Character.toLowerCase(a1);//method1 update char to lower case
        Boolean c1 = Character.isAlphabetic(a1); //method2 сhecks that the value is a string character
        String d1 = Character.getName(a1);       //method3 return unicode name
        System.out.println("Lower case: " + b1);                      //return method1
        System.out.println("Alphabet?: " + c1);                       //return method2
        System.out.println("Unicode name: " + d1 + "\n");                   //return method3


        byte primitiveByte = 121;
        Byte a2 = Byte.valueOf(primitiveByte);
        System.out.println("Wrapper Byte:" + a2);//return wrapper Byte
        int b2 = Byte.toUnsignedInt(a2);    //method1 converts the argument to an int by an unsigned conversion
        Long c2 = Byte.toUnsignedLong(a2);  //method2 converts the argument to an long by an unsigned conversion
        int d2 = Byte.hashCode(a2);         //method3 returns a hash code for this Byte
        System.out.println("Unsigned Int: " + b2);           //return method1
        System.out.println("Unsigned Long: " + c2);          //return method2
        System.out.println("hashCode: " + d2);               //return method3
        System.out.println("\n");

        short primitiveShort = 1000;
        Short a3 = Short.valueOf(primitiveShort);
        System.out.println("Wrapper short: " + a3);//return wrapper Short
        Short b3 = Short.reverseBytes(a3);  //method1 returns the value obtained by reversing the order of the bytes in the two's complement representation of the specified long value
        int c3 = Integer.reverse(a3);       //method2 returns the value obtained by reversing the order of the bits in the two's complement binary representation of the specified long value
        Byte d3 = a3.byteValue();           //method3 returns the value of this Long as a byte after a narrowing primitive conversion
        System.out.println("reversed bytes: " + b3);         //return method1
        System.out.println("reversed int: " + c3);            //return method2
        System.out.println("Bytes: " + d3);                   //return method3
        System.out.println("\n");

        int primitiveInt = 2262345;
        Integer a4 = Integer.valueOf(primitiveInt);
        System.out.println("Wrapper int: " + a4);//return wrapper Integer
        Integer b4 = Integer.bitCount(a4);      //method1 returns the number of one-bits in the two's complement binary representation of the specified int value.
        String c4 = Integer.toHexString(a4);    //method2 Returns a string representation of the integer argument as an unsigned integer in base 16
        String d4 = Integer.toBinaryString(a4); //method3 Returns a string representation of the integer argument as an unsigned integer in base 2.
        System.out.println("Count bit: " + b4);       //return method1
        System.out.println("Hex String: " + c4);      //return method2
        System.out.println("Binary String: " + d4);   //return method3
        System.out.println("\n");

        long primitiveLong = 1064563511;
        Long a5 = Long.valueOf(primitiveLong);
        System.out.println("Wrapper Long: " + a5);//return wrapper Long
        Long b5 = Long.highestOneBit(a5);               //method1 Returns a long value with at most a single one-bit, in the position of the highest-order ("leftmost") one-bit in the specified long value.
        Long c5 = Long.sum(89, a5);                   //method2 Adds two long values together as per the + operator.
        Long d5 = Long.rotateLeft(a5, 5);       //method3 Returns the value obtained by rotating the two's complement binary representation of the specified long value left by the specified number of bits.
        System.out.println("Highest one bit: " + b5); //return method1
        System.out.println("Sum = " + c5);            //return method2
        System.out.println("Rotate left = 5" + d5);   //return method3
        System.out.println("\n");

        float primitiveFloat = 1.5f;
        Float a6 = Float.valueOf(primitiveFloat);
        System.out.println("Wrapper Float: " + a6);//return wrapper Float
        Boolean b6 = Float.isFinite(a6);        //method1 Returns true if the argument is a finite floating-point value; returns false otherwise (for NaN and infinity arguments
        Boolean c6 = Float.isNaN(a6);            //method2 Returns true if this Float value is a Not-a-Number (NaN), false otherwise
        int d6 = Float.floatToIntBits(a6);      //method3 Returns a representation of the specified floating-point value according to the IEEE 754 floating-point "single format" bit layout.
        System.out.println("Finite?: " + b6);     //return method1
        System.out.println("NaN?: " + c6);        //return method2
        System.out.println("int bits: " + d6);    //return method3
        System.out.println("\n");

        double primitiveDouble = 2.53463456;
        Double a7 = Double.valueOf(primitiveDouble);
        System.out.println("Wrapper Double: " + a7);//return wrapper
        Long b7 = Double.doubleToRawLongBits(a7);//method1 Returns a representation of the specified floating-point value according to the IEEE 754 floating-point "double format" bit layout, preserving Not-a-Number (NaN) values.
        Double c7 = Double.max(a7, b7);          //method2 Returns the greater of two double values as if by calling Math.max
        Double d7 = Double.min(a7, b7);          //method3 Returns the smaller of two double values as if by calling Math.min
        System.out.println("Raw long Bits: " + b7);//return method1
        System.out.println("Max: " + c7);          //return method2
        System.out.println("Min: " + d7);          //return method3
        System.out.println("\n");

    }
}
