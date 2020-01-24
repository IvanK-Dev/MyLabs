package laba13_wrappers;

public class WrapperTest {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = Integer.valueOf(10);
        Integer i3 = new Integer(10);
        Integer i4 = Integer.parseInt("10");

        Character ch1 = 'Q';
        Character ch2 = Character.valueOf('Q');
        Character ch3 = new Character('Q');
        Character ch4 = "Q".charAt(0);

        Byte bt1 = 1;
        Byte bt2 = Byte.valueOf((byte) 1);
        Byte bt3 = new Byte((byte) 1);
        Byte bt4 = Byte.parseByte("1");

        Short sh1 = 1;
        Short sh2 = Short.valueOf((short) 1);
        Short sh3 = new Short((short) 1);
        Short sh4 = Short.parseShort("1");

        Float fl1 = 10F;
        Float fl2 = Float.valueOf(10);
        Float fl3 = new Float(10);
        Float fl4 = Float.parseFloat("10");

        Double d1 = 1.1;
        Double d2 = Double.valueOf(1.1);
        Double d3 = new Double(1.1);
        Double d4 = Double.parseDouble("1.1");

        Boolean b1 = true;
        Boolean b2 = Boolean.valueOf(true);
        Boolean b3 = new Boolean(true);
        Boolean b4 = Boolean.parseBoolean("true");


        byte bt5 = d1.byteValue();
        short sh5 = d1.shortValue();
        int i5 = d1.intValue();
        float fl5 = d1.floatValue();
        long lg = d1.longValue();

        Double var1 = 0.0, var2 = 2.2;
        Double nanValue = var1 / var1;
        Double infinityValue = var2 / var1;
        System.out.println("nanValue - " + nanValue);
        System.out.println("infinityValue - " + infinityValue);

        if (nanValue.isNaN()) System.out.println("Переменная  nanValue = NaN ");
        if (infinityValue.isInfinite()) System.out.println("Переменная infinityValue = Infinity");

        Long long1 = 120L;
        Long long2 = 120L;
        System.out.println("long1 - " + long1 +
                "\nlong2 - " + long2);

        System.out.println("long1 == long2 - " + (long1 == long2 ? "true" : "false"));
        long1 = 1200L;
        long2 = 1200L;
        System.out.println("long1 - " + long1 +
                "\nlong2 - " + long2);

        System.out.println("long1 == long2 - " + (long1 == long2 ? "true" : "false"));

        System.out.println("long1.equals(long2) - " + (long1.equals(long2) ? "true" : "false"));

    }
}
