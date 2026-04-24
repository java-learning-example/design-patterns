## Bridge Pattern

Bridge separates abstraction from implementation so both can vary independently.

### Example in code
- `Remote` is the abstraction.
- `Device` implementations (`TV`, `Radio`) are separate.
- `BasicRemote` can control any `Device`.
