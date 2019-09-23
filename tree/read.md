- 94 Binary Tree Inorder Traversal 
recursive和iterative都需要会
最重要的是理解中序的走法。然后先走递归，理解递归中递归栈的数据push和pop过程。然后再转到iterative的写法去走栈里元素的变化。
中序的走法，是把左子树的都遍历完，然后根节点，然后右子树；左子树和右子树再递归这个过程。所以过程就是一直从根节点的左孩子往下走，直到左孩子为空为止；在这个过程中递归的传入参数是不断更新的树的左子树节点，会一直被压入递归栈中，一直到左孩子为空；然后处理根节点；然后走到当前根节点的右子树，再反复地将其左孩子入递归栈，反复这个过程直到整颗树被遍历完。在递归中，当前的根结点的所有信息包括它自己会在整个左子树递归和右子树递归都完成后才弹出。
换到迭代的时候过程类似，唯一不同的是，栈里的元素出栈的时机，是在左子树为空的时候就会把栈顶元素出栈，而不是像递归那样等到左右子树都遍历完才出栈。

这里的recursive是top down的，可以把res设为全局变量，也可以作为helper函数的参数传进去。注意与permutation里res的新元素加入的位置的不同；permutation中的res是逐层加入每个元素的，所以放在递归的开始；而这个树的中序遍历是需要在把左边子树都一直递归到最左边，才开始在res加入元素，注意写法的不同。
而且需要注意把左边递归完了，返回来后，还需要继续执行后面的语句。
top down可以说是先序，当前处理的节点，然后它的左边，右边都还不知道结果。top down一般需要传一个上面的值下来(这个参数是记录上面的遍历得到的值)，而bottom up需要返回一个值上去。 
bottom up 大多数是后序遍历，因为先得知道左边子树的值，和右子树的值，才能决定当前节点的值。 
但是98题是中序遍历也可以用bottom up。是因为这道题左边的值不满足，就可以返回了；或当前的节点不满足，也可以返回。
- 98 Validate Binary Search Tree
有top down,bottom up和iterative的写法


bottom up做这道题目最为普遍，但是也需要也知道top down的写法
https://leetcode.com/submissions/detail/256635492/ top down 的写法
top down的写法是没有返回值的，一般都需要设全局变量。
也可以把全局变量设为递归函数的参数，如下列写法：
https://leetcode.com/submissions/detail/256679620/  
long[] prev = new long[1]; 是一个dummy node，在递归过程中不断改变的是它的值。
注意不能写成TreeNode[] prev = new TreeNode(1), 因为TreeNode的value是整形，这样如果输入是最小整数比如[-2147483648]，就会出错。

98的top down不能算完全的top down，只能说是中序。与其bottom up版本相比，当左边遇到false没有终止，还继续往下执行。这个要终止也是可以的，一进来就判断res是不是false，就return,但是本质上还是top down。


