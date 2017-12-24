package com.giroux.kevin.dofustuff.commons.item;


public enum EffectName {
    UNKNOWN("un","unknown"),
    VITALITE("vi","vitalité"),
    AGILITE("ag","agilité"),
    AT("at","at"),
    BOU("bou","bou"),
    COUP_CRITIQUE("cc","couts critiques"),
    _CC("_cc","_cc"),
    CHANCE("ch","chance"),
    CHS("chs","chs"),
    CP("cp","cp"),
    DA("da","da"),
    DAF("daf","daf"),
    DC("dc","dc"),
    DD("dd","dd"),
    DE("de","de"),
    DEF("def","def"),
    DEG("deg","deg"),
    DF("df","df"),
    DFF("dff","dff"),
    DM("dm","dm"),
    DOMMAGE("dmg","dommage"),
    DN("dn","dn"),
    DNF("dnf","dnf"),
    DP("dp","dp"),
    DS("ds","ds"),
    DT("dt","dt"),
    DTF("dtf","dtf"),
    DW("dw","dw"),
    EPA("epa","epa"),
    EPM("epm","epm"),
    FORCE("fo","force"),
    FU("fu","fu"),
    IC("ic","ic"),
    IE("ie","ie"),
    II("ii","ii"),
    IN("in","in"),
    _LDV("_ldv","_ldv"),
    _LEL("_lel","_lel"),
    _LT("_lt","_lt"),
    _LTJ("_ltj","_ltj"),
    POINT_ACTION("pa","point d'action"),
    _PA("_pa","_pa"),
    PAC("pac","pac"),
    PB("pb","pb"),
    _PB("_pb","_pb"),
    PD("pd","pd"),
    POINT_DE_VIE("pdv","point de vie"),
    PI("pi","pi"),
    PIP("pip","pip"),
    POINT_MOUVEMENT("pm","point de mouvement"),
    PO("po","portée"),
    _PO("_po","_po"),
    PP("pp","pp"),
    PU("pu","pu"),
    PV("pv","point de vie"),
    PVA("pva","pva"),
    RA("ra","ra"),
    RAP("rap","rap"),
    RC("rc","rc"),
    RD("rd","rd"),
    RE("re","re"),
    REP("rep","rep"),
    RF("rf","rf"),
    RFP("rfp","rfp"),
    RM("rm","rm"),
    RN("rn","rn"),
    RNP("rnp","rnp"),
    RP("rp","rp"),
    RPA("rpa","rpa"),
    RPM("rpm","rpm"),
    RT("rt","rt"),
    RTP("rtp","rtp"),
    RV("rv","rv"),
    SAGESSE("sa","sagesse"),
    SO("so","so"),
    SU("su","su"),
    TA("ta","ta"),
    _TDL("_tdl","_tdl"),
    TI("ti","ti"),
    VA("va","va"),
    VE("ve","ve"),
    VF("vf","vf"),
    VN("vn","vn"),
    VT("vt","vt");


    /**
     * Nom court
     */
    private String shortName;
    /**
     * Nom longs
     */
    private String longName;

    EffectName(final String pShortName, final String pLongName){
        this.shortName = pShortName;
        this.longName = pLongName;
    }

    public static EffectName retrieveFromShortName(final String pShortName){
        for(EffectName effectName : EffectName.values()){
            if(effectName.shortName.equals(pShortName)){
                return effectName;
            }
        }
        return UNKNOWN;
    }

    public static EffectName retrieveFromLongName(final String pLongName){
        for(EffectName effectName : EffectName.values()){
            if(effectName.longName.equals(pLongName)){
                return effectName;
            }
        }
        return UNKNOWN;
    }

    public String getShortName() {
        return shortName;
    }
    public String getLongName() {
        return longName;
    }

}
