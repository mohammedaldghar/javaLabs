public class OwenException {
    private int age;

    public void setAgeNeg(int age)throws Exception {
        if (age<0){
            throw new Exception("Age shouldn't be negative ");
        }
    }

    public void setAgeAsZero(int age) throws Exception{
        if (age==0){
            throw new Exception("Age shouldn't be zero ");
        }
    }

    public void setAgeEmpty(String age)throws Exception {

        throw new Exception("Age shouldn't be Empty");
    }
    public void setAgeString(String age)throws Exception {

        throw new Exception("Age shouldn't be String");
    }
}
