package co.kr.hatchfly.hf.model;

public class User {

    String userid;
    String username;

    public User(String userid, String username) {
        this.userid=userid;
        this.username=username;
    }

    public String getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
