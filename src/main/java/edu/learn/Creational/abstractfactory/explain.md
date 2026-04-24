## Abstract Factory Pattern

This pattern creates **families of related objects** without exposing concrete classes.

### Example in code
- `UIFactory` defines methods for related products: `Button` and `Checkbox`.
- `LightThemeFactory` and `DarkThemeFactory` produce matching widget families.
- `AbstractFactoryDemo` switches theme once and gets a consistent UI set.

### Why this helps
- Keeps creation logic grouped by family (theme, platform, brand).
- Client code is clean and does not need `if/else` for each widget type.
