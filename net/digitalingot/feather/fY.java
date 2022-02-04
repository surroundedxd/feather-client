// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import java.awt.Color;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.gui.GuiUtilRenderComponents;
import net.minecraft.util.MathHelper;
import net.digitalingot.feather.mixin.core.b;
import net.minecraft.client.gui.ChatLine;
import java.util.regex.Matcher;
import net.minecraft.util.ChatStyle;
import net.digitalingot.feather.mixin.core.m;
import net.minecraft.util.ChatComponentTranslation;
import net.digitalingot.feather.mixin.core.l;
import net.minecraft.util.ChatComponentText;
import java.util.Iterator;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.EnumChatFormatting;
import java.util.Locale;
import com.google.common.collect.Sets;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.Map;
import net.minecraft.client.Minecraft;

@dV(eN = ec.CHAT_OPTIONS, eO = @eb(fj = "Chat Options", fk = "https://assets.feathercdn.net/game/sidebar/chat.svg", fl = "", fm = {}, fn = @eb.a(fj = "Chat", fo = @es(fU = 1))))
public final class fy extends dW<a>
{
    private Minecraft minecraft;
    private final Map<String, Integer> mB;
    private final Set<String> mC;
    private Pattern mD;
    private String mE;
    private String mF;
    private boolean mG;
    
    public fy() {
        this.mB = new LinkedHashMap<String, Integer>(5);
        this.mC = (Set<String>)Sets.newHashSet((Object[])new String[] { "-----------------------------------------------------" });
    }
    
    @Override
    public void initialize() {
        this.minecraft = Minecraft.func_71410_x();
        aU.aR();
        this.gZ();
        Q.bk.a(this::a);
        P.bk.a(s -> {
            this.mF = s.toLowerCase(Locale.ROOT);
            return s;
        });
        ab.br.a((p0, p1) -> this.mB.clear());
        bM.a(() -> ((a)this.jK).mI, () -> {
            if (this.minecraft.field_71462_r == null) {
                ((a)this.jK).mJ = !((a)this.jK).mJ;
            }
        }, null);
    }
    
    @Override
    public void eR() {
        this.gZ();
    }
    
    private void gZ() {
        final String func_111285_a = this.minecraft.func_110432_I().func_111285_a();
        this.mD = Pattern.compile(func_111285_a, 2);
        this.mE = this.F(func_111285_a);
    }
    
    private String F(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append(EnumChatFormatting.RESET);
        sb.append(((a)this.jK).mQ.toString);
        if (((a)this.jK).mR) {
            sb.append(EnumChatFormatting.BOLD);
        }
        sb.append(str);
        sb.append(EnumChatFormatting.RESET);
        return sb.toString();
    }
    
    private IChatComponent a(final IChatComponent chatComponent) {
        if (((a)this.jK).mP) {
            this.mG = false;
            this.b(chatComponent);
            if (this.mG) {
                this.mF = null;
            }
        }
        if (((a)this.jK).mM) {
            final String func_150260_c = chatComponent.func_150260_c();
            if (func_150260_c.trim().isEmpty() || this.mC.contains(func_150260_c)) {
                return chatComponent;
            }
            if (this.mB.size() > (((a)this.jK).mN ? 1 : 5)) {
                final Iterator<Map.Entry<String, Integer>> iterator = this.mB.entrySet().iterator();
                iterator.next();
                iterator.remove();
            }
            int size = this.mB.size();
            int intValue = -1;
            for (final Map.Entry<String, Integer> entry : this.mB.entrySet()) {
                --size;
                if (entry.getKey().equals(func_150260_c)) {
                    intValue = entry.getValue();
                    break;
                }
            }
            if (intValue != -1 && this.ha()) {
                this.M(size);
                this.a(chatComponent, intValue + 1);
                this.mB.remove(func_150260_c);
                this.mB.put(func_150260_c, intValue + 1);
            }
            else {
                this.mB.put(func_150260_c, 1);
            }
        }
        return chatComponent;
    }
    
    private boolean b(final IChatComponent chatComponent) {
        boolean b = false;
        final ChatStyle func_150256_b = chatComponent.func_150256_b();
        if (chatComponent instanceof ChatComponentText) {
            final String a = this.a(((ChatComponentText)chatComponent).func_150265_g(), func_150256_b);
            if (a != null) {
                ((l)chatComponent).setText(a);
                return true;
            }
        }
        else if (chatComponent instanceof ChatComponentTranslation) {
            final Object[] func_150271_j = ((ChatComponentTranslation)chatComponent).func_150271_j();
            for (int i = 0; i < func_150271_j.length; ++i) {
                final Object o = func_150271_j[i];
                if (o != chatComponent) {
                    if (o instanceof IChatComponent) {
                        b |= this.b((IChatComponent)o);
                    }
                    else if (o instanceof String) {
                        final String a2 = this.a((String)o, func_150256_b);
                        if (a2 != null) {
                            func_150271_j[i] = a2;
                            b = true;
                        }
                    }
                }
            }
            if (b) {
                ((m)chatComponent).setLastUpdate(-1L);
            }
        }
        for (final IChatComponent chatComponent2 : chatComponent.func_150253_a()) {
            if (chatComponent2 != chatComponent) {
                b |= this.b(chatComponent2);
            }
        }
        return b;
    }
    
