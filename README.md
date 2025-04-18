# BankApp

This is a simple Spring Boot application simulating bank account transfers.

## Features

- Greeting in different languages (English, Hindi)
- Transfer money between accounts
- Handle exceptions like Insufficient Balance
- Simulated transaction rollback using `@Transactional` annotation

## How to Run

1. Clone the repository: `git clone https://github.com/kmagar-dev/BankApp.git`
2. Open the project in your IDE.
3. Run the `BankAppApplication` class as a Spring Boot application.

## API Endpoints

- `GET /api/bank/english`: Get greeting in English.
- `GET /api/bank/hindi`: Get greeting in Hindi.
- `POST /api/bank/transfer`: Transfer money between two accounts.

## Technologies Used

- Spring Boot
- MySQL
- JPA
- Spring Data

## License

This project is licensed under the MIT License.
