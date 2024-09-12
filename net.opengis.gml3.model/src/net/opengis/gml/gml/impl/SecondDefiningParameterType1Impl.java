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

import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.LengthType;
import net.opengis.gml.gml.MeasureType;
import net.opengis.gml.gml.SecondDefiningParameterType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Second Defining Parameter Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.SecondDefiningParameterType1Impl#getInverseFlattening <em>Inverse Flattening</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.SecondDefiningParameterType1Impl#getSemiMinorAxis <em>Semi Minor Axis</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.SecondDefiningParameterType1Impl#isIsSphere <em>Is Sphere</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecondDefiningParameterType1Impl extends MinimalEObjectImpl.Container implements SecondDefiningParameterType1 {
	/**
	 * The cached value of the '{@link #getInverseFlattening() <em>Inverse Flattening</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseFlattening()
	 * @generated
	 * @ordered
	 */
	protected MeasureType inverseFlattening;

	/**
	 * The cached value of the '{@link #getSemiMinorAxis() <em>Semi Minor Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemiMinorAxis()
	 * @generated
	 * @ordered
	 */
	protected LengthType semiMinorAxis;

	/**
	 * The default value of the '{@link #isIsSphere() <em>Is Sphere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSphere()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SPHERE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsSphere() <em>Is Sphere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSphere()
	 * @generated
	 * @ordered
	 */
	protected boolean isSphere = IS_SPHERE_EDEFAULT;

	/**
	 * This is true if the Is Sphere attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSphereESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecondDefiningParameterType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getSecondDefiningParameterType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType getInverseFlattening() {
		return inverseFlattening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInverseFlattening(MeasureType newInverseFlattening, NotificationChain msgs) {
		MeasureType oldInverseFlattening = inverseFlattening;
		inverseFlattening = newInverseFlattening;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__INVERSE_FLATTENING, oldInverseFlattening, newInverseFlattening);
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
	public void setInverseFlattening(MeasureType newInverseFlattening) {
		if (newInverseFlattening != inverseFlattening) {
			NotificationChain msgs = null;
			if (inverseFlattening != null)
				msgs = ((InternalEObject)inverseFlattening).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__INVERSE_FLATTENING, null, msgs);
			if (newInverseFlattening != null)
				msgs = ((InternalEObject)newInverseFlattening).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__INVERSE_FLATTENING, null, msgs);
			msgs = basicSetInverseFlattening(newInverseFlattening, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__INVERSE_FLATTENING, newInverseFlattening, newInverseFlattening));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LengthType getSemiMinorAxis() {
		return semiMinorAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemiMinorAxis(LengthType newSemiMinorAxis, NotificationChain msgs) {
		LengthType oldSemiMinorAxis = semiMinorAxis;
		semiMinorAxis = newSemiMinorAxis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SEMI_MINOR_AXIS, oldSemiMinorAxis, newSemiMinorAxis);
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
	public void setSemiMinorAxis(LengthType newSemiMinorAxis) {
		if (newSemiMinorAxis != semiMinorAxis) {
			NotificationChain msgs = null;
			if (semiMinorAxis != null)
				msgs = ((InternalEObject)semiMinorAxis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SEMI_MINOR_AXIS, null, msgs);
			if (newSemiMinorAxis != null)
				msgs = ((InternalEObject)newSemiMinorAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SEMI_MINOR_AXIS, null, msgs);
			msgs = basicSetSemiMinorAxis(newSemiMinorAxis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SEMI_MINOR_AXIS, newSemiMinorAxis, newSemiMinorAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSphere() {
		return isSphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSphere(boolean newIsSphere) {
		boolean oldIsSphere = isSphere;
		isSphere = newIsSphere;
		boolean oldIsSphereESet = isSphereESet;
		isSphereESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__IS_SPHERE, oldIsSphere, isSphere, !oldIsSphereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsSphere() {
		boolean oldIsSphere = isSphere;
		boolean oldIsSphereESet = isSphereESet;
		isSphere = IS_SPHERE_EDEFAULT;
		isSphereESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__IS_SPHERE, oldIsSphere, IS_SPHERE_EDEFAULT, oldIsSphereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsSphere() {
		return isSphereESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__INVERSE_FLATTENING:
				return basicSetInverseFlattening(null, msgs);
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SEMI_MINOR_AXIS:
				return basicSetSemiMinorAxis(null, msgs);
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
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__INVERSE_FLATTENING:
				return getInverseFlattening();
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SEMI_MINOR_AXIS:
				return getSemiMinorAxis();
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__IS_SPHERE:
				return isIsSphere();
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
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__INVERSE_FLATTENING:
				setInverseFlattening((MeasureType)newValue);
				return;
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SEMI_MINOR_AXIS:
				setSemiMinorAxis((LengthType)newValue);
				return;
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__IS_SPHERE:
				setIsSphere((Boolean)newValue);
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
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__INVERSE_FLATTENING:
				setInverseFlattening((MeasureType)null);
				return;
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SEMI_MINOR_AXIS:
				setSemiMinorAxis((LengthType)null);
				return;
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__IS_SPHERE:
				unsetIsSphere();
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
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__INVERSE_FLATTENING:
				return inverseFlattening != null;
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SEMI_MINOR_AXIS:
				return semiMinorAxis != null;
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__IS_SPHERE:
				return isSetIsSphere();
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
		result.append(" (isSphere: ");
		if (isSphereESet) result.append(isSphere); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SecondDefiningParameterType1Impl
