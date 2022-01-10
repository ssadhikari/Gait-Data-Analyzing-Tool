package com.jme3.system.osvr.osvrclientreporttypes;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OSVR_AccelerationState extends Structure {
	/** C type : OSVR_LinearAccelerationState */
	public OSVR_Vec3 linearAcceleration;
	/** C type : OSVR_CBool */
	public byte linearAccelerationValid;
	/** C type : OSVR_AngularAccelerationState */
	public OSVR_IncrementalQuaternion angularAcceleration;
	/** C type : OSVR_CBool */
	public byte angularAccelerationValid;
	public OSVR_AccelerationState() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("linearAcceleration", "linearAccelerationValid", "angularAcceleration", "angularAccelerationValid");
	}
	/**
	 * @param linearAcceleration C type : OSVR_LinearAccelerationState<br>
	 * @param linearAccelerationValid C type : OSVR_CBool<br>
	 * @param angularAcceleration C type : OSVR_AngularAccelerationState<br>
	 * @param angularAccelerationValid C type : OSVR_CBool
	 */
	public OSVR_AccelerationState(OSVR_Vec3 linearAcceleration, byte linearAccelerationValid, OSVR_IncrementalQuaternion angularAcceleration, byte angularAccelerationValid) {
		super();
		this.linearAcceleration = linearAcceleration;
		this.linearAccelerationValid = linearAccelerationValid;
		this.angularAcceleration = angularAcceleration;
		this.angularAccelerationValid = angularAccelerationValid;
	}
	public OSVR_AccelerationState(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OSVR_AccelerationState implements Structure.ByReference {
		
	};
	public static class ByValue extends OSVR_AccelerationState implements Structure.ByValue {
		
	};
}
