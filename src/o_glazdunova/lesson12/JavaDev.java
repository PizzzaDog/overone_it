package o_glazdunova.lesson12;

public class JavaDev implements Developer {

    public String writeCode() {// этой строкой мы говорим,что все программисты умеют писать код (т,е наследуют это от Developer)
        return "public static void main()";
    }
}