package ca.collegeuniversel.budgetbuddy.presistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String NAME = "budget_buddy.db";
    private static final int VERSION = 1;

    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        String command = "CREATE TABLE expenses ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
                + "title TEXT NOT NULL, "
                + "amont DOUBLE NOT NULL, "
                + "category TEXT NOT NULL);";
        database.execSQL(command);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {

    }
}
