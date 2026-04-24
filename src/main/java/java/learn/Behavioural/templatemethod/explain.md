## Template Method Pattern

Template Method defines algorithm steps in a base class while allowing subclasses to customize parts.

### Example
- `DataExporter.export()` is fixed.
- `CsvExporter` and `JsonExporter` implement variable steps.
