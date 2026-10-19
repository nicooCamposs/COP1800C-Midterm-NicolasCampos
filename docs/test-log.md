# Test Log - Practical Midterm

## Exercise 1: Study Budget

1. Base Example
   Input: name = " Ana Lee ", minutes = 95, isActive = true


   Predicted: 3 blocks, 5 mins left, $15 base fee, no discount.


   Output: Worked as expected. Cleaned the name, calculated 3 blocks and $15 base fee.

3. 120 mins, Active
   Input: name = "Ana Lee", minutes = 120, isActive = true


   Predicted: 4 blocks, $20 base fee, 20% discount applied.


   Output: Worked. Reached 4 blocks so it applied $4.00 discount, final fee was $16.00.

5. 120 mins, Inactive
   Input: name = "Ana Lee", minutes = 120, isActive = false


   Predicted: 4 blocks, $20 base fee, no discount.


   Output: Worked. Inactive membership blocked the discount even with 4 blocks.

7. 29 mins Visit
   Input: name = "Ana Lee", minutes = 29, isActive = true


   Predicted: 0 blocks, 29 mins left, $0 fee.


   Output: Worked. Under 30 minutes gives 0 complete blocks and $0 base fee.

9. Blank Name Error
   Input: name = "   ", minutes = 95, isActive = true


   Predicted: Error message for blank name, halts program.


   Output: Worked. Printed "Error: Your name is blank." and stopped execution.

11. Zero Minutes Error
Input: name = "Ana Lee", minutes = 0, isActive = true


Predicted: Error message for invalid time, halts program.

   
Output: Worked. Printed "Error: Time has to be greater than zero." and stopped.

13. Custom Test - 60 mins
Input: name = "Ana Lee", minutes = 60, isActive = true


Predicted: 2 blocks, $10 fee, no discount.


Output: Custom test worked. Exactly 2 blocks, active member gets no discount.
