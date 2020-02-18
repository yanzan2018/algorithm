### leetcode 42. Trapping Rain Water
https://segmentfault.com/a/1190000009798456
栈的方法是横着填，关键是填充高度的计算，为左右挡板高度的最小值-当前底部的高度值，其填充宽度为其左右挡板之间的bin的个数。
注意，底部和左挡板不一定是相邻的。如  [4,2,0,3,2,5] 
栈里的元素从底部到栈顶是降序的，这样就表示需要碰到一个大于栈顶的元素才会是找到右挡板，然后弹出栈顶元素，表示盛水的底部，然后此时的新的栈顶元素可以看做是其左边界；如果栈为空，就表示没有左挡板，则当前弹出的栈顶位置不能盛水。
动态规划：
https://leetcode.com/submissions/detail/303541484/ 
堆栈
https://leetcode.com/submissions/detail/303633869/
双指针：
https://leetcode.com/problems/trapping-rain-water/submissions/ 

动态规划和双指针都是需要找到当前位置的左边最大或右边最大，然后计算可以容水的量；而堆栈的方法不一样，它是通过当前位置最相邻的高度来判断是否可以积水，或者能积多少。

### leetcode 84. Largest Rectangle in Histogram


### 138. Copy List with Random Pointer

5. Longest Palindromic Substring 
