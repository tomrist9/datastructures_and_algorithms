# 📚 Data Structures and Algorithms Journey 

Welcome to my personal repository for mastering **Data Structures and Algorithms (DSA)** using Java.  
This repo contains my daily solutions to coding problems from platforms like **LeetCode**and structured implementations of common algorithms and patterns.

Each solution is written with **clean code principles**, proper naming, and explanatory comments.  
My goal is to build a solid foundation for technical interviews, system thinking, and real-world software engineering.

---

## 📂 Topics Covered

- ✅ Arrays
- ✅ Strings
- ✅ Linked Lists
- ✅ HashMaps & Sets
- ✅ Recursion & Backtracking
- ✅ Sorting & Searching
- ✅ Binary Search
- ✅ Stacks & Queues
- ✅ Trees & Graphs
- ✅ Dynamic Programming
- ✅ Sliding Window & Two Pointers
- ✅ Greedy Algorithms

---

##  What I’m Practicing

- Writing clean and optimized Java code
- Analyzing time & space complexity (Big-O)
- Solving problems with multiple approaches
- Using recursion, iteration, and dynamic programming
- Building a growth-oriented interview mindset

---

##  Technologies Used

- Java
- IntelliJ IDEA
- Git & GitHub
- LeetCode, HackerRank, GeeksforGeeks

---

## 📈 Folder Structure

```bash
src/
├── array/
├── string/
├── linkedlist/
├── sort/
├── binarysearch/
├── hashmap/
├── tree_graph/
├── recursion/
├── math/
├── ...
```

---


## 🧪 Sample Problem

#### [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

```java
// Time: O(n), Space: O(1)
public int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE, maxProfit = 0;
    for (int price : prices) {
        if (price < minPrice) minPrice = price;
        else maxProfit = Math.max(maxProfit, price - minPrice);
    }
    return maxProfit;
}
```

---

##  How to Use

```bash
git clone https://github.com/tomrist9/datastructures_and_algorithms.git
```
