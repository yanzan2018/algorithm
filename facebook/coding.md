### priority queue/quick select 

215. Kth Largest Element in an Array 

### interval

56. Merge Intervals 

https://leetcode.com/problems/merge-intervals/submissions/  

### Presum

560. Subarray Sum Equals K     

https://leetcode.com/submissions/detail/289969750/  brute force 
https://leetcode.com/problems/subarray-sum-equals-k/discuss/102106/Java-Solution-PreSum-%2B-HashMap 

https://leetcode.com/submissions/detail/290357579/   O(n)

LeetCode 523. Continuous Subarray Sum 

LeetCode 674. Longest Continuous Increasing Subsequence 

https://leetcode.com/submissions/detail/290732882/  O(n square)
https://leetcode.com/submissions/detail/290735380/   O(n)

121. Best Time to Buy and Sell Stock 
https://leetcode.com/submissions/detail/292076823/ 

### Dynamic programming

LeetCode 53. Maximum Subarray 

LeetCode 689. Maximum Sum of 3 Non-Overlapping Subarrays 

LeetCode 97. Interleaving String 
https://www.cnblogs.com/grandyang/p/4298664.html 
这道题需要理解dp数组的真实物理意义；dp[i][j]表示目前s1取前i个字符的子串和s2取前j个字符的子串是否是s3中取到前i+j的interleaving string。
dp[0][j]表示s1为空时，s2取前j个字符，字符串s3取到的前j个字符是interleaving。
比如dp[0][1]就表示s1取空串，和s2取第一个字符，然后合起来的字符串，是否是s3取第一个字符的interleaving string。
暴力dfs
cached dfs

leetcode 139. Word Break  

LeetCode 10. Regular Expression Matching 

3. Longest Substring Without Repeating Characters
31. Next Permutation

LeetCode 480. Sliding Window Median 
295. Find Median from Data Stream 

LeetCode 670. Maximum Swap 

LeetCode 3. Longest Substring Without Repeating Characters 
LeetCode 76. Minimum Window Substring 

LeetCode 43. Multiply Strings 
LeetCode 8. String to Integer (atoi)

LeetCode 49. Group Anagrams 

LeetCode 349. Intersection of Two Arrays 


LeetCode 51. N-Queens 
LeetCode 29. Divide Two Integers 
LeetCode 34. Find First and Last Position of Element in Sorted Array 

LeetCode 21. Merge Two Sorted Lists 
LeetCode 23. Merge K Sorted Lists 
LeetCode 88. Merge Sorted Array

LeetCode 92. Reverse Linked List II 
LeetCode 143. Reorder List 
300. Longest Increasing Subsequence 
LeetCode 20. Valid Parentheses 
LeetCode 301. Remove Invalid Parentheses 


### string
leetcode 953. Verifying an Alien Dictionary
438. Find All Anagrams in a String

621. Task Scheduler 
这道题目的idea就是要统计各个任务的个数，要先排个数最多的task，这在cooling interval 的个数小于unique task的个数时有效（比如有AAB,按照ABA，和BAIA,显然是前者），其他情况先放谁都是一样的，因为总是需要idle去填充。其本质就是要尽量减少idle的个数。
358. Rearrange String k Distance Apart
767. Reorganize String 

31. Next Permutation 
https://leetcode.com/problems/next-permutation/discuss/13867/C%2B%2B-from-Wikipediahttps://leetcode.com/problems/next-permutation/discuss/13867/C%2B%2B-from-Wikipedia 

leetcode 1249. Minimum Remove to Make Valid Parentheses 
比较容易想到的是栈的方法， time complexity O(n), space complexity O(n)
https://leetcode.com/submissions/detail/299460240/ 
还有 用指针的方法
https://leetcode.com/submissions/detail/299470450/ 

301. Remove Invalid Parentheses

721. Accounts Merge 

leetcode 114. Flatten Binary Tree to Linked List 
循环：  https://leetcode.com/submissions/detail/307727729/
这个方法是从根节点开始出发，先检测其左子结点是否存在，如存在则将根节点和其右子节点断开，将左子结点及其后面所有结构一起连到原右子节点的位置，把原右子节点连到元左子结点最后面的右子节点之后。
递归：  
是按照右 -> 左 -> 根 这样的后序顺序来遍历的, bottum up 的递归， 用了一个prev的全局变量。


https://www.cnblogs.com/nashiyue/p/5313767.html 
https://www.cnblogs.com/grandyang/p/4293853.html 
https://segmentfault.com/a/1190000010503483 
https://www.iteye.com/blog/yuanhsh-2185978 
https://www.iteye.com/blog/shmilyaw-hotmail-com-2289879 

leetcode 349. Intersection of Two Arrays
三种解法：
1  hashset   https://leetcode.com/submissions/detail/308023576/ 
2  two pointer   https://leetcode.com/submissions/detail/308036716/
3  binary search

leetcode 987. Vertical Order Traversal of a Binary Tree




