// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class eC<T extends eg>
{
    @NotNull
    protected final Class<T> lE;
    @Nullable
    protected final Map<String, String> lG;
    @Nullable
    protected List<ez> lH;
    @Nullable
    private Map<ez, Object> lI;
    
    public eC(@NotNull final Class<T> le, @Nullable final Map<String, String> lg) {
        this.lE = le;
        this.lG = lg;
    }
    
    @NotNull
    public T gr() {
        this.gs();
        this.gt();
        this.gu();
        return this.gv();
    }
    
    protected void gs() {
        this.lH = new eA((Class<Object>)this.lE).gq();
    }
    
    private void gt() {
        if (this.lH == null) {
            throw new IllegalStateException("parseObjects() called before parseAnnotations()");
        }
        this.lI = new HashMap<ez, Object>();
        for (final ez ez : this.lH) {
            final String fw = ez.gh().fw();
            final String s = (this.lG == null) ? null : this.lG.get(fw);
            if (s == null && fw.equals("enabled")) {
                final el gw = this.gw();
                if (gw != null) {
                    this.lI.put(ez, gw.fE());
                    continue;
                }
            }
            this.lI.put(ez, new eG<Object>(ez, s).gD());
        }
    }
    
    private void gu() {
        if (this.lI == null) {
            throw new IllegalStateException("validateObjects() called before parseObjects()");
        }
        for (final Map.Entry<ez, Object> entry : this.lI.entrySet()) {
            final ez ez = entry.getKey();
            final Object value = entry.getValue();
            if (ez.gp() == null) {
                continue;
            }
            if (new eB<Object>(ez).e(value)) {
                continue;
            }
            entry.setValue(new eG<Object>(entry.getKey(), null).gD());
        }
    }
    
    private T gv() {
        try {
            final eg obj = this.lE.getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            for (final Map.Entry<ez, Object> entry : this.lI.entrySet()) {
                entry.getKey().gg().set(obj, entry.getValue());
            }
            return (T)obj;
        }
        catch (NoSuchMethodException cause) {
            throw new IllegalStateException("The config class has no default constructor.", cause);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            final Object cause2;
            throw new IllegalStateException((Throwable)cause2);
        }
    }
    
    @Nullable
    public el gw() {
        return this.lE.getDeclaredAnnotation(el.class);
    }
    
    @NotNull
    public Class<T> gx() {
        return this.lE;
    }
    
    @Nullable
    public List<ez> gy() {
        return this.lH;
    }
}
