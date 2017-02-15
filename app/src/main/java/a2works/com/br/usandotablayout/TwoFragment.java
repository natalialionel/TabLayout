package a2works.com.br.usandotablayout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TwoFragment extends Fragment {

    private TextView textFragment;

    public TwoFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view =inflater.inflate(R.layout.fragment_two, container, false);

        textFragment =(TextView) view.findViewById(R.id.textFrag2);
        textFragment.setText("Two");

        return view;
    }



}
