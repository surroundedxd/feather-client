// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.util.IChatComponent;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import javax.sound.sampled.Control;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.AudioSystem;
import java.util.regex.Matcher;
import net.minecraft.client.Minecraft;
import java.util.regex.Pattern;
import javax.sound.sampled.Clip;
import java.util.List;
import java.io.File;

@dV(eN = ec.OOF_MOD, eO = @eb(fj = "Oof Mod", fk = "https://assets.feathercdn.net/game/mods/oofmod.svg", fl = "Plays a kill sound", fm = { dk.a.HYPIXEL }))
public class fG extends dW<a>
{
    private static final File oq;
    private static List<String> or;
    private Clip os;
    private String ot;
    private Pattern ou;
    private Pattern ov;
    
    @Override
    public void initialize() {
        this.hu();
        final String input;
        final String[] array;
        final Matcher matcher;
        Q.bk.a(chatComponent -> {
            if (!this.eU()) {
                return chatComponent;
            }
            else if (!jP.tO()) {
                return chatComponent;
            }
            else {
                if (!Minecraft.func_71410_x().func_110432_I().func_111285_a().equals(this.ot)) {
                    this.hu();
                }
                chatComponent.func_150260_c();
                this.ou.matcher(input);
                input.split(" ");
                if (this.ov.matcher((array.length > 0) ? array[0] : input.trim()).matches() && matcher.find()) {
                    if (!matcher.group(1).equals(this.ot)) {
                        this.hw();
                    }
                }
                return chatComponent;
            }
        });
        this.hv();
    }
    
    @Override
    public void eR() {
        this.hv();
        if (this.os != null) {
            this.os.close();
        }
        try {
            (this.os = AudioSystem.getClip()).open(AudioSystem.getAudioInputStream(new File(fG.oq, ((a)this.jK).ow)));
            ((FloatControl)this.os.getControl(FloatControl.Type.MASTER_GAIN)).setValue(((a)this.jK).ox - 30.0f);
        }
        catch (Exception ex) {
            this.os = null;
            ex.printStackTrace();
        }
    }
    
    @NotNull
    private static List<String> hs() {
        final String[] list = fG.oq.list();
        if (list == null) {
            return new ArrayList<String>(Collections.singletonList("oof.wav"));
        }
        final List<? super String> list2 = Arrays.stream(list).filter(s -> s.endsWith(".wav")).collect((Collector<? super String, ?, List<? super String>>)Collectors.toList());
        if (!list2.contains("oof.wav")) {
            list2.add("oof.wav");
        }
        return (List<String>)list2;
    }
    
    public boolean ht() {
        return !new HashSet(hs()).equals(new HashSet(fG.or));
    }
    
    private void hu() {
        this.ot = Minecraft.func_71410_x().func_110432_I().func_111285_a();
        this.ou = Pattern.compile("(\\w{1,16}).+ (by|of|to|for|with) (" + this.ot + ")");
        this.ov = Pattern.compile("^[a-zA-Z0-9_-]{3,16}$");
    }
    
    private void hv() {
        final File file = new File(fG.oq, "oof.wav");
        if (!file.exists()) {
            fG.oq.mkdirs();
            jz.aO("assets/feather/sounds/oof.wav").a(jz.m(file).ty());
        }
    }
    
    private void hw() {
        if (this.os != null) {
            this.os.setFramePosition(0);
            this.os.start();
        }
    }
    
    static {
        oq = new File(Minecraft.func_71410_x().field_71412_D, "feather/misc/oofmod");
    }
    
    public static class a extends eg
    {
        @ex(fw = "selectedSound", fj = "Selected Sound", fY = "oof.wav", fo = @es(fU = 0))
        @ei(fw = "sounds")
        @en
        public String ow;
        @ex(fw = "volume", fj = "Volume", fY = "10", fo = @es(fU = 1))
        @er(fR = 30)
        public int ox;
        
        @ei(fw = "sounds")
        public static List<String> hs() {
            final List hx = hs();
            fG.or = (List<String>)hx;
            return (List<String>)hx;
        }
    }
}
