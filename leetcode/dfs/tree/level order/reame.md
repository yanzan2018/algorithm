102. Binary Tree Level Order Traversal
递归的解法，由于递归的特性，我们会一直深度优先去处理左子结点，那么势必会穿越不同的层，所以当要加入某个结点的时候，我们必须要知道当前的深度，所以使用一个变量level来标记当前的深度，初始化带入0，表示根结点所在的深度。由于需要返回的是一个二维数组res，开始时我们又不知道二叉树的深度，不知道有多少层，所以无法实现申请好二维数组的大小，只有在遍历的过程中不断的增加。那么我们什么时候该申请新的一层了呢，当level等于二维数组的大小的时候，为啥是等于呢，不是说要超过当前的深度么，这是因为level是从0开始的，就好比一个长度为n的数组A，你访问A[n]是会出错的，当level等于数组的长度时，就已经需要新申请一层了，我们新建一个空层，继续往里面加数字.
https://www.cnblogs.com/grandyang/p/4051326.html
366. Find Leaves of Binary Tree 
what is the difference between depth and height in tree
https://stackoverflow.com/questions/2603692/what-is-the-difference-between-tree-depth-and-height
543. Diameter of Binary Tree
