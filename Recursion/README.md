# RECURSION
Below are my notes for recursion. 

### Problem 1
Given N, count all ‘a’ and ‘b’ that satisfy the condition a^3 + b^3 = N. [Link](https://www.geeksforgeeks.org/count-pairs-a-b-whose-sum-of-cubes-is-n-a3-b3-n/)

### Approach
Approach would be to traverse through number from 0 to b^3<n ,as we find the a^3 (a^3=n-b^3) ,we check if a is a perfect cube or not 
if yes then count++;
### Solution

[Firstly, try yourself](https://github.com/utsav-verma/DSA/blob/main/Recursion/find_pair.java)

<hr>

### Problem 2
Finding a 'p' and 'q' of n=>p*q from when p and q are prime numbers 

### Approach
Approach would be to traverse through number from 0 to n/2 ,as we have to find pair so n/2 now ,
now run a loop from) 2 to p*q<=n(that is our prime condition) and check if p and q are prime or not,
prime check [Sieve of Eratosthenes](https://www.geeksforgeeks.org/sieve-of-eratosthenes/)
### Solution

[Firstly, try yourself](https://github.com/utsav-verma/DSA/blob/main/Recursion/find_pair_prime.java)

<hr>

### Problem 3
[Josephour Game](https://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/)

### Approach
delete every kth element until 1 person is alive, use Modulous to maintain the range
### Solution

[Firstly, try yourself](https://github.com/utsav-verma/DSA/blob/main/Recursion/josephous_problem.java)

<hr>

### Problem 4
Place n queens in n*n board in such a way all queen are safe,no queens attack eaxh other[Link](https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/)

### Approach
Naaive approcah place and recursively check if that position is safe if not position +1 till <n.
### Solution

[Firstly, try yourself](https://github.com/utsav-verma/DSA/blob/main/Recursion/n_queen.java)

<hr>

### Problem 5
[Question](https://www.geeksforgeeks.org/given-a-string-print-all-possible-palindromic-partition)

### Approach
Choose a particular range and check if they are palidome or not if yes add to list
### Solution

[Firstly, try yourself](https://github.com/utsav-verma/DSA/blob/main/Recursion/palindromic_partitions.java)

