package com.blueserial.Joystick;

public interface JoystickMovedListener {
	void OnMoved(int pan, int tilt);
	void OnReleased();
	void OnReturnedToCenter();
}
