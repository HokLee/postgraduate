package test.ljh.com.viewpagertest;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hoklee on 2016/3/17.
 */
public class MyAdapter extends BaseAdapter {
    List<ItemBean> mList;
    LayoutInflater mInflager;

    public MyAdapter(Context context,List<ItemBean> list) {
        mList=list;
        mInflager=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            viewHolder=new ViewHolder();
            convertView=mInflager.inflate(R.layout.item,null);
            viewHolder.imageView=(ImageView)convertView.findViewById(R.id.image);
            viewHolder.title=(TextView)convertView.findViewById(R.id.title);
            viewHolder.content=(TextView)convertView.findViewById(R.id.content);
            convertView.setTag(viewHolder);

        }
        else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        ItemBean bean=mList.get(position);
        viewHolder.imageView.setImageResource(bean.ItemImageResouceID);
        viewHolder.title.setText(bean.ItemTitle);
        viewHolder.content.setText(bean.ItemContent);
        return convertView;
    }

    class ViewHolder{
        public ImageView imageView;
        public TextView title;
        public TextView content;
    }
}
