package com.lambrk.aio.models.dlapismodels;

import androidx.annotation.Keep;

@Keep
public class DownloaderOptions {
    private long httpChunkSize;

    public long getHTTPChunkSize() {
        return httpChunkSize;
    }

    public void setHTTPChunkSize(long value) {
        this.httpChunkSize = value;
    }
}
