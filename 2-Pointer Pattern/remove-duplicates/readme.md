# Remove Duplicates

## 📌 Problem Statement

You are given a sorted array  
**A₁, A₂, …, Aₙ** of length **N** (sorted in **non-decreasing order**).

Your task is to **remove all duplicate elements** and produce a **sorted increasing array of distinct elements** containing all unique values present in the original array.

This must be done for **multiple test cases**.

---

## 🧾 Input Format

- The first line contains an integer **T** — number of test cases.
- For each test case:
  - The first line contains an integer **N** — length of the array.
  - The second line contains **N** space-separated integers  
    `A₁, A₂, …, Aₙ`.

---

## 📤 Output Format

For each test case, output **two lines**:

1. An integer **M** — size of the array after removing duplicates.
2. **M** space-separated integers — the distinct elements in sorted order.

---

## 🔒 Constraints

- `1 ≤ T ≤ 100`
- `1 ≤ N ≤ 10^5`
- `1 ≤ A[i] ≤ 10^9`
- The sum of `N` over all test cases does not exceed `2 × 10^5`.

---

## 🧪 Sample Input

3
2
5 10
4
1 5 5 10
5
4 4 6 6 8

## 🧪 Sample Output
2
5 10
3
1 5 10
3
4 6 8
