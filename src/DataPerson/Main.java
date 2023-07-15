package DataPerson;

import javax.lang.model.element.Name;

public class Main {
    public static void main(String[] args) {
        DataPerson dataPerson = new DataPerson();
        dataPerson.name = "Juan";
        dataPerson.age = "18 age";
        dataPerson.country = "Colombia";
        dataPerson.gender = "man";
        System.out.println("the data of the person are: "+dataPerson.dataPerson());
    }
}
