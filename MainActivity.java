package bawei.com.clockview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bu_01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bu_01 = (Button) findViewById(R.id.bu_01);

        bu_01.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bu_01:
                getTime();
        }
    }

    public String getTime() {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date();
//        String time = format.format(date);
//        bu_01.setText(time);
        Calendar cal = Calendar.getInstance();
        // int dayOfWeek = Calendar.DAY_OF_WEEK;
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 1:
                return "星期一";
            case 2:
                return "星期二";
            case 3:
                return "星期三";
            case 4:
                return "星期四";
            case 5:
                return "星期五";
            case 6:
                return "星期六";
            case 7:
                return "星期日";
            default:
                return "";


        }
    }
}