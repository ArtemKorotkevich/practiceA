package by.andersen.practicTask.beans;

public class User {
    private int iduser;
    private String login;
    private String pass;
    private String role;

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (iduser != user.iduser) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (pass != null ? !pass.equals(user.pass) : user.pass != null) return false;
        if (role != null ? !role.equals(user.role) : user.role != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iduser;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
