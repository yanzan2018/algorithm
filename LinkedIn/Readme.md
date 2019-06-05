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

173. Binary Search Tree Iterator 
这道题的关键点是要求空间复杂度是O（h），这个只能用栈来实现，next方法的均摊时间复杂度是O（1）。否则就用数组，直接用中序遍历完整颗树，存到数组中，但是空间复杂度就是O（n），虽然每次得到最小数的时间复杂度也是O（1）。
这道题目也是二叉树的中序遍历的非递归形式
https://github.com/awangdev/LintCode/blob/master/Java/Binary%20Search%20Tree%20Iterator.java
https://rli40.expressions.syr.edu/2016/02/understandings-for-leetcode-binary-search-tree-iterator/
https://github.com/awangdev/LintCode/blob/master/Java/Binary%20Search%20Tree%20Iterator.java
https://www.jiuzhang.com/solution/binary-search-tree-iterator/
不管把Push所有的左孩子放在Next还是hasNext（需要多一个全局变量next），每个节点都是只需要放进栈里去一次就好，所以每次当栈顶元素出栈时，不管当push有没有发生的时候，最后对整棵树来说总的发生次数是n，所以对于每次调用next或hasnext，分摊的时间复杂度就会是O（1）。

5. Longest Palindromic Substring
516. Longest Palindromic Subsequence
352. Data Stream as Disjoint Intervals 
74. Search a 2D Matrix   
其实就是普通的二份搜索，唯一改变的是需要把mid的值还原为矩阵的行列索引。

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
Zig-Zag print binary tree
https://www.glassdoor.com/Interview/Transform-one-given-string-of-length-n-into-another-given-string-of-the-same-length-using-a-series-of-elemental-transformat-QTN_2707446.htm  
write a function to sample from a multinomial distribution  

k means /naive bayesian/knn 
https://medium.com/acing-ai/linkedin-ai-interview-questions-acing-the-ai-interview-41028c4b0704 

415


# random 
Given a random generator function that return 0 or 1 with equal probability, create another random function that will return any value between [0,6] with equal probability  
https://stackoverflow.com/questions/137783/expand-a-random-range-from-1-5-to-1-7
Talk about SVM, overfitting, classification methods?
Also, a coding question to use binary search in a sorted array!  
试想连续三次不成功的概率(9/49的三次方)为极小，也就是说基本上调用rand5常数次就可以得到解，所以时间复杂度可以理解为O(1)。

Given a random generator function that return 0 or 1 with  equal probability, create another random function that will return any value between [0,6] with equal probability

https://stackoverflow.com/questions/137783/expand-a-random-range-from-1-5-to-1-7

http://www.mytechinterviews.com/equal-probability-between-1-and-7

https://www.geeksforgeeks.org/implement-random-0-6-generator-using-the-given-random-0-1-generator/

The coding question was about random number generators (528. Random Pick with Weight  & 398. Random Pick Index )
https://www.geeksforgeeks.org/random-number-generator-in-arbitrary-probability-distribution-fashion/

398. Random Pick Index 
https://leetcode.com/submissions/detail/233232084/  
因为构造函数里只调用一次，所以时间复杂度是n没什么关系。但是Pick函数调用了多次，pick函数的时间复杂度是O（1）。
全局变量比如 
Map<Integer, List<Integer>> map;
Random r ;
的初始化放在构造函数中。
 此外，理解 Map<Integer, List<Integer>> map = new HashMap<>(); 注意其中map的值是List<Integer>类型,而不是ArrayList<Integer>或LinkedList<Integer>。类似 int[] nums = new int[10] 而不能是int[] nums = new Integer[10],但是nums[0] = new Integer(3) 是可以的。
  computeIfAbsent是Java8中的，就是一个和put功能差不多的算子，都是往map里面添加数据。不同的是，put只是简单的添加，当map中存在对应Key的时候，put会覆盖掉原本的value值。而computeIfAbsent顾名思义，会检查map中是否存在Key值，如果存在会检查value值是否为空，如果为空就会将K值赋给value。
  如果map里没有这个key，那么就按照后面的这个function添加对应的key和value；如果有，
  https://blog.csdn.net/charKim/article/details/81234479  测试computeIfAbsent
  https://www.cnblogs.com/inspirationBoom/p/9994932.html  computeIfAbsent源码解析
  
  528. Random Pick with Weight
  对于leetcode上的题目中的约束，
  比如给定一个数组，如果约束中n是20以内，那么算法的时间复杂度是2的n次方，或n的阶乘也可能过；但是如果n在100到1000之间，则n平方的算法可能能过；对于5000到10000，这一般要O（n）的时间复杂度才能过；
  对于w[i]要求大小，是因为这道题目需要求前缀和，太大会溢出。
  PickIndex函数 will be called at most 10000 times. 是希望其时间复杂度越低越好。
  
  

497. Random Point in Non-overlapping Rectangles

478. Generate Random Point in a Circle



