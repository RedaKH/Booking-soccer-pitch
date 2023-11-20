public class Personne {

   private String name;
  private  String username;
   private String password;

    private Role Role;

    public Personne(String name,String username,String password,Role role){

        this.name = name;
        this.username = username;
        this.password = password;
        this.role = Role;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
