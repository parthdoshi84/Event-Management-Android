package com.example.admin.eventmanagementapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/*import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
*/
public class RegisterLogIn extends AppCompatActivity implements View.OnClickListener {
    EditText username;
    EditText password;
    EditText cpass;
    EditText college;
    EditText city;
    EditText mobile;
    EditText email;
    Button login;
    User user = new User();
    dbHandler db;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setTitle("Rgister/SignIn");

        login = (Button) findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = (EditText) findViewById(R.id.username);
                password = (EditText) findViewById(R.id.password);
                cpass = (EditText) findViewById(R.id.cpass);
                college = (EditText) findViewById(R.id.college);
                city = (EditText) findViewById(R.id.city);
                mobile = (EditText) findViewById(R.id.mobile);
                email = (EditText) findViewById(R.id.email);
                user.setUsername(username.getText().toString());
                user.setPassword(password.getText().toString());
                user.setCpass(cpass.getText().toString());
                user.setCollege(college.getText().toString());
                user.setCity(city.getText().toString());
                user.setMobile(mobile.getText().toString());
                user.setEmail(email.getText().toString());
                db = new dbHandler(this, null, null, 1);
                db.addRow(user);
                username.setText(db.print(user.getUsername().toString(), user.getPassword().toString()));
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}

 /*       // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public void onClick(View v) {


    }

    @Override
    /*public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "RegisterLogIn Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.admin.eventmanagementapplication/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "RegisterLogIn Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.admin.eventmanagementapplication/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }



    /*public void dbconnection()
    {
        try{
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            Class.forName("com.sql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,dbusername,dbpassword);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select Username,Password from proj2");
            ResultSetMetaData rst  = rs.getMetaData();
            while(rs.next())
            {
                userHold = rs.getString(2);
                passHold = rs.getString(3);
            }
            userinfo.setText(userHold);
            passinfo.setText(passHold);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
*/