    private String a(final String input, final ChatStyle chatStyle) {
        if (this.mG || (!((a)this.jK).mS && this.mF != null && jV.aS(input).toLowerCase(Locale.ROOT).contains(this.mF))) {
            this.mG = true;
            return null;
        }
        final Matcher matcher = this.mD.matcher(input);
        if (matcher.find()) {
            final ku.a au = ku.aU(input);
            final StringBuffer sb = new StringBuffer();
            do {
                final ku.b ap = au.aP(matcher.end());
                String s = ap.ua();
                if (!ap.ub() && chatStyle.func_150215_a() != null) {
                    s += chatStyle.func_150215_a().toString();
                }
                matcher.appendReplacement(sb, this.mE + s);
            } while (matcher.find());
            matcher.appendTail(sb);
            return sb.toString();
        }
        return null;
    }
    
    private void M(final int n) {
        final GuiNewChat func_146158_b = this.minecraft.field_71456_v.func_146158_b();
        int n2 = 0;
        int size = 0;
        for (int i = 0; i <= n; ++i) {
            size = GuiUtilRenderComponents.func_178908_a(((b)func_146158_b).getAllMessages().get(i).func_151461_a(), MathHelper.func_76141_d(func_146158_b.func_146228_f() / func_146158_b.func_146244_h()), this.minecraft.field_71466_p, false, false).size();
            n2 += size;
        }
        ((b)func_146158_b).getAllMessages().remove(n);
        ((b)func_146158_b).getTrimmedMessages().subList(n2 - size, n2).clear();
    }
    
    private boolean ha() {
        return !((b)this.minecraft.field_71456_v.func_146158_b()).getAllMessages().isEmpty();
    }
    
    private void a(final IChatComponent chatComponent, final int i) {
        chatComponent.func_150258_a(" [" + i + "]");
    }
    
    public static final class a extends eg
    {
        @es(fU = 0)
        public fc mH;
        @ex(fw = "keyToggleChat", fj = "Toggle Chat", fY = "0", fo = @es(fU = 1))
        public bK mI;
        @ex(fw = "chatHidden", fj = "Chat Hidden", fY = "false", fo = @es(fU = -10))
        public transient boolean mJ;
        @ex(fw = "unlimitedScrollback", fj = "Unlimited Scrollback", fY = "true", fo = @es(fU = 3))
        public boolean mK;
        @ex(fw = "backgroundColor", fj = "Background Color", fY = "0/0/0/128", fo = @es(fU = 4))
        public Color li;
        @ex(fw = "textShadow", fj = "Text Shadow", fY = "true", fo = @es(fU = 5))
        public boolean lp;
        @es(fU = 10)
        public fc mL;
        @ex(fw = "stackMessages", fj = "Stack Repeated Messages", fY = "true", fo = @es(fU = 11))
        public boolean mM;
        @ex(fw = "consecutiveMessagesOnly", fj = "Consecutive Messages Only", fY = "false", gb = @et(fw = "stackMessages"), fo = @es(fU = 12))
        public boolean mN;
        @es(fU = 20)
        public fc mO;
        @ex(fw = "mentionHighlight", fj = "Highlight", fY = "false", fo = @es(fU = 21))
        public boolean mP;
        @ex(fw = "mentionColor", fj = "Color", fY = "green", gb = @et(fw = "mentionHighlight"), fo = @es(fU = 22))
        @en
        public fa mQ;
        @ex(fw = "mentionBold", fj = "Bold", fY = "false", gb = @et(fw = "mentionHighlight"), fo = @es(fU = 23))
        public boolean mR;
        @ex(fw = "mentionOwnMessage", fj = "Own Messages", fY = "false", gb = @et(fw = "mentionHighlight"), fo = @es(fU = 24))
        public boolean mS;
        
        public a() {
            this.mH = new fc("Chat Settings");
            this.mL = new fc("Stack Messages");
            this.mO = new fc("Mentions");
        }
        
        @Override
        public boolean dI() {
            return true;
        }
    }
}
