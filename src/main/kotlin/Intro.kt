package org.example

// Examples to count time/space complexity.

// Given an integer array "input" with length n,

fun example(input: IntArray) {
    for (element in input) {
        for (i in 0..<500_000) {
            println(element)
        }
    }
}

// Given an integer array "input" with length n,

fun example2(input: IntArray) {
    for (element in input) {
        for (element2 in input) {
            println(element * element2)
        }
    }
}

// Given integer arrays "input1" with length n and "input2" with length m,

fun example3(input1: IntArray, input2: IntArray) {
    for (element in input1) {
        println(element)
    }
    for (element in input1) {
        println(element)
    }
    for (element in input2) {
        println(element)
    }
}

// Given an integer array "input" with length n,

fun example4(input: IntArray) {
    for (i in 0..<input.size) {
        for (j in i..<input.size) {
            println(input[i] + input[j])
        }
    }
}

// This is a partial sum series.

// Space complexity examples:

/*
* In the below examples, the code is only allocating memory so that we can analyze the space complexity,
* so we will consider everything we allocate as part of the space complexity (there is no "answer").
*/

// Given an integer array "input" with length n

fun example5(input: IntArray) {
    for (element in input) {
        println(element)
    }
}

// Given an integer array "arr" with length n

fun example6(input: IntArray) {
    val doubledNumbers = IntArray(input.size)
    for (i in 0..<input.size) {
        val element = input[i]
        doubledNumbers[i] = element * 2
    }
}

// Given an integer array "arr" with length n

fun example7(input: IntArray) {
    val nums = ArrayList<Int>()
    val oneHundredth = input.size / 100
    for (i in 0..<oneHundredth) {
        nums.add(input[i])
    }
}

// Given integer arrays "arr" with length n and "arr2" with length m,

fun example8(input1: IntArray, input2: IntArray) {
    val grid = Array<Array<Int>>(input1.size) { Array<Int>(input2.size) { 0 } }
    for (i in 0..<input1.size) {
        for (j in 0..<input2.size) {
            grid[i][j] = input1[i] * input2[j]
        }
    }
}