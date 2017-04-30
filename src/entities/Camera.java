package entities;

import org.lwjgl.input.Keyboard;
import org.lwjgl.util.vector.Vector3f;

public class Camera {
	
	private Vector3f position = new Vector3f(0, 5, 0);
	private float pitch = 10;	// high or low
	private float yaw;		// left or right
	private float roll;		// titled
	
	public Camera() {}
	
	public void move() {
		if (Keyboard.isKeyDown(Keyboard.KEY_UP)) {
			position.z -= 0.2f;
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
			position.z += 0.2f;
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
			position.x += 0.2f;
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
			position.x -= 0.2f;
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_U)) {
			position.y -= 0.2f;
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
			position.y += 0.2f;
		}
	
	}
 	
	public Vector3f getPosition() {
		return position;
	}

	public float getPitch() {
		return pitch;
	}

	public float getYaw() {
		return yaw;
	}

	public float getRoll() {
		return roll;
	}

}
