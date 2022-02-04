// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.NavigableMap;

public class kB
{
    private static final NavigableMap<Integer, String> GF;
    private static final TreeMap<Integer, String> GG;
    
    public static int aV(String s) {
        s = s.toUpperCase();
        int n = 0;
        for (final Map.Entry<Object, Object> entry : kB.GF.entrySet()) {
            final String prefix = entry.getValue();
            final int intValue = entry.getKey();
            while (s.startsWith(prefix)) {
                n += intValue;
                s = s.substring(prefix.length());
            }
        }
        return n;
    }
    
    public static String aQ(int i) {
        final StringBuilder sb = new StringBuilder();
        while (i > 0) {
            final Map.Entry<Integer, String> floorEntry = kB.GG.floorEntry(i);
            i -= floorEntry.getKey();
            sb.append(floorEntry.getValue());
        }
        return sb.toString();
    }
    
    static {
        (GG = new TreeMap<Integer, String>()).put(1, "I");
        kB.GG.put(4, "IV");
        kB.GG.put(5, "V");
        kB.GG.put(9, "IX");
        kB.GG.put(10, "X");
        kB.GG.put(40, "XL");
        kB.GG.put(50, "L");
        kB.GG.put(90, "XC");
        kB.GG.put(100, "C");
        kB.GG.put(400, "CD");
        kB.GG.put(500, "D");
        kB.GG.put(900, "CM");
        kB.GG.put(1000, "M");
        kB.GG.put(4000, "MV\u0305");
        kB.GG.put(5000, "V\u0305");
        kB.GG.put(9000, "MX\u0305");
        kB.GG.put(10000, "X\u0305");
        kB.GG.put(40000, "X\u0305L\u0305");
        kB.GG.put(50000, "L\u0305");
        kB.GG.put(90000, "X\u0305C\u0305");
        kB.GG.put(100000, "C\u0305");
        kB.GG.put(400000, "C\u0305D\u0305");
        kB.GG.put(500000, "D\u0305");
        kB.GG.put(900000, "C\u0305M\u0305");
        kB.GG.put(1000000, "M\u0305");
        GF = kB.GG.descendingMap();
    }
}
