package com.example.Log.Log.domian;


public class Error {
	
	public static String appName;
	//public static HashMap<String, String> errorSummery = new HashMap<String, String>();
	//public ArrayList<String> err = new ArrayList<>()
	@SuppressWarnings("unused")
	public static void addNewError(String temp) {
		StringBuffer b=new StringBuffer();
		String errorType;
		int cuttIndex=temp.indexOf("-", 0);
		String coreCustom;//core or custom
		String errorCode;//error code
		String appName;//app name
	
		appName=temp.substring(0, cuttIndex-1);
		String coreCustomCode=temp.substring(cuttIndex-1, cuttIndex);
		if(coreCustomCode=="1") {
			coreCustom="core";
		}
		else coreCustom="custom";
		errorCode=temp.substring(cuttIndex+1, cuttIndex+7);//error code
		if((Integer.parseInt(errorCode)%10>=1)&&(Integer.parseInt(errorCode)%10<=3)) {
			errorType="critical";
		}
		else if((Integer.parseInt(errorCode)%10>=4)&&(Integer.parseInt(errorCode)%10<=6)) {
			errorType="error";
		}
		else errorType="warning";
		//errorSummery.put(appName, coreCustom);
		//System.out.println(errorSummery.hashCode());
	    System.out.println("App: "+appName+" "+coreCustom+" error code: "+errorCode+" error type : "+errorType);

		
	}
}
