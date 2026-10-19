1. Acceptance Step A Test
   
- Input : Reserve 2 seats in resource 1


- Expected : Success : Operation completed.


- Result : Success : Operation completed. Works as expected.


2. Acceptance Step B Test

- Input : Reserve 3 seats in resource 1


- Expected : Rejected due to exceeding capacity.


- Result : Rejected : Invalid seat amount or not enough space/reservations. Works as expected.


3. Acceptance Step C Test

- Input : Reserve 1 seat in resource 2


- Expected : Success : Operation completed.


- Result : Success : Operation completed. Works as expected.


4. Acceptance Step D Test

- Input : Cancel 1 seat from resource 1


- Expected : Success : Operation completed.


- Result : Success : Operation completed. Works as expected.


5. Acceptance Step E Test

- Input : Reserve 2 seats in resource 3


- Expected : Success : Operation completed.


- Result : Success : Operation completed. Works as expected.


6. Acceptance Step F Test

- Input : Cancel 2 seats from resource 2


- Expected : Success : Operation completed.


- Result : Success : Operation completed. Works as expected.


7. Acceptance Step G Test

- Input : Reserve 1 seat in resource 4 (out of bounds)


- Expected : Error message about resource number limits.


- Result : Shows error message. Works as expected.


8. Acceptance Step H Test

- Input : Reserve 0 seats in resource 1


- Expected : Rejection because seat count is less than 1.


- Result : Rejected. Works as expected.


9. Acceptance Step I Test

- Input : Choose report option


- Expected : Prints details for all rooms and total revenue matching 17 units.


- Result : Total revenue is 17. Works as expected.


10. Negative Seat Count Test

- Input : Try to reserve negative seats


- Expected : Rejection message.


- Result : Rejected safely. Works as expected.
  
11. Nonnumeric Input Test

- Input : Type letters instead of numbers for choice or seats


- Expected : Error message without crashing.


- Result : Catches error and returns to menu. Works as expected.


12. Exact Capacity Test

- Input : Fill a room right up to its maximum capacity


- Expected : Success, and next seat attempt gets rejected.


- Result : Works as expected.


13. Double Report Test

- Input : Run the report option twice in a row

- Expected : The numbers and total do not change on the second check.

- Result : State remains safe and consistent. Works as expected
