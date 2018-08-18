package com.example.monkey.carviedocommunitydemo.Utils;

import com.qiniu.pili.droid.shortvideo.PLCameraSetting;
import com.qiniu.pili.droid.shortvideo.PLVideoEncodeSetting;

public class RecordSettings {

    public static final long DEFAULT_MIN_RECORD_DURATION = 2 * 1000;
    public static final long DEFAULT_MAX_RECORD_DURATION = 15 * 1000;

    public static final String[] PREVIEW_SIZE_RATIO_TIPS_ARRAY = {
            "16:9","4:3"
    };

    public static final String[] ENCODING_MODE_LEVEL_TIPS_ARRAY = {
            "HW",
            "SW"
    };

    public static final String[] PREVIEW_SIZE_LEVEL_TIPS_ARRAY = {
            "1080P",
            "1200P",
            "960P",
            "720P",
            "480P",
            "360P",
            "240P",
    };

    public static final String[] ENCODING_SIZE_LEVEL_TIPS_ARRAY = {
            "1440x1088",
            "1088x1088",
            "1280x720",
            "960x720",
            "720x720",
            "720x544",
            "544x544",
            "848x480",
            "640x480",
            "480x480",
            "640x360",
            "480x360",
            "360x360",
            "640x352",
            "352x352",
            "320x240",
            "240x240"
    };

    public static final String[] ENCODING_BITRATE_LEVEL_TIPS_ARRAY = {
            "8000Kbps",
            "4000Kbps",
            "2500Kbps",
            "2000Kbps",
            "1600Kbps",
            "1200Kbps",
            "1000Kbps",
            "800Kbps",
            "500Kbps"
    };

    public static final String[] ROTATION_LEVEL_TIPS_ARRAY = {
            "0（可用作去除视频旋转信息）",
            "90",
            "180",
            "270"
    };

    public static final String[] AUDIO_CHANNEL_NUM_TIPS_ARRAY = {
            "单声道",
            "双声道"
    };

    public static final PLCameraSetting.CAMERA_PREVIEW_SIZE_RATIO[] PREVIEW_SIZE_RATIO_ARRAY = {
            PLCameraSetting.CAMERA_PREVIEW_SIZE_RATIO.RATIO_16_9,
            PLCameraSetting.CAMERA_PREVIEW_SIZE_RATIO.RATIO_4_3
    };

    public static final PLCameraSetting.CAMERA_PREVIEW_SIZE_LEVEL[] PREVIEW_SIZE_LEVEL_ARRAY = {
            PLCameraSetting.CAMERA_PREVIEW_SIZE_LEVEL.PREVIEW_SIZE_LEVEL_1080P,
            PLCameraSetting.CAMERA_PREVIEW_SIZE_LEVEL.PREVIEW_SIZE_LEVEL_1200P,
            PLCameraSetting.CAMERA_PREVIEW_SIZE_LEVEL.PREVIEW_SIZE_LEVEL_960P,
            PLCameraSetting.CAMERA_PREVIEW_SIZE_LEVEL.PREVIEW_SIZE_LEVEL_720P,
            PLCameraSetting.CAMERA_PREVIEW_SIZE_LEVEL.PREVIEW_SIZE_LEVEL_480P,
            PLCameraSetting.CAMERA_PREVIEW_SIZE_LEVEL.PREVIEW_SIZE_LEVEL_360P,
            PLCameraSetting.CAMERA_PREVIEW_SIZE_LEVEL.PREVIEW_SIZE_LEVEL_240P,
    };

    public static final PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL[] ENCODING_SIZE_LEVEL_ARRAY = {
            /**
             * 1440x1088
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_1088P_2,
            /**
             * 1088x1088
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_1088P_1,
            /**
             * 1280x720
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_720P_3,
            /**
             * 960x720
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_720P_2,
            /**
             * 720x720
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_720P_1,
            /**
             * 720x544
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_544P_2,
            /**
             * 544x544
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_544P_1,
            /**
             * 848x480
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_480P_3,
            /**
             * 640x480
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_480P_2,
            /**
             * 480x480
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_480P_1,
            /**
             * 640x360
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_360P_3,
            /**
             * 480x360
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_360P_2,
            /**
             * 360x360
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_360P_1,
            /**
             * 640x352
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_352P_2,
            /**
             * 352x352
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_352P_1,
            /**
             * 320x240
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_240P_2,
            /**
             * 240x240
            */
            PLVideoEncodeSetting.VIDEO_ENCODING_SIZE_LEVEL.VIDEO_ENCODING_SIZE_LEVEL_240P_1,
    };

    public static final int[] ENCODING_BITRATE_LEVEL_ARRAY = {
            8000 * 1000,
            4000 * 1000,
            2500 * 1000,
            2000 * 1000,
            1600 * 1000,
            1200 * 1000,
            1000 * 1000,
            800 * 1000,
            500 * 1000,
    };

    public static final int[] ROTATION_LEVEL_ARRAY = {
            0,
            90,
            180,
            270,
    };

    public static final double[] RECORD_SPEED_ARRAY = {
            0.25,
            0.5,
            1,
            2,
            4,
    };

    public static final int[] AUDIO_CHANNEL_NUM_ARRAY = {
            1,
            2,
    };
}
