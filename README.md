# Santander Dev Week 2024

Java RESTful API criada para a Santander Dev Week.

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
    class Doctor {       
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
    
    Doctor "1" --> "1" Contact
    Contact "1" --> "1" Address
    Doctor "1" --> "*" Availability   

```
