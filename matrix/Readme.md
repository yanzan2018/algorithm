交换方阵的行列，
对于一个方阵A，交换其行列元素， 
显然，对角线上的元素不用交换。需要交换的是A[i, j]和A[j,i]。 可以用两个循环来实现，比如外循环是行，内循环是列。需要注意的是列的开始索引不应该是从零开始，而是行的索引加一，否则A[i, j]和A[j,i]会被交换两次，相当于没有交换。
两层循环应该如下：
for (int i = 0; i < row; i++)
  for (int j = i+1; j < col; j++) {
  ...
  }
