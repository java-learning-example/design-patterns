## Prototype Pattern

Prototype creates new objects by cloning existing ones.

### Example in code
- `Resume` implements `Cloneable`.
- `clone()` performs a deep copy of mutable `skills` array.
- We clone a template resume and customize per user.

### Why this helps
- Fast creation from preconfigured templates.
- Useful when setup is expensive or repetitive.
