https://www.cnblogs.com/daoluanxiaozi/p/longest-palindromic-substring.html

# 5. Longest Palindromic Substring
## 动态规划：
根据Palindromic定义来定义子问题，发现i, j索引之间的字串索引是i+1， j-1，也就是需要读取下面的行的信息来判断当前的dp[i][j]是否构成回文串，所以
tricky的地方是for (int i = s.length() - 1; i >= 0; i--)， 此外，因为j是子串的结尾索引，所以j>=i，所以内循环是for (int j = i; j < s.length(); j++)   

https://leetcode.com/submissions/detail/184708441/


https://blog.csdn.net/HYbridSuns/article/details/54898964  另外一种动规思路。
## 中间扩展法
比较直观。但是要注意回文串有奇数个或偶数个，所以需要用两种situation。
https://leetcode.com/submissions/detail/184235527/
