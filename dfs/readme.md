## Graph
需要找到一个开始遍历的点
##### 200. Number of Islands   常见的dfs，需要visited数组。根据题意找到一个标识为岛的点开始遍历，即寻找有多少个满足给定条件的连通图。
##### 130. Surrounded Regions 是变种的dfs。 第一，选择开始遍历的点比较tricky,因为Surrounded regions shouldn’t be on the border，所以比较smart的方式是选择从边界上的点开始遍历，然后这样的点能到的区域都不是满足条件的。这样，剩下的点O就都是满足条件的了。因为遍历的同时翻转了，所以类似visited的作用，也就是不会在访问，所以不需要再用visited。
Maze也是变种的dfs。不同在于球要一滚到底，所以下一轮递归的dfs的开始的点不是有直接边连接的点， 而是滚到不能再滚的点。
##### 286. Walls and Gates  
trikcy的地方是从0开始遍历，而不是INF。不需要visited数组，满足条件if (rooms[i][j] + 1 < rooms[r][c]) 才会继续做dfs。这个条件做了两件事情，一件有visited的作用，使得之前被访问过的点不会再被访问，因为循环访问的点一定会比之前的点的步数多，另一个是能够找到更短的距离。这道题可以参考Maze 2 。

489. Robot Room Cleaner
扫地机器人是盲扫，一开始机器人根本是不知道自己在坐标系中的位置，而且根本不知道房子的地图,而且，所以要想好怎样用他给的api做移动
这题可能难点在于如何处理移动变换上。毕竟还要原路返回什么
这道题的题意就比较vague。要跟面试官clarify一下许多assumption。最后的结果至少要是可行的，言之成理的。
感觉dfs()里，一直可以 call move() and clean() 打扫卫生直到robot either move to the next cell that has a block or the next cell is already cleaned, 在这两种情况下robot就要turnLeft and turnRight, 所以这里move()一次好像有问题
turnRight(int k)是用来robot转身k次。比如，turnRight(2)就可以让机器人在原地向右转两次（180度）。
注意是机器人，保证方向在进入深层递归中不变，同时从深层递归返回时调整方向
这个应该用DFS吧，因为更贴切机器人一次只走一条路的行为吧。
如果机器人转了360度都走不了，它就应该回退了（即先转360度，然后再转180度；因为转360度是回到了原地，所以可以直接转180度就可以了）。
其实就是搜索，回溯法搜索房间的每一个点(在这里回溯就是转180度，注意还要move)，这里要用dfs，因为机器人不能同时出现在两个地方，所以用不了bfs。
根据AI的思想， 首先根据提供的API定义出自己想要的actions（三个方向移动和返回原来的位置），然后利用这些action解决问题
回溯的时候需要五步(普通的就一步，即remove)，(Turn left两次，move, turn left两次) ，头两次turn left是为了转到之前的方向，然后move，然后再次需要调整方向到之前的方向，然后再开始下一次的dfs的探索。 
平时的dfs是因为定义了一个方向数组，所以会一直向某个方向移动，一直到移动不了为止。这里不同的是机器人除了转向，否则会一直往一个方向移动。
与maze比较像，一直要碰到障碍物或边界才换方向。但maze不需要回溯。
https://www.1point3acres.com/bbs/thread-289514-8-1.html
https://www.1point3acres.com/bbs/interview/google-software-engineer-403845.html
https://www.1point3acres.com/bbs/thread-345555-1-1.html
https://www.1point3acres.com/bbs/thread-345555-1-1.html
https://massivealgorithms.blogspot.com/2018/12/leetcode-489-robot-room-cleaner.html
http://www.noteanddata.com/leetcode-489-Robot-Room-Cleaner-java-solution-note.html
https://linlaw0229.github.io/2019/03/02/489-Robot-Room-Cleaner/
https://www.cnblogs.com/grandyang/p/9988250.html
https://blog.csdn.net/sc19951007/article/details/83743171

https://www.youtube.com/watch?v=YKE4Vd1ysPI 并查集




353. Design Snake Game


323. Number of Connected Components in an Undirected Graph
先建好图，就非常好做。https://leetcode.com/submissions/detail/246854787/  其中的visited因为输入给定了图中结点的个数，所以可以用数组，但是也可以用hashset。用hashset的好处是如果没有给定图中结点的个数，就不能用数组，但是hashset是始终可以用的。
当然也可以不用建图来做，但是没有建图后好写。https://leetcode.com/submissions/detail/246835263/。 而且每dfs遍历一个节点，都会走一遍所有的边比如m,这样时间复杂度为O(mn)，但是建好图后的时间复杂度就是o(n)

dfs 对于无向图才需要考虑visited，比如number of islands里有四个方向的这种；而对于有向图，除非有环，否则不用考虑。

684. Redundant Connection 
这道题在Notes中提到N is the size of the input array.说明图是n个节点，N条边。此外， If there are multiple answers, return the answer that occurs last in the given 2D-array.这个指明并不是返回cycle里的任意一条边，而是加入这条边就会形成cycle的那条边。
这道题也需要先建好图,然后再在上边做操作。对于number of islands的这样的题目，因为已经把图建立好了， 所以不用专门做建图的操作（建好意味着很容易在上边做一些图的遍历等操作）。

https://leetcode.com/problems/redundant-connection/discuss/163973/dfs-and-union-find 

注意 List<List<Integer>> graph = new ArrayList<>(); 因为后面有graph.get(from)的操作，因为 如果改为LinkedList，则get操作ArrayList是O（1）操作；而LinkedList的get是O(n)操作。

这道题的dfs与一般图的dfs不一样，因为一般图的dfs是按照点来遍历，而这道题是按照边来遍历，即遍历每一条边，check这条边关联的两个点是否已经有路径可达，如果没有，则加入这条边，否则就说明加入这条边后会出现一个环，则返回这条边。
注意这道题的dfs中的visited每次都是重置了的，因为每次新来一条边时按照dfs的思想，会check这条边所有相关联的邻近点的关联的边。如果visited不重置，那么第一条边被check完了，第二条边加入的时候，第一条边关联的点就没法check了。
这道题目的dfs是bottom up的，即每次都要返回一个值。时间复杂度是n的平方阶。

261. Graph Valid Tree 

46. Permutations 
walk through 这类case的时候，注意按照深度优先遍历的思路去走，而不要去看循环for (int i = 0; i < nums.length; i++)这样去思考。
https://leetcode.com/problems/permutations/discuss/18239/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partioning) 
46 与17(Letter Combinations of a Phone Number)非常像 不同之处在于17不需要backtrack，因为用的是String








