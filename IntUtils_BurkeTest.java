package test;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.Test;


import utils.IntUtils_Burke;

class IntUtils_BurkeTest {


    @Test
    void isEven() {
        assert (IntUtils_Burke.isEven(3)) == false;
        assert (IntUtils_Burke.isEven(6)) == true;
        assert (IntUtils_Burke.isEven(1)) == false;
        assert (IntUtils_Burke.isEven(9)) == false;
    }

	@Test
    void isOdd() {
        assert (IntUtils_Burke.isOdd(5)) == true;
        assert (IntUtils_Burke.isOdd(2)) == false;
        assert (IntUtils_Burke.isOdd(7)) == true;
        assert (IntUtils_Burke.isOdd(6)) == false;
    }

    @Test
    void isPrime() {
        assert (IntUtils_Burke.isPrime(7)) == true;
        assert (IntUtils_Burke.isPrime(49)) == true;
        assert (IntUtils_Burke.isPrime(23)) == true;
        assert (IntUtils_Burke.isPrime(36)) == false;
    }


	@Test
    void greatestCommonFactor() {
        assert (IntUtils_Burke.greatestCommonFactor(5,4)) == 1;
        assert (IntUtils_Burke.greatestCommonFactor(10,5)) == 5;
        assert (IntUtils_Burke.greatestCommonFactor(18,6)) == 6;
        assert (IntUtils_Burke.greatestCommonFactor(9,3)) == 3;
    }

    @Test
    void getGreatestConstrainedMultiple() {
        assert (IntUtils_Burke.getGreatestConstrainedMultiple(7,50)) == 49;
        assert (IntUtils_Burke.getGreatestConstrainedMultiple(2,100)) == 100;
        assert (IntUtils_Burke.getGreatestConstrainedMultiple(3,19)) == 18;
        assert (IntUtils_Burke.getGreatestConstrainedMultiple(0,1)) == 0;
    }

    @Test
    void getIntegerH() {
        assert (IntUtils_Burke.getIntegerH(5, 5)) == 1;
    }

    @Test
    void getMaximum() {
        assert (IntUtils_Burke.getMaximum(new HashSet<Integer>(Arrays.asList(4,7,8))) == (8));
        assert (IntUtils_Burke.getMaximum(new HashSet<Integer>(Arrays.asList(90,50,30))) == (90));
        assert (IntUtils_Burke.getMaximum(new HashSet<Integer>(Arrays.asList(66,6,32,61))) == (66));
        assert (IntUtils_Burke.getMaximum(new HashSet<Integer>(Arrays.asList(99))) == (99));

    }

    @Test
    void getMinimum() {
        assert (IntUtils_Burke.getMinimum(new int[]{3,7,5})) == 3;
        assert (IntUtils_Burke.getMinimum(new int[]{13})) == 13;
        assert (IntUtils_Burke.getMinimum(new int[]{90,9,99})) == 9;
        assert (IntUtils_Burke.getMinimum(new int[]{5,2,-4,6})) == -4;
    }

    @Test
    void isSorted() {
        assert (IntUtils_Burke.isSorted(new int[]{1,2,3})) == true;
        assert (IntUtils_Burke.isSorted(new int[]{17})) == true;
        assert (IntUtils_Burke.isSorted(new int[]{89,13,60,17})) == false;
        assert (IntUtils_Burke.isSorted(new int[]{9,-8,7,6})) == false;
    }

    @Test
    void getSmallestIndexOfMatch() {
        assert (IntUtils_Burke.getSmallestIndexOfMatch(new int[]{5,2,-4,6},2)) == 1;
        assert (IntUtils_Burke.getSmallestIndexOfMatch(new int[]{5,3,1},5)) == 0;
        assert (IntUtils_Burke.getSmallestIndexOfMatch(new int[]{1,2,3,4},3)) == 2;
        assert (IntUtils_Burke.getSmallestIndexOfMatch(new int[]{20},2)) == -1;
    }

    @Test
    void reverse() {
        assert (IntUtils_Burke.reverse(29)) == 92;
        assert (IntUtils_Burke.reverse(8632)) == 2368;
        assert (IntUtils_Burke.reverse(1)) == 1;
        assert (IntUtils_Burke.reverse(5517)) == 7155;
    }

    @Test
    void sumthing() {
        assert (IntUtils_Burke.sumthing(29)) == 11;
        assert (IntUtils_Burke.sumthing(55)) == 10;
        assert (IntUtils_Burke.sumthing(1)) == 1;
        assert (IntUtils_Burke.sumthing(0)) == 0;
    }
}