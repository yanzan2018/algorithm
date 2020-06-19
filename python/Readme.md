https://leetcode.com/submissions/detail/355600926/   

如果每门课程不是数字表示，而是字符表示，那么函数的参数应该有一个课程的名字的数组，而不是像现在这样只传入一个整数表示几门课程。因为如果课程是字符的话，indegree必须是hashmap。如果是字符的话，没法这样初始化in_degrees = [0] * numCourses
，那么如果有5门独立课程，prerequisites为空的话，目前的逻辑没法把5门课程的信息放入到indegree这样的hashmap里。
