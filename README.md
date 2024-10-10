# Matrix-Spiral-Traversal
A simple approach using if's for spiral traversal of a matrix

# Working

1.Get the Count of Elements in the Matrix as t, which is numbers of rows * number of columns
2.initialized a variabled zc for taking count of elements visited, and initialize a flag variable as 0
3.run the while loop for n times

when flag is 0, increment j that is move right, when j exceeds column or next j element is already visited change the flag to 1 and increment i

when flag is 1, increment i that is move down, when i exceeds rows or next i element is already visited change the flag to 2 and decrement j

when flag is 2, decrement j that is move left, when j gets lesser than 0 or next j element is already visited change the flag to 2 and decrement i

when flag is 3, decrement i that is move up, when i gets lesser than 0 or next i element is already visited change the flag to 0 and increment j

the visited elements are marked by changings it's value to constant that does not exist in the matrix.it helps the flag to know if that is obstruction. The flag helps i ensuring the direction of Traversal,ultimately resulting in a Spiral Traversal.

Time Complexity

# O(R*C)
