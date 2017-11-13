
package model;

public class PassManagerModel {
    
    private String desc;
    private String name;
    private String password;

    public PassManagerModel() {
    }

    public PassManagerModel(String desc, String name, String password) {
        this.desc = desc;
        this.name = name;
        this.password = password;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
