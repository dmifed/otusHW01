-injars       target/otusHW01Name.jar
-outjars      target/otusHW01Name_obf.jar
-libraryjars <java.home>/jmods/java.base.jmod(!**.jar;!module-info.class)
-printseeds
-printmapping   obMap.map
-dontwarn

-keepclasseswithmembers public class * {
    public static void main(java.lang.String[]);
}