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

import net.opengis.kml.AbstractColorStyleType;
import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.ColorModeEnumType;
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
 * An implementation of the model object '<em><b>Abstract Color Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.AbstractColorStyleTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractColorStyleTypeImpl#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractColorStyleTypeImpl#getAbstractColorStyleSimpleExtensionGroupGroup <em>Abstract Color Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractColorStyleTypeImpl#getAbstractColorStyleSimpleExtensionGroup <em>Abstract Color Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractColorStyleTypeImpl#getAbstractColorStyleObjectExtensionGroupGroup <em>Abstract Color Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractColorStyleTypeImpl#getAbstractColorStyleObjectExtensionGroup <em>Abstract Color Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractColorStyleTypeImpl extends AbstractSubStyleTypeImpl implements AbstractColorStyleType {
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
	 * The default value of the '{@link #getColorMode() <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorMode()
	 * @generated
	 * @ordered
	 */
	protected static final ColorModeEnumType COLOR_MODE_EDEFAULT = ColorModeEnumType.NORMAL;

	/**
	 * The cached value of the '{@link #getColorMode() <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorMode()
	 * @generated
	 * @ordered
	 */
	protected ColorModeEnumType colorMode = COLOR_MODE_EDEFAULT;

	/**
	 * This is true if the Color Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colorModeESet;

	/**
	 * The cached value of the '{@link #getAbstractColorStyleSimpleExtensionGroupGroup() <em>Abstract Color Style Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractColorStyleSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractColorStyleSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getAbstractColorStyleObjectExtensionGroupGroup() <em>Abstract Color Style Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractColorStyleObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractColorStyleObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractColorStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getAbstractColorStyleType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__COLOR, oldColor, color, !oldColorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__COLOR, oldColor, COLOR_EDEFAULT, oldColorESet));
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
	public ColorModeEnumType getColorMode() {
		return colorMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorMode(ColorModeEnumType newColorMode) {
		ColorModeEnumType oldColorMode = colorMode;
		colorMode = newColorMode == null ? COLOR_MODE_EDEFAULT : newColorMode;
		boolean oldColorModeESet = colorModeESet;
		colorModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__COLOR_MODE, oldColorMode, colorMode, !oldColorModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetColorMode() {
		ColorModeEnumType oldColorMode = colorMode;
		boolean oldColorModeESet = colorModeESet;
		colorMode = COLOR_MODE_EDEFAULT;
		colorModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__COLOR_MODE, oldColorMode, COLOR_MODE_EDEFAULT, oldColorModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetColorMode() {
		return colorModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractColorStyleSimpleExtensionGroupGroup() {
		if (abstractColorStyleSimpleExtensionGroupGroup == null) {
			abstractColorStyleSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return abstractColorStyleSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getAbstractColorStyleSimpleExtensionGroup() {
		return getAbstractColorStyleSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractColorStyleType_AbstractColorStyleSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractColorStyleObjectExtensionGroupGroup() {
		if (abstractColorStyleObjectExtensionGroupGroup == null) {
			abstractColorStyleObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return abstractColorStyleObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getAbstractColorStyleObjectExtensionGroup() {
		return getAbstractColorStyleObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractColorStyleType_AbstractColorStyleObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractColorStyleSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractColorStyleObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getAbstractColorStyleObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__COLOR:
				return getColor();
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__COLOR_MODE:
				return getColorMode();
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractColorStyleSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractColorStyleSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP:
				return getAbstractColorStyleSimpleExtensionGroup();
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractColorStyleObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractColorStyleObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP:
				return getAbstractColorStyleObjectExtensionGroup();
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
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__COLOR:
				setColor((byte[])newValue);
				return;
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__COLOR_MODE:
				setColorMode((ColorModeEnumType)newValue);
				return;
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractColorStyleSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractColorStyleObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__COLOR:
				unsetColor();
				return;
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__COLOR_MODE:
				unsetColorMode();
				return;
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				getAbstractColorStyleSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				getAbstractColorStyleObjectExtensionGroupGroup().clear();
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
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__COLOR:
				return isSetColor();
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__COLOR_MODE:
				return isSetColorMode();
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return abstractColorStyleSimpleExtensionGroupGroup != null && !abstractColorStyleSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP:
				return !getAbstractColorStyleSimpleExtensionGroup().isEmpty();
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return abstractColorStyleObjectExtensionGroupGroup != null && !abstractColorStyleObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP:
				return !getAbstractColorStyleObjectExtensionGroup().isEmpty();
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
		result.append(", colorMode: ");
		if (colorModeESet) result.append(colorMode); else result.append("<unset>");
		result.append(", abstractColorStyleSimpleExtensionGroupGroup: ");
		result.append(abstractColorStyleSimpleExtensionGroupGroup);
		result.append(", abstractColorStyleObjectExtensionGroupGroup: ");
		result.append(abstractColorStyleObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractColorStyleTypeImpl
