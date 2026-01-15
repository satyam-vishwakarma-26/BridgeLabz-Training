package com.BirdSanctuary;
// Uses reflection to read annotations
public class ReflectionUtil{
    public static void showDeveloperInfo(Class<?> cls){
        if(cls.isAnnotationPresent(DeveloperInfo.class)){
            DeveloperInfo info=cls.getAnnotation(DeveloperInfo.class);
            System.out.println("Developer:"+info.developer()+" Version:"+info.version());
        }
    }
}
