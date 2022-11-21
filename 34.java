package Assignment_03; //comment before run

class EMP{
    int id;
    String name;
    EMP(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        System.out.println(id);
        System.out.println(name);
        return "In EMP class";
    } 
}

class Scientist extends EMP{
    int no_of_publication,experience;
    Scientist(int id,String name,int no_of_publication,int experience){
        super(id,name);
        this.no_of_publication=no_of_publication;
        this.experience=experience;
    }
    public String toString(){
        System.out.println(no_of_publication);
        System.out.println(experience);
        return "In Scientist class";
    }
}

class DScientist extends Scientist{
    int award;
    DScientist(int id,String name,int no_of_publication,int experience,int award){
        super(id, name, no_of_publication, experience);
        this.award=award;
    }
    public String toString(){
        System.out.println(award);
        return "In DScientist class";
    }
}

public class qs4 {
    public static void main(String[] args) {
        int id=12,no_of_publication=29,experience=15,award=52;
        String name="SAYAN";
        EMP e=new EMP(id, name);
        Scientist s=new Scientist(id, name, no_of_publication, experience);
        DScientist d=new DScientist(id, name, no_of_publication, experience, award);
        e.toString();
        s.toString();
        d.toString();
    }
}
