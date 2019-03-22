package prinz.com.descent2edition;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import prinz.com.descent2edition.entities.Hero;

/**
 * Created by Prinz on 19.03.2019.
 */

public class CharakterActivity extends Fragment {

    //ListView lvCharakter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Charakter");


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_charakter,container, false);

        ListView lvCharakter = view.findViewById(R.id.lvCharakter);

        List<Hero> list =Arrays.asList(Hero.values());

        HeroAdapter heroAdapter = new HeroAdapter(list);

        lvCharakter.setAdapter(heroAdapter);


        return view;
    }

    class HeroAdapter extends BaseAdapter{

        List<Hero> heros;

        public HeroAdapter(List<Hero> heros){
            this.heros = heros;
        }

        @Override
        public int getCount() {
            return heros.size();
        }

        @Override
        public Object getItem(int i) {
            return heros.get(i);
        }

        @Override
        public long getItemId(int i) {
            return heros.get(i).ordinal();
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater(null).inflate(R.layout.hero_layout,null);
            TextView tvName = view.findViewById(R.id.tvName);
            TextView tvArchetyp = view.findViewById(R.id.tvArchetyp);

            tvName.setText(heros.get(i).getName());
            tvArchetyp.setText(heros.get(i).getArchetype().getName());

            Log.d("HERO",""+Hero.SHIVER.getName());

            return view;
        }
    }
}
