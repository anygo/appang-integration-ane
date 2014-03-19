package com.nextapps.appangintegrationane
{
	
	import flash.events.EventDispatcher;
	import flash.external.ExtensionContext;
	
	public class AppangIntegrationANE extends EventDispatcher {  
		
		private var context:ExtensionContext;
		
		public function AppangIntegrationANE():void{
			try{
				context = ExtensionContext.createExtensionContext("com.nextapps.appangintegrationane", null);
			}catch(e:Error){
				trace(e.message);
			}
		}
		
		public function run(key:String):void{
			context.call("run", key);
		}
		
	}
}