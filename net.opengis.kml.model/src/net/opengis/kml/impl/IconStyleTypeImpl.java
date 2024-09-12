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
import net.opengis.kml.BasicLinkType;
import net.opengis.kml.IconStyleType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.Vec2Type;

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
 * An implementation of the model object '<em><b>Icon Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.IconStyleTypeImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link net.opengis.kml.impl.IconStyleTypeImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link net.opengis.kml.impl.IconStyleTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link net.opengis.kml.impl.IconStyleTypeImpl#getHotSpot <em>Hot Spot</em>}</li>
 *   <li>{@link net.opengis.kml.impl.IconStyleTypeImpl#getIconStyleSimpleExtensionGroupGroup <em>Icon Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.IconStyleTypeImpl#getIconStyleSimpleExtensionGroup <em>Icon Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.IconStyleTypeImpl#getIconStyleObjectExtensionGroupGroup <em>Icon Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.IconStyleTypeImpl#getIconStyleObjectExtensionGroup <em>Icon Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IconStyleTypeImpl extends AbstractColorStyleTypeImpl implements IconStyleType {
	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected double scale = SCALE_EDEFAULT;

	/**
	 * This is true if the Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scaleESet;

	/**
	 * The default value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected static final double HEADING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected double heading = HEADING_EDEFAULT;

	/**
	 * This is true if the Heading attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean headingESet;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected BasicLinkType icon;

	/**
	 * The cached value of the '{@link #getHotSpot() <em>Hot Spot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotSpot()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type hotSpot;

	/**
	 * The cached value of the '{@link #getIconStyleSimpleExtensionGroupGroup() <em>Icon Style Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconStyleSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap iconStyleSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getIconStyleObjectExtensionGroupGroup() <em>Icon Style Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconStyleObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap iconStyleObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IconStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getIconStyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(double newScale) {
		double oldScale = scale;
		scale = newScale;
		boolean oldScaleESet = scaleESet;
		scaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ICON_STYLE_TYPE__SCALE, oldScale, scale, !oldScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetScale() {
		double oldScale = scale;
		boolean oldScaleESet = scaleESet;
		scale = SCALE_EDEFAULT;
		scaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ICON_STYLE_TYPE__SCALE, oldScale, SCALE_EDEFAULT, oldScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetScale() {
		return scaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeading() {
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeading(double newHeading) {
		double oldHeading = heading;
		heading = newHeading;
		boolean oldHeadingESet = headingESet;
		headingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ICON_STYLE_TYPE__HEADING, oldHeading, heading, !oldHeadingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHeading() {
		double oldHeading = heading;
		boolean oldHeadingESet = headingESet;
		heading = HEADING_EDEFAULT;
		headingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ICON_STYLE_TYPE__HEADING, oldHeading, HEADING_EDEFAULT, oldHeadingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHeading() {
		return headingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicLinkType getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(BasicLinkType newIcon, NotificationChain msgs) {
		BasicLinkType oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.ICON_STYLE_TYPE__ICON, oldIcon, newIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcon(BasicLinkType newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null)
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ICON_STYLE_TYPE__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ICON_STYLE_TYPE__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ICON_STYLE_TYPE__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vec2Type getHotSpot() {
		return hotSpot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHotSpot(Vec2Type newHotSpot, NotificationChain msgs) {
		Vec2Type oldHotSpot = hotSpot;
		hotSpot = newHotSpot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.ICON_STYLE_TYPE__HOT_SPOT, oldHotSpot, newHotSpot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHotSpot(Vec2Type newHotSpot) {
		if (newHotSpot != hotSpot) {
			NotificationChain msgs = null;
			if (hotSpot != null)
				msgs = ((InternalEObject)hotSpot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ICON_STYLE_TYPE__HOT_SPOT, null, msgs);
			if (newHotSpot != null)
				msgs = ((InternalEObject)newHotSpot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ICON_STYLE_TYPE__HOT_SPOT, null, msgs);
			msgs = basicSetHotSpot(newHotSpot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ICON_STYLE_TYPE__HOT_SPOT, newHotSpot, newHotSpot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIconStyleSimpleExtensionGroupGroup() {
		if (iconStyleSimpleExtensionGroupGroup == null) {
			iconStyleSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return iconStyleSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getIconStyleSimpleExtensionGroup() {
		return getIconStyleSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getIconStyleType_IconStyleSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIconStyleObjectExtensionGroupGroup() {
		if (iconStyleObjectExtensionGroupGroup == null) {
			iconStyleObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return iconStyleObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getIconStyleObjectExtensionGroup() {
		return getIconStyleObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getIconStyleType_IconStyleObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ICON_STYLE_TYPE__ICON:
				return basicSetIcon(null, msgs);
			case KMLPackage.ICON_STYLE_TYPE__HOT_SPOT:
				return basicSetHotSpot(null, msgs);
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getIconStyleSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getIconStyleObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getIconStyleObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.ICON_STYLE_TYPE__SCALE:
				return getScale();
			case KMLPackage.ICON_STYLE_TYPE__HEADING:
				return getHeading();
			case KMLPackage.ICON_STYLE_TYPE__ICON:
				return getIcon();
			case KMLPackage.ICON_STYLE_TYPE__HOT_SPOT:
				return getHotSpot();
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getIconStyleSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getIconStyleSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_SIMPLE_EXTENSION_GROUP:
				return getIconStyleSimpleExtensionGroup();
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getIconStyleObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getIconStyleObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_OBJECT_EXTENSION_GROUP:
				return getIconStyleObjectExtensionGroup();
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
			case KMLPackage.ICON_STYLE_TYPE__SCALE:
				setScale((Double)newValue);
				return;
			case KMLPackage.ICON_STYLE_TYPE__HEADING:
				setHeading((Double)newValue);
				return;
			case KMLPackage.ICON_STYLE_TYPE__ICON:
				setIcon((BasicLinkType)newValue);
				return;
			case KMLPackage.ICON_STYLE_TYPE__HOT_SPOT:
				setHotSpot((Vec2Type)newValue);
				return;
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getIconStyleSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getIconStyleObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.ICON_STYLE_TYPE__SCALE:
				unsetScale();
				return;
			case KMLPackage.ICON_STYLE_TYPE__HEADING:
				unsetHeading();
				return;
			case KMLPackage.ICON_STYLE_TYPE__ICON:
				setIcon((BasicLinkType)null);
				return;
			case KMLPackage.ICON_STYLE_TYPE__HOT_SPOT:
				setHotSpot((Vec2Type)null);
				return;
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				getIconStyleSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				getIconStyleObjectExtensionGroupGroup().clear();
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
			case KMLPackage.ICON_STYLE_TYPE__SCALE:
				return isSetScale();
			case KMLPackage.ICON_STYLE_TYPE__HEADING:
				return isSetHeading();
			case KMLPackage.ICON_STYLE_TYPE__ICON:
				return icon != null;
			case KMLPackage.ICON_STYLE_TYPE__HOT_SPOT:
				return hotSpot != null;
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return iconStyleSimpleExtensionGroupGroup != null && !iconStyleSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_SIMPLE_EXTENSION_GROUP:
				return !getIconStyleSimpleExtensionGroup().isEmpty();
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return iconStyleObjectExtensionGroupGroup != null && !iconStyleObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.ICON_STYLE_TYPE__ICON_STYLE_OBJECT_EXTENSION_GROUP:
				return !getIconStyleObjectExtensionGroup().isEmpty();
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
		result.append(" (scale: ");
		if (scaleESet) result.append(scale); else result.append("<unset>");
		result.append(", heading: ");
		if (headingESet) result.append(heading); else result.append("<unset>");
		result.append(", iconStyleSimpleExtensionGroupGroup: ");
		result.append(iconStyleSimpleExtensionGroupGroup);
		result.append(", iconStyleObjectExtensionGroupGroup: ");
		result.append(iconStyleObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //IconStyleTypeImpl
