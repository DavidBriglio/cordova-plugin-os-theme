package com.dbriglio.ostheme;

import android.content.res.Configuration;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONObject;

public class OsTheme extends CordovaPlugin {
  @Override
  public boolean execute(final String action, final JSONArray data, final CallbackContext callbackContext) {
    if (action.equals("getTheme")) {
      JSONObject theme = new JSONObject();

      boolean isDark = (cordova.getActivity().getResources().getConfiguration().uiMode
          & Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES;

      try {
        theme.put("isDark", isDark);
      } catch (Exception e) {
        callbackContext.error("Error setting 'isDark' JSON entry.");
        return true;
      }

      callbackContext.success(theme);

      return true;
    }

    return false;
  }
}