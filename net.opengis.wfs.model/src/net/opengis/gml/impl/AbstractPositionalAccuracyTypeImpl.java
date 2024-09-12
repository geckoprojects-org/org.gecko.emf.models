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
package net.opengis.gml.impl;

import net.opengis.gml.AbstractPositionalAccuracyType;
import net.opengis.gml.CodeType;
import net.opengis.gml.GMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Positional Accuracy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.AbstractPositionalAccuracyTypeImpl#getMeasureDescription <em>Measure Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractPositionalAccuracyTypeImpl extends MinimalEObjectImpl.Container implements AbstractPositionalAccuracyType {
	/**
	 * The cached value of the '{@link #getMeasureDescription() <em>Measure Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureDescription()
	 * @generated
	 * @ordered
	 */
	protected CodeType measureDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPositionalAccuracyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractPositionalAccuracyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getMeasureDescription() {
		return measureDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureDescription(CodeType newMeasureDescription, NotificationChain msgs) {
		CodeType oldMeasureDescription = measureDescription;
		measureDescription = newMeasureDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_POSITIONAL_ACCURACY_TYPE__MEASURE_DESCRIPTION, oldMeasureDescription, newMeasureDescription);
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
	public void setMeasureDescription(CodeType newMeasureDescription) {
		if (newMeasureDescription != measureDescription) {
			NotificationChain msgs = null;
			if (measureDescription != null)
				msgs = ((InternalEObject)measureDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_POSITIONAL_ACCURACY_TYPE__MEASURE_DESCRIPTION, null, msgs);
			if (newMeasureDescription != null)
				msgs = ((InternalEObject)newMeasureDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_POSITIONAL_ACCURACY_TYPE__MEASURE_DESCRIPTION, null, msgs);
			msgs = basicSetMeasureDescription(newMeasureDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_POSITIONAL_ACCURACY_TYPE__MEASURE_DESCRIPTION, newMeasureDescription, newMeasureDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_POSITIONAL_ACCURACY_TYPE__MEASURE_DESCRIPTION:
				return basicSetMeasureDescription(null, msgs);
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
			case GMLPackage.ABSTRACT_POSITIONAL_ACCURACY_TYPE__MEASURE_DESCRIPTION:
				return getMeasureDescription();
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
			case GMLPackage.ABSTRACT_POSITIONAL_ACCURACY_TYPE__MEASURE_DESCRIPTION:
				setMeasureDescription((CodeType)newValue);
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
			case GMLPackage.ABSTRACT_POSITIONAL_ACCURACY_TYPE__MEASURE_DESCRIPTION:
				setMeasureDescription((CodeType)null);
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
			case GMLPackage.ABSTRACT_POSITIONAL_ACCURACY_TYPE__MEASURE_DESCRIPTION:
				return measureDescription != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractPositionalAccuracyTypeImpl
