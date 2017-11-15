package mcgee.memegenerator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BotMemeFragment extends Fragment {

    //define widget variables
    private static TextView mTopTV;
    private static TextView mBotTV;

    public BotMemeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_bot_meme, container, false);

        //get reference to the widget
        mTopTV = (TextView) view.findViewById(R.id.topTV);
        mBotTV = (TextView) view.findViewById(R.id.botTV);

        return view;
    }

    public void setMemeText(String top, String bot) {
        mTopTV.setText(top);
        mBotTV.setText(bot);
    }
}
