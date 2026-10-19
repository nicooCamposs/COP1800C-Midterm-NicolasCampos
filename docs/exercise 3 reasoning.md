# Reasoning and Critical Thinking Answers

## Answer E3-R1: Why can changing state before validation violate the invariant?
The invariant requires that reserved seats must always remain between zero and the total capacity[cite: 5]. If state changes occur before validating inputs against boundaries or available capacity, an invalid modification could temporarily corrupt the object state or leave fields inconsistent before an exception or rejection occurs.

## Answer E3-R2: How are the two reserve methods an example of overloading?
Overloading occurs when multiple methods share the exact same name within a class but possess different parameter lists[cite: 5, 6]. In this project, reserve() takes no parameters and delegates to reserve(int seats), which takes an integer parameter, providing flexibility in calling conventions.

## Answer E3-R3: Create a second independent room and an alias referencing the first; explain which object changes after a reservation through the alias.
An alias is a second reference pointing to the exact same object instance in memory rather than creating a distinct copy[cite: 5, 6]. When a reservation is made through the alias, the underlying shared object state changes, meaning both the original reference and the alias reflect the updated reserved seat count. The second independent room remains completely unaffected because it points to a separate object instance[cite: 5].
