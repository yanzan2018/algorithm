# 3. Longest Substring Without Repeating Characters

https://www.youtube.com/watch?v=sZosU8JjVaA brute force and sliding windows

## 1  暴力法
idea: 



## 2  滑动窗口法
子串的开始指针 ： 当结尾指针碰到重复值时，开始更新开始指针。
子串的结束指针 ： 一直往后移，直到碰到重复值。
模板是用while循环，if (比如改变end指针) else{比如改变start指针}

实现方法： 
### 1  两个指针start ,end, 用一个hashset存储目前的符合条件的子串的字符集合。当碰到重复值时，删掉hashset的当前start指向的元素，然后start逐个向后移动，直到遇到重复的元素，然后删除hashset后，start往后移一位。（最好先删除hashset的值，再移动start指针。否则要先把start指针的值先存下来。）
### 2  hashmap法   
使用一个hashmap存储元素和其对应的位置，当发现重复值时，更新hashmap此元素的索引值为当前的。trick的地方是需要跟新start为目前start和此重复元素的之前位置的索引+1的较大的值。这里的hashmap存储的值相当于start指针。
相对1的实现，当发现重复值时时，可以直接跳到下一个start的位置，但是1必须挨个移动start指针。
test case: 
更新start时，当第一个重复值出现时，一定是start更新到这个值前一次出现的位置加1；当后续又有重复值出现时，如果这个重复值比当前start的位置要早，显然start位置不用更新。
如abcca  当c出现时，start位置从0更新到3；当a出现时，start位置仍然是3。
