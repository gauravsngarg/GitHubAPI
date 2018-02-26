package gauravsngarg.com.githubapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

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
    }
}
