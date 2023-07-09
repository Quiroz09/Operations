package DataPerson;

public class DataPerson {
    public String name;
    public String age;
    public String country;
    public String gender;

    public String dataPerson(){
        return "\n" + this.name +"\n"+ this.age + "\n"+this.country + "\n" + this.gender;
    }
}
