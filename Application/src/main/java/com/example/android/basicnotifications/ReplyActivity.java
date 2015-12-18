package com.example.android.basicnotifications;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.RemoteInput;
import android.util.Log;

public class ReplyActivity extends Activity
{
	private static final String EXTRA_VOICE_REPLY = "extra_voice_reply";

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reply);
		//
		Intent i = getIntent();
		String ms = (String) getMessageText(i);
		Log.i("Test", "Test");
		//
	}
	private CharSequence getMessageText(Intent intent) {
		Bundle remoteInput = RemoteInput.getResultsFromIntent(intent);
		if (remoteInput != null) {
			return remoteInput.getCharSequence(EXTRA_VOICE_REPLY);
		}
		return null;
	}
}
