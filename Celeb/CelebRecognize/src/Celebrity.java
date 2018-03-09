import java.io.File;

public class Celebrity
{
    
    File f;
    String name;
    
    public Celebrity(File f, String name){
        this.f = f;
        this.name = name;
    }
    
    public File getFile() {
      return f;   
    }
    
    public String getName() {
     return name;   
    }
    
}
