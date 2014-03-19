appang-integration-ane
======================

앱팡 연동을 위한 Adobe Air용 ANE




* build
1) make .jar in ‘android’ project using eclipse or ADT.
2) ant build using as/build.xml
3) using ANE! that is as/bin/AppangIntegrationANE.ane



* add parts

- manifest in air project
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
<uses-permission android:name="android.permission.READ_PHONE_STATE"/>

<application>
…
	<activity android:name="com.nextapps.appangintegrationane.MainActivity"></activity> 
…


…

    	<extensionID>com.nextapps.appangintegrationane</extensionID>
    </extensions>
</application>




* call integrations

var ai:AppangIntegrationANE = new AppangIntegrationANE();
var key:String = avtertiseKey(get in appang)
ai.run(key);