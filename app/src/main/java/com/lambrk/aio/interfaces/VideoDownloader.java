package com.lambrk.aio.interfaces;

public interface VideoDownloader {

    String getVideoId(String link);

    void DownloadVideo();
}
