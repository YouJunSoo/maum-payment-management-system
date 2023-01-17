package maum.maumpaymentmanagementsystem.ajaxreturn.annotation;

import maum.maumpaymentmanagementsystem.enums.EnumBase;
import maum.maumpaymentmanagementsystem.enums.EnumExceptionBase;

public enum EnumExceptionToken implements EnumExceptionBase {

    NEED_ACCESS_TOKEN   ("NEED_ACCESS_TOKEN", "Access Token이 필요함."),
    NOT_EXIST_ACCESSTOKEN   ("NOT_EXIST_ACCESSTOKEN", "Access Token이 존재하지 않음."),
    NOT_EXIST_REFRESHTOKEN   ("NOT_EXIST_REFRESHTOKEN", "Refresh Token이 존재하지 않음.."),
    NOT_VALIDATION_USERINFO   ("NOT_VALIDATION_USERINFO", "사용자 정보가 일치하지 않음."),
    REFRESH_EXPIRE   ("REFRESH_EXPIRE", "REFRESH 만료 되었음.."),
    EXPIRE   ("EXPIRE", "만료되었음.");

    private String code;
    private String desc;

    EnumExceptionToken(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public String getcode() {return code; }
    public String getDesc() {return desc; }

    @Override
    public EnumBase[] getValues() { return values(); }

    @Override
    public String getName() { return name(); }
}
