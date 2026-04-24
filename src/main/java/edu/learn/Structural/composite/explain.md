## Composite Pattern

Composite treats single objects and groups uniformly.

### Example in code
- `FileLeaf` and `FolderComposite` both implement `FileSystemNode`.
- Client calls `size()` the same way on files and folders.
