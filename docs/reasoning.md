# Reasoning Log - Nicolas Campos Java Midterm
Exercise 1: Study Budget

### Plan / Approach
1. Validate inputs (blank name or non-positive minutes), stop the program if its invalid.
2. Clean student name string, extract uppercase version and first character to display in the output
3. Find complete 30-minute blocks and leftover minutes.
4. Check membership discount validation(active membership AND at least 4 blocks).
5. Calculate base fee, discount amount, and final fee, then display formatted report.

### Answers
1: The eligibility rule uses AND ("&&") because both conditions must happen at the same time
2. If we wrote "20/100", Java rounds the result down to 0 because it thinks you only want whole numbers. 
Since anything multiplied by 0 is zero the discount would always end up as $0.00.
Writing 0.20 instead keeps the decimals and makes the math work correctly.
