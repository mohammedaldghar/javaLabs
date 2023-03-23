
import java.util.function.Function;
public class Main {
    public static void main(String[] args) {
    /*
    NUM 1 :
    float celi=20;
    ConvertToFehrnhiet obj= new ConvertToFehrnhiet();
    System.out.println(obj.apply(celi));*/

        Formula f = new Formula();
        Convert c = new Convert();
        f.a=5;
        f.b=10;
        f.c=4;
        Root r = c.apply(f);
        System.out.println(r.pos);
        System.out.println(r.neg);

    }
}
class Formula{
protected  double a;
    double b;
    double c;
}
class Root{
    double pos;
    double neg;
}
class Convert implements Function<Formula,Root>{
    @Override
    public Root apply(Formula formula) {
        Root result= new Root();
        result.pos= ((-formula.b)+Math.sqrt((formula.b* formula.b)-(4* formula.a* formula.c)))/(2* formula.a);
        result.neg= ((-formula.b)-Math.sqrt((formula.b* formula.b)-(4* formula.a* formula.c)))/(2* formula.a);
        return result;
    }
}

//NUM 1 :
class ConvertToFehrnhiet implements Function<Float,Double>{

    @Override
    public Double apply(Float celi) {
        double result =(celi* 9/5)+32;
        return result;
    }

}

