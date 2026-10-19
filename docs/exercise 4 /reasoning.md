1. Why can a CampusResource reference produce two different fee values?
Because of method overriding. Even though the variable type is CampusResource, Java looks at the actual object created (like StudySpace or ComputerLab) at runtime and uses its specific fee rule.

2. Explain the different responsibilities of abstract CampusResource and interface Priced.
Priced only ensures that an item has a method to get a fee per seat. CampusResource handles common room tasks like keeping track of reserved seats, while leaving the exact fee calculation up to the specific room types.

3. Why would summing every historically accepted reservation be incorrect?
Because people can cancel reservations later. If we only add up every reservation ever made without subtracting cancellations, the total reserved seats and revenue would be higher than what is currently active in the room.

4. Why would rebuilding the catalog inside the menu loop lose reservations?
If a new catalog is created every time the menu loops, all the previous rooms and their current bookings get erased and replaced with brand new empty rooms, losing all previous changes.
