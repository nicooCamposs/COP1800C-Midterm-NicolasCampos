Nicolas Campos - Java midterm ex 2. Reasoning 

Why can changing state before validation break the rules?
Because if internal information is modified before checking that data is correct, the system could temporarily store invalid data before detecting the error.

How are the two reservation methods an example of overloading?
It occurs when two methods share the exact same name but have different inputs. One receives no data and reserves a space by default, while the other receives a specific numerical quantity of seats.

Create an independent room and an alias; explain which one changes.
An alias is another variable pointing to the exact same object in memory. If modified using the alias, the original room changes because they share the same space. The independent room is a completely separate object and is not affected.
