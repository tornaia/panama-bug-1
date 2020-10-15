#ifndef PBUG_H
#define PBUG_H

typedef struct PARAMS {

    union {

        struct {

            int flags1;

            union {

                struct {
                    int flags3;
                } Struct2;

            } DUMMYUNION1;

        } Struct1;

        struct {
            int flags2;
        } Struct2;

    } DUMMYUNION2;

} PARAMS;


#endif // PBUG_H