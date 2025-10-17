package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_06_SaveablePerson;

public class Person implements Saveable{
    private String name;
    private String address;

    public void save(){
        System.out.println("Save me");
    }

    public void delete(){
        System.out.println("Delete my browsing history");
    }

    public void load(String address){
        this.address = address;
        System.out.println("This is now my address: " + this.address);
    }
}
