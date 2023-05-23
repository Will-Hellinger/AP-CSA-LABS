public class Int{
    private int val;
  
    public Int(){
      val = 0;
    }
  
    public Int(int v){
      val = v;
    }
  
    public int getVal(){
      return val;
    }
  
    public void setVal(int v){
      val = v;
    }
  
    public String toString(){
      return ""+val;
    }
  }