bottum up 的写法
注意因为test case中可能有Integer的最小值，所以https://leetcode.com/submissions/detail/257251012/ 做法是不对的，因为当只有一个结点且这个结点的值是最小值时，如下
Input:
[-2147483648]
Output:
false
Expected:
true
所以错了。
https://leetcode.com/submissions/detail/257254734/   这种写法用Long数组，注意初始化是Long的最小值，这样在刚开始时，不管根节点是什么值，prev肯定都会被替换掉。


 https://leetcode.com/submissions/detail/257257431/   更好的写法是是用Integer[] 数组，这样最开始的时候prev[0]的值是null。
 注意，prev[0]的指向始终不变，变化的是里面的值。和permutation里的curList一样的，变化的是里面的值。prev的初始值其实并不重要，因为它立即会被更新为当前root的val，这里用Null的目的就是标识它不是prev的初始值，用任何一个值能达到目的都行。
 
 
 https://leetcode.com/submissions/detail/257244648/ 这种写法的错误，注意出错test case[1,1]，每一层的prev是自己这层递归独有的，不会和其它层共享。
 
 和98类似的题目有   230. Kth Smallest Element in a BST
 用栈的迭代方法很简单， 如下
 https://leetcode.com/submissions/detail/258661752/      第26行的返回值相当于dummy node，返回的具体值不重要，只是一个必须要的return语句，因为按照题目You may assume k is always valid, 1 ≤ k ≤ BST's total elements.  所以当执行时一定会在第19行返回。
 https://leetcode.com/submissions/detail/258662387/     这种写法用了break，但是一般来说，能够直接return的就最好return，而不要用break；因为break只是跳出循环，但是后面可能还有语句需要执行。所以还是上面的写法更好。
 这类有count的题目用递归做时，特别要注意这个count值并不是每一层递归就变化（如permutation类型的题目很多就是每层变量会变化），而是有可能有几层或者说要满足条件后count值才会发生变化，这时count最好使用全局变量，当然也可以用参数的方式，但是必须用引用，比如数组。
 top down 的递归写法
 https://leetcode.com/submissions/detail/259100364/  无剪枝 和 https://leetcode.com/submissions/detail/259103342/   有剪枝, 时间效率更高。
 bottum up的递归写法
 当可以用全局变量时就用全局变量，比放在递归函数里做参数更方便(做参数一般会使用只有一个元素的数组，这样在层层递归中，每一层这个参数的引用不变，但是值可以改变)。
 https://leetcode.com/submissions/detail/259114418/  这里使用了count做全局变量。
 
 Kth Largest Element in a BST 
 https://www.careercup.com/question?id=11298700   
 
 671. Second Minimum Node In a Binary Tree
 https://www.youtube.com/watch?v=QXvbRrK1zjY&t=596s 花花酱 
 https://leetcode.com/submissions/detail/260845444/   top down的做法
 这道题的关键在于按照这棵树的定义， 即根节点是整颗树里的最小值，而其他节点的值要么等于该根节点，要么大于根节点， 所以top down中对于根节点的处理，就是如果大于根节点的才处理。注意学会剪枝，第30行的return。如test case[2,2,5,3,2,null,null,null,null,2,7]。 当递归到根节点为3就可以return了，因为再往下都是比3小的；同理对根节点5和7。这里比较特殊的是，3,5,7这些根节点都没有子树了，但是要明白有子树的话也不需要往下走了，因为当前节点就是包括子树里的最小值。
 这道题目的关键在于left 和right 其中一个点是null 的这种情况
 https://leetcode.com/submissions/detail/260874738/  bottum up的写法
 这里有两个base case。bottum up的写法经常会根据情况写好几个base case；这里bottum up的写法也没有剪枝的必要。
 https://leetcode.com/submissions/detail/262216339/  迭代的写法
 
 
- 104  Maximum Depth of Binary Tree

bottom up 的写法：
top down的写法：
迭代的写法

559. Maximum Depth of N-ary Tree 
https://leetcode.com/submissions/detail/262537740/  top down 的写法
https://leetcode.com/submissions/detail/263004587/   bottum up 的写法。注意max变量不是全局的，而是用作当前层的。另外max的变量的初始值应该赋值多少，可以走下case就知道了，不要想当然地就认为是0。

111. Minimum Depth of Binary Tree 

https://leetcode.com/submissions/detail/263022526/   top down 

https://leetcode.com/submissions/detail/263341132/   bottum up  最简洁的写法
https://leetcode.com/submissions/detail/263339483/   写成这样就可以了
https://leetcode.com/problems/minimum-depth-of-binary-tree/submissions/  迭代的写法
这三种写法的时间复杂度和空间复杂度每种算法都是O（n）
其中迭代写法的空间时间复杂度需要思考满二叉树的情况，最后一层最多有多少个节点。这就是空间复杂度最worse的情况，因为迭代写法的辅助空间结构是队列，考虑什么时候是最多。







- 110  Balanced Binary Tree
- 112  Path Sum
- 124 Binary Tree Maximum Path Sum
- 235 Lowest Common Ancestor of a Binary Search Tree
- 236 Lowest Common Ancestor of a Binary Tree
- 297 Serialize and Deserialize Binary Tree
- 449 Serialize and Deserialize BST
- 337 House Robber III
- 437 Path Sum III


- 144 Binary Tree Preorder Traversal
- 145 Binary Tree Postorder Traversal
- 173 Binary Search Tree Iterator
- 285 Inorder Successor in BST
