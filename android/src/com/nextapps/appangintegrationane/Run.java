package com.nextapps.appangintegrationane;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;
import com.nextapps.nasrun.NASRun;

public class Run implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] arg1) {
		String key = "";
		Log.d("AI", "run method called");
        try {
        	key = arg1[0].getAsString();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (FRETypeMismatchException e) {
            e.printStackTrace();
        } catch (FREInvalidObjectException e) {
            e.printStackTrace();
        } catch (FREWrongThreadException e) {
            e.printStackTrace();
            
        }
        
        Log.d("AI", context.getActivity().getApplicationContext().toString());
        Log.d("AI", key);
        
        /*
        Intent i = new Intent(context.getActivity().getApplicationContext(), MainActivity.class);
        i.putExtra("key", key);
        context.getActivity().startActivity(i);
        */
        NASRun.run(context.getActivity().getApplicationContext(), key);
        return null;
	}

}
