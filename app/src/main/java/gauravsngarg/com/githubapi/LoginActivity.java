package gauravsngarg.com.githubapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String USERNAMEINFO = "usernameinfo";

    @BindView(R.id.input_username)
    EditText username;

    @BindView(R.id.btn_login)
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_login){
            Intent i = new Intent(LoginActivity.this, UserActivity.class);
            i.putExtra(USERNAMEINFO, username.getText().toString());
            startActivity(i);
        }
    }
}
