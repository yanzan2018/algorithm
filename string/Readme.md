
3. Longest Substring Without Repeating Characters
https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/  

注意这样的case "tmmzuxt"， 当遍历到最后一个t的时候，之前的t出现的位置是在目前的left之前，这时候要取更大的值。所以注意这句的写法：
left = Math.max(left, map.get(ch[right])+1);


### Reverse String 
最常见的做法是iterative的，可以用左右指针同时从前后开始扫描，也可以使用一个stringbuilder，从输入string的尾部开始开始扫描，依次将扫描到的元素加入到stringbuilder中，然后再把这个stringbuilder返回为string。


最直接的做法是top down的，但是由于substring的原因(这样每一层递归的时间复杂度是O（n）)，空间复杂度是n的平方(reverse调用中的自调用reverse，使得时间复杂度的分析按照递归树来走，因为每一层都用一个节点，所以有n层)。


String Reverse(String s) {
  if (s == "" || s.length() == 1) {
    return s;
  }
  return s.charAt(s.length() - 1) + Reverse(s.substring(0, length()-1));  
}
以下写法也是top down的，但是因为使用了stringbuffer，所以时间复杂度变成了O（1）。
String reverse(String s) {
  StringBuilder sb = new StringBuilder();
  dfs(s, s.length() - 1, sb);
  return sb.toString();
}


//也是top down的写法，因为每次一进递归，就把当前索引的字符加入到stringbuilder中（注意索引是从尾部开始扫描的），因为stringbuilder的append元素是O（1）的，所以这个空间复杂度是O（n）
//这种解法其实就是迭代的解法中的第二种
void dfs(String s, int p, StringBuilder sb) {
  if (p < 0) {
    return;
  } 
  sb.append(s.charAt(p));
  dfs(s, p-1, sb);
}


//还有bottom up的写法
String reverse(String s) {
  return dfs(s, 0);
}
void dfs(String s, int pos) {
  if (p == len) {
    return "";
  }
  String r = dfs(s, p+1);
  return r + s.charAt(p);
}
但是因为r是字符串，所以r+s.charAt(p)会产生一个新的字符串，这个的时间复杂度依然是O（n），所以整个递归函数的时间复杂度仍然是n的平方
