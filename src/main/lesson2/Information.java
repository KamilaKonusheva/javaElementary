package lesson2;

import java.util.*;


public class Information {
    private List<String> login;
    private Set<String> mail;
    private Map<String, String> userInfo;

    public Information() {
        login = new ArrayList<>();
        mail = new HashSet<>();
        userInfo = new HashMap<>();
    }

    public Information(List<String> login, Set<String> mail, Map<String, String> userInfo) {
        this.login = login;
        this.mail = mail;
        this.userInfo = userInfo;
    }

    public List<String> getLogin() {
        return login;
    }

    public void setLogin(List<String> login) {
        this.login = login;
    }

    public Set<String> getMail() {
        return mail;
    }

    public void setMail(Set<String> mail) {
        this.mail = mail;
    }

    public Map<String, String> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(Map<String, String> userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Information that = (Information) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(userInfo, that.userInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, mail, userInfo);
    }

    @Override
    public String toString() {
        return "Information{" +
                "login=" + login +
                ", mail=" + mail +
                ", userInfo=" + userInfo +
                '}';
    }
}