package co.com.mywallet.crosscutting.helpers;

import java.math.BigDecimal;

public class NumericHelper {
    private NumericHelper(){

    }

    public static final boolean RANGE_INCLUDED = true;
    public static final boolean RANGE_NOT_INCLUDED = false;


    public static boolean isNegative(final Number number) {
        return isLessThan(number,0);
    }

    public static boolean isPositive(final Number number) {
        return isGreaterThan(number,0);
    }

    public static BigDecimal transformNumberToBigDecimal(final Number number) {
        return new BigDecimal(number.toString());
    }

    public static boolean isGreaterThan(final Number number1,final Number number2) {
        return transformNumberToBigDecimal(number1).compareTo(transformNumberToBigDecimal(number2))>0;
    }

    public static boolean isLessThan(final Number number1,final Number number2) {
        return transformNumberToBigDecimal(number1).compareTo(transformNumberToBigDecimal(number2))<0;
    }

    public static boolean isEqual(final Number number1,final Number number2) {
        return transformNumberToBigDecimal(number1).compareTo(transformNumberToBigDecimal(number2))==0;
    }

    public static boolean isGreaterOrEqualTo(final Number number1,final Number number2) {
        return isGreaterThan(number1,number2) || isEqual(number1,number2);
    }

    public static boolean isLessOrEqualTo(final Number number1,final Number number2) {
        return isLessThan(number1,number2) || isEqual(number1,number2);
    }

    public static boolean isBetween(final Number number,final Number initialNumber,final Number finalNumber, boolean includeInitial, boolean includeFinal) {
        return ((includeInitial) ? isGreaterOrEqualTo(number,initialNumber): isGreaterThan(number,initialNumber))
                &&
                ((includeFinal) ? isLessOrEqualTo(number,finalNumber):isLessThan(number,finalNumber));
    }

    public static boolean isBetweenExclusive(final Number number,final Number initialNumber,final Number finalNumber) {
        return isBetween(number,initialNumber,finalNumber,RANGE_NOT_INCLUDED,RANGE_NOT_INCLUDED);
    }

    public static boolean isBetweenInclusive(final Number number,final Number initialNumber,final Number finalNumber) {
        return isBetween(number,initialNumber,finalNumber,RANGE_INCLUDED,RANGE_INCLUDED);
    }

    public static boolean isBetweenInclusiveRight(final Number number,final Number initialNumber,final Number finalNumber) {
        return isBetween(number,initialNumber,finalNumber,RANGE_NOT_INCLUDED,RANGE_INCLUDED);
    }

    public static boolean isBetweenInclusiveLeft(final Number number,final Number initialNumber,final Number finalNumber) {
        return isBetween(number,initialNumber,finalNumber,RANGE_INCLUDED,RANGE_NOT_INCLUDED);
    }
}
