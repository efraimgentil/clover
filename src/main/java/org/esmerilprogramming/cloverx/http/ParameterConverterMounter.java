package org.esmerilprogramming.cloverx.http;

import java.util.HashMap;
import java.util.Map;

import org.esmerilprogramming.cloverx.http.converter.CommonsParamConverter;
import org.esmerilprogramming.cloverx.http.converter.ModelConverter;
import org.esmerilprogramming.cloverx.http.converter.ParameterConverter;
import org.esmerilprogramming.cloverx.http.converter.PrimitiveParamConverter;

public class ParameterConverterMounter {
  
   public Map<String, ParameterConverter> identifyParametersTranslators( String[] parameterNames, Class<?>[] parameterTypes ){
     Map<String, ParameterConverter> translatorMap = new HashMap<>();
     for (int i = 0 ; i < parameterTypes.length ; i++) {
       Class<?> clazz = parameterTypes[i];
       ParameterConverter translator = getTranslator(clazz);
       translatorMap.put( parameterNames[i], translator);
     }
     return translatorMap;
   }
   
   public ParameterConverter getTranslator( Class<?> clazz ){
     if(PrimitiveParamConverter.isPrimitive(clazz))
         return new PrimitiveParamConverter().getConveter(clazz);
     if(CommonsParamConverter.isCommonParam(clazz))
         return new CommonsParamConverter().getConveter(clazz);
     else
         return new ModelConverter();
 }
   
}
