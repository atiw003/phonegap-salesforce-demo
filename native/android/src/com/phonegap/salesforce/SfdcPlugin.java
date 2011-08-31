package com.phonegap.salesforce;

import java.net.URLDecoder;
import java.net.URLEncoder;

import org.json.JSONArray;

import com.phonegap.api.Plugin;
import com.phonegap.api.PluginResult;

public class SfdcPlugin extends Plugin {

	@Override
	public PluginResult execute(String action, JSONArray args, String callbackId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean onOverrideUrlLoading(String url) {
		this.ctx.loadUrl("file:///android_asset/www/index.html?" + url.split("#")[1]);
		return true;
	}
}