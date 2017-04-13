package loginapp;

public enum option
{
  Admin,  Student;
  
  private option() {}
  
  public String value()
  {
    return name();
  }
  
  public static option fromvalue(String v)
  {
    return valueOf(v);
  }
}
