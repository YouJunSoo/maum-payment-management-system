package maum.maumpaymentmanagementsystem.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import maum.maumpaymentmanagementsystem.ajaxreturn.annotation.CheckCall;
import maum.maumpaymentmanagementsystem.ajaxreturn.annotation.EnumNeedLogin;
import maum.maumpaymentmanagementsystem.common.CommonCode;
import maum.maumpaymentmanagementsystem.common.ExceptionBase;
import maum.maumpaymentmanagementsystem.configuration.ApplicationConstans;
import maum.maumpaymentmanagementsystem.payment.PaymentController;
import maum.maumpaymentmanagementsystem.util.ParamUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/maum/payment")
public class Maum {

    private final String USER_SERVICE_TYPE = CommonCode.serviceType.MAUM;

    @Autowired
    PaymentController paymentController;

    @PostMapping("/create/order")
    @Operation(tags = "01. payment", summary = "주문 생성", description = "주문 생성")
    @CheckCall(needLogin = EnumNeedLogin.YES)
    public Map<String, Object> createOrder(HttpServletRequest request,
           @Parameter(name = "productName", in = ParameterIn.QUERY, description = "상품명", example = "송지은 모델") @RequestParam("productName") String productName,
           @Parameter(name = "price", in = ParameterIn.QUERY, description = "가격", example = "99000") @RequestParam("price") String price)
           throws ExceptionBase {
        Map<String, Object> param = ParamUtil.getParameterMap(request);
        param.put(ApplicationConstans.SERVICE_TYPE, USER_SERVICE_TYPE);
        return paymentController.createOrder(param);
    }
}
