package ekatmkonnect.vritti.com.fcm_notification;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MyAndroidFirebaseInstanceIdService extends FirebaseInstanceIdService {

    /*private static final String TAG = "MyAndroidFCMIIDService";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        //Get hold of the registration token
        String token = FirebaseInstanceId.getInstance().getToken();

        //for now we are displaying the token in the log
        //copy it as this method is called only when the new token is generated
        //and usually new token is only generated when the app is reinstalled or the data is cleared
        Log.d("MyRefreshedToken", token);
    }
    private void sendRegistrationToServer(String token) {
        //Implement this method if you want to store the token on your server
    }*/

    private static final String TAG = "MyAndroidFCMIIDService";

    @Override
    public void onTokenRefresh() {
        //Get hold of the registration token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        //Log the token
        Log.d(TAG, "Refreshed token: " + refreshedToken);
    }
    private void sendRegistrationToServer(String token) {
        //Implement this method if you want to store the token on your server
    }

}
