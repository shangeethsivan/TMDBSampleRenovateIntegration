# TMDB App

A simple Android application that displays a list of favorite movies from The Movie Database (TMDB) API and allows users to view movie details and manage their favorites.

## Features

- View a list of favorite movies
- View detailed information about a movie
- Add/remove movies to/from favorites
- Local database storage for favorites

## Architecture

The app follows the MVVM (Model-View-ViewModel) architecture pattern and uses the following components:

- **UI Layer**: Jetpack Compose for the UI
- **ViewModel Layer**: AndroidX ViewModel for managing UI-related data
- **Repository Layer**: Single source of truth for data
- **Data Layer**:
  - Remote: Retrofit for API calls
  - Local: Room Database for local storage

## Setup

1. Clone the repository
2. Get an API key from [The Movie Database](https://www.themoviedb.org/documentation/api)
3. Add your API key to the `gradle.properties` file:
   ```
   TMDB_API_KEY=your_api_key_here
   ```
4. Make sure your Android SDK location is correctly set up:
   - Create a `local.properties` file in the project root if it doesn't exist
   - Add the following line to specify your SDK location:
     ```
     sdk.dir=${user.home}/Library/Android/sdk    # For macOS
     sdk.dir=${user.home}/AppData/Local/Android/Sdk    # For Windows
     sdk.dir=${user.home}/Android/Sdk    # For Linux
     ```
   - Alternatively, you can use environment variables:
     ```
     sdk.dir=${ANDROID_HOME}
     # or
     sdk.dir=${ANDROID_SDK_ROOT}
     ```
5. Build and run the app

## Libraries Used

- **Jetpack Compose**: Modern Android UI toolkit
- **Room**: Database for local storage
- **Retrofit**: HTTP client for API calls
- **Coil**: Image loading library
- **Coroutines**: For asynchronous programming
- **Navigation Compose**: For navigation between screens

## Screens

### Favorites Screen
- Displays a grid of favorite movies
- Shows a message when no favorites are available
- Clicking on a movie navigates to the details screen

### Movie Details Screen
- Displays detailed information about a movie
- Shows movie poster/backdrop, title, release date, rating, and overview
- Allows adding/removing the movie from favorites

## Future Improvements

- Add search functionality
- Implement pagination for API results
- Add more movie information (cast, reviews, etc.)
- Support for offline mode
- Add unit and UI tests
