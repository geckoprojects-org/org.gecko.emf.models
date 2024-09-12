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
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CharacteristicCombination;
import org.hl7.fhir.EvidenceVariableCharacteristic;
import org.hl7.fhir.EvidenceVariableDefinitionByCombination;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Variable Definition By Combination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableDefinitionByCombinationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableDefinitionByCombinationImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableDefinitionByCombinationImpl#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceVariableDefinitionByCombinationImpl extends BackboneElementImpl implements EvidenceVariableDefinitionByCombination {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CharacteristicCombination code;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt threshold;

	/**
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceVariableCharacteristic> characteristic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceVariableDefinitionByCombinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getEvidenceVariableDefinitionByCombination();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacteristicCombination getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CharacteristicCombination newCode, NotificationChain msgs) {
		CharacteristicCombination oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CODE, oldCode, newCode);
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
	public void setCode(CharacteristicCombination newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreshold(PositiveInt newThreshold, NotificationChain msgs) {
		PositiveInt oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__THRESHOLD, oldThreshold, newThreshold);
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
	public void setThreshold(PositiveInt newThreshold) {
		if (newThreshold != threshold) {
			NotificationChain msgs = null;
			if (threshold != null)
				msgs = ((InternalEObject)threshold).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__THRESHOLD, null, msgs);
			if (newThreshold != null)
				msgs = ((InternalEObject)newThreshold).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__THRESHOLD, null, msgs);
			msgs = basicSetThreshold(newThreshold, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__THRESHOLD, newThreshold, newThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EvidenceVariableCharacteristic> getCharacteristic() {
		if (characteristic == null) {
			characteristic = new EObjectContainmentEList<EvidenceVariableCharacteristic>(EvidenceVariableCharacteristic.class, this, FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CHARACTERISTIC);
		}
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__THRESHOLD:
				return basicSetThreshold(null, msgs);
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CHARACTERISTIC:
				return ((InternalEList<?>)getCharacteristic()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CODE:
				return getCode();
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__THRESHOLD:
				return getThreshold();
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CHARACTERISTIC:
				return getCharacteristic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CODE:
				setCode((CharacteristicCombination)newValue);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__THRESHOLD:
				setThreshold((PositiveInt)newValue);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CHARACTERISTIC:
				getCharacteristic().clear();
				getCharacteristic().addAll((Collection<? extends EvidenceVariableCharacteristic>)newValue);
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
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CODE:
				setCode((CharacteristicCombination)null);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__THRESHOLD:
				setThreshold((PositiveInt)null);
				return;
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CHARACTERISTIC:
				getCharacteristic().clear();
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
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CODE:
				return code != null;
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__THRESHOLD:
				return threshold != null;
			case FHIRPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION__CHARACTERISTIC:
				return characteristic != null && !characteristic.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceVariableDefinitionByCombinationImpl
