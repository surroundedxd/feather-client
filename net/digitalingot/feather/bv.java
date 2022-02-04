// 
// Decompiled by Procyon v0.5.36
// 

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.google.gson.annotations.SerializedName;

public enum bV
{
    @SerializedName("callback")
    CALLBACK((Class<? extends bY>)null), 
    @SerializedName("readyForMessages")
    READY_FOR_MESSAGES((Class<? extends bY>)cG.class), 
    @SerializedName("recordKeys")
    RECORD_KEYS((Class<? extends bY>)cH.class), 
    @SerializedName("renderMod")
    RENDER_MOD((Class<? extends bY>)cK.class), 
    @SerializedName("removeRenderMod")
    REMOVE_RENDER_MOD((Class<? extends bY>)cJ.class), 
    @SerializedName("setScalePercentage")
    SET_SCALE_PERCENTAGE((Class<? extends bY>)cL.class), 
    @SerializedName("setUIColors")
    SET_UI_COLORS((Class<? extends bY>)cM.class), 
    @SerializedName("pageUpdate")
    PAGE_UPDATE((Class<? extends bY>)cZ.class), 
    @SerializedName("loadHomepageSelections")
    LOAD_HOMEPAGE_SELECTIONS((Class<? extends bY>)cW.class), 
    @SerializedName("pressButton")
    PRESS_BUTTON((Class<? extends bY>)da.class), 
    @SerializedName("openFeatherMods")
    OPEN_FEATHER_MODS((Class<? extends bY>)cX.class), 
    @SerializedName("openHomepage")
    OPEN_HOMEPAGE((Class<? extends bY>)cY.class), 
    @SerializedName("closeHomepage")
    CLOSE_HOMEPAGE((Class<? extends bY>)cV.class), 
    @SerializedName("loadClientPreferences")
    LOAD_CLIENT_PREFERENCES((Class<? extends bY>)cN.class), 
    @SerializedName("updateClientPreferences")
    UPDATE_CLIENT_PREFERENCES((Class<? extends bY>)cO.class), 
    @SerializedName("loadModProfileList")
    LOAD_MOD_PROFILE_LIST((Class<? extends bY>)dq.class), 
    @SerializedName("loadModProfile")
    LOAD_MOD_PROFILE((Class<? extends bY>)dp.class), 
    @SerializedName("createModProfile")
    CREATE_MOD_PROFILE((Class<? extends bY>)dn.class), 
    @SerializedName("selectModProfile")
    SELECT_MOD_PROFILE((Class<? extends bY>)ds.class), 
    @SerializedName("renameModProfile")
    RENAME_MOD_PROFILE((Class<? extends bY>)dr.class), 
    @SerializedName("cloneModProfile")
    CLONE_MOD_PROFILE((Class<? extends bY>)dm.class), 
    @SerializedName("deleteModProfile")
    DELETE_MOD_PROFILE((Class<? extends bY>)do.class), 
    @SerializedName("buildModSettings")
    BUILD_MOD_SETTINGS((Class<? extends bY>)df.class), 
    @SerializedName("updateModSettings")
    UPDATE_MOD_SETTINGS((Class<? extends bY>)dj.class), 
    @SerializedName("resetModSettings")
    RESET_MOD_SETTINGS((Class<? extends bY>)di.class), 
    @SerializedName("resetModPositions")
    RESET_MOD_POSITIONS((Class<? extends bY>)dh.class), 
    @SerializedName("disabledMods")
    DISABLED_MODS((Class<? extends bY>)dg.class), 
    @SerializedName("buildSidebarSettings")
    BUILD_SIDEBAR_SETTINGS((Class<? extends bY>)dI.class), 
    @SerializedName("loadSidebarSettings")
    LOAD_SIDEBAR_SETTINGS((Class<? extends bY>)dJ.class), 
    @SerializedName("updateSidebarSettings")
    UPDATE_SIDEBAR_SETTINGS((Class<? extends bY>)dL.class), 
    @SerializedName("resetSidebarSettings")
    RESET_SIDEBAR_SETTINGS((Class<? extends bY>)dK.class), 
    @SerializedName("openCosmetics")
    OPEN_COSMETICS((Class<? extends bY>)cA.class), 
    @SerializedName("buildCosmeticsMenu")
    BUILD_COSMETICS_MENU((Class<? extends bY>)cy.class), 
    @SerializedName("loadCosmeticSettings")
    LOAD_COSMETICS_SETTINGS((Class<? extends bY>)cz.class), 
    @SerializedName("updateCosmetics")
    UPDATE_COSMETICS((Class<? extends bY>)cC.class), 
    @SerializedName("resetCosmeticsSettings")
    RESET_COSMETICS_SETTINGS((Class<? extends bY>)cB.class), 
    @SerializedName("openHudSelection")
    OPEN_HUD_SELECTION((Class<? extends bY>)de.class), 
    @SerializedName("closeHudSelection")
    CLOSE_HUD_SELECTION((Class<? extends bY>)db.class), 
    @SerializedName("loadHudSelection")
    LOAD_HUD_SELECTION((Class<? extends bY>)dd.class), 
    @SerializedName("doHudSelection")
    DO_HUD_SELECTION((Class<? extends bY>)dc.class), 
    @SerializedName("drmRequest")
    DRM_REQUEST((Class<? extends bY>)cE.class), 
    @SerializedName("accountSwitchDetails")
    ACCOUNT_SWITCH_DETAILS((Class<? extends bY>)cs.class), 
    @SerializedName("loadAccountList")
    LOAD_ACCOUNT_LIST((Class<? extends bY>)cr.class), 
    @SerializedName("changeAccount")
    CHANGE_ACCOUNT((Class<? extends bY>)cq.class), 
    @SerializedName("openWaypointsMenu")
    OPEN_WAYPOINTS_MENU((Class<? extends bY>)dQ.class), 
    @SerializedName("loadWaypoints")
    LOAD_WAYPOINTS((Class<? extends bY>)dP.class), 
    @SerializedName("createUpdateWaypoint")
    CREATE_UPDATE_WAYPOINT((Class<? extends bY>)dN.class), 
    @SerializedName("deleteWaypoint")
    DELETE_WAYPOINT((Class<? extends bY>)dO.class), 
    @SerializedName("openAutoTextMenu")
    OPEN_AUTO_TEXT_MENU((Class<? extends bY>)cx.class), 
    @SerializedName("loadMacros")
    LOAD_MACROS((Class<? extends bY>)cw.class), 
    @SerializedName("createUpdateMacro")
    CREATE_UPDATE_MACRO((Class<? extends bY>)cu.class), 
    @SerializedName("deleteMacro")
    DELETE_MACRO((Class<? extends bY>)cv.class), 
    @SerializedName("requestP2PJoin")
    REQUEST_P2P_JOIN((Class<? extends bY>)dF.class), 
    @SerializedName("acceptP2PJoin")
    ACCEPT_P2P_JOIN((Class<? extends bY>)dB.class), 
    @SerializedName("prepareP2P")
    PREPARE_P2P((Class<? extends bY>)dD.class), 
    @SerializedName("punchHole")
    PUNCH_HOLE((Class<? extends bY>)dE.class), 
    @SerializedName("closeP2P")
    CLOSE_P2P((Class<? extends bY>)dC.class);
    
