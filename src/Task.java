
public class Task {
    
    protected String name, description;
    
    public Task(String nm, String d){
        name = nm;
        description = d;
    }

    public boolean validate() {
        if (name == null || description == null || name.equals("") || description.equals("")) return false;
        else return true;
    }
    
    public String toString(){
        return "Name: " + name + "\nDescription: " + description + "\n========\n";
    }
    
    //getter & setter for name
    public void setName(String nm) {
            name = nm;
    }
    public String getName() {
        return name;
    }
    
    //getter & setter for description
    public void setDescription(String d) {
            description = d;
    }
    public String getDescription() {
        return description;
    }
}
