# Santander Dev Week 2024

Java RESTful API criada para a Santander Dev Week.

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
    class Doctor {
        +Long id
        +String name
        +String specialty
        +Contact contact
        +List~Availability~ availability
    }

    class Contact {
        +String email
        +String phoneNumber
        +Address address
    }

    class Address {
        +String street
        +String city
        +String state
        +String zipCode
    }

    class Availability {
        +Long id
        +LocalDate date
        +List~String~ timeSlots
    }

    class User {
        +Long id
        +String name
        +Account account
    }

    class Account {
        +String email
        +String password
        +String phoneNumber
        +Address address
    }

    class Scheduling {
        +Long id
        +Long doctorId
        +LocalDate date
        +String time
        +String status
    }

    class Feature {
        +String button
        +String description
    }

    Doctor "1" --> "1" Contact
    Contact "1" --> "1" Address
    Doctor "1" --> "*" Availability
    User "1" --> "1" Account
    Account "1" --> "1" Address
    User "1" --> "*" Scheduling
    User "1" --> "1" Feature

```
