1. Room Trace Test (Capacity: 6)
- Initial state: reserved = 0
- reserve(4): result = true, reserved = 4
- reserve(3): result = false (exceeds remaining capacity), reserved = 4
- cancel(2): result = true, reserved = 2
- reserve() (no-arg): result = true, reserved = 3
- reserve(3): result = false (exceeds remaining capacity), reserved = 3
- cancel(7): result = false (exceeds current reserved count), reserved = 3
- reserve(0): result = false (non-positive request), reserved = 3
- cancel(-1): result = false (non-positive request), reserved = 3

2. Constructor Exception Checks
- Null title: new StudyRoom(null, 5) -> caught IllegalArgumentException successfully
- Spaces-only title: new StudyRoom("   ", 5) -> caught IllegalArgumentException successfully
- Zero capacity: new StudyRoom("Zero Room", 0) -> caught IllegalArgumentException successfully
- Negative capacity: new StudyRoom("Negative Room", -1) -> caught IllegalArgumentException successfully

3. Default Capacity Check
- Input: new StudyRoom("Regular Room")
- Result: capacity = 4 guests (default applied via constructor delegation)

4. Full Cancellation Check
- Input: Room with capacity 5, reserve(5) -> reserved = 5
- Action: cancel(5)
- Result: result = true, reserved = 0, remaining = 5

5. Independent Room vs Alias Comparison
- Input: room created with capacity 6, alias pointing to room, independent room created with capacity 6
- Result: Modifications made through alias affect the primary room instance, while the independent room maintains its own separate state
