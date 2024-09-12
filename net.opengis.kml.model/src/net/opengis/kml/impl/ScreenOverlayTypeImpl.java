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
import net.opengis.kml.KMLPackage;
import net.opengis.kml.ScreenOverlayType;
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
 * An implementation of the model object '<em><b>Screen Overlay Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.ScreenOverlayTypeImpl#getOverlayXY <em>Overlay XY</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ScreenOverlayTypeImpl#getScreenXY <em>Screen XY</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ScreenOverlayTypeImpl#getRotationXY <em>Rotation XY</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ScreenOverlayTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ScreenOverlayTypeImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ScreenOverlayTypeImpl#getScreenOverlaySimpleExtensionGroupGroup <em>Screen Overlay Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ScreenOverlayTypeImpl#getScreenOverlaySimpleExtensionGroup <em>Screen Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ScreenOverlayTypeImpl#getScreenOverlayObjectExtensionGroupGroup <em>Screen Overlay Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ScreenOverlayTypeImpl#getScreenOverlayObjectExtensionGroup <em>Screen Overlay Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScreenOverlayTypeImpl extends AbstractOverlayTypeImpl implements ScreenOverlayType {
	/**
	 * The cached value of the '{@link #getOverlayXY() <em>Overlay XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlayXY()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type overlayXY;

	/**
	 * The cached value of the '{@link #getScreenXY() <em>Screen XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenXY()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type screenXY;

	/**
	 * The cached value of the '{@link #getRotationXY() <em>Rotation XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationXY()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type rotationXY;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type size;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected double rotation = ROTATION_EDEFAULT;

	/**
	 * This is true if the Rotation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationESet;

	/**
	 * The cached value of the '{@link #getScreenOverlaySimpleExtensionGroupGroup() <em>Screen Overlay Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenOverlaySimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap screenOverlaySimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getScreenOverlayObjectExtensionGroupGroup() <em>Screen Overlay Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenOverlayObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap screenOverlayObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenOverlayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getScreenOverlayType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vec2Type getOverlayXY() {
		return overlayXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverlayXY(Vec2Type newOverlayXY, NotificationChain msgs) {
		Vec2Type oldOverlayXY = overlayXY;
		overlayXY = newOverlayXY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.SCREEN_OVERLAY_TYPE__OVERLAY_XY, oldOverlayXY, newOverlayXY);
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
	public void setOverlayXY(Vec2Type newOverlayXY) {
		if (newOverlayXY != overlayXY) {
			NotificationChain msgs = null;
			if (overlayXY != null)
				msgs = ((InternalEObject)overlayXY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.SCREEN_OVERLAY_TYPE__OVERLAY_XY, null, msgs);
			if (newOverlayXY != null)
				msgs = ((InternalEObject)newOverlayXY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.SCREEN_OVERLAY_TYPE__OVERLAY_XY, null, msgs);
			msgs = basicSetOverlayXY(newOverlayXY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.SCREEN_OVERLAY_TYPE__OVERLAY_XY, newOverlayXY, newOverlayXY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vec2Type getScreenXY() {
		return screenXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScreenXY(Vec2Type newScreenXY, NotificationChain msgs) {
		Vec2Type oldScreenXY = screenXY;
		screenXY = newScreenXY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_XY, oldScreenXY, newScreenXY);
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
	public void setScreenXY(Vec2Type newScreenXY) {
		if (newScreenXY != screenXY) {
			NotificationChain msgs = null;
			if (screenXY != null)
				msgs = ((InternalEObject)screenXY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_XY, null, msgs);
			if (newScreenXY != null)
				msgs = ((InternalEObject)newScreenXY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_XY, null, msgs);
			msgs = basicSetScreenXY(newScreenXY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_XY, newScreenXY, newScreenXY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vec2Type getRotationXY() {
		return rotationXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotationXY(Vec2Type newRotationXY, NotificationChain msgs) {
		Vec2Type oldRotationXY = rotationXY;
		rotationXY = newRotationXY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION_XY, oldRotationXY, newRotationXY);
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
	public void setRotationXY(Vec2Type newRotationXY) {
		if (newRotationXY != rotationXY) {
			NotificationChain msgs = null;
			if (rotationXY != null)
				msgs = ((InternalEObject)rotationXY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION_XY, null, msgs);
			if (newRotationXY != null)
				msgs = ((InternalEObject)newRotationXY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION_XY, null, msgs);
			msgs = basicSetRotationXY(newRotationXY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION_XY, newRotationXY, newRotationXY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vec2Type getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Vec2Type newSize, NotificationChain msgs) {
		Vec2Type oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.SCREEN_OVERLAY_TYPE__SIZE, oldSize, newSize);
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
	public void setSize(Vec2Type newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.SCREEN_OVERLAY_TYPE__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.SCREEN_OVERLAY_TYPE__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.SCREEN_OVERLAY_TYPE__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotation(double newRotation) {
		double oldRotation = rotation;
		rotation = newRotation;
		boolean oldRotationESet = rotationESet;
		rotationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION, oldRotation, rotation, !oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRotation() {
		double oldRotation = rotation;
		boolean oldRotationESet = rotationESet;
		rotation = ROTATION_EDEFAULT;
		rotationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION, oldRotation, ROTATION_EDEFAULT, oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRotation() {
		return rotationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getScreenOverlaySimpleExtensionGroupGroup() {
		if (screenOverlaySimpleExtensionGroupGroup == null) {
			screenOverlaySimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return screenOverlaySimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getScreenOverlaySimpleExtensionGroup() {
		return getScreenOverlaySimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getScreenOverlayType_ScreenOverlaySimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getScreenOverlayObjectExtensionGroupGroup() {
		if (screenOverlayObjectExtensionGroupGroup == null) {
			screenOverlayObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return screenOverlayObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getScreenOverlayObjectExtensionGroup() {
		return getScreenOverlayObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getScreenOverlayType_ScreenOverlayObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.SCREEN_OVERLAY_TYPE__OVERLAY_XY:
				return basicSetOverlayXY(null, msgs);
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_XY:
				return basicSetScreenXY(null, msgs);
			case KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION_XY:
				return basicSetRotationXY(null, msgs);
			case KMLPackage.SCREEN_OVERLAY_TYPE__SIZE:
				return basicSetSize(null, msgs);
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getScreenOverlaySimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getScreenOverlayObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getScreenOverlayObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.SCREEN_OVERLAY_TYPE__OVERLAY_XY:
				return getOverlayXY();
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_XY:
				return getScreenXY();
			case KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION_XY:
				return getRotationXY();
			case KMLPackage.SCREEN_OVERLAY_TYPE__SIZE:
				return getSize();
			case KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION:
				return getRotation();
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getScreenOverlaySimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getScreenOverlaySimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return getScreenOverlaySimpleExtensionGroup();
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getScreenOverlayObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getScreenOverlayObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP:
				return getScreenOverlayObjectExtensionGroup();
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
			case KMLPackage.SCREEN_OVERLAY_TYPE__OVERLAY_XY:
				setOverlayXY((Vec2Type)newValue);
				return;
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_XY:
				setScreenXY((Vec2Type)newValue);
				return;
			case KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION_XY:
				setRotationXY((Vec2Type)newValue);
				return;
			case KMLPackage.SCREEN_OVERLAY_TYPE__SIZE:
				setSize((Vec2Type)newValue);
				return;
			case KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION:
				setRotation((Double)newValue);
				return;
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getScreenOverlaySimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getScreenOverlayObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.SCREEN_OVERLAY_TYPE__OVERLAY_XY:
				setOverlayXY((Vec2Type)null);
				return;
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_XY:
				setScreenXY((Vec2Type)null);
				return;
			case KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION_XY:
				setRotationXY((Vec2Type)null);
				return;
			case KMLPackage.SCREEN_OVERLAY_TYPE__SIZE:
				setSize((Vec2Type)null);
				return;
			case KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION:
				unsetRotation();
				return;
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				getScreenOverlaySimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				getScreenOverlayObjectExtensionGroupGroup().clear();
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
			case KMLPackage.SCREEN_OVERLAY_TYPE__OVERLAY_XY:
				return overlayXY != null;
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_XY:
				return screenXY != null;
			case KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION_XY:
				return rotationXY != null;
			case KMLPackage.SCREEN_OVERLAY_TYPE__SIZE:
				return size != null;
			case KMLPackage.SCREEN_OVERLAY_TYPE__ROTATION:
				return isSetRotation();
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				return screenOverlaySimpleExtensionGroupGroup != null && !screenOverlaySimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return !getScreenOverlaySimpleExtensionGroup().isEmpty();
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				return screenOverlayObjectExtensionGroupGroup != null && !screenOverlayObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP:
				return !getScreenOverlayObjectExtensionGroup().isEmpty();
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
		result.append(" (rotation: ");
		if (rotationESet) result.append(rotation); else result.append("<unset>");
		result.append(", screenOverlaySimpleExtensionGroupGroup: ");
		result.append(screenOverlaySimpleExtensionGroupGroup);
		result.append(", screenOverlayObjectExtensionGroupGroup: ");
		result.append(screenOverlayObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //ScreenOverlayTypeImpl
