46 Permutations
47 Permutations II

339. Nested List Weight Sum  

364. Nested List Weight Sum II

12. Integer to Roman
13. Roman to Integer 

468. Validate IP Address
https://www.cnblogs.com/grandyang/p/6185339.html 

270. Closest Binary Search Tree Value 
272. Closest Binary Search Tree Value II 
658. Find K Closest Elements  

53. Maximum Subarray  
https://www.youtube.com/watch?v=7J5rs56JBs8
关键点是当前这个元素之前的和是正数还是负数，如果是负数，就丢弃之前的累加和，重新开始。
https://www.youtube.com/watch?v=2MmGzdiKR9Y 
第12分钟  

152. Maximum Product Subarray  
https://www.youtube.com/watch?v=AtzfZHb35YI  
与53很类似，也是动态规划。区别在于除了保存一个目前的最大值，还要保存一个目前的最小值，因为如果当前元素为负数，则最大值为目前的最小值乘以当前数。
https://leetcode.com/submissions/detail/231575820/   注意temp的用处。

170 

5. Longest Palindromic Substring
516. Longest Palindromic Subsequence
352. Data Stream as Disjoint Intervals 


76. Minimum Window Substring 
34. Find First and Last Position of Element in Sorted Array
296. Best Meeting Point 
https://www.cnblogs.com/grandyang/p/5291058.html 
basic: ______A_____P_______B_______ 
只要开会为位置P在[A, B]区间内，不管在哪，距离之和都是A和B之间的距离，如果P不在[A, B]之间，那么距离之和就会大于A和B之间的距离。
extension: 那么我们现在再加两个点C和D：
______C_____A_____P_______B______D______
如果忽略A点和B点，那么对于C点和D点，任意点P在C或D其中的点都符合条件。但是如果我们把A和B点都加进来，那么任何在C和A之间的P点，或在B和D之间的P点都会使得A和B到这个点的距离之和大于其在A和B之间的P点之和，所以对于这四个点而言，P点选在A和B之间是最优的。
这样，我们通过分析可以得出，P点的最佳位置就是在[A, B]区间内，这样和四个点的距离之和为AB距离加上CD距离，在其他任意一点的距离都会大于这个距离。
一维的搞清楚了，街区距离实际上是二维的，拆成两个一维的就可以解了。
注意因为是行扫描的，所以对于行这个维度，是自然有序的；而对于列这个维度，则需要排序。

380. Insert Delete GetRandom O(1)

