# Test Log Entries

## Test 1: Room Trace (Capacity: 6)
- Initial state: reserved = 0[cite: 5]
- reserve(4): result = true, reserved = 4[cite: 5]
- reserve(3): result = false (exceeds remaining capacity), reserved = 4[cite: 5]
- cancel(2): result = true, reserved = 2[cite: 5]
- reserve() (no-arg): result = true, reserved = 3[cite: 5]
- reserve(3): result = false (exceeds remaining capacity), reserved = 3[cite: 5]
- cancel(7): result = false (exceeds current reserved count), reserved = 3[cite: 5]
- reserve(0): result = false (non-positive request), reserved = 3[cite: 5]
- cancel(-1): result = false (non-positive request), reserved = 3[cite: 5]

## Test 2: Constructor Exception Checks
- Null title: new StudyRoom(null, 5) -> caught IllegalArgumentException successfully[cite: 5]
- Spaces-only title: new StudyRoom("   ", 5) -> caught IllegalArgumentException successfully[cite: 5]
- Zero capacity: new StudyRoom("Zero Room", 0) -> caught IllegalArgumentException successfully[cite: 5]
- Negative capacity: new StudyRoom("Negative Room", -1) -> caught IllegalArgumentException successfully[cite: 5]

## Test 3: Default Capacity Check
- Input: new StudyRoom("Regular Room")[cite: 5]
- Result: capacity = 4 guests (default applied via constructor chaining)[cite: 5]

## Test 4: Full Cancellation Check
- Input: Room with capacity 5, reserve(5) -> reserved = 5[cite: 5]
- Action: cancel(5)[cite: 5]
- Result: result = true, reserved = 0, remaining = 5[cite: 5]

## Test 5: Independent Room vs Alias Comparison
- Input: room created with capacity 6, alias pointing to room, independent room created with capacity 6[cite: 5]
- Result: Modifications via alias affect the primary room instance, while the independent room maintains separate state tracking[cite: 5].
