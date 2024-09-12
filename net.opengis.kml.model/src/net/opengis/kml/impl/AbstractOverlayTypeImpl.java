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
import net.opengis.kml.AbstractOverlayType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.LinkType;

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
 * An implementation of the model object '<em><b>Abstract Overlay Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.AbstractOverlayTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractOverlayTypeImpl#getDrawOrder <em>Draw Order</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractOverlayTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractOverlayTypeImpl#getAbstractOverlaySimpleExtensionGroupGroup <em>Abstract Overlay Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractOverlayTypeImpl#getAbstractOverlaySimpleExtensionGroup <em>Abstract Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractOverlayTypeImpl#getAbstractOverlayObjectExtensionGroupGroup <em>Abstract Overlay Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractOverlayTypeImpl#getAbstractOverlayObjectExtensionGroup <em>Abstract Overlay Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractOverlayTypeImpl extends AbstractFeatureTypeImpl implements AbstractOverlayType {
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
	 * The default value of the '{@link #getDrawOrder() <em>Draw Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int DRAW_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDrawOrder() <em>Draw Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawOrder()
	 * @generated
	 * @ordered
	 */
	protected int drawOrder = DRAW_ORDER_EDEFAULT;

	/**
	 * This is true if the Draw Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean drawOrderESet;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected LinkType icon;

	/**
	 * The cached value of the '{@link #getAbstractOverlaySimpleExtensionGroupGroup() <em>Abstract Overlay Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractOverlaySimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractOverlaySimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getAbstractOverlayObjectExtensionGroupGroup() <em>Abstract Overlay Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractOverlayObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractOverlayObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractOverlayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getAbstractOverlayType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_OVERLAY_TYPE__COLOR, oldColor, color, !oldColorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ABSTRACT_OVERLAY_TYPE__COLOR, oldColor, COLOR_EDEFAULT, oldColorESet));
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
	public int getDrawOrder() {
		return drawOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDrawOrder(int newDrawOrder) {
		int oldDrawOrder = drawOrder;
		drawOrder = newDrawOrder;
		boolean oldDrawOrderESet = drawOrderESet;
		drawOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_OVERLAY_TYPE__DRAW_ORDER, oldDrawOrder, drawOrder, !oldDrawOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDrawOrder() {
		int oldDrawOrder = drawOrder;
		boolean oldDrawOrderESet = drawOrderESet;
		drawOrder = DRAW_ORDER_EDEFAULT;
		drawOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ABSTRACT_OVERLAY_TYPE__DRAW_ORDER, oldDrawOrder, DRAW_ORDER_EDEFAULT, oldDrawOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDrawOrder() {
		return drawOrderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(LinkType newIcon, NotificationChain msgs) {
		LinkType oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_OVERLAY_TYPE__ICON, oldIcon, newIcon);
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
	public void setIcon(LinkType newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null)
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_OVERLAY_TYPE__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.ABSTRACT_OVERLAY_TYPE__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_OVERLAY_TYPE__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractOverlaySimpleExtensionGroupGroup() {
		if (abstractOverlaySimpleExtensionGroupGroup == null) {
			abstractOverlaySimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return abstractOverlaySimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getAbstractOverlaySimpleExtensionGroup() {
		return getAbstractOverlaySimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractOverlayType_AbstractOverlaySimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractOverlayObjectExtensionGroupGroup() {
		if (abstractOverlayObjectExtensionGroupGroup == null) {
			abstractOverlayObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return abstractOverlayObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getAbstractOverlayObjectExtensionGroup() {
		return getAbstractOverlayObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractOverlayType_AbstractOverlayObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ICON:
				return basicSetIcon(null, msgs);
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractOverlaySimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractOverlayObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getAbstractOverlayObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__COLOR:
				return getColor();
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__DRAW_ORDER:
				return getDrawOrder();
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ICON:
				return getIcon();
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractOverlaySimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractOverlaySimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return getAbstractOverlaySimpleExtensionGroup();
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractOverlayObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractOverlayObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP:
				return getAbstractOverlayObjectExtensionGroup();
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
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__COLOR:
				setColor((byte[])newValue);
				return;
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__DRAW_ORDER:
				setDrawOrder((Integer)newValue);
				return;
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ICON:
				setIcon((LinkType)newValue);
				return;
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractOverlaySimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractOverlayObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__COLOR:
				unsetColor();
				return;
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__DRAW_ORDER:
				unsetDrawOrder();
				return;
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ICON:
				setIcon((LinkType)null);
				return;
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				getAbstractOverlaySimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				getAbstractOverlayObjectExtensionGroupGroup().clear();
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
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__COLOR:
				return isSetColor();
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__DRAW_ORDER:
				return isSetDrawOrder();
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ICON:
				return icon != null;
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				return abstractOverlaySimpleExtensionGroupGroup != null && !abstractOverlaySimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return !getAbstractOverlaySimpleExtensionGroup().isEmpty();
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				return abstractOverlayObjectExtensionGroupGroup != null && !abstractOverlayObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP:
				return !getAbstractOverlayObjectExtensionGroup().isEmpty();
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
		result.append(", drawOrder: ");
		if (drawOrderESet) result.append(drawOrder); else result.append("<unset>");
		result.append(", abstractOverlaySimpleExtensionGroupGroup: ");
		result.append(abstractOverlaySimpleExtensionGroupGroup);
		result.append(", abstractOverlayObjectExtensionGroupGroup: ");
		result.append(abstractOverlayObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractOverlayTypeImpl
