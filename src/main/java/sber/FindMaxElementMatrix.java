package sber;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMaxElementMatrix {
    public static Integer getMaxValue(Integer[][] matrix) {
         /*
        1,2,3,4,5
        3,4,2,1,5
        5,4,3,1,8
        6,4,3,2,1
        */
        ArrayList<ArrayList<Integer>> buffer = new ArrayList<>();
        buffer.add(new ArrayList(Arrays.asList(matrix[0])));
        buffer.add(new ArrayList<Integer>());

        for (int i = 1 ; i < matrix.length; i++) {
            for (int j = 0 ; j < matrix[i].length; j++) {
                if(j == 0) {
                    int max = Math.max(matrix[i][0], matrix[i][1]);
                    int sum =  max + buffer.get(0).get(0);
                    buffer.get(1).add(sum);
                } else if(j == matrix[i].length - 1 && j != 0) {
                    int sum = Math.max(matrix[i][j], matrix[i][j-1]) + buffer.get(0).get(j);
                    buffer.get(1).add(sum);
                } else {
                    int sum = Math.max(Math.max(matrix[i][j], matrix[i][j-1]), matrix[i][j+1]) + buffer.get(0).get(j);
                    buffer.get(1).add(sum);
                }
            }
            buffer.set(0, new ArrayList(buffer.get(1)));
            buffer.get(1).clear();
        }
        return Collections.max(buffer.get(0));
    }

    public static void main(String[] args) throws IOException {
        Integer[][] matrix = {
                {10,2,3,10,5},
                {3,10,50,1,1},
                {10,4,3,1,20},
                {6,10,4,2,1}};
        System.out.println(FindMaxElementMatrix.getMaxValue(matrix));
    }
}
