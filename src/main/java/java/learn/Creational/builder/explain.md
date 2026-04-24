## Builder Pattern

Builder constructs complex objects in readable steps.

### Example in code
- `Burger.Builder` sets optional fields with fluent methods.
- `build()` returns an immutable `Burger`.

### Why this helps
- Avoids long constructors with many parameters.
- Makes object creation readable and less error-prone.
