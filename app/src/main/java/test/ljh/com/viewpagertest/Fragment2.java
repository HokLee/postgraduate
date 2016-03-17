package test.ljh.com.viewpagertest;

import android.content.ClipData;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hoklee on 2016/3/16.
 */
public class Fragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag2,container,false);

        List<ItemBean> list=new ArrayList<>();
        for(int i=0;i<200;i++){
            list.add(new ItemBean(
                    R.mipmap.ic_launcher,
                    "标题",
                    "内容"
            ));
        }

        MyAdapter adapter=new MyAdapter(getActivity(),list);
        ListView listView=(ListView)view.findViewById(R.id.listview);
        listView.setAdapter(adapter);
        return view;
    }
}
