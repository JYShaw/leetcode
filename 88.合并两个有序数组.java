/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p = 0;
    int q = 0;
    int[] sorted = new int[m + n];
    int i = 0;
    while (p < m || q < n) {
      if (p == m) {
        sorted[i] = nums2[q];
        i++;
        q++;
        continue;
      }
      if (q == n) {
        sorted[i] = nums1[p];
        i++;
        p++;
        continue;
      }
      if (nums1[p] < nums2[q]) {
        sorted[i] = nums1[p];
        i++;
        p++;
        continue;
      } else {
        sorted[i] = nums2[q];
        i++;
        q++;
        continue;
      }
    }

    for (int j = 0; j < m + n; j++) {
      nums1[j] = sorted[j];
    }
  }
}
// @lc code=end
