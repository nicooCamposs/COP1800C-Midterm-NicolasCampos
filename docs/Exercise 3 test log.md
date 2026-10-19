File test-log.md

Room trace test

Initial state: reserved = 0

reserve(4): result = true, reserved = 4

reserve(3): result = false (exceeds remaining capacity), reserved = 4

cancel(2): result = true, reserved = 2

reserve() (no-arg): result = true, reserved = 3

reserve(3): result = false (exceeds remaining capacity), reserved = 3

cancel(7): result = false (exceeds current reserved count), reserved = 3

reserve(0): result = false (non-positive request), reserved = 3

cancel(-1): result = false (non-positive request), reserved = 3

Constructor error checks test

Null title: new StudyRoom(null, 5) -> caught IllegalArgumentException successfully

Spaces-only title: new StudyRoom("   ", 5) -> caught IllegalArgumentException successfully

Zero capacity: new StudyRoom("Zero Room", 0) -> caught IllegalArgumentException successfully

Negative capacity: new StudyRoom("Negative Room", -1) -> caught IllegalArgumentException successfully

Default capacity check test

Input: new StudyRoom("Regular Room")

Result: capacity = 4 guests (default applied via constructor chaining)

Full cancellation check test

Input: Room with capacity 5, reserve(5) -> reserved = 5

Action: cancel(5)

Result: result = true, reserved = 0, remaining = 5

Independent room and alias comparison test

Input: room created with capacity 6, alias pointing to room, independent room created with capacity 6

Result: Modifications via alias affect the primary room instance, while the independent room maintains separate state tracking
