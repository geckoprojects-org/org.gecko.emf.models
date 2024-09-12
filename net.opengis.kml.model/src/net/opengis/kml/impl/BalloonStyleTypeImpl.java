/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package net.opengis.kml.impl;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.BalloonStyleType;
import net.opengis.kml.DisplayModeEnumType;
import net.opengis.kml.KMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Balloon Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.BalloonStyleTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BalloonStyleTypeImpl#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BalloonStyleTypeImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BalloonStyleTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BalloonStyleTypeImpl#getDisplayMode <em>Display Mode</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BalloonStyleTypeImpl#getBalloonStyleSimpleExtensionGroupGroup <em>Balloon Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BalloonStyleTypeImpl#getBalloonStyleSimpleExtensionGroup <em>Balloon Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BalloonStyleTypeImpl#getBalloonStyleObjectExtensionGroupGroup <em>Balloon Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BalloonStyleTypeImpl#getBalloonStyleObjectExtensionGroup <em>Balloon Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BalloonStyleTypeImpl extends AbstractSubStyleTypeImpl implements BalloonStyleType {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] COLOR_EDEFAULT = { (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff };

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected byte[] color = COLOR_EDEFAULT;

	/**
	 * This is true if the Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colorESet;

	/**
	 * The default value of the '{@link #getBgColor() <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BG_COLOR_EDEFAULT = { (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff };

	/**
	 * The cached value of the '{@link #getBgColor() <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected byte[] bgColor = BG_COLOR_EDEFAULT;

	/**
	 * This is true if the Bg Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bgColorESet;

	/**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] TEXT_COLOR_EDEFAULT = { (byte)0xff, 0x00, 0x00, 0x00 };

	/**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected byte[] textColor = TEXT_COLOR_EDEFAULT;

	/**
	 * This is true if the Text Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textColorESet;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayMode() <em>Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected static final DisplayModeEnumType DISPLAY_MODE_EDEFAULT = DisplayModeEnumType.DEFAULT;

	/**
	 * The cached value of the '{@link #getDisplayMode() <em>Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected DisplayModeEnumType displayMode = DISPLAY_MODE_EDEFAULT;

	/**
	 * This is true if the Display Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayModeESet;

	/**
	 * The cached value of the '{@link #getBalloonStyleSimpleExtensionGroupGroup() <em>Balloon Style Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalloonStyleSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap balloonStyleSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getBalloonStyleObjectExtensionGroupGroup() <em>Balloon Style Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalloonStyleObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap balloonStyleObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BalloonStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getBalloonStyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(byte[] newColor) {
		byte[] oldColor = color;
		color = newColor;
		boolean oldColorESet = colorESet;
		colorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.BALLOON_STYLE_TYPE__COLOR, oldColor, color, !oldColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetColor() {
		byte[] oldColor = color;
		boolean oldColorESet = colorESet;
		color = COLOR_EDEFAULT;
		colorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.BALLOON_STYLE_TYPE__COLOR, oldColor, COLOR_EDEFAULT, oldColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetColor() {
		return colorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getBgColor() {
		return bgColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBgColor(byte[] newBgColor) {
		byte[] oldBgColor = bgColor;
		bgColor = newBgColor;
		boolean oldBgColorESet = bgColorESet;
		bgColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.BALLOON_STYLE_TYPE__BG_COLOR, oldBgColor, bgColor, !oldBgColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBgColor() {
		byte[] oldBgColor = bgColor;
		boolean oldBgColorESet = bgColorESet;
		bgColor = BG_COLOR_EDEFAULT;
		bgColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.BALLOON_STYLE_TYPE__BG_COLOR, oldBgColor, BG_COLOR_EDEFAULT, oldBgColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBgColor() {
		return bgColorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getTextColor() {
		return textColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextColor(byte[] newTextColor) {
		byte[] oldTextColor = textColor;
		textColor = newTextColor;
		boolean oldTextColorESet = textColorESet;
		textColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.BALLOON_STYLE_TYPE__TEXT_COLOR, oldTextColor, textColor, !oldTextColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTextColor() {
		byte[] oldTextColor = textColor;
		boolean oldTextColorESet = textColorESet;
		textColor = TEXT_COLOR_EDEFAULT;
		textColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.BALLOON_STYLE_TYPE__TEXT_COLOR, oldTextColor, TEXT_COLOR_EDEFAULT, oldTextColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTextColor() {
		return textColorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.BALLOON_STYLE_TYPE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisplayModeEnumType getDisplayMode() {
		return displayMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayMode(DisplayModeEnumType newDisplayMode) {
		DisplayModeEnumType oldDisplayMode = displayMode;
		displayMode = newDisplayMode == null ? DISPLAY_MODE_EDEFAULT : newDisplayMode;
		boolean oldDisplayModeESet = displayModeESet;
		displayModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.BALLOON_STYLE_TYPE__DISPLAY_MODE, oldDisplayMode, displayMode, !oldDisplayModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDisplayMode() {
		DisplayModeEnumType oldDisplayMode = displayMode;
		boolean oldDisplayModeESet = displayModeESet;
		displayMode = DISPLAY_MODE_EDEFAULT;
		displayModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.BALLOON_STYLE_TYPE__DISPLAY_MODE, oldDisplayMode, DISPLAY_MODE_EDEFAULT, oldDisplayModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDisplayMode() {
		return displayModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBalloonStyleSimpleExtensionGroupGroup() {
		if (balloonStyleSimpleExtensionGroupGroup == null) {
			balloonStyleSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return balloonStyleSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getBalloonStyleSimpleExtensionGroup() {
		return getBalloonStyleSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getBalloonStyleType_BalloonStyleSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBalloonStyleObjectExtensionGroupGroup() {
		if (balloonStyleObjectExtensionGroupGroup == null) {
			balloonStyleObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return balloonStyleObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getBalloonStyleObjectExtensionGroup() {
		return getBalloonStyleObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getBalloonStyleType_BalloonStyleObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getBalloonStyleSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getBalloonStyleObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getBalloonStyleObjectExtensionGroup()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KMLPackage.BALLOON_STYLE_TYPE__COLOR:
				return getColor();
			case KMLPackage.BALLOON_STYLE_TYPE__BG_COLOR:
				return getBgColor();
			case KMLPackage.BALLOON_STYLE_TYPE__TEXT_COLOR:
				return getTextColor();
			case KMLPackage.BALLOON_STYLE_TYPE__TEXT:
				return getText();
			case KMLPackage.BALLOON_STYLE_TYPE__DISPLAY_MODE:
				return getDisplayMode();
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getBalloonStyleSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getBalloonStyleSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_SIMPLE_EXTENSION_GROUP:
				return getBalloonStyleSimpleExtensionGroup();
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getBalloonStyleObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getBalloonStyleObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_OBJECT_EXTENSION_GROUP:
				return getBalloonStyleObjectExtensionGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KMLPackage.BALLOON_STYLE_TYPE__COLOR:
				setColor((byte[])newValue);
				return;
			case KMLPackage.BALLOON_STYLE_TYPE__BG_COLOR:
				setBgColor((byte[])newValue);
				return;
			case KMLPackage.BALLOON_STYLE_TYPE__TEXT_COLOR:
				setTextColor((byte[])newValue);
				return;
			case KMLPackage.BALLOON_STYLE_TYPE__TEXT:
				setText((String)newValue);
				return;
			case KMLPackage.BALLOON_STYLE_TYPE__DISPLAY_MODE:
				setDisplayMode((DisplayModeEnumType)newValue);
				return;
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getBalloonStyleSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getBalloonStyleObjectExtensionGroupGroup()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KMLPackage.BALLOON_STYLE_TYPE__COLOR:
				unsetColor();
				return;
			case KMLPackage.BALLOON_STYLE_TYPE__BG_COLOR:
				unsetBgColor();
				return;
			case KMLPackage.BALLOON_STYLE_TYPE__TEXT_COLOR:
				unsetTextColor();
				return;
			case KMLPackage.BALLOON_STYLE_TYPE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case KMLPackage.BALLOON_STYLE_TYPE__DISPLAY_MODE:
				unsetDisplayMode();
				return;
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				getBalloonStyleSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				getBalloonStyleObjectExtensionGroupGroup().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KMLPackage.BALLOON_STYLE_TYPE__COLOR:
				return isSetColor();
			case KMLPackage.BALLOON_STYLE_TYPE__BG_COLOR:
				return isSetBgColor();
			case KMLPackage.BALLOON_STYLE_TYPE__TEXT_COLOR:
				return isSetTextColor();
			case KMLPackage.BALLOON_STYLE_TYPE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case KMLPackage.BALLOON_STYLE_TYPE__DISPLAY_MODE:
				return isSetDisplayMode();
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return balloonStyleSimpleExtensionGroupGroup != null && !balloonStyleSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_SIMPLE_EXTENSION_GROUP:
				return !getBalloonStyleSimpleExtensionGroup().isEmpty();
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return balloonStyleObjectExtensionGroupGroup != null && !balloonStyleObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.BALLOON_STYLE_TYPE__BALLOON_STYLE_OBJECT_EXTENSION_GROUP:
				return !getBalloonStyleObjectExtensionGroup().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (color: ");
		if (colorESet) result.append(color); else result.append("<unset>");
		result.append(", bgColor: ");
		if (bgColorESet) result.append(bgColor); else result.append("<unset>");
		result.append(", textColor: ");
		if (textColorESet) result.append(textColor); else result.append("<unset>");
		result.append(", text: ");
		result.append(text);
		result.append(", displayMode: ");
		if (displayModeESet) result.append(displayMode); else result.append("<unset>");
		result.append(", balloonStyleSimpleExtensionGroupGroup: ");
		result.append(balloonStyleSimpleExtensionGroupGroup);
		result.append(", balloonStyleObjectExtensionGroupGroup: ");
		result.append(balloonStyleObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //BalloonStyleTypeImpl
