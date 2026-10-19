1. Where must a row accumulator be reset, and why?
   
The total counter for each room must be set back to 0 before it starts to count that room's numbers. If it is not reseted, the new room will accidentally add its numbers on top of the previous room's total.


3. Explain the displayed-number-to-index conversion and why validation must happen first.

People count rooms starting from 1, but Java starts counting positions from 0, so its necessary to subtract 1 from the room number. We check if the number is valid first so the program does not try to look for a room that doesn't exist.

4. Explain how your comparison preserves the stated tie rule.

To find the room with the most visits, we only update our top choice if a new room has strictly more visits than the current highest. If two rooms have the exact same total, the program keeps the lower room number since it'd come first.
