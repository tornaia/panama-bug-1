java --version

jextract --source -C "--verbose" -d src\main\java "pbug.h"

rd /s /q target
mkdir target\classes

javac --source 16 --add-modules jdk.incubator.foreign -d target\classes src\main\java\*.java

java -classpath target\classes --enable-preview --add-modules jdk.incubator.foreign -Dforeign.restricted=permit PBugApp