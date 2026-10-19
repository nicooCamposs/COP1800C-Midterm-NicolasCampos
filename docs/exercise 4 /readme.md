This project implements the Campus Resource Reservation App. It uses object-oriented programming, inheritance, interfaces, and menus to manage bookings and cancellations for different campus study spaces and computer labs, calculating total revenues and occupancy cleanly.

- Priced.java : Interface for items that charge fees per seat.
- StudyRoom.java : Base class managing basic room info, capacity, and seat tracking.
- CampusResource.java : Abstract class connecting rooms with pricing and revenue rules.
- StudySpace.java : Concrete room type with study space pricing.
- ComputerLab.java : Concrete room type with computer lab pricing.
- ResourceApp.java : Main application runner with console menu and report generation.
