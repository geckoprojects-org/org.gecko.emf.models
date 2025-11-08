/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom.impl;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ClaimsType1;
import org.cyclonedx.schema.bom.ConfidenceType;
import org.cyclonedx.schema.bom.ConformanceType;
import org.cyclonedx.schema.bom.CounterClaimsType;
import org.cyclonedx.schema.bom.MapType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MapTypeImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MapTypeImpl#getClaims <em>Claims</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MapTypeImpl#getCounterClaims <em>Counter Claims</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MapTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MapTypeImpl#getConfidence <em>Confidence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapTypeImpl extends MinimalEObjectImpl.Container implements MapType {
	/**
	 * The default value of the '{@link #getRequirement() <em>Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected String requirement = REQUIREMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClaims() <em>Claims</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaims()
	 * @generated
	 * @ordered
	 */
	protected ClaimsType1 claims;

	/**
	 * The cached value of the '{@link #getCounterClaims() <em>Counter Claims</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterClaims()
	 * @generated
	 * @ordered
	 */
	protected CounterClaimsType counterClaims;

	/**
	 * The cached value of the '{@link #getConformance() <em>Conformance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected ConformanceType conformance;

	/**
	 * The cached value of the '{@link #getConfidence() <em>Confidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected ConfidenceType confidence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirement(String newRequirement) {
		String oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MAP_TYPE__REQUIREMENT, oldRequirement, requirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimsType1 getClaims() {
		return claims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaims(ClaimsType1 newClaims, NotificationChain msgs) {
		ClaimsType1 oldClaims = claims;
		claims = newClaims;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.MAP_TYPE__CLAIMS, oldClaims, newClaims);
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
	public void setClaims(ClaimsType1 newClaims) {
		if (newClaims != claims) {
			NotificationChain msgs = null;
			if (claims != null)
				msgs = ((InternalEObject)claims).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MAP_TYPE__CLAIMS, null, msgs);
			if (newClaims != null)
				msgs = ((InternalEObject)newClaims).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MAP_TYPE__CLAIMS, null, msgs);
			msgs = basicSetClaims(newClaims, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MAP_TYPE__CLAIMS, newClaims, newClaims));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CounterClaimsType getCounterClaims() {
		return counterClaims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCounterClaims(CounterClaimsType newCounterClaims, NotificationChain msgs) {
		CounterClaimsType oldCounterClaims = counterClaims;
		counterClaims = newCounterClaims;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.MAP_TYPE__COUNTER_CLAIMS, oldCounterClaims, newCounterClaims);
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
	public void setCounterClaims(CounterClaimsType newCounterClaims) {
		if (newCounterClaims != counterClaims) {
			NotificationChain msgs = null;
			if (counterClaims != null)
				msgs = ((InternalEObject)counterClaims).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MAP_TYPE__COUNTER_CLAIMS, null, msgs);
			if (newCounterClaims != null)
				msgs = ((InternalEObject)newCounterClaims).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MAP_TYPE__COUNTER_CLAIMS, null, msgs);
			msgs = basicSetCounterClaims(newCounterClaims, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MAP_TYPE__COUNTER_CLAIMS, newCounterClaims, newCounterClaims));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConformanceType getConformance() {
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformance(ConformanceType newConformance, NotificationChain msgs) {
		ConformanceType oldConformance = conformance;
		conformance = newConformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.MAP_TYPE__CONFORMANCE, oldConformance, newConformance);
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
	public void setConformance(ConformanceType newConformance) {
		if (newConformance != conformance) {
			NotificationChain msgs = null;
			if (conformance != null)
				msgs = ((InternalEObject)conformance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MAP_TYPE__CONFORMANCE, null, msgs);
			if (newConformance != null)
				msgs = ((InternalEObject)newConformance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MAP_TYPE__CONFORMANCE, null, msgs);
			msgs = basicSetConformance(newConformance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MAP_TYPE__CONFORMANCE, newConformance, newConformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidenceType getConfidence() {
		return confidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfidence(ConfidenceType newConfidence, NotificationChain msgs) {
		ConfidenceType oldConfidence = confidence;
		confidence = newConfidence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.MAP_TYPE__CONFIDENCE, oldConfidence, newConfidence);
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
	public void setConfidence(ConfidenceType newConfidence) {
		if (newConfidence != confidence) {
			NotificationChain msgs = null;
			if (confidence != null)
				msgs = ((InternalEObject)confidence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MAP_TYPE__CONFIDENCE, null, msgs);
			if (newConfidence != null)
				msgs = ((InternalEObject)newConfidence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MAP_TYPE__CONFIDENCE, null, msgs);
			msgs = basicSetConfidence(newConfidence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MAP_TYPE__CONFIDENCE, newConfidence, newConfidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.MAP_TYPE__CLAIMS:
				return basicSetClaims(null, msgs);
			case BOMPackage.MAP_TYPE__COUNTER_CLAIMS:
				return basicSetCounterClaims(null, msgs);
			case BOMPackage.MAP_TYPE__CONFORMANCE:
				return basicSetConformance(null, msgs);
			case BOMPackage.MAP_TYPE__CONFIDENCE:
				return basicSetConfidence(null, msgs);
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
			case BOMPackage.MAP_TYPE__REQUIREMENT:
				return getRequirement();
			case BOMPackage.MAP_TYPE__CLAIMS:
				return getClaims();
			case BOMPackage.MAP_TYPE__COUNTER_CLAIMS:
				return getCounterClaims();
			case BOMPackage.MAP_TYPE__CONFORMANCE:
				return getConformance();
			case BOMPackage.MAP_TYPE__CONFIDENCE:
				return getConfidence();
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
			case BOMPackage.MAP_TYPE__REQUIREMENT:
				setRequirement((String)newValue);
				return;
			case BOMPackage.MAP_TYPE__CLAIMS:
				setClaims((ClaimsType1)newValue);
				return;
			case BOMPackage.MAP_TYPE__COUNTER_CLAIMS:
				setCounterClaims((CounterClaimsType)newValue);
				return;
			case BOMPackage.MAP_TYPE__CONFORMANCE:
				setConformance((ConformanceType)newValue);
				return;
			case BOMPackage.MAP_TYPE__CONFIDENCE:
				setConfidence((ConfidenceType)newValue);
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
			case BOMPackage.MAP_TYPE__REQUIREMENT:
				setRequirement(REQUIREMENT_EDEFAULT);
				return;
			case BOMPackage.MAP_TYPE__CLAIMS:
				setClaims((ClaimsType1)null);
				return;
			case BOMPackage.MAP_TYPE__COUNTER_CLAIMS:
				setCounterClaims((CounterClaimsType)null);
				return;
			case BOMPackage.MAP_TYPE__CONFORMANCE:
				setConformance((ConformanceType)null);
				return;
			case BOMPackage.MAP_TYPE__CONFIDENCE:
				setConfidence((ConfidenceType)null);
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
			case BOMPackage.MAP_TYPE__REQUIREMENT:
				return REQUIREMENT_EDEFAULT == null ? requirement != null : !REQUIREMENT_EDEFAULT.equals(requirement);
			case BOMPackage.MAP_TYPE__CLAIMS:
				return claims != null;
			case BOMPackage.MAP_TYPE__COUNTER_CLAIMS:
				return counterClaims != null;
			case BOMPackage.MAP_TYPE__CONFORMANCE:
				return conformance != null;
			case BOMPackage.MAP_TYPE__CONFIDENCE:
				return confidence != null;
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
		result.append(" (requirement: ");
		result.append(requirement);
		result.append(')');
		return result.toString();
	}

} //MapTypeImpl
