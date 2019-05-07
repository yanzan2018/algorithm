23. Merge k Sorted Lists 
优先队列的实现是用二叉堆来实现的。二叉堆的两个典型操作，插入任意元素，和弹出最大值（最大堆）或最小值（最小堆）。
这道题使用优先队列主要是在查找K个list中最小的值时，用最小堆是logk的时间。
最好在函数头养成判断参数是否有效的习惯，如下：
if (lists == null || lists.length == 0) {
            return null;
        }
 否则，当test case是[]时，PriorityQueue的构造函数采取不同的形式，返回的值不一样。PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);可以过，也返回[]。但是PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);就会返回null。为了避免这种tricky的写法，最好一开始就养成习惯对参数进行判断。
  
