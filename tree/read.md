- 94 Binary Tree Inorder Traversal 
recursive和iterative都需要会
最重要的是理解中序的走法。然后先走递归，理解递归中递归栈的数据push和pop过程。然后再转到iterative的写法去走栈里元素的变化。
中序的走法，是把左子树的都遍历完，然后根节点，然后右子树；左子树和右子树再递归这个过程。所以过程就是一直从根节点的左孩子往下走，直到左孩子为空为止；在这个过程中递归的传入参数是不断更新的树的左子树节点，会一直被压入递归栈中，一直到左孩子为空；然后处理根节点；然后走到当前根节点的右子树，再反复地将其左孩子入递归栈，反复这个过程直到整颗树被遍历完。在递归中，当前的根结点的所有信息包括它自己会在整个左子树递归和右子树递归都完成后才弹出。
换到迭代的时候过程类似，唯一不同的是，栈里的元素出栈的时机，是在左子树为空的时候就会把栈顶元素出栈，而不是像递归那样等到左右子树都遍历完才出栈。

这里的recursive是top down的，可以把res设为全局变量，也可以作为helper函数的参数传进去。注意与permutation里res的新元素加入的位置的不同；permutation中的res是逐层加入每个元素的，所以放在递归的开始；而这个树的中序遍历是需要在把左边子树都一直递归到最左边，才开始在res加入元素，注意写法的不同。
而且需要注意把左边递归完了，返回来后，还需要继续执行后面的语句。
bottom up 其实是后序遍历
- 98 Validate Binary Search Tree
有top down,bottom up和iterative的写法


bottom up做这道题目最为普遍，但是也需要也知道top down的写法
https://leetcode.com/submissions/detail/256635492/ top down 的写法
top down的写法是没有返回值的，一般都需要设全局变量。
也可以把全局变量设为递归函数的参数，如下列写法：
https://leetcode.com/submissions/detail/256679620/  
long[] prev = new long[1]; 是一个dummy node，在递归过程中不断改变的是它的值。
注意不能写成TreeNode[] prev = new TreeNode(1), 因为TreeNode的value是整形，这样如果输入是最小整数比如[-2147483648]，就会出错。


bottum up 的写法
注意因为test case中可能有Integer的最小值，所以https://leetcode.com/submissions/detail/257251012/ 做法是不对的，因为当只有一个结点且这个结点的值是最小值时，如下
Input:
[-2147483648]
Output:
false
Expected:
true
所以错了。
https://leetcode.com/submissions/detail/257254734/   这种写法用Long数组，
 https://leetcode.com/submissions/detail/257257431/   更好的写法是是用Integer[] 数组，这样最开始的时候prev[0]的值是null。
 注意，prev[0]的指向始终不变，变化的是里面的值。和permutation里的curList一样的，变化的是里面的值。
 

- 104  Maximum Depth of Binary Tree
- 110  Balanced Binary Tree
- 112  Path Sum
- 124 Binary Tree Maximum Path Sum
- 235 Lowest Common Ancestor of a Binary Search Tree
- 236 Lowest Common Ancestor of a Binary Tree
- 297 Serialize and Deserialize Binary Tree
- 337 House Robber III
- 449 Serialize and Deserialize BST
- 437 Path Sum III


- 144 Binary Tree Preorder Traversal
- 145 Binary Tree Postorder Traversal
- 173 Binary Search Tree Iterator
- 285 Inorder Successor in BST
