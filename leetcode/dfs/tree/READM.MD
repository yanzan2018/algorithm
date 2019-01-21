### 236. Lowest Common Ancestor of a Binary Tree  bottom-up dfs (post-order travesal)
https://www.youtube.com/watch?v=13m9ZCB8gjw  case carry out
it does not matter there is any duplicates in this tree because we compare the node is p(q) rather than root value equal p(q) value. 
The trick part is when find p, not continue in this sub tree to search q; Instead go another branch to search q. It is more easy to implement the algorithm in this way. 
