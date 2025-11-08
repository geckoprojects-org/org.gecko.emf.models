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

import java.math.BigDecimal;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ConformanceType;
import org.cyclonedx.schema.bom.MitigationStrategiesType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ConformanceTypeImpl#getScore <em>Score</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ConformanceTypeImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ConformanceTypeImpl#getMitigationStrategies <em>Mitigation Strategies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformanceTypeImpl extends MinimalEObjectImpl.Container implements ConformanceType {
	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SCORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal score = SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMitigationStrategies() <em>Mitigation Strategies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigationStrategies()
	 * @generated
	 * @ordered
	 */
	protected MitigationStrategiesType1 mitigationStrategies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getConformanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScore(BigDecimal newScore) {
		BigDecimal oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CONFORMANCE_TYPE__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CONFORMANCE_TYPE__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MitigationStrategiesType1 getMitigationStrategies() {
		return mitigationStrategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMitigationStrategies(MitigationStrategiesType1 newMitigationStrategies, NotificationChain msgs) {
		MitigationStrategiesType1 oldMitigationStrategies = mitigationStrategies;
		mitigationStrategies = newMitigationStrategies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CONFORMANCE_TYPE__MITIGATION_STRATEGIES, oldMitigationStrategies, newMitigationStrategies);
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
	public void setMitigationStrategies(MitigationStrategiesType1 newMitigationStrategies) {
		if (newMitigationStrategies != mitigationStrategies) {
			NotificationChain msgs = null;
			if (mitigationStrategies != null)
				msgs = ((InternalEObject)mitigationStrategies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONFORMANCE_TYPE__MITIGATION_STRATEGIES, null, msgs);
			if (newMitigationStrategies != null)
				msgs = ((InternalEObject)newMitigationStrategies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONFORMANCE_TYPE__MITIGATION_STRATEGIES, null, msgs);
			msgs = basicSetMitigationStrategies(newMitigationStrategies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CONFORMANCE_TYPE__MITIGATION_STRATEGIES, newMitigationStrategies, newMitigationStrategies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.CONFORMANCE_TYPE__MITIGATION_STRATEGIES:
				return basicSetMitigationStrategies(null, msgs);
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
			case BOMPackage.CONFORMANCE_TYPE__SCORE:
				return getScore();
			case BOMPackage.CONFORMANCE_TYPE__RATIONALE:
				return getRationale();
			case BOMPackage.CONFORMANCE_TYPE__MITIGATION_STRATEGIES:
				return getMitigationStrategies();
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
			case BOMPackage.CONFORMANCE_TYPE__SCORE:
				setScore((BigDecimal)newValue);
				return;
			case BOMPackage.CONFORMANCE_TYPE__RATIONALE:
				setRationale((String)newValue);
				return;
			case BOMPackage.CONFORMANCE_TYPE__MITIGATION_STRATEGIES:
				setMitigationStrategies((MitigationStrategiesType1)newValue);
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
			case BOMPackage.CONFORMANCE_TYPE__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case BOMPackage.CONFORMANCE_TYPE__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case BOMPackage.CONFORMANCE_TYPE__MITIGATION_STRATEGIES:
				setMitigationStrategies((MitigationStrategiesType1)null);
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
			case BOMPackage.CONFORMANCE_TYPE__SCORE:
				return SCORE_EDEFAULT == null ? score != null : !SCORE_EDEFAULT.equals(score);
			case BOMPackage.CONFORMANCE_TYPE__RATIONALE:
				return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
			case BOMPackage.CONFORMANCE_TYPE__MITIGATION_STRATEGIES:
				return mitigationStrategies != null;
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
		result.append(" (score: ");
		result.append(score);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(')');
		return result.toString();
	}

} //ConformanceTypeImpl
