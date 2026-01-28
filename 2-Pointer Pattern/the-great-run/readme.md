# The Great Run

## 📌 Problem Statement

Vishal loves running and often visits Nehru Park for long runs. On one such visit, he noticed that there were many girls standing along the running track. Vishal wants to impress as many girls as possible with his **maximum running speed**.

The track is a straight path of **N kilometres**.  
- In the `i-th` kilometre, there are `a[i]` girls.
- Vishal can run at his **maximum speed only for a single continuous stretch of K kilometres**.

A girl will be impressed **only if Vishal is running at his maximum speed** when he passes her.

Your task is to determine the **maximum number of girls Vishal can impress**.

---

## 🧾 Input Format

- The first line contains an integer **T** — number of test cases.
- For each test case:
  - The first line contains two space-separated integers **N** and **K**.
  - The second line contains **N** space-separated integers where `a[i]` denotes the number of girls in the `i-th` kilometre.

---

## 📤 Output Format

- For each test case, print a single integer — the **maximum number of girls Vishal can impress**.

---

## 🔒 Constraints

- `1 ≤ T ≤ 10`
- `1 ≤ K ≤ N ≤ 100`
- `1 ≤ a[i] ≤ 100`

---

## 🧪 Sample Input

1
7 2
2 4 8 1 2 1 8

## 🧪 Sample Ouput

12
