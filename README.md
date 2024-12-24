# FancyGallery App

**FancyGallery** is an Android application that showcases a curated collection of images from [Flickr](https://www.flickr.com/). The app provides users with two primary ways to explore photos: a dynamic scrolling grid and an interactive world map displaying photo locations based on embedded geo-coordinates.

## Features

- **Dual View Modes:**
  - **Gallery View:** Browse through a grid of curated images fetched from Flickr.
  - **Map View:** Explore photo locations on an interactive map with pan and zoom functionalities.

- **Bottom Navigation Bar:** Seamlessly switch between Gallery and Map views using an intuitive navigation bar.

- **Flickr Integration:**
  - Fetch and display images using Flickr's REST API.
  - Access detailed photo information and link to Flickr's web pages.

- **Image Caching:**
  - Efficiently cache images using the Coil library to enhance performance.
  - Option to refresh the image cache on demand.

- **Interactive Map:**
  - Display photo locations with custom markers using OSMDroid.
  - Clickable markers that show photo titles and navigate to detailed views.

- **WebView Integration:**
  - View detailed photo pages within the app using WebView.
  - Progress indicators to enhance user experience during loading.

- **Robust Architecture:**
  - Implements MVVM (Model-View-ViewModel) architecture for clean and maintainable code.
  - Utilizes Android Jetpack components such as ViewModel and Navigation for efficient state management.

- **Data Sharing Across Fragments:**
  - Share data between Gallery and Map fragments using a shared ViewModel scoped to the Activity.

- **State Management:**
  - Maintains map state (zoom level and center position) across fragment transitions using `MapViewModel`.

- **Coroutines for Asynchronous Operations:**
  - Manages background tasks such as network requests and image loading using Kotlin Coroutines.

- **User Interaction Enhancements:**
  - Clickable map markers that navigate to detailed photo pages.
  - Smooth animations and transitions between different app states and views.

## Technology Stack

- **Kotlin:** Primary programming language for Android development.
- **Android Jetpack Components:** Including ViewModel, LiveData, and Navigation for robust app architecture.
- **Retrofit:** For making network requests to Flickr's REST API.
- **Moshi:** For JSON serialization and deserialization.
- **Coil:** Efficient image loading and caching library.
- **OSMDroid:** Open-source library for map functionalities and displaying interactive markers.
- **Coroutines:** For managing asynchronous tasks and background operations.


## Key Components

- **GalleryFragment.kt:** Displays a grid of photos fetched from Flickr. Implements image caching and integrates with the shared ViewModel to manage photo data.

- **MapFragment.kt:** Shows photo locations on an interactive map using OSMDroid. Retrieves geo-coordinates from the shared ViewModel and places custom markers on the map.

- **PhotoPageFragment.kt:** Presents detailed information about a selected photo within a WebView, allowing users to view the photo's Flickr page.

- **MainViewModel.kt:** Serves as the shared ViewModel for both Gallery and Map fragments, managing the list of GalleryItem objects and handling data fetching.

- **MapViewModel.kt:** Manages the state of the map, including zoom levels and center positions to ensure a consistent user experience when navigating between fragments.

- **PhotoRepository.kt:** Handles data operations, including fetching photos from Flickr's API and managing data caching mechanisms.

- **FlickrApi.kt:** Defines the Retrofit interface for interacting with Flickr's REST API, including methods for fetching interesting photos with geo-coordinates.

- **GalleryItem.kt:** Data model representing a photo fetched from Flickr, including properties like title, image URL, and geo-coordinates.

## Important Features and Implementations

- **Bottom Navigation Bar:**
  - Implemented using `BottomNavigationView` in `activity_main.xml`.
  - Enables seamless switching between Gallery and Map views.
  
- **Flickr API Integration:**
  - Utilizes Retrofit for making HTTPS requests to Flickr's API.
  - Parses JSON responses using Moshi into Kotlin objects.
  
- **Image Loading and Caching:**
  - Images are loaded into a RecyclerView grid using the Coil library.
  - Implements cache refreshing functionality to ensure up-to-date image display.
  
- **Interactive Map with OSMDroid:**
  - Displays map tiles with custom settings, including zoom limits and tile sources.
  - Places markers on the map based on photo geo-coordinates.
  - Customizes marker display and handles user interactions, such as clicking to view photo details.
  
- **WebView Integration:**
  - Loads Flickr photo pages within the app using WebView.
  - Includes progress indicators to inform users during page loading.
  
- **Data Sharing Across Fragments:**
  - Implements a shared `MainViewModel` scoped to the hosting Activity.
  - Enables both Gallery and Map fragments to access and manipulate shared photo data.
  
- **State Management:**
  - Maintains map state (zoom level and center position) across fragment transitions using `MapViewModel`.
  
- **Coroutines for Asynchronous Operations:**
  - Manages background tasks such as network requests and image loading using Kotlin Coroutines.
  
- **User Interaction Enhancements:**
  - Clickable map markers that navigate to detailed photo pages.
  - Smooth animations and transitions between different app states and views.
