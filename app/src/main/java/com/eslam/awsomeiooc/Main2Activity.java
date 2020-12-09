package com.eslam.awsomeiooc;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    ListView listView;
    String[] names = {"Eslam Mohammed", "Israa Hagag", "Hazobol"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.list1);

        cutomerAdaptetrlist adaptetr = new cutomerAdaptetrlist(this, names);
        listView.setAdapter(adaptetr);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(Main2Activity.this, names[position], Toast.LENGTH_SHORT).show();

            }
        });
    }

    class cutomerAdaptetrlist extends ArrayAdapter<String> {
        Context context;
        String[] Aname;

        cutomerAdaptetrlist(Context c, String[] name1) {
            super(c, R.layout.row, R.id.textlist, name1);
            this.context = c;
            this.Aname = name1;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            LayoutInflater myinflator=getLayoutInflater();
//            View view = myinflator.inflate(R.layout.row,(ViewGroup) findViewById(R.id.linearLayout));
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            TextView textView = row.findViewById(R.id.textlist);
            textView.setText(Aname[position]);
            return super.getView(position, convertView, parent);


        }
    }
}
