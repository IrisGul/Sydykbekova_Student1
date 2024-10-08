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
        this.name=name;
    }
    public void setAlter(int alter)
    {
        this.alter=alter;
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
        System.out.println(name+ " "+ alter + " " + religion+ " " + matura + ";");
    }
}
