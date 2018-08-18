package com.example.monkey.carviedocommunitydemo.Utils;

import android.content.Context;
import android.content.SharedPreferences;


import com.qiniu.pili.droid.shortvideo.PLCameraSetting;

import static android.content.Context.MODE_PRIVATE;

public class SharedPeferenceSaveAndRead {

    private static void savePreference(Context context, String prefName, String columName, String msg) {
        SharedPreferences.Editor editor = context.getSharedPreferences(prefName, MODE_PRIVATE).edit(); // 获取编辑器
        editor.putString(columName, msg);
        editor.apply(); // 提交修改
    }

    public static void saveCameraOpenSide(Context context, PLCameraSetting.CAMERA_FACING_ID cameraFacingId) {
        if (cameraFacingId == PLCameraSetting.CAMERA_FACING_ID.CAMERA_FACING_3RD) {
            savePreference(context, "CameraSide", "cameraside", "CAMERA_FACING_3RD");
        } else if (cameraFacingId == PLCameraSetting.CAMERA_FACING_ID.CAMERA_FACING_FRONT) {
            savePreference(context, "CameraSide", "cameraside", "CAMERA_FACING_FRONT");
        } else if (cameraFacingId == PLCameraSetting.CAMERA_FACING_ID.CAMERA_FACING_BACK) {
            savePreference(context, "CameraSide", "cameraside", "CAMERA_FACING_BACK");
        }
    }

    public static PLCameraSetting.CAMERA_FACING_ID readCameraOpenSide(Context context) {
        SharedPreferences pref = context.getSharedPreferences("CameraSide", MODE_PRIVATE);
        String cameraFacingId = pref.getString("cameraside", "");
        if (cameraFacingId.equals("CAMERA_FACING_3RD")) {
            return PLCameraSetting.CAMERA_FACING_ID.CAMERA_FACING_3RD;
        } else if (cameraFacingId.equals("CAMERA_FACING_FRONT")) {
            return PLCameraSetting.CAMERA_FACING_ID.CAMERA_FACING_FRONT;
        } else
            return PLCameraSetting.CAMERA_FACING_ID.CAMERA_FACING_BACK;
    }

}
