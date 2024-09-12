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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.CodeType;
import net.opengis.gml.gml.CodeWithAuthorityType;
import net.opengis.gml.gml.CoordinateSystemAxisType;
import net.opengis.gml.gml.GMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinate System Axis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.CoordinateSystemAxisTypeImpl#getAxisAbbrev <em>Axis Abbrev</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.CoordinateSystemAxisTypeImpl#getAxisDirection <em>Axis Direction</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.CoordinateSystemAxisTypeImpl#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.CoordinateSystemAxisTypeImpl#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.CoordinateSystemAxisTypeImpl#getRangeMeaning <em>Range Meaning</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.CoordinateSystemAxisTypeImpl#getUom <em>Uom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinateSystemAxisTypeImpl extends IdentifiedObjectTypeImpl implements CoordinateSystemAxisType {
	/**
	 * The cached value of the '{@link #getAxisAbbrev() <em>Axis Abbrev</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisAbbrev()
	 * @generated
	 * @ordered
	 */
	protected CodeType axisAbbrev;

	/**
	 * The cached value of the '{@link #getAxisDirection() <em>Axis Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisDirection()
	 * @generated
	 * @ordered
	 */
	protected CodeWithAuthorityType axisDirection;

	/**
	 * The default value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected double minimumValue = MINIMUM_VALUE_EDEFAULT;

	/**
	 * This is true if the Minimum Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumValueESet;

	/**
	 * The default value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
	protected double maximumValue = MAXIMUM_VALUE_EDEFAULT;

	/**
	 * This is true if the Maximum Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumValueESet;

	/**
	 * The cached value of the '{@link #getRangeMeaning() <em>Range Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeMeaning()
	 * @generated
	 * @ordered
	 */
	protected CodeWithAuthorityType rangeMeaning;

	/**
	 * The default value of the '{@link #getUom() <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUom()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUom() <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUom()
	 * @generated
	 * @ordered
	 */
	protected String uom = UOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinateSystemAxisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getCoordinateSystemAxisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getAxisAbbrev() {
		return axisAbbrev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisAbbrev(CodeType newAxisAbbrev, NotificationChain msgs) {
		CodeType oldAxisAbbrev = axisAbbrev;
		axisAbbrev = newAxisAbbrev;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV, oldAxisAbbrev, newAxisAbbrev);
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
	public void setAxisAbbrev(CodeType newAxisAbbrev) {
		if (newAxisAbbrev != axisAbbrev) {
			NotificationChain msgs = null;
			if (axisAbbrev != null)
				msgs = ((InternalEObject)axisAbbrev).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV, null, msgs);
			if (newAxisAbbrev != null)
				msgs = ((InternalEObject)newAxisAbbrev).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV, null, msgs);
			msgs = basicSetAxisAbbrev(newAxisAbbrev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV, newAxisAbbrev, newAxisAbbrev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeWithAuthorityType getAxisDirection() {
		return axisDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisDirection(CodeWithAuthorityType newAxisDirection, NotificationChain msgs) {
		CodeWithAuthorityType oldAxisDirection = axisDirection;
		axisDirection = newAxisDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION, oldAxisDirection, newAxisDirection);
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
	public void setAxisDirection(CodeWithAuthorityType newAxisDirection) {
		if (newAxisDirection != axisDirection) {
			NotificationChain msgs = null;
			if (axisDirection != null)
				msgs = ((InternalEObject)axisDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION, null, msgs);
			if (newAxisDirection != null)
				msgs = ((InternalEObject)newAxisDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION, null, msgs);
			msgs = basicSetAxisDirection(newAxisDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION, newAxisDirection, newAxisDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinimumValue() {
		return minimumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumValue(double newMinimumValue) {
		double oldMinimumValue = minimumValue;
		minimumValue = newMinimumValue;
		boolean oldMinimumValueESet = minimumValueESet;
		minimumValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__MINIMUM_VALUE, oldMinimumValue, minimumValue, !oldMinimumValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinimumValue() {
		double oldMinimumValue = minimumValue;
		boolean oldMinimumValueESet = minimumValueESet;
		minimumValue = MINIMUM_VALUE_EDEFAULT;
		minimumValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__MINIMUM_VALUE, oldMinimumValue, MINIMUM_VALUE_EDEFAULT, oldMinimumValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinimumValue() {
		return minimumValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaximumValue() {
		return maximumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumValue(double newMaximumValue) {
		double oldMaximumValue = maximumValue;
		maximumValue = newMaximumValue;
		boolean oldMaximumValueESet = maximumValueESet;
		maximumValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__MAXIMUM_VALUE, oldMaximumValue, maximumValue, !oldMaximumValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaximumValue() {
		double oldMaximumValue = maximumValue;
		boolean oldMaximumValueESet = maximumValueESet;
		maximumValue = MAXIMUM_VALUE_EDEFAULT;
		maximumValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__MAXIMUM_VALUE, oldMaximumValue, MAXIMUM_VALUE_EDEFAULT, oldMaximumValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaximumValue() {
		return maximumValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeWithAuthorityType getRangeMeaning() {
		return rangeMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangeMeaning(CodeWithAuthorityType newRangeMeaning, NotificationChain msgs) {
		CodeWithAuthorityType oldRangeMeaning = rangeMeaning;
		rangeMeaning = newRangeMeaning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__RANGE_MEANING, oldRangeMeaning, newRangeMeaning);
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
	public void setRangeMeaning(CodeWithAuthorityType newRangeMeaning) {
		if (newRangeMeaning != rangeMeaning) {
			NotificationChain msgs = null;
			if (rangeMeaning != null)
				msgs = ((InternalEObject)rangeMeaning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__RANGE_MEANING, null, msgs);
			if (newRangeMeaning != null)
				msgs = ((InternalEObject)newRangeMeaning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__RANGE_MEANING, null, msgs);
			msgs = basicSetRangeMeaning(newRangeMeaning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__RANGE_MEANING, newRangeMeaning, newRangeMeaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUom() {
		return uom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUom(String newUom) {
		String oldUom = uom;
		uom = newUom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__UOM, oldUom, uom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV:
				return basicSetAxisAbbrev(null, msgs);
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION:
				return basicSetAxisDirection(null, msgs);
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__RANGE_MEANING:
				return basicSetRangeMeaning(null, msgs);
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
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV:
				return getAxisAbbrev();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION:
				return getAxisDirection();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__MINIMUM_VALUE:
				return getMinimumValue();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__MAXIMUM_VALUE:
				return getMaximumValue();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__RANGE_MEANING:
				return getRangeMeaning();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__UOM:
				return getUom();
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
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV:
				setAxisAbbrev((CodeType)newValue);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION:
				setAxisDirection((CodeWithAuthorityType)newValue);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__MINIMUM_VALUE:
				setMinimumValue((Double)newValue);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__MAXIMUM_VALUE:
				setMaximumValue((Double)newValue);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__RANGE_MEANING:
				setRangeMeaning((CodeWithAuthorityType)newValue);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__UOM:
				setUom((String)newValue);
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
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV:
				setAxisAbbrev((CodeType)null);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION:
				setAxisDirection((CodeWithAuthorityType)null);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__MINIMUM_VALUE:
				unsetMinimumValue();
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__MAXIMUM_VALUE:
				unsetMaximumValue();
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__RANGE_MEANING:
				setRangeMeaning((CodeWithAuthorityType)null);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__UOM:
				setUom(UOM_EDEFAULT);
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
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV:
				return axisAbbrev != null;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION:
				return axisDirection != null;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__MINIMUM_VALUE:
				return isSetMinimumValue();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__MAXIMUM_VALUE:
				return isSetMaximumValue();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__RANGE_MEANING:
				return rangeMeaning != null;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__UOM:
				return UOM_EDEFAULT == null ? uom != null : !UOM_EDEFAULT.equals(uom);
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
		result.append(" (minimumValue: ");
		if (minimumValueESet) result.append(minimumValue); else result.append("<unset>");
		result.append(", maximumValue: ");
		if (maximumValueESet) result.append(maximumValue); else result.append("<unset>");
		result.append(", uom: ");
		result.append(uom);
		result.append(')');
		return result.toString();
	}

} //CoordinateSystemAxisTypeImpl
