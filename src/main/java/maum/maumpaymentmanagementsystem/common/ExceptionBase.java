package maum.maumpaymentmanagementsystem.common;

import lombok.Data;
import lombok.EqualsAndHashCode;
import maum.maumpaymentmanagementsystem.enums.EnumExceptionBase;

@Data
@EqualsAndHashCode(callSuper = false)
public class ExceptionBase extends Exception {
    private static final long serialVersionUid = -4893402395748023439L;
    private String code = "";
    private String desc = "";
    private Object data = "";
    private Exception e;
    private EnumExceptionBase enumCode;

    public ExceptionBase() {
    }

    public ExceptionBase (ExceptionBase e){
        this.code = e.getCode();
        this.desc = e.getDesc();
        this.enumCode = e.getEnumCode();
        this.data = e.data;
        this.e = e;
    }

    public ExceptionBase (EnumExceptionBase code){
        this.code = code.getcode();
        this.desc = code.getDesc();
        this.enumCode = code;
    }

    public ExceptionBase(Exception e, EnumExceptionBase code, Object data){
        this.e = e;
        this.code = code.getcode();
        this.desc = code.getDesc();
        this.data = data;
        this.enumCode = code;
    }

    public ExceptionBase( Exception e, EnumExceptionBase code){
        this.e = e;
        this.code = code.getcode();
        this.desc = code.getDesc();
        this.enumCode = code;
    }

    @Override
    public String toString() {
        return "ExceptionBase [code=" + code + ", desc=" + desc + ", data=" + data + ", e=" + e + ", enumCode=" + enumCode + "]";
    }

}
