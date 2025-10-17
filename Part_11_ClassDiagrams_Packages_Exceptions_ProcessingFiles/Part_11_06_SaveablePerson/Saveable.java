package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_06_SaveablePerson;

public interface Saveable {
    void save();
    void delete();
    void load(String address);
}
