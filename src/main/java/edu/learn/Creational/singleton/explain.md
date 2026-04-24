## Singleton Pattern (Class-based) - Browser Example

This package demonstrates a **class-based Singleton** using a `Browser` object.

### Intent

Singleton ensures a class has:
- exactly one instance
- a global access point to that instance

In this example, all parts of the app share one browser session (tabs, homepage).

## Files

- `Browser.java`: singleton implementation + shared browser state
- `BrowserDemo.java`: runnable demo and thread test
- `enums/`: enum-based singleton variant

## How `Browser` is implemented

### 1. Private constructor

`Browser()` is private so no class can create new `Browser` with `new`.

### 2. Static singleton reference

```java
private static volatile Browser instance;
```

- `static`: one reference for the whole class
- `volatile`: prevents partially-constructed object visibility in multithreaded access

### 3. Global access method (`getInstance`)

`getInstance()` uses **double-checked locking**:
- first check avoids locking after instance exists
- synchronized block protects first-time creation
- second check ensures only one object is created

## Shared behavior in singleton

`Browser` also maintains shared state:
- `homePage`
- `openTabs`

Methods like `openTab`, `closeTab`, `getOpenTabsSnapshot`, `getTabCount`, `setHomePage` are synchronized for thread-safe writes/reads.

## What `BrowserDemo` proves

1. `browser1 == browser2` is `true` (same instance)
2. Updating homepage via one reference is visible via another
3. Multiple threads open tabs through `Browser.getInstance()`
4. Final tab count and snapshot show one shared, synchronized state

## Why this is useful

Use class-based singleton when you need one shared manager, e.g.:
- config manager
- cache manager
- browser session manager

## Tradeoffs

- Global state can make testing harder if overused
- Should be used for truly shared app-wide concerns only

## Class-based vs Enum singleton

- Class-based singleton (this package): more flexible structure, explicit locking
- Enum singleton (`enums`): simpler and safer default in many cases (serialization/reflection resistant)

Both guarantee single instance when implemented correctly.
