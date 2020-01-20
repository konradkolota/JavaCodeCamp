package com.kk;

public class test {
    public static void main(String[] args) {
        DistinctArray testowy = new DistinctArray();
        int[] testArray =  {1,1,2,3,4,5,5,5,5,6,6,7,8,9,9,0,0,0,0,0,1,2,3,4,3,3,3,3,4,5,6,7};

        testowy.getDistinct(testArray);
    }
}
