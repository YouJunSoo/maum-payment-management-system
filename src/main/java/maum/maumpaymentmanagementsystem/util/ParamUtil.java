package maum.maumpaymentmanagementsystem.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class ParamUtil {
    public static Map<String, Object> getParameterMap(HttpServletRequest request){
        Map<String, Object> parameterMap = new HashMap<>();
        try{
            Enumeration<String> enums = request.getParameterNames();
            while (enums.hasMoreElements()){
                String paramName = (String) enums.nextElement();
                String[] parameters = request.getParameterValues(paramName);

                if(parameters.length > 1){
                    parameterMap.put(paramName, parameters);
                }else{
                    parameterMap.put(paramName, parameters[0]);
                }
            }
        }catch (Exception e){
        }
        return parameterMap;
    }

}
