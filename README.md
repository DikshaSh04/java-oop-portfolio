# Java OOP Systems

> A collection of real-world Java applications, each engineered to simulate a distinct business or software domain using core Object-Oriented Programming design principles.

---

## Overview

This repository contains **6 independently functional Java applications**, each modelling a real-world system. Every module is architected around a specific OOP concept, demonstrating how professional software design patterns apply to practical, domain-driven problems.

---

## Applications at a Glance

| Application | Domain | Core OOP Concept | Key Classes |
|---|---|---|---|
| Bank Account System | FinTech / Banking | Abstract Classes | `BankAccount`, `SavingsAccount`, `CurrentAccount` |
| Media Player Engine | Software / Entertainment | Interfaces | `Playable`, `Audiobook`, `Podcast`, `Song` |
| Hospital Patient Records System | Healthcare | Encapsulation | `Patient` |
| Vehicle Registration System | Transport / Government | Hierarchical Inheritance | `Vehicle`, `Car`, `Truck` |
| Smart Device System | Consumer Electronics | Multiple Inheritance | `Chargeable`, `Connectable`, `Smartphone`, `Laptop`, `Smartwatch` |
| Home Alert System | IoT / Home Security | Polymorphism | `Sensor`, `MotionSensor`, `GasSensor`, `SmokeSensor` |

---

## Module Breakdown

###  Bank Account Management System
**OOP Concept: Abstract Classes & Inheritance**

Simulates a multi-account banking system where different account types share a common abstract base but implement unique transaction behaviours.

- Abstract `BankAccount` class defines the universal contract for all account types
- `SavingsAccount` and `CurrentAccount` extend and specialise base behaviour (e.g. interest rules, overdraft logic)
- Demonstrates method overriding, protected access modifiers, and constructor chaining

```
abstract-classes/
└── BankAccountSimulator.java   (BankAccount, SavingsAccount, CurrentAccount, Main)
```

---

###  Media Player Engine
**OOP Concept: Interfaces & Abstraction**

Models a media playback system that supports multiple content formats through a shared interface contract, enabling extensibility without modifying core logic.

- `Playable` interface defines a universal playback contract across all media types
- `Audiobook`, `Podcast`, and `Song` each provide their own concrete implementation
- New media types can be introduced without altering existing code (Open/Closed Principle)

```
interfaces/
└── MediaPlayerSimulator.java   (Playable, Audiobook, Podcast, Song, Main)
```

---

###  Hospital Patient Records System
**OOP Concept: Encapsulation**

Simulates a secure patient data management system where sensitive medical information is protected behind controlled access boundaries.

- `Patient` class encapsulates all personal and medical data with private fields
- Public getter and setter methods enforce controlled, validated access to internal state
- Demonstrates the principle of data hiding to prevent unauthorised or accidental modification of sensitive records

```
encapsulation/
└── HospitalSystem.java   (Patient, Main)
```

---

###  Vehicle Registration System
**OOP Concept: Hierarchical Inheritance**

Models a transport registration system where multiple vehicle types inherit shared attributes from a common parent, while extending functionality specific to their category.

- `Vehicle` parent class holds shared attributes (registration number, owner, year)
- `Car` and `Truck` independently extend `Vehicle`, adding type-specific properties (e.g. seating capacity, payload limit)
- Illustrates how a single base class can branch into multiple specialised subtypes — a core pattern in hierarchical system design

```
hierarchical-inheritance/
└── VehicleRegistrationSystem.java   (Vehicle, Car, Truck, Main)
```

---

###  Smart Device System
**OOP Concept: Multiple Inheritance via Interfaces**

Simulates a consumer electronics ecosystem where devices selectively inherit capabilities through multiple interfaces, mirroring real-world product feature sets.

- `Chargeable` and `Connectable` interfaces define independent capability contracts
- `Smartphone` implements both interfaces, modelling a fully-featured device
- `Laptop` implements only `Connectable`; `Smartwatch` implements only `Chargeable`
- Demonstrates how Java resolves multiple inheritance cleanly through interface composition

```
multiple-inheritance/
└── SmartDeviceSystem.java   (Chargeable, Connectable, Smartphone, Laptop, Smartwatch, Main)
```

---

###  Home Alert System
**OOP Concept: Polymorphism**

Simulates a smart home security system where different sensor types respond to threats through a unified interface, enabling a single control system to manage all alert types.

- Abstract `Sensor` base class defines a shared `triggerAlert()` contract
- `MotionSensor`, `GasSensor`, and `SmokeSensor` each override the method with threat-specific alert behaviour
- The main controller calls `triggerAlert()` on any `Sensor` reference, demonstrating runtime polymorphism
- Reflects how real IoT systems handle heterogeneous device types through a common interface

```
polymorphism/
└── HomeAlertSystem.java   (Sensor, MotionSensor, GasSensor, SmokeSensor, Main)
```

---

## Technical Highlights

- Designed and implemented **6 independent class hierarchies** across modular packages
- Applied **runtime polymorphism** to manage heterogeneous object types through unified base references
- Used **interface composition** to simulate multiple inheritance cleanly within Java's type system
- Enforced **data encapsulation** to protect sensitive domain data (e.g. patient medical records)
- Followed **SOLID principles** — particularly Single Responsibility and Open/Closed — throughout all modules
- All applications use **real-world domain analogies** to reflect how OOP maps to production software problems

---

## OOP Concepts Covered

| Concept | Module |
|---|---|
| Abstract Classes | Bank Account System |
| Interfaces | Media Player Engine |
| Encapsulation | Hospital Patient Records System |
| Hierarchical Inheritance | Vehicle Registration System |
| Multiple Inheritance (via Interfaces) | Smart Device System |
| Polymorphism | Home Alert System |

---

## Tech Stack

| | |
|---|---|
| **Language** | Java (JDK 11+) |
| **Paradigm** | Object-Oriented Programming |
| **IDE** | IntelliJ IDEA |
| **Build** | Javac (standard compiler) |

---

## How to Run

### Prerequisites
- Java JDK 11 or higher installed
- Any Java IDE or terminal access

### Steps

```bash
# 1. Clone the repository
git clone https://github.com/DikshaSh04/java-oop-portfolio.git

# 2. Navigate to a module
cd java-oop-portfolio/abstract-classes

# 3. Compile
javac BankAccountSimulator.java

# 4. Run
java BankAccountSimulator
```

Each module folder is self-contained and can be compiled and run independently.

---

## Author

**Diksha Sharma**
[LinkedIn](www.linkedin.com/in/diksha-sharma25) · [GitHub](https://github.com/DikshaSh04) · [Email](diksha250406@gmail.com)
