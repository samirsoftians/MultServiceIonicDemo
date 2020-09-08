package cordova;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class MultService extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            
            this.coolMethod( callbackContext);
            return true;
        }
	else if (action.equals("coolMethod2")) {
            
            this.coolMethod2( callbackContext);
            return true;
        }
	
        return false;
    }

    


    private void coolMethod( CallbackContext callbackContext) {
        cordova.getActivity().startService(new Intent(cordova.getActivity(), MyService.class));
	
       
    }
	
	private void coolMethod2( CallbackContext callbackContext) {


        
       
	cordova.getActivity().startService(new Intent(cordova.getActivity(), MyService2.class));
       
    }
}
