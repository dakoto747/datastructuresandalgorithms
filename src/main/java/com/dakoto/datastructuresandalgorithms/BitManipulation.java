package com.dakoto.datastructuresandalgorithms;

public class BitManipulation
{


    public static enum ShiftDirection{LEFT, RIGHT};

    public void addition()
    {
        /*
         *  1c: 1 carry
         *
         *
         * 1c    1c     1c
         *        1     0     1
         *
         *        0     1     1
         *  +   _________________
         * 1      0     0     0
         *
         *  question: 101 + 011
         *    answer: 1000
         */
    }


    public void negativeIntegers()
    {
        /*
         * First bit represents the sign of the number:
         *     0 :- positive (+)
         *     1 :- negative (-)
         *
         * remaining bits are filled in with "two's complement": the number that you'll have to add the absolute value of
         *                                                       the positive version to get 2^8 in this case,
         *                                                       because it's an 8 bit number ( 8 digits/bits)
         *                                                       ....
         *                                                       What number can we add to the positive value to get
         *                                                       1 followed by a bunch of 0s?
         *                                                       E.g.
         *                                                       what number can we add to 18b10: 0 0 1 0 0 1 0 to get:
         *                                                                                 2^8b2: 1 0 0 0 0 0 0 ?
         *
         *                                                       Answer, invert the number, and add 1 to it.
         *                                                       following the example above:
         *                                                             invert:   0 0 1 0 0 1 0
         *                                                             to get:   1 1 0 1 1 0 1
         *                                                adding 1 to inverse:   1 1 0 1 1 1 0
         *                                        two's complement prepends 1: 1 1 1 0 1 1 1 0
         *
         * Base 10            Base 2
         *   18              0 0 0 1 0 0 1 0
         *
         *  -18              1 1 1 0 1 1 1 0
         *
         *
         *  In summary,
         *  invert,
         *  add 1 to to inverse,
         *  prepend 1 to inverse for negative sign
         */
    }



    // NOTES ON SHIFTING:
    // 1. bitshift 1 << x = 2 ^ x in decimal
    //     e.g.
    //        1 << 4 = 00010000 converted to decimal is 16 or 2^4
    // 2. the times you want to shift are to the righthand side
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    public void logicalShift(ShiftDirection direction)
    {
        // >>> or <<<
        //all numbers here include bit to represent sign

        switch (direction)
        {
            case LEFT:

                /*
                 *       23b10 :- 0 0 0 1 0 1 1 1
                 *       literally shift everything to the left :
                 *       46b10 :- 0 0 1 0 1 1 1 0
                 *
                 *       first bit/digit goes into trash
                 *
                 *       left shift multiplies by 2
                 *
                 *       e.g
                 *
                 *       -23b10 :- 1 1 1 0 1 0 0 1
                 *       leftshift
                 *       -46b10 :- 1 1 0 1 0 0 1 0
                 *
                 */
                break;

            case RIGHT:

                /*
                 *       23b10 :- 0 0 0 1 0 1 1 1
                 *       literally shift everything to the left :
                 *       11b10 :- 0 0 0 0 1 0 1 1
                 *
                 *       last bit/digit goes into the trash
                 *
                 *       right shift divides by 2 (if not negative, because it also shifts the sign bit, arithmetic preserves sign bit)
                 *
                 *       e.g
                 *
                 *       -23b0 :- 1 1 1 0 1 0 0 1
                 *       rightshift
                 *      116b10 :- 0 1 1 1 0 1 0 0
                 *
                 */
                break;
        }

    }

    public void arithmeticShift(ShiftDirection direction)
    {
        // >> or <<
        // all numbers here include bit to represent sign
        // preserves arithmetic relationship between original number and new right shifted number by
        // preserving sign bit

        switch (direction)
        {
            case LEFT:

                /*
                 *       23b10 :- 0 0 0 1 0 1 1 1
                 *       literally shift everything to the left :
                 *       46b10 :- 0 0 1 0 1 1 1 0
                 *
                 *       first bit/digit goes into trash
                 *
                 *       left shift multiplies by 2
                 *
                 *       e.g
                 *
                 *       -23b10 :- 1 1 1 0 1 0 0 1
                 *       leftshift
                 *       -46b10 :- 1 1 0 1 0 0 1 0
                 *
                 */
                break;

            case RIGHT:

                /*       preserves arithmetic relationship between original number and new right shifted number by
                 *       preserving sign bit
                 *
                 *       23b10 :- 0 0 0 1 0 1 1 1
                 *       literally shift everything to the left :
                 *       11b10 :- 0 0 0 0 1 0 1 1
                 *
                 *       last bit/digit goes into the trash
                 *
                 *       right shift divides by 2 (if not negative, because it also shifts the sign bit, arithmetic preserves sign bit)
                 *
                 *       e.g
                 *
                 *       -23b0 :- 1 1 1 0 1 0 0 1
                 *       rightshift
                 *       -12b10 :- 1 1 1 1 0 1 0 0
                 *
                 */
                break;
        }
    }


    public void mask()
    {
        /*
         * 1 op 0 <- -> 0 op 1
         *
         *   AND
         *
         *   0 & 0 = 0
         *   0 & 1 = 0
         *   1 & 1 = 1
         *
         *
         *   OR
         *
         *   0 | 0 = 0
         *   0 | 1 = 1
         *   1 | 1 = 1
         *
         *
         *
         *   XOR
         *
         *   0 ^ 0 = 0
         *   0 ^ 1 = 1
         *   1 ^ 1 = 0
         */
    }


}
