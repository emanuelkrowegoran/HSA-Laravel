package emanuelkrowegoran.gmail.com.Login;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import emanuelkrowegoran.gmail.com.Form.ListActivity;

import emanuelkrowegoran.gmail.com.R;


public class HomeActivity extends MainActivity {
    TextView nameTv;
    TextView emailTv;
    Button logoutbtn;
    Button btnIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        init();
        setContentView(R.layout.activity_home);

        //link views
        getViews();
    }

    private void getViews() {
        nameTv = findViewById(R.id.name_username);
        nameTv.setText(sharedPreferences.getString("name",""));
        emailTv = findViewById(R.id.edt_username_login);
        emailTv.setText(sharedPreferences.getString("email",""));
        logoutbtn = findViewById(R.id.logoutBtn);
        btnIN = (Button) findViewById(R.id.btnin);

        btnIN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        //make logout
        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Redirect back to login page
                logout();
                Toast.makeText(context,"Logout Berhasil",Toast.LENGTH_SHORT).show();
                intent = new Intent(context,Login.class);
                //remove all previous stack activities
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });
    }

}
