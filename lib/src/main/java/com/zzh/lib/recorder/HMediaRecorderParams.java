package com.zzh.lib.recorder;

import android.media.MediaRecorder;

public class HMediaRecorderParams {
    public static final HMediaRecorderParams DEFAULT = new HMediaRecorderParams();

    private int audioSource;
    private int outputFormat;
    private int audioEncoder;

    public HMediaRecorderParams() {
        setAudioSource(MediaRecorder.AudioSource.MIC);
        setOutputFormat(MediaRecorder.OutputFormat.DEFAULT);
        setAudioEncoder(MediaRecorder.AudioEncoder.AAC);
    }

    public int getAudioSource() {
        return audioSource;
    }

    /**
     * 设置音频数据源
     *
     * @param audioSource {@link MediaRecorder.AudioSource}
     * @return
     */
    public HMediaRecorderParams setAudioSource(int audioSource) {
        this.audioSource = audioSource;
        return this;
    }

    public int getOutputFormat() {
        return outputFormat;
    }

    /**
     * 设置输出格式
     *
     * @param outputFormat {@link MediaRecorder.OutputFormat}
     * @return
     */
    public HMediaRecorderParams setOutputFormat(int outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }

    public int getAudioEncoder() {
        return audioEncoder;
    }

    /**
     * 设置编码格式
     *
     * @param audioEncoder {@link MediaRecorder.AudioEncoder}
     * @return
     */
    public HMediaRecorderParams setAudioEncoder(int audioEncoder) {
        this.audioEncoder = audioEncoder;
        return this;
    }
}
