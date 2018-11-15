package plus.karjoo.cafebazaar.intents;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ActivityEventListener;


import android.content.Intent;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.app.Activity;

public class RNCafeBazaarIntentsModule extends ReactContextBaseJavaModule implements ActivityEventListener {
  private static final int OPEN_BAZAAR_REQUEST = 3620;
  private static final String E_OPEN_BAZAAR_INTENT_ERROR = "E_OPEN_BAZAAR_INTENT_ERROR";
  private static final String PACKAGE = "com.farsitel.bazaar";
  private static final String DATA = "bazaar://details?id=";

  public RNCafeBazaarIntentsModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "RNCafeBazaarIntents";
  }

  @ReactMethod
  public void showRatePackage(String packageName, Promise promise) {
    Intent intent = new Intent(Intent.ACTION_EDIT);
    intent.setData(Uri.parse(DATA + packageName));
    intent.setPackage(PACKAGE);

    try {
      getReactApplicationContext().startActivityForResult(intent, OPEN_BAZAAR_REQUEST, null);
      promise.resolve(true);
    } catch(ActivityNotFoundException e) {
      promise.reject(E_OPEN_BAZAAR_INTENT_ERROR, e);
    }
  }

  @Override
  public void onNewIntent(Intent intent) {
  }

  @Override
  public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent intent) {
  }
}
