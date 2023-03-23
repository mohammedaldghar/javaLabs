public class ComplexNumber<T extends Number> {
    T real;
    T img;

    public ComplexNumber add(ComplexNumber c){
        ComplexNumber result = new ComplexNumber();
        result.img = this.img.doubleValue()+c.img.doubleValue();
        result.real=this.real.doubleValue()+c.real.doubleValue();
        return result;
    }
    public ComplexNumber sub(ComplexNumber c){
        ComplexNumber result = new ComplexNumber();
        result.img = this.img.doubleValue()-c.img.doubleValue();
        result.real=this.real.doubleValue()-c.real.doubleValue();
        return result;
    }
    @Override
    public String toString() {
        return (real+"+"+img+"i");
    }
}
