package com.github.wasiqb.coteafs.appium.android;

import com.github.wasiqb.coteafs.appium.device.DeviceElementActions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author wasiq.bhamla
 * @since 02-May-2017 6:31:57 PM
 */
public class AndroidDeviceElementActions extends DeviceElementActions <AndroidDriver <MobileElement>, AndroidDevice> {
	/**
	 * @author wasiq.bhamla
	 * @since 02-May-2017 6:32:14 PM
	 * @param device
	 * @param name
	 * @param element
	 */
	public AndroidDeviceElementActions (final AndroidDevice device, final String name, final MobileElement element) {
		super (device, name, element);
	}

	/*
	 * (non-Javadoc)
	 * @see com.github.wasiqb.coteafs.appium.device.DeviceElementActions#verifyThat()
	 */
	@Override
	public AndroidElementVerify verifyThat () {
		return new AndroidElementVerify (this);
	}
}