### https://www.khanacademy.org/computing/computer-science/algorithms/graph-representation/a/representing-graphs
### Topological Sorting for a graph is not possible if the graph is not a DAG.It is a linear ordering of vertices for DAG.
There can be more than one topological sorting for a graph. 
### The first vertex in topological sorting is always a vertex with in-degree as 0 (a vertex with no in-coming edges).
### https://www.geeksforgeeks.org/topological-sorting-indegree-based-solution/


# 207  course schedule
使用hashmap存储图的边的关系，对这道题目还需要一个hashmap存储所有节点的入度值（因为这个存储了图中的所有节点，所以不用专门用数据结构来存储图的节点了）。因为拓扑排序的场景，是需要记录所有节点的入度值的。
https://leetcode.com/problems/course-schedule/submissions/  这种写法中，入度为0的要么刚开始就是0，在这个queue循环之前就进去了，
要么是在这个循环里逐渐减去入度直到为0，然后进入queue,但是它一旦减为0，就意味着没有别的节点指向它了，所以按这个代码的逻辑只会将入度为0的节点入队列一次，这样可以解释，为什么可以不写indegree.remove(from);而map这个hashmap记录的是图的关系，提供给更新入度时用，可以不用修改。而且这个写法中注意把入度为0的节点入队的操作，应该在当把此刻的入度减一后，立即入队。而不是将入度减一写个循环，然后又专门写个循环来将入度为0的节点入队，因为这样会使节点为零的节点反复入队，导致count数目不正确；当然也可以每次把queue的入度为0的节点弹出后就从Indegree中删除此节点。
# 210  course schedule two 
# 269. Alien Dictionary
# 953. Verifying an Alien Dictionary 
# 329. Longest Increasing Path in a Matrix
# 444. Sequence Reconstruction
