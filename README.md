---

# **Java Basic Vectors Assignment**

## **Overview**

This assignment is designed to help you understand and work with **Java Vectors**, their features, and differences compared to **ArrayLists**. You will practice basic operations, capacity management, iteration, thread safety, and managing custom objects using Vectors.

---

## **Learning Objectives**

By completing this assignment, you will:

1. Understand how to create and manipulate `Vector`s.
2. Practice using common `Vector` methods: `add`, `remove`, `get`, `set`, `size`, `capacity`.
3. Learn about **thread-safety** and **synchronization**.
4. Compare `Vector` with `ArrayList`.
5. Understand when to use `Vector` versus `ArrayList`.
6. Work with **Vector-specific features** like capacity management and `Enumeration`.

---

## **Prerequisites**

* Completion of **Basic ArrayLists Assignment**.
* Understanding of **ArrayLists** and Java Collections Framework.
* Basic knowledge of **threads** (conceptual understanding).

---

## **Exercises**

### **Exercise 1: Vector Basics**

**File:** `VectorBasics.java`

* Create a `Vector<String>` and perform operations like add, remove, get, set.
* Explore **size** and **capacity**.
* Practice **capacity management** with `trimToSize()`.
* Observe automatic resizing behavior.

**Key Concepts:** Vector creation, manipulation, capacity, `trimToSize()`.

---

### **Exercise 2: Vector vs ArrayList Comparison**

**File:** `VectorVsArrayList.java`

* Show that `Vector` and `ArrayList` have nearly identical APIs.
* Compare capacity features: `Vector.capacity()`, `ensureCapacity()`, `trimToSize()`.
* Demonstrate **Enumeration** vs **Iterator**.

**Key Concepts:** Legacy vs modern methods, capacity differences, API similarities.

---

### **Exercise 3: Vector Operations**

**File:** `VectorOperations.java`
Implement the following methods:

1. `removeAll(Vector<String> vec, String target)` – remove all occurrences of a target string.
2. `insertAtPositions(Vector<Integer> vec, int value, int... positions)` – insert value at multiple indices.
3. `printCapacityInfo(Vector<?> vec)` – print size, capacity, and available space.
4. `copyRange(Vector<String> vec, int start, int end)` – copy a sub-range of the vector.

**Key Concepts:** Safe removal during iteration, variable arguments, generic methods.

---

### **Exercise 4: Thread Safety Demonstration**

**File:** `ThreadSafetyDemo.java`

* Compare thread-safety of `Vector` vs `ArrayList`.
* Two threads add elements to shared collections.
* Observe consistent results in `Vector` but not in `ArrayList`.

**Key Concepts:** Synchronization, thread-safe collections, concurrency issues.

---

### **Exercise 5: Vector of Custom Objects**

**File:** `ProductInventory.java`

* Create a `Product` class with `name`, `price`, `quantity`.
* Manage products in `Inventory` using `Vector<Product>`.
* Perform operations: add, remove, update, find, calculate total value, sort by price.

**Key Concepts:** Custom objects, vector of objects, sorting with `Comparator`.

---

### **Exercise 6: Vector Iteration**

**File:** `VectorIteration.java`

* Demonstrate three ways to iterate over a `Vector<String>`:

  1. Enumeration (legacy)
  2. Iterator (modern)
  3. Enhanced for-loop
* Compare safe removal options during iteration.

**Key Concepts:** Legacy vs modern iteration, safe removal.

---

### **Optional Challenge: Vector Performance Comparison**

**File:** `VectorChallenge.java`

* Compare performance of `Vector` and `ArrayList` when adding 1,000,000 elements.
* Compare access times for random elements.
* Discuss why `Vector` is slower and thread-safety trade-offs.

---

## **Submission Checklist**

* ✅ All exercise files completed: `VectorBasics.java`, `VectorVsArrayList.java`, `VectorOperations.java`, `ThreadSafetyDemo.java`, `ProductInventory.java`, `VectorIteration.java`
* ✅ Code compiles and runs without errors.
* ✅ Output matches expected results.
* ✅ Proper comments explaining methods, iteration, and capacity management.

---

## **Key Takeaways**

* `Vector` and `ArrayList` have nearly identical APIs.
* `Vector` is **synchronized** (thread-safe) but slower than `ArrayList`.
* `ArrayList` is preferred for **single-threaded applications**.
* Legacy features in `Vector` (like `Enumeration` and `capacity`) exist for backward compatibility.
* Only use `Vector` when **thread-safety is required**.

---

## **References**

* [Java Vector Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Vector.html)
* [ArrayList vs Vector](https://www.geeksforgeeks.org/difference-between-arraylist-and-vector-in-java/)
* [Java Collections Framework](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/package-summary.html)

---
