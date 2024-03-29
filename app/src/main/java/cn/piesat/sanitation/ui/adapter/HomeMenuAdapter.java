package cn.piesat.sanitation.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import cn.piesat.sanitation.R;
import cn.piesat.sanitation.ui.view.banner.AutoSwitchAdapter;
import cn.piesat.sanitation.ui.view.banner.AutoSwitchView;


/**
 *
 */

public class HomeMenuAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<String> listData;

    public HomeMenuAdapter(Context context, ArrayList<String> listData) {
        this.context = context;
        this.listData = listData;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View bannerView = LayoutInflater.from(context).inflate(R.layout.item_banner, parent,false);
        View noticeView = LayoutInflater.from(context).inflate(R.layout.item_notice, parent,false);
        View newsView = LayoutInflater.from(context).inflate(R.layout.item_news, parent,false);

        if (viewType == TYPE_BANNER) return new BannerHolder(bannerView);
        if (viewType == TYPE_NOTICE) return new NoticeHolder(noticeView);
        return new NewsHolder(newsView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        switch (holder.getItemViewType()) {
            case TYPE_BANNER:
                bindBannerHolder((BannerHolder) holder, position);
                break;
            case TYPE_NOTICE:
                bindNoticeHolder((NoticeHolder) holder, position);
                break;
            case TYPE_NEWS:
                bindNewsHolder((NewsHolder) holder, position);
                break;
        }

    }

    private void bindBannerHolder(BannerHolder holder, int position) {
        ArrayList<String> im = new ArrayList<String>();
        im.add("");
        im.add("");
        im.add("");
        AutoSwitchAdapter mAdapter = new AutoSwitchAdapter(context, im);
        holder.loopswitch.setAdapter(mAdapter);
    }

    private void bindNoticeHolder(NoticeHolder holder, int position) {


    }

    private void bindNewsHolder(NewsHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 9;
    }


    public static final int TYPE_BANNER = 0;
    public static final int TYPE_NOTICE = 1;
    public static final int TYPE_NEWS = 2;

    @Override
    public int getItemViewType(int position) {
        if (position == TYPE_BANNER) return TYPE_BANNER;
        if (position == TYPE_NOTICE) return TYPE_NOTICE;
        return TYPE_NEWS;
    }

    class BannerHolder extends RecyclerView.ViewHolder {
        AutoSwitchView loopswitch;
        public BannerHolder(View itemView) {
            super(itemView);
            loopswitch=itemView.findViewById(R.id.loopswitch);
        }
    }

    class NoticeHolder extends RecyclerView.ViewHolder {

        public NoticeHolder(View itemView) {
            super(itemView);
        }
    }

    class NewsHolder extends RecyclerView.ViewHolder {

        public NewsHolder(View itemView) {
            super(itemView);
        }
    }

}
