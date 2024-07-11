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
        +Address address
        +List~Availability~ availability
    }

    class Contact {
        +String email
        +String phoneNumber
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

    Doctor "1" --> "1" Contact
    Doctor "1" --> "1" Address
    Doctor "1" --> "*" Availability

```
