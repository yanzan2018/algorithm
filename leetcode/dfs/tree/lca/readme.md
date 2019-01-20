235. Lowest Common Ancestor of a Binary Search Tree
236. Lowest Common Ancestor of a Binary Tree  典型的dfs，后序遍历，bottom up的。tricky的地方在于判断两个节点是否在同一个子树还是另一个子树时，当找到一个节点时不是继续往下搜索另一个节点是不是也在这个子树里，而是去另一个子树搜索第二个节点。
Tree traversal could be preorder, or postorder, which can be implemented by recursive(dfs) or iterative
if recursive implementation, will be base rule(base rule is not different the node operation)
