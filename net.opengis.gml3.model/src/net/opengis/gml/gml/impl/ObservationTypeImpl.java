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
import net.opengis.gml.gml.ObservationType;
import net.opengis.gml.gml.ProcedurePropertyType;
import net.opengis.gml.gml.ResultType;
import net.opengis.gml.gml.TargetPropertyType;
import net.opengis.gml.gml.TimePrimitivePropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.ObservationTypeImpl#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ObservationTypeImpl#getUsing <em>Using</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ObservationTypeImpl#getTargetGroup <em>Target Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ObservationTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ObservationTypeImpl#getResultOf <em>Result Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationTypeImpl extends AbstractFeatureTypeImpl implements ObservationType {
	/**
	 * The cached value of the '{@link #getValidTime() <em>Valid Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTime()
	 * @generated
	 * @ordered
	 */
	protected TimePrimitivePropertyType validTime;

	/**
	 * The cached value of the '{@link #getUsing() <em>Using</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsing()
	 * @generated
	 * @ordered
	 */
	protected ProcedurePropertyType using;

	/**
	 * The cached value of the '{@link #getTargetGroup() <em>Target Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap targetGroup;

	/**
	 * The cached value of the '{@link #getResultOf() <em>Result Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOf()
	 * @generated
	 * @ordered
	 */
	protected ResultType resultOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getObservationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePrimitivePropertyType getValidTime() {
		return validTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidTime(TimePrimitivePropertyType newValidTime, NotificationChain msgs) {
		TimePrimitivePropertyType oldValidTime = validTime;
		validTime = newValidTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.OBSERVATION_TYPE__VALID_TIME, oldValidTime, newValidTime);
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
	public void setValidTime(TimePrimitivePropertyType newValidTime) {
		if (newValidTime != validTime) {
			NotificationChain msgs = null;
			if (validTime != null)
				msgs = ((InternalEObject)validTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.OBSERVATION_TYPE__VALID_TIME, null, msgs);
			if (newValidTime != null)
				msgs = ((InternalEObject)newValidTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.OBSERVATION_TYPE__VALID_TIME, null, msgs);
			msgs = basicSetValidTime(newValidTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.OBSERVATION_TYPE__VALID_TIME, newValidTime, newValidTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedurePropertyType getUsing() {
		return using;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsing(ProcedurePropertyType newUsing, NotificationChain msgs) {
		ProcedurePropertyType oldUsing = using;
		using = newUsing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.OBSERVATION_TYPE__USING, oldUsing, newUsing);
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
	public void setUsing(ProcedurePropertyType newUsing) {
		if (newUsing != using) {
			NotificationChain msgs = null;
			if (using != null)
				msgs = ((InternalEObject)using).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.OBSERVATION_TYPE__USING, null, msgs);
			if (newUsing != null)
				msgs = ((InternalEObject)newUsing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.OBSERVATION_TYPE__USING, null, msgs);
			msgs = basicSetUsing(newUsing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.OBSERVATION_TYPE__USING, newUsing, newUsing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTargetGroup() {
		if (targetGroup == null) {
			targetGroup = new BasicFeatureMap(this, GMLPackage.OBSERVATION_TYPE__TARGET_GROUP);
		}
		return targetGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetPropertyType getTarget() {
		return (TargetPropertyType)getTargetGroup().get(GMLPackage.eINSTANCE.getObservationType_Target(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(TargetPropertyType newTarget, NotificationChain msgs) {
		return ((FeatureMap.Internal)getTargetGroup()).basicAdd(GMLPackage.eINSTANCE.getObservationType_Target(), newTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TargetPropertyType newTarget) {
		((FeatureMap.Internal)getTargetGroup()).set(GMLPackage.eINSTANCE.getObservationType_Target(), newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultType getResultOf() {
		return resultOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultOf(ResultType newResultOf, NotificationChain msgs) {
		ResultType oldResultOf = resultOf;
		resultOf = newResultOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.OBSERVATION_TYPE__RESULT_OF, oldResultOf, newResultOf);
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
	public void setResultOf(ResultType newResultOf) {
		if (newResultOf != resultOf) {
			NotificationChain msgs = null;
			if (resultOf != null)
				msgs = ((InternalEObject)resultOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.OBSERVATION_TYPE__RESULT_OF, null, msgs);
			if (newResultOf != null)
				msgs = ((InternalEObject)newResultOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.OBSERVATION_TYPE__RESULT_OF, null, msgs);
			msgs = basicSetResultOf(newResultOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.OBSERVATION_TYPE__RESULT_OF, newResultOf, newResultOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.OBSERVATION_TYPE__VALID_TIME:
				return basicSetValidTime(null, msgs);
			case GMLPackage.OBSERVATION_TYPE__USING:
				return basicSetUsing(null, msgs);
			case GMLPackage.OBSERVATION_TYPE__TARGET_GROUP:
				return ((InternalEList<?>)getTargetGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.OBSERVATION_TYPE__TARGET:
				return basicSetTarget(null, msgs);
			case GMLPackage.OBSERVATION_TYPE__RESULT_OF:
				return basicSetResultOf(null, msgs);
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
			case GMLPackage.OBSERVATION_TYPE__VALID_TIME:
				return getValidTime();
			case GMLPackage.OBSERVATION_TYPE__USING:
				return getUsing();
			case GMLPackage.OBSERVATION_TYPE__TARGET_GROUP:
				if (coreType) return getTargetGroup();
				return ((FeatureMap.Internal)getTargetGroup()).getWrapper();
			case GMLPackage.OBSERVATION_TYPE__TARGET:
				return getTarget();
			case GMLPackage.OBSERVATION_TYPE__RESULT_OF:
				return getResultOf();
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
			case GMLPackage.OBSERVATION_TYPE__VALID_TIME:
				setValidTime((TimePrimitivePropertyType)newValue);
				return;
			case GMLPackage.OBSERVATION_TYPE__USING:
				setUsing((ProcedurePropertyType)newValue);
				return;
			case GMLPackage.OBSERVATION_TYPE__TARGET_GROUP:
				((FeatureMap.Internal)getTargetGroup()).set(newValue);
				return;
			case GMLPackage.OBSERVATION_TYPE__TARGET:
				setTarget((TargetPropertyType)newValue);
				return;
			case GMLPackage.OBSERVATION_TYPE__RESULT_OF:
				setResultOf((ResultType)newValue);
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
			case GMLPackage.OBSERVATION_TYPE__VALID_TIME:
				setValidTime((TimePrimitivePropertyType)null);
				return;
			case GMLPackage.OBSERVATION_TYPE__USING:
				setUsing((ProcedurePropertyType)null);
				return;
			case GMLPackage.OBSERVATION_TYPE__TARGET_GROUP:
				getTargetGroup().clear();
				return;
			case GMLPackage.OBSERVATION_TYPE__TARGET:
				setTarget((TargetPropertyType)null);
				return;
			case GMLPackage.OBSERVATION_TYPE__RESULT_OF:
				setResultOf((ResultType)null);
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
			case GMLPackage.OBSERVATION_TYPE__VALID_TIME:
				return validTime != null;
			case GMLPackage.OBSERVATION_TYPE__USING:
				return using != null;
			case GMLPackage.OBSERVATION_TYPE__TARGET_GROUP:
				return targetGroup != null && !targetGroup.isEmpty();
			case GMLPackage.OBSERVATION_TYPE__TARGET:
				return getTarget() != null;
			case GMLPackage.OBSERVATION_TYPE__RESULT_OF:
				return resultOf != null;
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
		result.append(" (targetGroup: ");
		result.append(targetGroup);
		result.append(')');
		return result.toString();
	}

} //ObservationTypeImpl
