# Reverse Substrings Between Each Pair of Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should  **not**  contain any brackets.

 

 **Example 1:** 

```
Input: s = "(abcd)"
Output: "dcba"

```

 **Example 2:** 

```
Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.

```

 **Example 3:** 

```
Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.

```

 

 **Constraints:** 

- 1 <= s.length <= 2000
- s only contains lower case English characters and parentheses.
- It is guaranteed that all parentheses are balanced.

## Solution

**Language:** Python  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 12.5 MB (beats 18.67%)  
**Submitted:** 2026-09-27T11:38:27.752Z  

```py
class Solution:
    def reverseParentheses(self, s):
        stack = []

        for ch in s:
            if ch == '(':
                stack.append([])
            elif ch == ')':
                text = stack.pop()
                text.reverse()

                if stack:
                    stack[-1].extend(text)
                else:
                    stack.append(text)
            else:
                if stack:
                    stack[-1].append(ch)
                else:
                    stack.append([ch])

        return "".join(stack[0])
        
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/)