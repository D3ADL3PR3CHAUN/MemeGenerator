package mcgee.memegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String bot) {
        BotMemeFragment botMemeFragment = (BotMemeFragment) getSupportFragmentManager().findFragmentById(R.id.botFragment);
        botMemeFragment.setMemeText(top, bot);
    }

}
