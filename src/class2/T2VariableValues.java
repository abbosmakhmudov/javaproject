package class2;

public class T2VariableValues {
    public static void main(String[] args) {
        byte verySmallWholeBox=127;
        verySmallWholeBox=126;
        short smallWholeBox=127;
        smallWholeBox=128;
        int mostWidelyUsedWholeNumberBox=1256220;
        mostWidelyUsedWholeNumberBox=1250000;
        long largeWholeBox=124586666654141L;
        largeWholeBox=124000000000000012L;

        float mediumDecimalBox= 12532.5F;
        mediumDecimalBox=12.1F;
        double largeDecimalBox=1354541.13125421;
        largeDecimalBox=123567889.11111111;
        char singleCharacterBox='G';
        singleCharacterBox='M';
        boolean trueFalseBox=true;
        trueFalseBox=false;

        System.out.println(verySmallWholeBox);
        System.out.println(smallWholeBox);
        System.out.println(mostWidelyUsedWholeNumberBox);
        System.out.println(largeWholeBox);
        System.out.println(mediumDecimalBox);
        System.out.println(largeDecimalBox);
        System.out.println(singleCharacterBox);
        System.out.println(trueFalseBox);


    }
}
