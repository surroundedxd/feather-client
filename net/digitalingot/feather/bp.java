// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.lwjgl.input.Keyboard;
import org.jetbrains.annotations.NotNull;

public class bP
{
    @NotNull
    public static final bO hZ;
    @NotNull
    public static final bO ia;
    public static final bO[] ib;
    
    public static String a(@NotNull final bO bo) {
        final int cq = bo.cq();
        if (cq == 0 || cq == 100000) {
            return "Unknown";
        }
        if (cq >= 100000) {
            return "Mouse " + (cq - 100000);
        }
        final String s = (cq < 256) ? Keyboard.getKeyName(cq) : String.format("%c", (char)(cq - 256)).toUpperCase();
        return (s != null) ? s : "Unknown";
    }
    
    static {
        hZ = new bO(0, 0);
        ia = new bO(100000, 100000);
        ib = new bO[] { bP.hZ, bP.ia, new bO(11, 48), new bO(2, 49), new bO(3, 50), new bO(4, 51), new bO(5, 52), new bO(6, 53), new bO(7, 54), new bO(8, 55), new bO(9, 56), new bO(10, 57), new bO(30, 65), new bO(48, 66), new bO(46, 67), new bO(32, 68), new bO(18, 69), new bO(33, 70), new bO(34, 71), new bO(35, 72), new bO(23, 73), new bO(36, 74), new bO(37, 75), new bO(38, 76), new bO(50, 77), new bO(49, 78), new bO(24, 79), new bO(25, 80), new bO(16, 81), new bO(19, 82), new bO(31, 83), new bO(20, 84), new bO(22, 85), new bO(47, 86), new bO(17, 87), new bO(45, 88), new bO(21, 89), new bO(44, 90), new bO(59, 112), new bO(60, 113), new bO(61, 114), new bO(62, 115), new bO(63, 116), new bO(64, 117), new bO(65, 118), new bO(66, 119), new bO(67, 120), new bO(68, 121), new bO(87, 122), new bO(88, 123), new bO(100, 61440), new bO(101, 61441), new bO(102, 61442), new bO(103, 61443), new bO(104, 61444), new bO(105, 61445), new bO(113, 61446), new bO(10114, 61447), new bO(10115, 61448), new bO(10116, 61449), new bO(10117, 61450), new bO(10118, 61451), new bO(10119, 71452), new bO(69, 144), new bO(82, 96), new bO(79, 97), new bO(80, 98), new bO(81, 99), new bO(75, 100), new bO(76, 101), new bO(77, 102), new bO(71, 103), new bO(72, 104), new bO(73, 105), new bO(78, 107), new bO(83, 110), new bO(156, 10), new bO(141, 61), new bO(55, 106), new bO(181, 111), new bO(74, 109), new bO(208, 40), new bO(203, 37), new bO(205, 39), new bO(200, 38), new bO(40, 222), new bO(43, 92), new bO(51, 44), new bO(13, 10061), new bO(41, 192), new bO(26, 91), new bO(12, 45), new bO(52, 46), new bO(27, 93), new bO(39, 59), new bO(53, 47), new bO(57, 32), new bO(15, 9), new bO(56, 18), new bO(29, 17), new bO(42, 16), new bO(219, 524), new bO(184, 10018), new bO(157, 10017), new bO(54, 10016), new bO(220, 10524), new bO(28, 10010), new bO(1, 27), new bO(14, 8), new bO(211, 127), new bO(207, 35), new bO(199, 36), new bO(210, 155), new bO(209, 34), new bO(201, 33), new bO(58, 20), new bO(197, 19), new bO(70, 145), new bO(221, 525), new bO(183, 154), new bO(121, 10001), new bO(123, 10002), new bO(100001, 100001), new bO(100002, 100002), new bO(100003, 100003), new bO(100004, 100004), new bO(100005, 100005), new bO(100006, 100006), new bO(100007, 100007), new bO(100008, 100008) };
    }
}
