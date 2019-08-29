bottom up 其实是后序遍历
- 98. Validate Binary Search Tree
- 104. Maximum Depth of Binary Tree
- 110. Balanced Binary Tree
- 112. Path Sum
- 124. Binary Tree Maximum Path Sum
- 235. Lowest Common Ancestor of a Binary Search Tree
- 236. Lowest Common Ancestor of a Binary Tree
- 297. Serialize and Deserialize Binary Tree
- 337. House Robber III
- 449. Serialize and Deserialize BST
- 437. Path Sum III

- 94. Binary Tree Inorder Traversal 
recursive和iterative都需要会
这里的recursive是top down的，可以把res设为全局变量，也可以作为helper函数的参数传进去。注意与permutation里res的新元素加入的位置的不同；permutation中的res是逐层加入每个元素的，所以放在递归的开始；而这个树的中序遍历是需要在把左边子树都一直递归到最左边，才开始在res加入元素，注意写法的不同。
而且需要注意把左边递归完了，返回来后，还需要继续执行后年的语句。
- 144. Binary Tree Preorder Traversal
- 145. Binary Tree Postorder Traversal
- 173. Binary Search Tree Iterator
- 285. Inorder Successor in BST
