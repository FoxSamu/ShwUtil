# ShwUtil
Shadew's Utility Library

## Installation
The library can be installed from Maven:
```groovy
repositories {
    // ...
    maven {
        url "https://maven.shadew.net/"
    }
    // ...
}

dependencies {
    compile "net.shadew:shwutil:1.7.0"
    // ...
}
```

## What's included
#### Contract validation utilities and `@NotNull`+`@Nullable` annotations
```java
public void something(@NotNull String string) {
    Validate.notNull(string, "string");
}
```

#### Either data type
The Either data type is provided by `net.shadew.util.data.Either` and can hold a value of either one or another type.
```java
Either<String, Integer> intOrString = someCondition ? Either.left("Hello") : Either.right(31);
```

#### Pair data type
The Pair data type is provided by `net.shadew.util.data.Pair` and holds two values
```java
Pair<String, Integer> intAndString = Pair.of("Hello", 31);
```

#### Unit data type
The Unit data type is provided by `net.shadew.util.data.Unit` and does not represent any value. `Unit` can be used where
a not-null value is expected but none can be given: `Unit` is an always existing value, but only exists once.
```java
Unit unit = Unit.unit();
```

#### Three-argument basic functional interfaces
```java
TriConsumer<String, Integer, Boolean> consumer = (s, i, b) -> dosomethingwith(s, i, b);
TriPredicate<String, Integer, Boolean> predicate = (s, i, b) -> checksomethingfor(s, i, b);
TriFunction<String, Integer, Boolean> function = (s, i, b) -> makesomethingof(s, i, b);
```

#### Flexible input streams and readers that allow unlimited pushback and implement mark and reset
```java
FlexibleInputStream in = new FlexibleInputStream(makeSomeStream());
System.out.println(in.markSupported()); // Prints 'true' 

FlexibleReader r = new FlexibleReader(makeSomeReader());
System.out.println(r.markSupported()); // Prints 'true'
```

#### Several handy utilities
```java
String content = IO.readAll(reader);
```
```java
byte[] bs = new byte[20];
IO.readFully(inputStream, bs, 5, 10);
```
```java
MathUtil.lerp(2, 5, 0.5); // 3.5
MathUtil.clamp(2, 5, 0.5); // 2
MathUtil.avg(1, 2, 3, 4, 5, 6); // 10.5
MathUtil.sum(1, 2, 3, 4, 5, 6); // 21
MathUtil.min(1, 2, 3, 4, 5, 6); // 1
MathUtil.max(1, 2, 3, 4, 5, 6); // 6
```
```java
ColorUtil.hsv(0, 1, 1); // 0xff0000
ColorUtil.interpolate(0xff0000, 0x0000ff, 0.5); // 0x880088
ColorUtil.greenf(0xff8800); // 0.5
ColorUtil.huef(ColorUtil.LIME); // 120.0
```
