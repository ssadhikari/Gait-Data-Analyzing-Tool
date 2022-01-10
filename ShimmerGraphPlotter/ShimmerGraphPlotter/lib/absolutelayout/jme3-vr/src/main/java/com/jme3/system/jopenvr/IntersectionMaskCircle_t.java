package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1552</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IntersectionMaskCircle_t extends Structure {
	public float m_flCenterX;
	public float m_flCenterY;
	public float m_flRadius;
	public IntersectionMaskCircle_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("m_flCenterX", "m_flCenterY", "m_flRadius");
	}
	public IntersectionMaskCircle_t(float m_flCenterX, float m_flCenterY, float m_flRadius) {
		super();
		this.m_flCenterX = m_flCenterX;
		this.m_flCenterY = m_flCenterY;
		this.m_flRadius = m_flRadius;
	}
	public IntersectionMaskCircle_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IntersectionMaskCircle_t implements Structure.ByReference {
		
	};
	public static class ByValue extends IntersectionMaskCircle_t implements Structure.ByValue {
		
	};
}