    @Nullable
    private final Class<? extends bY> model;
    
    private bV(final Class<? extends bY> model) {
        this.model = model;
    }
    
    @NotNull
    public Class<? extends bY> getModel() {
        if (this.model == null) {
            throw new IllegalArgumentException("can't call this on CallType.CALLBACK");
        }
        return this.model;
    }
    
    private static /* synthetic */ bV[] $values() {
        return new bV[] { bV.CALLBACK, bV.READY_FOR_MESSAGES, bV.RECORD_KEYS, bV.RENDER_MOD, bV.REMOVE_RENDER_MOD, bV.SET_SCALE_PERCENTAGE, bV.SET_UI_COLORS, bV.PAGE_UPDATE, bV.LOAD_HOMEPAGE_SELECTIONS, bV.PRESS_BUTTON, bV.OPEN_FEATHER_MODS, bV.OPEN_HOMEPAGE, bV.CLOSE_HOMEPAGE, bV.LOAD_CLIENT_PREFERENCES, bV.UPDATE_CLIENT_PREFERENCES, bV.LOAD_MOD_PROFILE_LIST, bV.LOAD_MOD_PROFILE, bV.CREATE_MOD_PROFILE, bV.SELECT_MOD_PROFILE, bV.RENAME_MOD_PROFILE, bV.CLONE_MOD_PROFILE, bV.DELETE_MOD_PROFILE, bV.BUILD_MOD_SETTINGS, bV.UPDATE_MOD_SETTINGS, bV.RESET_MOD_SETTINGS, bV.RESET_MOD_POSITIONS, bV.DISABLED_MODS, bV.BUILD_SIDEBAR_SETTINGS, bV.LOAD_SIDEBAR_SETTINGS, bV.UPDATE_SIDEBAR_SETTINGS, bV.RESET_SIDEBAR_SETTINGS, bV.OPEN_COSMETICS, bV.BUILD_COSMETICS_MENU, bV.LOAD_COSMETICS_SETTINGS, bV.UPDATE_COSMETICS, bV.RESET_COSMETICS_SETTINGS, bV.OPEN_HUD_SELECTION, bV.CLOSE_HUD_SELECTION, bV.LOAD_HUD_SELECTION, bV.DO_HUD_SELECTION, bV.DRM_REQUEST, bV.ACCOUNT_SWITCH_DETAILS, bV.LOAD_ACCOUNT_LIST, bV.CHANGE_ACCOUNT, bV.OPEN_WAYPOINTS_MENU, bV.LOAD_WAYPOINTS, bV.CREATE_UPDATE_WAYPOINT, bV.DELETE_WAYPOINT, bV.OPEN_AUTO_TEXT_MENU, bV.LOAD_MACROS, bV.CREATE_UPDATE_MACRO, bV.DELETE_MACRO, bV.REQUEST_P2P_JOIN, bV.ACCEPT_P2P_JOIN, bV.PREPARE_P2P, bV.PUNCH_HOLE, bV.CLOSE_P2P };
    }
    
    static {
        $VALUES = $values();
    }
}
