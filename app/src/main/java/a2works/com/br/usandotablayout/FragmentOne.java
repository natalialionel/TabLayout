package a2works.com.br.usandotablayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lionel on 15/02/17.
 */

public class FragmentOne extends Fragment {

    private  TextView textFragment;

    public FragmentOne() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_one, container, false);

        textFragment =(TextView) view.findViewById(R.id.textFrag1);
        textFragment.setText("One");

        return view;
    }
}
