package chen.com.mysqllite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteDatabase db=openOrCreateDatabase("stu.db", Context.MODE_PRIVATE,null);
        //Cursor c=db.query("stu",null,null,null,null,null,null);
        db.execSQL("create table stu (_id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, age SMALLINT)");

        //stu stu=new stu();
        //stu.name="cgy";
        //stu.age=18;
        //db.execSQL("insert into stu values(null,?,?)",new Object[]{stu.name,stu.age});

    }
    class stu
    {
        String name;
        int age;
    }
}
