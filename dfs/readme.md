## Graph
需要找到一个开始遍历的点
200. Number of Islands   常见的dfs，需要visited数组。根据题意找到一个标识为岛的点开始遍历，即寻找有多少个满足给定条件的连通图。
130. Surrounded Regions 是变种的dfs。 第一，选择开始遍历的点比较tricky,因为Surrounded regions shouldn’t be on the border，所以比较smart的方式是选择从边界上的点开始遍历，然后这样的点能到的区域都不是满足条件的。这样，剩下的点O就都是满足条件的了。因为遍历的同时翻转了，所以类似visited的作用，也就是不会在访问，所以不需要再用visited。
Maze也是变种的dfs。不同在于球要一滚到底，所以下一轮递归的dfs的开始的点不是有直接边连接的点， 而是滚到不能再滚的点。
286. Walls and Gates 


