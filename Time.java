public class Time {
    private byte min, sec;
    final byte UNDEF = -77; 

    {
        min = 0;
        sec = 0;
    }
    
    public Time(){};
    
    public Time(Number min, Number sec){
        setTime(min, sec);
    }

    public void setTime(Number min, Number sec){
        byte a = min.byteValue();
        byte b = sec.byteValue();
        if(b >= 0 && b <60 && a >= 0){
            this.min = a;
            this.sec = b;
        }else{
            this.min = UNDEF;
            this.sec = UNDEF;
        }
    }

    public byte getMin(){
        return min;
    }
    public byte getSec(){
        return sec;
    }
}
