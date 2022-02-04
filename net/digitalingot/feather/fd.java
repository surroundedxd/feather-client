// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.Entity;
import java.awt.Color;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.util.AxisAlignedBB;

@dV(eN = ec.HITBOX, eO = @eb(fj = "Hitbox", fk = "https://assets.feathercdn.net/game/mods/hitbox.svg", fl = "Adds hitboxes around entities", fm = {}))
public class fD extends dW<a>
{
    @Override
    public void initialize() {
        final Color color;
        final AxisAlignedBB axisAlignedBB;
        af.bv.a((entity, n, n2, n3, p4) -> {
            if (!(!this.eU())) {
                if (!entity.func_82150_aj()) {
                    this.e(entity);
                    if (color != null) {
                        io.r(false);
                        io.lT();
                        io.lK();
                        io.lR();
                        io.lQ();
                        entity.func_174813_aQ();
                        RenderGlobal.func_181563_a(new AxisAlignedBB(axisAlignedBB.field_72340_a - entity.field_70165_t + n, axisAlignedBB.field_72338_b - entity.field_70163_u + n2, axisAlignedBB.field_72339_c - entity.field_70161_v + n3, axisAlignedBB.field_72336_d - entity.field_70165_t + n, axisAlignedBB.field_72337_e - entity.field_70163_u + n2, axisAlignedBB.field_72334_f - entity.field_70161_v + n3), color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                        io.lU();
                        io.lJ();
                        io.lS();
                        io.lQ();
                        io.r(true);
                    }
                }
            }
        });
    }
    
    private Color e(final Entity entity) {
        Color color = null;
        if (entity instanceof IProjectile) {
            color = (((a)this.jK).nK ? ((a)this.jK).nL : null);
        }
        else if (entity instanceof EntityItem) {
            color = (((a)this.jK).nN ? ((a)this.jK).nO : null);
        }
        else if (entity instanceof EntityAnimal) {
            color = (((a)this.jK).nH ? ((a)this.jK).nI : null);
        }
        else if (entity instanceof EntityMob) {
            color = (((a)this.jK).nE ? ((a)this.jK).nF : null);
        }
        else if (entity instanceof EntityPlayer) {
            color = (((a)this.jK).nB ? ((a)this.jK).nC : null);
        }
        if (color == null) {
            return null;
        }
        final eZ nz = ((a)this.jK).nz;
        Color gu;
        if (nz.gT()) {
            gu = new Color(iM.sU().sW());
        }
        else {
            gu = nz.gU();
        }
        return gu;
    }
    
    public static class a extends eg
    {
        @es(fU = 0)
        public fc mu;
        @ex(fw = "mainColor", fj = "Main Color", fY = "", fo = @es(fU = 1))
        public eZ nz;
        @es(fU = 10)
        public fc nA;
        @ex(fw = "playerHitboxes", fj = "Player Hitboxes", fY = "true", fo = @es(fU = 11))
        public boolean nB;
        @ex(fw = "playerHitboxColor", fj = "Color", gb = @et(fw = "playerHitboxes"), fo = @es(fU = 12))
        public Color nC;
        @es(fU = 20)
        public fc nD;
        @ex(fw = "monsterHitboxes", fj = "Monster Hitboxes", fY = "true", fo = @es(fU = 21))
        public boolean nE;
        @ex(fw = "monsterHitboxColor", fj = "Color", gb = @et(fw = "monsterHitboxes"), fo = @es(fU = 22))
        public Color nF;
        @es(fU = 30)
        public fc nG;
        @ex(fw = "animalHitboxes", fj = "Animal Hitboxes", fY = "true", fo = @es(fU = 31))
        public boolean nH;
        @ex(fw = "animalHitboxColor", fj = "Color", gb = @et(fw = "animalHitboxes"), fo = @es(fU = 32))
        public Color nI;
        @es(fU = 40)
        public fc nJ;
        @ex(fw = "projectileHitboxes", fj = "Projectile Hitboxes", fY = "true", fo = @es(fU = 41))
        public boolean nK;
        @ex(fw = "projectileHitboxColor", fj = "Color", gb = @et(fw = "projectileHitboxes"), fo = @es(fU = 42))
        public Color nL;
        @es(fU = 50)
        public fc nM;
        @ex(fw = "itemDropHitboxes", fj = "Item Drop Hitboxes", fY = "true", fo = @es(fU = 51))
        public boolean nN;
        @ex(fw = "itemDropHitboxColor", fj = "Color", gb = @et(fw = "itemDropHitboxes"), fo = @es(fU = 52))
        public Color nO;
        
        public a() {
            this.mu = new fc("General");
            this.nA = new fc("Player Hitboxes");
            this.nD = new fc("Monster Hitboxes");
            this.nG = new fc("Animal Hitboxes");
            this.nJ = new fc("Projectile Hitboxes");
            this.nM = new fc("Item Drop Hitboxes");
        }
    }
}
