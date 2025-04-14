# Intro

## Intro to big O

What exactly is an "algorithm" in the context of leetcode-like problems. It's a set of instructions that a computer will
follow step-by-step to solve a problem.

For example, let's say you had a non-empty array of positive integers called nums, and you wanted to answer the
question: "What is the largest number in `nums`?".

````kotlin
fun max(input: IntArray): Int {
    var max = 0
    for (element in input) {
        if (max < element) max = element
    }
    return max
}
````

- Algorithms should be deterministic.
- The algorithm should be correct for any arbitrary **valid** input. In our example, we stated that nums is a non-empty
  array of positive integers. There are infinitely many such arrays, and our algorithm works for all of them. However,
  if nums contained negative numbers, the input would be invalid since we specifically required positive integers. In
  fact, our algorithm would break in such a case because we initialized maxNum to 0. If nums were entirely negative,
  maxNum would remain 0 since no negative number would be greater than 0, leading to an incorrect result. Instead, we
  should initialize maxNum to the first element of nums to ensure the maximum value is always selected from the array
  itself.

Big O is a notation used to describe the computational complexity of an algorithm. The computational complexity of an
algorithm is split into two parts: time complexity and space complexity. The time complexity of an algorithm is the
amount of time the algorithm needs to run relative to the input size. The space complexity of an algorithm is the amount
of memory allocated by the algorithm when run relative to the input size.

Being able to analyze an algorithm and calculate its time and space complexity is a crucial skill. Interviewers will
almost always ask you for your algorithm's complexity to check that you actually understand your algorithm and didn't
just memorize/copy the code. Being able to analyze an algorithm also enables you to determine what parts of it can be
improved.

**Rules for Big O**

1. The first rule is we ignore constants. That means O(999999n) = O(8n) = O(n/500). Why do we do this? Because the
   required operations increase **linearly**.
2. The second rule is that we consider the complexity as the variables tend to **infinity**. For example O(2^n + n^2 -
   500n) = (2^n). Why? Because as `n` tends to infinity, 2^n becomes so large that the other two terms are effectively
   zero in comparison.

The best complexity possible is O(1), called "constant time" or "constant space".
It means that the algorithm ALWAYS uses the same amount of resources, regardless of the input.

Note that a constant time complexity doesn't necessarily mean that an algorithm is fast (
O(5000000)=O(1)), it just means that its runtime is independent of the input size.

When talking about complexity, there are normally three cases:

- Best case scenario
- Average case
- Worst case scenario

If you have to choose only one to represent the algorithm's time or space complexity, never choose the best case
scenario. It is most correct to use the worst case scenario, but you should be able to talk about the difference
between the cases.

For examples see `Intro.kt`.

**Logarithmic time**

A common time complexity is O(n*logn), which is reasonably fast for most problems and also the time complexity of
efficient sorting algorithms.

Typically, the base of the logarithm will be 2. This means that if your input is size n, then the algorithm will perform
x operations, where `2^x=n`. However, the base of the logarithm doesn't actually matter for big O, since all logarithms
are related by a constant factor.

O(logn) means that somewhere in your algorithm, the input is being reduced by a percentage at every step. A good example
of this is binary search

**Analyzing space complexity**
When you initialize variables like arrays or strings, your algorithm is allocating memory. We never count the space used
by the input (it is bad practice to modify the input), and usually don't count the space used by the output (the answer)
unless an interviewer asks us to.