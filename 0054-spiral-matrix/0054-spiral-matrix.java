
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ans;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            
            for (int i = left;i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

          
            for (int j = top; j <= bottom; j++) {
                ans.add(matrix[j][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // 4) left column, bottom→top (if still within bounds)
            if (left <= right) {
                for (int j = bottom; j>= top; j--) {
                    ans.add(matrix[j][left]);
                }
                left++;
            }
        }

        return ans;
    }
}
