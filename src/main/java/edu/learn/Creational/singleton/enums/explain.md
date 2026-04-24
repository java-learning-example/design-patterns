## Enum Singleton (`enums`)

This package demonstrates **Singleton using `enum`**, which is the most robust singleton style in Java.

---

## Core confusion: "If I call `.INSTANCE` many times, am I creating many objects?"

No.  
Calling `Editor.INSTANCE` multiple times does **not** create new objects.
It only returns a reference to the **same object** that JVM created once.

Think of it like checking the same home address many times:
- Looking up the address 10 times does not build 10 houses.
- It points to the same house every time.

---

## What Java/JVM actually does

With enum singleton:

```java
public enum Editor {
    INSTANCE;
}
```

`INSTANCE` is created once by the JVM during class loading.

So this:

```java
Editor e1 = Editor.INSTANCE;
Editor e2 = Editor.INSTANCE;
System.out.println(e1 == e2); // true
```

prints `true` because both variables point to the same memory object.

---

## Why enum singleton is special

Compared to classic class-based singleton, enum singleton gives you:

1. **Single instance guaranteed by language/JVM**
2. **Thread safety by default**
3. **Serialization safety** (no extra `readResolve` needed)
4. **Reflection safety** (harder to break than constructor-based singleton)

This is why Joshua Bloch (Effective Java) strongly recommends enum for singletons.

---

## How this maps to your code

### `Editor.java`
- `Editor` is an enum with one constant: `INSTANCE`.
- It stores shared app state in `openFiles`.
- Methods like `openFile(...)`, `closeFile(...)`, `listOpenFiles()`, `totalOpenSize()` operate on the same shared state.

### `EnumEditorDemo.java`
- Gets `Editor.INSTANCE` from two references (`editorFromTab1`, `editorFromTab2`).
- Opens files from both references.
- Shows they are the same instance with:
  - `editorFromTab1 == editorFromTab2`
- Shared state is visible through both references.

### `File.java`
- Simple value object representing file metadata (`name`, `size`).

---

## Proof that it is one instance

If one reference updates state:

```java
Editor a = Editor.INSTANCE;
Editor b = Editor.INSTANCE;

a.openFile(new File("notes.md", 1000));
System.out.println(b.listOpenFiles()); // b sees what a changed
```

`b` sees the same data changed by `a`, confirming both use the same singleton object.

---

## When to use enum singleton

Use it when:
- You need exactly one shared object in the app.
- Global coordination/state is needed (config manager, app session manager, cache manager, editor session).
- You want simple and safe singleton without double-checked locking complexity.

Avoid it when:
- You need multiple differently configured instances (then use factory/builder/DI).

---

## Quick summary

- `Editor.INSTANCE` is **not a constructor call**.
- It is a reference to one JVM-created singleton object.
- Multiple accesses, same object.
- In Java, enum is usually the cleanest and safest singleton implementation.
