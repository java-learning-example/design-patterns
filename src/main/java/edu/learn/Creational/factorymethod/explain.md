## Factory Method Pattern

Factory Method defines an interface for creating objects, but subclasses choose concrete types.

### Example
- `Logistics` defines `createTransport()`.
- `RoadLogistics` returns `Truck`.
- `SeaLogistics` returns `Ship`.
