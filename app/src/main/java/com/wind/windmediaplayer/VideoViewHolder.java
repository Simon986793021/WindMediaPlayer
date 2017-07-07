package com.wind.windmediaplayer;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bumptech.glide.Glide;
import com.xiao.nicevideoplayer.NiceVideoPlayer;
import com.xiao.nicevideoplayer.TxVideoPlayerController;

/**
 * Created by XiaoJianjun on 2017/5/21.
 */

public class VideoViewHolder extends RecyclerView.ViewHolder {

    private TxVideoPlayerController mController;
    private NiceVideoPlayer mVideoPlayer;

    public VideoViewHolder(View itemView) {
        super(itemView);
        mVideoPlayer = (NiceVideoPlayer) itemView.findViewById(R.id.nice_video_player);
    }

    public void setController(TxVideoPlayerController controller) {
        mController = controller;
    }

    public void bindData(Video video) {
        mController.setTitle(video.getTitle());
        Glide.with(itemView.getContext())
                .load(video.getImageUrl())
                .into(mController.imageView());
        mVideoPlayer.setController(mController);
        mVideoPlayer.setUp(video.getVideoUrl(), null);
    }
}
