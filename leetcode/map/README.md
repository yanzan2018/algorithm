# 3. Longest Substring Without Repeating Characters

https://www.youtube.com/watch?v=sZosU8JjVaA brute force and sliding windows

## 1  暴力法
idea: 



## 2  滑动窗口法
子串的开始指针 ： 当结尾指针碰到重复值时，开始更新开始指针。
子串的结束指针 ： 一直往后移，直到碰到重复值。

实现方法： 
### 1  两个指针start ,end, 用一个hashset存储目前的符合条件的子串的字符集合。当碰到重复值时，删掉hashset的当前start指向的元素，然后start逐个向后移动，直到遇到重复的元素，然后删除hashset后，start往后移一位。（最好先删除hashset的值，再移动start指针。否则要先把start指针的值先存下来。）
### 2  hashmap法   
使用一个hashmap存储元素和其对应的位置，当发现重复值时，更新hashmap此元素的索引值为当前的。trick的地方是需要跟新start为目前start和此重复元素的之前位置的索引+1的较大的值。这里的hashmap存储的值相当于start指针。
相对1的实现，当发现重复值时时，可以直接跳到下一个start的位置，但是1必须挨个移动start指针。
test case: 
abcca  当重复值的出现顺序并不是最开始元素值的出现顺序时，此时start的更新要注意一下。
