# Count Pairs

## 📌 Problem Statement

Given a **sorted array** of integers and a value **x**, count the number of pairs `(i, j)` such that:

- `i < j`
- `arr[i] + arr[j] < x`

---

## 🧾 Input Format

1. The first line contains an integer **n**, the number of elements in the array.
2. The second line contains **n** integers — the sorted array elements.
3. The third line contains an integer **x** — the target sum threshold.

---

## 📤 Output Format

- A single integer — the number of pairs `(i, j)` whose sum is **less than x**.

---

## 🔒 Constraints

- `1 ≤ n ≤ 10^5`
- `0 ≤ arr[i] ≤ 10^5`
- `0 ≤ x ≤ 10^8`

---

## 🧪 Sample Input

5
1 2 3 4 5
7

## 🧪 Sample Output

6
