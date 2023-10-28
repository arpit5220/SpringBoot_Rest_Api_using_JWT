# RestAPi using JWT
- Created a Rest Api using SpringBoot and implemented spring Security using JWT Authentication

## Backend Work
- User Api Call
- Implement Security Configuration for JWT(JSON Web Token)

## Tech Stacks
- Java Core
- Spring Data JPA
- Spring Boot
- Spring Security
- Hibernate
- JWT Authentication 

## User 
```json

[
    {
        "userId": "80faae55-930d-46c9-bc73-249e025fff62",
        "name": "Arpit Katiyar",
        "email": "arpit@gmail.com"
    },
    {
        "userId": "1b35ad00-8c5e-465d-9f71-75b390ece829",
        "name": "Ankit Katiyar",
        "email": "ankit@gmail.com"
    },
    {
        "userId": "e6beb993-095b-4845-8381-a460713f2fb7",
        "name": "Anuj Katiyar",
        "email": "anuj@gmail.com"
    },
    {
        "userId": "04043874-9c6e-4421-888e-d398c3669a25",
        "name": "Vikash Katiyar",
        "email": "vikash@gmail.com"
    }
]

```


## Installation and Run
- You can clone this repo and start the serve on localhost
- Update the port number and use POSTMAN to send request 

- http://localhost:9091/auth/login (use to get token)

![Screenshot (23)](https://github.com/arpit5220/SpringBoot_Rest_Api_using_JWT/assets/94009815/6efed96a-a68c-4df8-a661-f56100970e18)

- http://localhost:9091/home/users (send token and get user)
  
![Screenshot (25)](https://github.com/arpit5220/SpringBoot_Rest_Api_using_JWT/assets/94009815/df331d4c-172d-4748-beaa-a6639b3e8035)

