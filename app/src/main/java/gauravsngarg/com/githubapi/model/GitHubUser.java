package gauravsngarg.com.githubapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by GG on 26/02/18.
 */

public class GitHubUser {

    @SerializedName("login")
    private String login;

    @SerializedName("name")
    private String name;

    @SerializedName("followers")
    private String followers;

    @SerializedName("following")
    private String following;

    @SerializedName("email")
    private String email;

    @SerializedName("avatar_url")
    private String avatar;

    public GitHubUser(String login, String name, String followers, String following, String email, String avatar) {
        this.login = login;
        this.name = name;
        this.followers = followers;
        this.following = following;
        this.email = email;
        this.avatar = avatar;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
