package bi.konstrictor.urudandazauuid;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView txt_uuid;
    private String android_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_uuid = findViewById(R.id.txt_uuid);

        android_id = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
        txt_uuid.setText(android_id);
    }
    public void send(View view) {
//        Uri sms_uri = Uri.parse("smsto:+25775960696");
//        Intent sms_intent = new Intent(Intent.ACTION_SENDTO, sms_uri);
//        sms_intent.putExtra("sms_body", android_id);
//        startActivity(sms_intent);
    }
}