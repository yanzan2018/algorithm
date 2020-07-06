### 72. Edit Distance 

https://www.jianshu.com/p/8e08a1794aba   
暴力使用dfs求解，对每一个位置上的字符，都有三种操作的可能性。
https://leetcode.com/submissions/detail/352435005/  参考的网页是https://www.jianshu.com/p/8e08a1794aba，但是这个解法有错误，应该加上memo[i][j] = res;这句。
另外，Integer[][] memo而不是int[][] memo，因为比如两个字符串相等，s1 = "aab"和 s2 = "aab"，经过计算后的memo也是0，这样区分不出来是计算前还是计算后的。但是使用Integer[][] memo，没计算过的就是null，很明显得到区分。

https://leetcode.com/problems/edit-distance/discuss/159295/Python-solutions-and-intuition
两个for循环一行一行地填充dp数组
如下两个单词  w1 = "ab",  w2 = "abc"
                                          a         b         c 
index:                          0         1         2         3
                     0          0         1         2         3
            a        1          1         0         1         2
            b        2          2         1         0         1
                     
### 1143. Longest Common Subsequence    
https://leetcode.com/submissions/detail/352880700/

###  718. Maximum Length of Repeated Subarray  
https://leetcode.com/problems/maximum-length-of-repeated-subarray/submissions/ 注意和1143的区别


### coin change
https://www.youtube.com/watch?v=uUETHdijzkA
