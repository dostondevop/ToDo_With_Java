import jdk.swing.interop.LightweightContentWrapper;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //     Integer, Float, Double, Character, Long, Short, Byte, Boolean;
        // Wrapper class
        Integer age = 10;
        Float weight = 100.9f;
        Boolean gender = true;
        int agee = 10;
        System.out.println(age.toString());
        System.out.println(age.equals(100));
        int i = age.intValue();
        long l = age.longValue();
        byte b = age.byteValue();
        double d = age.doubleValue();
        System.out.println(weight.intValue());
        // Boxing

        //Primitive datatype dan nonprimitive datataype ga o'tish
        int height = 188;  // primitive data type
        Integer integer = Integer.valueOf(height); // boxing  -> primitive to Wrapper class
        int intValue = integer.intValue(); // unboxing -> Wrapper class to primitive data type
        


    }
}