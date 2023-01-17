package maum.maumpaymentmanagementsystem.payment;

import maum.maumpaymentmanagementsystem.ajaxreturn.annotation.CheckCall;
import maum.maumpaymentmanagementsystem.ajaxreturn.annotation.EnumNeedLogin;
import maum.maumpaymentmanagementsystem.common.ExceptionBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @CheckCall(needLogin = EnumNeedLogin.NO)
    public Map<String, Object> createOrder(Map<String, Object> param) throws ExceptionBase {

        return AjaxReturnUtil.makeSuccess(paymentSErvice.createOrder(param));
    }
}
