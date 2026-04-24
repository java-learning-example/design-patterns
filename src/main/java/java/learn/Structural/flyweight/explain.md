## Flyweight Pattern

Flyweight shares common immutable state to reduce memory usage.

### Example in code
- `TextStyleFactory` caches `TextStyle` by `font:size` key.
- Repeated requests reuse the same object instance.
