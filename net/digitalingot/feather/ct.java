// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class cT
{
    @SerializedName("compact")
    private Boolean jn;
    @SerializedName("favorites")
    private Boolean jo;
    @SerializedName("favoriteMods")
    private List<ec> jp;
    @SerializedName("renderMods")
    private List<ec> jq;
    @SerializedName("modPreview")
    private Boolean jr;
    @SerializedName("modPreviewImage")
    private String js;
    
    public cT(final boolean b, final boolean b2, final List<ec> jp, final List<ec> jq, final boolean b3, final String js) {
        this.jn = b;
        this.jo = b2;
        this.jp = jp;
        this.jq = jq;
        this.jr = b3;
        this.js = js;
    }
    
    public Boolean dl() {
        return this.jn;
    }
    
    public void a(final Boolean jn) {
        this.jn = jn;
    }
    
    public Boolean dm() {
        return this.jo;
    }
    
    public void b(final Boolean jo) {
        this.jo = jo;
    }
    
    public List<ec> dn() {
        return this.jp;
    }
    
    public void f(final List<ec> jp) {
        this.jp = jp;
    }
    
    public List<ec> do() {
        return this.jq;
    }
    
    public void g(final List<ec> jq) {
        this.jq = jq;
    }
    
    public Boolean dp() {
        return this.jr;
    }
    
    public void c(final Boolean jr) {
        this.jr = jr;
    }
    
    public String dq() {
        return this.js;
    }
    
    public void u(final String js) {
        this.js = js;
    }
}
