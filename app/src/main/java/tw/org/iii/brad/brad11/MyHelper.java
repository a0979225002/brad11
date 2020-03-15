package tw.org.iii.brad.brad11;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

//建立內部自己的sql,跟網路沒關西的sql
public class MyHelper extends SQLiteOpenHelper {
    private  final String createTable= //建立資料表
                        "CREATE TABLE cust (id integer primary key autoincrement," +
                                "cname text,tel text,birthday date)";
    public MyHelper(@Nullable Context context,
                    @Nullable String name,
                    @Nullable SQLiteDatabase.CursorFactory factory,
                    int version) {
        super(context, name, factory, version);
    }

    //起始點
    @Override
    //                  他幫我們輔助創出資料庫了
    public void onCreate(SQLiteDatabase db) {
        Log.v("brad","123");
        //創立資料表table
        db.execSQL(createTable);
    }
    //更新的資料庫版本,出現版本是更新的會到這裡執行
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
