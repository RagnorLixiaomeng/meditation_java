/*story：使用方法重载的思想，设计比较两个整数是否相同的方法，兼容全整数类型（byte short int long float double）*/

public class Ragnor_08_CompareTwoNumIsSame {
    public static void main(String[] args) {
//        boolean result = compareTwoNumIsSame(1, 3.3);
//        System.out.println(result);
        System.out.println(compareTwoNumIsSame((byte)1, (byte)3.3));
        System.out.println(compareTwoNumIsSame((short)1, (short)3.3));
        System.out.println(compareTwoNumIsSame(1, 3));
        System.out.println(compareTwoNumIsSame(1L, 3L));
        System.out.println(compareTwoNumIsSame(1.1F, 3.3F));
        System.out.println(compareTwoNumIsSame(1.1, 3.3));


    }

    public static boolean compareTwoNumIsSame(byte a, byte b){
        System.out.println("byte");

        if (a == b){
            return true;
        }else {
            return false;
        }
    }

    public static boolean compareTwoNumIsSame(short a, short b){
        System.out.println("short");
        if (a == b){
            return true;
        }else {
            return false;
        }
    }

    public static boolean compareTwoNumIsSame(int a, int b){
        System.out.println("int");
        if (a == b){
            return true;
        }else {
            return false;
        }
    }

    public static boolean compareTwoNumIsSame(long a, long b){
        System.out.println("long");
        if (a == b){
            return true;
        }else {
            return false;
        }
    }

    public static boolean compareTwoNumIsSame(double a, double b){
        System.out.println("double");
        if (a == b){
            return true;
        }else {
            return false;
        }
    }

    public static boolean compareTwoNumIsSame(float a, float b){
        System.out.println("float");
        if (a == b){
            return true;
        }else {
            return false;
        }
    }
}
