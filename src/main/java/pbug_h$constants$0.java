// Generated by jextract

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.*;
import jdk.incubator.foreign.MemoryLayout.PathElement;
import static jdk.incubator.foreign.CLinker.*;
class pbug_h$constants$0 {

    /* package-private */ pbug_h$constants$0() {}
    static final LibraryLookup[] LIBRARIES = RuntimeHelper.libraries(new String[] {
    });

    static final MemoryLayout PARAMS$struct$LAYOUT_ = MemoryLayout.ofStruct(
        MemoryLayout.ofUnion(
            MemoryLayout.ofStruct(
                C_INT.withName("flags1"),
                MemoryLayout.ofUnion(
                    MemoryLayout.ofStruct(
                        C_INT.withName("flags3")
                    ).withName("Struct2")
                ).withName("DUMMYUNION1")
            ).withName("Struct1"),
            MemoryLayout.ofStruct(
                C_INT.withName("flags2")
            ).withName("Struct2")
        ).withName("DUMMYUNION2")
    ).withName("PARAMS");
    static final jdk.incubator.foreign.MemoryLayout PARAMS$struct$LAYOUT() { return PARAMS$struct$LAYOUT_; }

    static final MemoryLayout DUMMYUNION2$struct$LAYOUT_ = MemoryLayout.ofUnion(
        MemoryLayout.ofStruct(
            C_INT.withName("flags1"),
            MemoryLayout.ofUnion(
                MemoryLayout.ofStruct(
                    C_INT.withName("flags3")
                ).withName("Struct2")
            ).withName("DUMMYUNION1")
        ).withName("Struct1"),
        MemoryLayout.ofStruct(
            C_INT.withName("flags2")
        ).withName("Struct2")
    );
    static final jdk.incubator.foreign.MemoryLayout DUMMYUNION2$struct$LAYOUT() { return DUMMYUNION2$struct$LAYOUT_; }

    static final MemoryLayout Struct1$struct$LAYOUT_ = MemoryLayout.ofStruct(
        C_INT.withName("flags1"),
        MemoryLayout.ofUnion(
            MemoryLayout.ofStruct(
                C_INT.withName("flags3")
            ).withName("Struct2")
        ).withName("DUMMYUNION1")
    );
    static final jdk.incubator.foreign.MemoryLayout Struct1$struct$LAYOUT() { return Struct1$struct$LAYOUT_; }

    static final MemoryLayout Struct1$flags1$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout Struct1$flags1$LAYOUT() { return Struct1$flags1$LAYOUT_; }

    static final VarHandle Struct1$flags1$VH_ = Struct1$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("flags1"));
    static final java.lang.invoke.VarHandle Struct1$flags1$VH() { return Struct1$flags1$VH_; }

    static final MemoryLayout DUMMYUNION1$struct$LAYOUT_ = MemoryLayout.ofUnion(
        MemoryLayout.ofStruct(
            C_INT.withName("flags3")
        ).withName("Struct2")
    );
    static final jdk.incubator.foreign.MemoryLayout DUMMYUNION1$struct$LAYOUT() { return DUMMYUNION1$struct$LAYOUT_; }

    static final MemoryLayout Struct2$struct$LAYOUT_ = MemoryLayout.ofStruct(
        C_INT.withName("flags3")
    );
    static final jdk.incubator.foreign.MemoryLayout Struct2$struct$LAYOUT() { return Struct2$struct$LAYOUT_; }

    static final MemoryLayout Struct2$flags3$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout Struct2$flags3$LAYOUT() { return Struct2$flags3$LAYOUT_; }

    static final VarHandle Struct2$flags3$VH_ = Struct2$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("flags3"));
    static final java.lang.invoke.VarHandle Struct2$flags3$VH() { return Struct2$flags3$VH_; }

    static final MemoryLayout Struct2$flags2$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout Struct2$flags2$LAYOUT() { return Struct2$flags2$LAYOUT_; }

    static final VarHandle Struct2$flags2$VH_ = Struct2$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("flags2"));
    static final java.lang.invoke.VarHandle Struct2$flags2$VH() { return Struct2$flags2$VH_; }

}

