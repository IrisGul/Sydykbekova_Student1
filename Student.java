public class Student
{
    private String name;
    private int alter;
    private String religion;
    private boolean matura;
    //Konstruktor
    /*
     * name="unknow"
     * alter=14
     * religion="OB"
     * matura=false
     */
    public Student(String name, int alter, String religion, boolean matura)
    {
      setName(name);
      setAlter(alter);
      setReligion(religion);
      setMatura(matura);
    }
    public Student(String name, int alter,String religion)
    {
        setName(name);
        setAlter(alter);
        setReligion(religion);
        setMatura(false);
    }
    public Student(String name, int alter)
    {
        setName(name);
        setAlter(alter);
        setReligion("OB");
        setMatura(false);
    }
    public Student(String name)
    {
        setName(name);
        setAlter(14);
        setReligion("OB");
        setMatura(false);
    }
    public Student()
    {
        setName("unknow");
        setAlter(14);
        setReligion("OB");
        setMatura(false);
    }
    // setMethode
    public void setName(String name)
    {
        if(name != null)
        {
              this.name=name;
        }
        else{
            System.out.println("Fehler:Kein name!");
            this.name="unknow";
        }
    }
    // Parameter Prüfung im SetMethode
    public void setAlter(int alter)
    {
        if((alter>=13) && (alter<=50))
        {
        this.alter=alter;
        }else
        {
            System.out.println("Fehler: ungültiges Alter!");
            this.alter=13;
        }
    }
    public void setReligion(String religion)
    {
        this.religion=religion;
    }
    public void setMatura(boolean matura)
    {
        this.matura=matura;
    }
    // getMethode
    public String getName()
    {
        return name;
    }
    public int getAlter()
    {
        return alter;
    }
    public String getReligion()
    {
        return religion;
    }
    public boolean getMatura()
    {
        return matura;
    }
    // printMethode
    public void printStudent()
    {
        System.out.println("Student: " + name+ " "+ alter + " Jahre Alt, Religion: " + religion + " Matura: " + matura + ";");
    }
}
