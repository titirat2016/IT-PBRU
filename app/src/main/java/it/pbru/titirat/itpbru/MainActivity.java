package it.pbru.titirat.itpbru;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MyManage myManage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Statement จบด้วยเซมิโคลอนเสมอ

        myManage = new MyManage(this);

        //test Add new user
        //myManage.addNewUser("123", "name", "sur", "user", "pass");

        //delete all sqlite
        deleteAllSQLite();

    } //Main Method

    private void deleteAllSQLite() {

        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        sqLiteDatabase.delete(MyManage.user_table, null, null);


    } //deleteAllSQLite

    public void clickSingUpMain(View view) {
      startActivity(new Intent(MainActivity.this,SignUpActivity.class));
    }
} // Main Class
