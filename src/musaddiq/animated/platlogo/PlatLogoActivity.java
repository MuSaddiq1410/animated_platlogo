package musaddiq.animated.platlogo;

import musaddiq.animated.platlogo.R;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class PlatLogoActivity extends Activity {

	// Declaring an Image View and an Animation Drawable
	ImageView view;
	ImageView view1;
	AnimationDrawable frameAnimation;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_platlogo);

		// Typecasting the Image View
		view = (ImageView) findViewById(R.id.image1);


		// Setting animation_list.xml as the background of the image view

		view.setBackgroundResource(R.drawable.anim_list);

		// Typecasting the Animation Drawable
		frameAnimation = (AnimationDrawable) view.getBackground();
	}

	// Called when Activity becomes visible or invisible to the user
	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		if (hasFocus) {
			// Starting the animation when in Focus
			frameAnimation.start();
		} else {
			// Stoping the animation when not in Focus
			frameAnimation.stop();
		}
	}

}
