# Week 1 Assignment: Building a Basic Android App with Kotlin & Jetpack Compose
## Objective:
Develop a basic Android application that implements Kotlin fundamentals, Object-Oriented Programming
(OOP) principles, and Jetpack Compose UI components. This assignment will help you in setting up
Android Studio, writing Kotlin code, and designing a sample UI using Jetpack Compose.

## Setup Instructions:

### Prerequisites
Make sure you have the following installed on your machine:

- **Android Studio** (latest version)
- **Android Emulator** or a **connected physical device**
- **Git** (for version control)

  ### Steps to Set Up

1. Clone the repository:
   ```bash
   git clone https://github.com/Ahado00/Week1Assignment.git

2. Open the project in Android Studio.

3. If prompted, sync the project with Gradle by clicking on the "Sync Now" button.

4. Ensure that you have an Android Emulator set up, or connect a physical device.

5. Run the app on the emulator/device.

## Features Implemented
### Kotlin Fundamentals:

- Created a User class with properties: name, age, and email.
- Implemented a UserDetails data class for storing user information.
- Demonstrated collections using List, Set, and Map to manage user details.
- Used lambdas and higher-order functions to filter users above 18 years.

### Object-Oriented Programming (OOP):

- Created an interface GreetingProvider with a method provideGreeting().
- Implemented the interface in a class FriendlyGreeting to return a greeting message.
- Used inheritance: Created a Person base class and extended it in the User class.

### UI Design with Jetpack Compose:

- Designed a simple UI screen using Jetpack Compose.
- Created a toggleable Watchlist button that switches between "Add to Watchlist" and "Remove from Watchlist".
- Used a Row Composable to render video quality options (720p, 1080p) dynamically from a list.

## Technologies Used
- Kotlin: Programming language for Android development.
- Jetpack Compose: UI toolkit for Android.
- Android Studio: IDE for Android development.
- Git: Version control.

## How to Contribute
We welcome contributions! Follow these steps to contribute to the project:

1. Fork the repository to your own GitHub account.
2. Create a new branch for your feature.
3. Make your changes and commit them:
```
git add .
git commit -m "Describe your changes"
```
4. Push your changes to your forked repository:
```
git push origin feature-name
```
5. Open a pull request to the main repository, describing your changes.
