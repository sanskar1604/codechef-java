# Maximum Common Elements

## 📌 Problem Statement

Given two arrays **A** and **B**, each of size **N**, where all elements in both arrays are **distinct**, find the **number of elements that are common** in both arrays.

You need to solve this problem for **multiple test cases**.

---

## 🧾 Input Format

- The first line contains an integer **T** — the number of test cases.
- For each test case:
  - The first line contains an integer **N** — size of both arrays.
  - The second line contains **N** space-separated integers — elements of array **A**.
  - The third line contains **N** space-separated integers — elements of array **B**.

---

## 📤 Output Format

- For each test case, output a **single integer** representing the number of common elements between arrays **A** and **B**.

---

## 🔒 Constraints

- `1 ≤ T ≤ 100`
- `1 ≤ N ≤ 10^5`
- `1 ≤ Ai, Bi ≤ 10^9`
- All elements in **A** are distinct.
- All elements in **B** are distinct.
- The sum of **N** over all test cases does not exceed `2 × 10^5`.

---

## 🧪 Sample Input

3
4
1 2 3 4
1 3 4 5
3
2 4 1
1 4 2
1
2
3
3

## 🧪 Sample Output

3
3
0
