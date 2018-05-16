import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view){
        EditText text = (EditText) findViewById(R.id.message);
        String title = getString(R.string.title);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String b = text.getText().toString();
        intent.putExtra(Intent.EXTRA_TEXT,b);
        Intent choosebox = Intent.createChooser(intent,title);
        startActivity(choosebox);
    }
}
