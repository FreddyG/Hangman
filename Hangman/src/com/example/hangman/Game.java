package com.example.hangman;

import java.util.ArrayList;



import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public class Game extends Activity {
	public TextView Moves;
	public TextView Theword;
	
	public int movesLeft = 5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		Moves = (TextView) findViewById(R.id.something);
		Moves.setText("MovesLeft : " + movesLeft);
		
		Theword = (TextView) findViewById(R.id.theword);
		Theword.setText("_ _ _ _ _ _");
		
		EditText editText = (EditText) findViewById(R.id.input);
		editText.setOnEditorActionListener(new OnEditorActionListener() {
		    @Override
		    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
		        boolean handled = false;
		        if (actionId == EditorInfo.IME_ACTION_SEND) {
		        	Moves.setText("MovesLeft2 : " + movesLeft);
		            handled = true;
		        }
		        return handled;
		    }

		
		});
	}
	
	
	
	
	
	
	
    public ArrayList<String> words = new ArrayList<String>();
    
	    
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game, menu);
		return true;
	}
	public void Exitgame(View v) {
      finish();
    }
	
	public void EvilSwitch(View v) {
	  finish();
	}
	
	public void Restartgame(View v) {
	  movesLeft = 10;
	  Moves.setText("MovesLeft : " + movesLeft);
	}

}
