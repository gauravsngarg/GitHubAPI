package gauravsngarg.com.githubapi.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import gauravsngarg.com.githubapi.R;
import gauravsngarg.com.githubapi.model.GitHubUser;
import gauravsngarg.com.githubapi.rest.APIClient;
import gauravsngarg.com.githubapi.rest.GitHubUserEndPoints;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserActivity extends AppCompatActivity {

    public static final String USERNAMEINFO = "usernameinfo";

    @BindView(R.id.avatar)
    ImageView avatarImg;

    @BindView(R.id.userName)
    TextView userNameTV;

    @BindView(R.id.followers)
    TextView followersTV;

    @BindView(R.id.following)
    TextView followingTV;

    @BindView(R.id.email)
    TextView email;

    @BindView(R.id.logIn)
    TextView logIn;

    @BindView(R.id.ownedReposBtn)
    Button ownedrepos;

    Bundle extras;

    String userNameEntered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        extras = getIntent().getExtras();
        userNameEntered = extras.getString(USERNAMEINFO);

        ButterKnife.bind(this);

        loadData();
    }

    public void loadData() {
        final GitHubUserEndPoints apiService = APIClient.getClient().create(GitHubUserEndPoints.class);

        Call<GitHubUser> call = apiService.getUser(userNameEntered);

        call.enqueue(new Callback<GitHubUser>() {

            @Override
            public void onResponse(Call<GitHubUser> call, Response<GitHubUser> response) {
                if(response.body().getName() == null)
                    userNameTV.setText("Username: none");
                else
                userNameTV.setText("Username: " + response.body().getName());

                if(response.body().getFollowers() == null)
                    followersTV.setText("Followers: none");
                else
                    followersTV.setText("Followers" + response.body().getFollowers());

                if(response.body().getFollowing() == null)
                    followingTV.setText("following: none");
                else
                followingTV.setText("following" + response.body().getFollowing());

                if(response.body().getEmail() == null)
                    email.setText("email: none");
                else
                    email.setText("email: " + response.body().getEmail());
                logIn.setText("Login: " + response.body().getLogin());


            }

            @Override
            public void onFailure(Call<GitHubUser> call, Throwable t) {

            }
        });
    }
}
