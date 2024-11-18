public class Operators {
    public void shiftLeft() {
        int x = 2;
        x = x << 1;
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        int y = 9;
        y = y << 1;
        System.out.println("Decimal: " + y);
        System.out.println("Binary: " + Integer.toBinaryString(y));

        int z = 17;
        y = z << 1;
        System.out.println("Decimal: " + z);
        System.out.println("Binary: " + Integer.toBinaryString(z));

        int i = 88;
        i = i << 1;
        System.out.println("Decimal: " + i);
        System.out.println("Binary: " + Integer.toBinaryString(i));

    }

    public void shiftRight() {
        int x = 150;
        x = x >> 1;
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        int y = 225;
        x = y >> 1;
        System.out.println("Decimal: " + y);
        System.out.println("Binary: " + Integer.toBinaryString(y));

        int z = 1555;
        x = z >> 1;
        System.out.println("Decimal: " + z);
        System.out.println("Binary: " + Integer.toBinaryString(z));

        int i = 32456;
        i = y >> 1;
        System.out.println("Decimal: " + i);
        System.out.println("Binary: " + Integer.toBinaryString(i));
    }

    public void useBitwiseAnd() {
        int x = 7;
        int y = 17;
        int z = x & y;

        System.out.println("x Binary: " + Integer.toBinaryString(x));
        System.out.println("y Binary: " + Integer.toBinaryString(y));
        System.out.println("z AND Binary: " + Integer.toBinaryString(z));
        System.out.println("z AND decimal: " + z);

    }

    public void useBitwiseOR() {
        int x = 7;
        int y = 17;
        int z = x | y;

        System.out.println("z OR Binary: " + Integer.toBinaryString(z));
        System.out.println("z OR decimal: " + z);
    }
    public void usePostfix(){
        int number = 5;
        System.out.println("Value before: " + number);
        number++;
        System.out.println("Value after: " + number);

    }
    public void increment(){
        int number = 5;
        number++;
        System.out.println("number++: " + number);
        ++number;
        System.out.println("++number: " + number);
        number += 1;
        System.out.println("number +=: " + number);

    }
    public void sumOrder(){
        int x = 5;
        int y = 8;
        //int sum = ++x + y;
        int sum2 = x++ + y;
        //System.out.println("Sum Prefix: " + sum);
        System.out.println("Sum Postfix: " + sum2);
    }
}
