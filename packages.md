## Java Packages

Used to group java classes, and are convenient for organizing the application and separating
code from libraries provided from others.

Java itself already has a number of packages defined such as: `java.util, java.math`, etc.

You can think of packages as folders on a hard-drive (which is actually how the classes are
stored on the disk)

To use classes from other packages you have to use "import"
You can access classes from the same package, and **public** classes from other packages.

You can import a specific class or all classes in a package

```
import java.util.Date;
import java.util.*;
```

If you have two classes with the same name in the same class
(for example `java.util.Date, java.sql.Date`) then instead of using imports you have to
use fully qualified name in the code:

```
java.util.Date currentDate = new java.util.Date();
java.sql.Date dbDate = new java.sql.Date(...);
```

To define a class in a specific package we use the "package" keyword:

```
package com.dm.example1

public class Point {
...
}
```

If you don't define a package the class belongs to the "default package", but it's a good
idea to always define packages.

As a naming convention, packages are always lower-case, and usually are the reverse of the
web url of the company that writes the code (which normally guarantees uniqueness).

For example Twitter libraries are packaged under `com.twitter`, because their url is twitter.com

.  
