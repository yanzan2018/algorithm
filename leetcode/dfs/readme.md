dfs 就是一条路径走到底。
带回溯的dfs就是需要手动地删除，因为是引用，但是字符串不需要。
top down 和 bottom up的时间复杂度有时候是一样的，都是O（n），都要根据具体情况分析。
一般bottom up的dfs都是有返回值的，而top down的helper函数一般是把level作为参数传进去的，还会有个全局变量。
