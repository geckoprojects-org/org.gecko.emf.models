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
import net.opengis.kml.OrientationType;

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
 * An implementation of the model object '<em><b>Orientation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.OrientationTypeImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link net.opengis.kml.impl.OrientationTypeImpl#getTilt <em>Tilt</em>}</li>
 *   <li>{@link net.opengis.kml.impl.OrientationTypeImpl#getRoll <em>Roll</em>}</li>
 *   <li>{@link net.opengis.kml.impl.OrientationTypeImpl#getOrientationSimpleExtensionGroupGroup <em>Orientation Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.OrientationTypeImpl#getOrientationSimpleExtensionGroup <em>Orientation Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.OrientationTypeImpl#getOrientationObjectExtensionGroupGroup <em>Orientation Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.OrientationTypeImpl#getOrientationObjectExtensionGroup <em>Orientation Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrientationTypeImpl extends AbstractObjectTypeImpl implements OrientationType {
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
	 * The default value of the '{@link #getTilt() <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt()
	 * @generated
	 * @ordered
	 */
	protected static final double TILT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTilt() <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt()
	 * @generated
	 * @ordered
	 */
	protected double tilt = TILT_EDEFAULT;

	/**
	 * This is true if the Tilt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tiltESet;

	/**
	 * The default value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected static final double ROLL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected double roll = ROLL_EDEFAULT;

	/**
	 * This is true if the Roll attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rollESet;

	/**
	 * The cached value of the '{@link #getOrientationSimpleExtensionGroupGroup() <em>Orientation Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap orientationSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getOrientationObjectExtensionGroupGroup() <em>Orientation Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap orientationObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrientationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getOrientationType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ORIENTATION_TYPE__HEADING, oldHeading, heading, !oldHeadingESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ORIENTATION_TYPE__HEADING, oldHeading, HEADING_EDEFAULT, oldHeadingESet));
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
	public double getTilt() {
		return tilt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTilt(double newTilt) {
		double oldTilt = tilt;
		tilt = newTilt;
		boolean oldTiltESet = tiltESet;
		tiltESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ORIENTATION_TYPE__TILT, oldTilt, tilt, !oldTiltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTilt() {
		double oldTilt = tilt;
		boolean oldTiltESet = tiltESet;
		tilt = TILT_EDEFAULT;
		tiltESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ORIENTATION_TYPE__TILT, oldTilt, TILT_EDEFAULT, oldTiltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTilt() {
		return tiltESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRoll() {
		return roll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoll(double newRoll) {
		double oldRoll = roll;
		roll = newRoll;
		boolean oldRollESet = rollESet;
		rollESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ORIENTATION_TYPE__ROLL, oldRoll, roll, !oldRollESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRoll() {
		double oldRoll = roll;
		boolean oldRollESet = rollESet;
		roll = ROLL_EDEFAULT;
		rollESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ORIENTATION_TYPE__ROLL, oldRoll, ROLL_EDEFAULT, oldRollESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRoll() {
		return rollESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getOrientationSimpleExtensionGroupGroup() {
		if (orientationSimpleExtensionGroupGroup == null) {
			orientationSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ORIENTATION_TYPE__ORIENTATION_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return orientationSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getOrientationSimpleExtensionGroup() {
		return getOrientationSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getOrientationType_OrientationSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getOrientationObjectExtensionGroupGroup() {
		if (orientationObjectExtensionGroupGroup == null) {
			orientationObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ORIENTATION_TYPE__ORIENTATION_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return orientationObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getOrientationObjectExtensionGroup() {
		return getOrientationObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getOrientationType_OrientationObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getOrientationSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getOrientationObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getOrientationObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.ORIENTATION_TYPE__HEADING:
				return getHeading();
			case KMLPackage.ORIENTATION_TYPE__TILT:
				return getTilt();
			case KMLPackage.ORIENTATION_TYPE__ROLL:
				return getRoll();
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getOrientationSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getOrientationSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_SIMPLE_EXTENSION_GROUP:
				return getOrientationSimpleExtensionGroup();
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getOrientationObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getOrientationObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_OBJECT_EXTENSION_GROUP:
				return getOrientationObjectExtensionGroup();
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
			case KMLPackage.ORIENTATION_TYPE__HEADING:
				setHeading((Double)newValue);
				return;
			case KMLPackage.ORIENTATION_TYPE__TILT:
				setTilt((Double)newValue);
				return;
			case KMLPackage.ORIENTATION_TYPE__ROLL:
				setRoll((Double)newValue);
				return;
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getOrientationSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getOrientationObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.ORIENTATION_TYPE__HEADING:
				unsetHeading();
				return;
			case KMLPackage.ORIENTATION_TYPE__TILT:
				unsetTilt();
				return;
			case KMLPackage.ORIENTATION_TYPE__ROLL:
				unsetRoll();
				return;
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_SIMPLE_EXTENSION_GROUP_GROUP:
				getOrientationSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_OBJECT_EXTENSION_GROUP_GROUP:
				getOrientationObjectExtensionGroupGroup().clear();
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
			case KMLPackage.ORIENTATION_TYPE__HEADING:
				return isSetHeading();
			case KMLPackage.ORIENTATION_TYPE__TILT:
				return isSetTilt();
			case KMLPackage.ORIENTATION_TYPE__ROLL:
				return isSetRoll();
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_SIMPLE_EXTENSION_GROUP_GROUP:
				return orientationSimpleExtensionGroupGroup != null && !orientationSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_SIMPLE_EXTENSION_GROUP:
				return !getOrientationSimpleExtensionGroup().isEmpty();
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_OBJECT_EXTENSION_GROUP_GROUP:
				return orientationObjectExtensionGroupGroup != null && !orientationObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.ORIENTATION_TYPE__ORIENTATION_OBJECT_EXTENSION_GROUP:
				return !getOrientationObjectExtensionGroup().isEmpty();
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
		result.append(" (heading: ");
		if (headingESet) result.append(heading); else result.append("<unset>");
		result.append(", tilt: ");
		if (tiltESet) result.append(tilt); else result.append("<unset>");
		result.append(", roll: ");
		if (rollESet) result.append(roll); else result.append("<unset>");
		result.append(", orientationSimpleExtensionGroupGroup: ");
		result.append(orientationSimpleExtensionGroupGroup);
		result.append(", orientationObjectExtensionGroupGroup: ");
		result.append(orientationObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //OrientationTypeImpl
