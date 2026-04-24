## Observer Pattern

The **Observer** pattern defines a one-to-many relationship between objects:
- One object (the **Subject**) holds state or events.
- Many objects (the **Observers**) subscribe to it.
- When the subject changes, it notifies all subscribers.

This pattern is useful when one change should automatically trigger updates in multiple places.

## Intent (Simple)

Instead of hardcoding calls like:
- `sendSms()`
- `sendEmail()`
- `refreshDashboard()`

inside one class, the subject just says: "I have a new update."  
All registered observers react in their own way.

## Roles In Your Code

### 1. Observer interface
- File: `Subscriber.java`
- Responsibility: defines the contract every observer must implement.
- Method:
  - `update(String headline)` -> called by the subject when new data arrives.

### 2. Concrete Observer
- File: `MobileSubscriber.java`
- Responsibility: concrete reaction to updates.
- Behavior:
  - Stores a user name.
  - Prints a notification when `update(...)` is called.

### 3. Subject (Publisher)
- File: `NewsChannel.java`
- Responsibility: manages subscribers and broadcasts updates.
- Fields:
  - `List<Subscriber> subscribers` -> all registered observers.
- Methods:
  - `subscribe(Subscriber subscriber)` -> register a new observer.
  - `publish(String headline)` -> notify all subscribers with new headline.

### 4. Client / Demo
- File: `ObserverDemo.java`
- Responsibility: wires everything together.
- Steps:
  - Create `NewsChannel`
  - Subscribe `MobileSubscriber("Alice")` and `MobileSubscriber("Bob")`
  - Publish `"Java 23 released"`

## How Notification Flow Works

1. Observer objects register using `subscribe(...)`.
2. Subject receives new data/event (`publish(...)`).
3. Subject loops through subscribers.
4. Subject calls `update(headline)` on each observer.
5. Each observer handles the event independently.

## Why This Is Better Than Direct Calls

- **Loose coupling**: `NewsChannel` only knows `Subscriber` interface, not concrete classes.
- **Extensible**: add a new observer type without editing `NewsChannel`.
- **Reusable subject**: same publisher can work with many observer implementations.
- **Cleaner architecture**: responsibilities are split clearly.

## Real-World Use Cases

- YouTube channel -> subscribers get upload notifications.
- Stock market feed -> multiple dashboards refresh when price changes.
- Spring events / app events -> listeners react to domain events.
- UI frameworks -> components re-render when model changes.

## Tradeoffs / Things To Improve

Current example is intentionally simple. In production, we usually add:

- `unsubscribe(...)` method to remove listeners.
- Duplicate-subscription protection.
- Thread safety if updates happen concurrently.
- Async notification (queue/executor) for slow observers.
- Error isolation so one failing observer does not break all others.

## Complexity

- `subscribe(...)`: O(1) average append.
- `publish(...)`: O(n), where `n` = number of subscribers.

This is expected because every observer must be notified.

## Quick Mental Model

- Subject = **news broadcaster**
- Observer = **subscriber device/app**
- Update = **breaking news alert**

Broadcaster does not care what each device does with the message.  
It only guarantees delivery to all subscribers.
