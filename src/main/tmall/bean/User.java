package tmall.bean;

public class User {
    private String password;
    private String name;
    private int id;

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAnonymousName(){
        if(null==this.name){
            return null;
        }
        if(name.length()<=1){
            return "*";
        }
        if(name.length()==2){
            return name.substring(0, 1)+"*";
        }
        char[] cs = this.name.toCharArray();
        for(int i=1; i<cs.length-1; i++){
            cs[i] = '*';
        }
        return new String(cs);
    }
}
