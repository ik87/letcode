package yandex;
//https://leetcode.com/problems/search-a-2d-matrix/
public class SearchA2dMatrixJ {
        public boolean searchMatrix(int[][] matrix, int target) {
            int[] row = searchRow(matrix, target);
            return binSearch(row, target);
        }

        private int[] searchRow(int[][] matrix, int target) {
            for(int y = 0; y < matrix.length; y++) {
                if(target >= matrix[y][0] && target <= matrix[y][matrix[y].length -1]) {
                    return matrix[y];
                }
            }
            return new int[]{};
        }

        private boolean binSearch(int[] row, int target) {
            int last = row.length;
            int first = 0;
            boolean found = false;
            while(first != last) {
                int point = (last - first) / 2 + first;
                if(row[point] == target) {
                    found = true;
                    break;
                }
                if(row[point] > target) {
                    last = point;
                }
                if(row[point] < target) {
                    first = point + 1;
                }
            }
            return found;
        }
}
