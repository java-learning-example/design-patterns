## Factory Pattern Changes

I completed the Factory example so object creation is now centralized in `OSFactory` instead of being hardcoded in `FactoryMain`.

### 1. `FactoryMain` now uses the factory

Before:
- `FactoryMain` directly created `new Android()`.

After:
- `FactoryMain` reads the OS type from `args[0]` (defaults to `"android"` when no argument is provided).
- It calls `OSFactory.getInstance(osType)`.
- It then calls `os.spec()`.

Why:
- This removes direct dependency on concrete classes in `FactoryMain`.
- The main class now depends only on the `OS` abstraction.

### 2. Implemented creation logic in `OSFactory`

`OSFactory.getInstance(String osType)` now:
- Returns `Android` when input is `null`/blank.
- Returns `Android` for `"android"` or `"google"`.
- Returns `IOS` for `"ios"`, `"apple"`, or `"open"`.
- Throws `IllegalArgumentException` for unknown values.

Why:
- This is the core of the Factory Pattern: one place decides which implementation to create.

### 3. Converted `IOS` to a concrete class

Before:
- `IOS` was an interface extending `OS`.

After:
- `IOS` is now a class implementing `OS`.
- It provides `spec()` and prints `----- iOS specs -----`.

Why:
- The factory needs concrete classes to instantiate.

### 4. Build result

Compilation succeeded with:
- `javac java\\learn\\factory\\*.java`

### 5. Runtime note (important)

Running with:
- `java java.learn.factory.FactoryMain android`

throws:
- `SecurityException: Prohibited package name: java.learn.factory`

Reason:
- Java reserves package names starting with `java.*`.

Fix:
- Rename the package from `java.learn.factory` to something like `learn.factory`.
