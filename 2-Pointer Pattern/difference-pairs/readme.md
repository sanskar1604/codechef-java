# Difference Pairs

## 📌 Problem Statement

Given an array **A** of **N** integers and an integer **B**, determine whether there exists a pair of indices  
**(i, j)** such that:

- `1 ≤ i < j ≤ N`
- `|A[i] - A[j]| = B`

For each test case, print **1** if such a pair exists, otherwise print **0**.

---

## 🧾 Input Format

- The first line contains an integer **T** — the number of test cases.
- For each test case:
  - The first line contains two space-separated integers **N** and **B**.
  - The second line contains **N** space-separated integers representing array **A**.

---

## 📤 Output Format

- For each test case, output:
  - `1` if there exists a pair `(i, j)` such that `|A[i] - A[j]| = B`
  - `0` otherwise

---

## 🔒 Constraints

- `1 ≤ T ≤ 100`
- `1 ≤ N ≤ 10^5`
- `-10^6 ≤ B ≤ 10^6`
- `-10^6 ≤ A[i] ≤ 10^6`
- Sum of `N` over all test cases ≤ `2 × 10^5`

---

## 🧪 Sample Input

3
6 78
5 10 3 2 50 80
2 30
-10 20
4 5
1 2 3 4

## 🧪 Sample Output

1
1
0
