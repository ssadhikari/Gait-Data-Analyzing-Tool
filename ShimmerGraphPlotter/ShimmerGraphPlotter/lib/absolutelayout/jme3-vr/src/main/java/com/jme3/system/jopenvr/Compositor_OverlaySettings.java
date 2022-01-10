package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1452</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class Compositor_OverlaySettings extends Structure {
	public int size;
	public byte curved;
	public byte antialias;
	public float scale;
	public float distance;
	public float alpha;
	public float uOffset;
	public float vOffset;
	public float uScale;
	public float vScale;
	public float gridDivs;
	public float gridWidth;
	public float gridScale;
	/** C type : HmdMatrix44_t */
	public HmdMatrix44_t transform;
	public Compositor_OverlaySettings() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("size", "curved", "antialias", "scale", "distance", "alpha", "uOffset", "vOffset", "uScale", "vScale", "gridDivs", "gridWidth", "gridScale", "transform");
	}
	public Compositor_OverlaySettings(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends Compositor_OverlaySettings implements Structure.ByReference {
		
	};
	public static class ByValue extends Compositor_OverlaySettings implements Structure.ByValue {
		
	};
}
