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

import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimDiagnosisImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDiagnosisImpl#getDiagnosisCodeableConcept <em>Diagnosis Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDiagnosisImpl#getDiagnosisReference <em>Diagnosis Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDiagnosisImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDiagnosisImpl#getOnAdmission <em>On Admission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimDiagnosisImpl extends BackboneElementImpl implements ClaimDiagnosis {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getDiagnosisCodeableConcept() <em>Diagnosis Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept diagnosisCodeableConcept;

	/**
	 * The cached value of the '{@link #getDiagnosisReference() <em>Diagnosis Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisReference()
	 * @generated
	 * @ordered
	 */
	protected Reference diagnosisReference;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getOnAdmission() <em>On Admission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAdmission()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept onAdmission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimDiagnosisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getClaimDiagnosis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_DIAGNOSIS__SEQUENCE, oldSequence, newSequence);
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
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_DIAGNOSIS__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_DIAGNOSIS__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_DIAGNOSIS__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDiagnosisCodeableConcept() {
		return diagnosisCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosisCodeableConcept(CodeableConcept newDiagnosisCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldDiagnosisCodeableConcept = diagnosisCodeableConcept;
		diagnosisCodeableConcept = newDiagnosisCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT, oldDiagnosisCodeableConcept, newDiagnosisCodeableConcept);
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
	public void setDiagnosisCodeableConcept(CodeableConcept newDiagnosisCodeableConcept) {
		if (newDiagnosisCodeableConcept != diagnosisCodeableConcept) {
			NotificationChain msgs = null;
			if (diagnosisCodeableConcept != null)
				msgs = ((InternalEObject)diagnosisCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT, null, msgs);
			if (newDiagnosisCodeableConcept != null)
				msgs = ((InternalEObject)newDiagnosisCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetDiagnosisCodeableConcept(newDiagnosisCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT, newDiagnosisCodeableConcept, newDiagnosisCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDiagnosisReference() {
		return diagnosisReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosisReference(Reference newDiagnosisReference, NotificationChain msgs) {
		Reference oldDiagnosisReference = diagnosisReference;
		diagnosisReference = newDiagnosisReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_REFERENCE, oldDiagnosisReference, newDiagnosisReference);
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
	public void setDiagnosisReference(Reference newDiagnosisReference) {
		if (newDiagnosisReference != diagnosisReference) {
			NotificationChain msgs = null;
			if (diagnosisReference != null)
				msgs = ((InternalEObject)diagnosisReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_REFERENCE, null, msgs);
			if (newDiagnosisReference != null)
				msgs = ((InternalEObject)newDiagnosisReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_REFERENCE, null, msgs);
			msgs = basicSetDiagnosisReference(newDiagnosisReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_REFERENCE, newDiagnosisReference, newDiagnosisReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.CLAIM_DIAGNOSIS__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOnAdmission() {
		return onAdmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnAdmission(CodeableConcept newOnAdmission, NotificationChain msgs) {
		CodeableConcept oldOnAdmission = onAdmission;
		onAdmission = newOnAdmission;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_DIAGNOSIS__ON_ADMISSION, oldOnAdmission, newOnAdmission);
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
	public void setOnAdmission(CodeableConcept newOnAdmission) {
		if (newOnAdmission != onAdmission) {
			NotificationChain msgs = null;
			if (onAdmission != null)
				msgs = ((InternalEObject)onAdmission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_DIAGNOSIS__ON_ADMISSION, null, msgs);
			if (newOnAdmission != null)
				msgs = ((InternalEObject)newOnAdmission).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_DIAGNOSIS__ON_ADMISSION, null, msgs);
			msgs = basicSetOnAdmission(newOnAdmission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_DIAGNOSIS__ON_ADMISSION, newOnAdmission, newOnAdmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.CLAIM_DIAGNOSIS__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				return basicSetDiagnosisCodeableConcept(null, msgs);
			case FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				return basicSetDiagnosisReference(null, msgs);
			case FHIRPackage.CLAIM_DIAGNOSIS__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM_DIAGNOSIS__ON_ADMISSION:
				return basicSetOnAdmission(null, msgs);
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
			case FHIRPackage.CLAIM_DIAGNOSIS__SEQUENCE:
				return getSequence();
			case FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				return getDiagnosisCodeableConcept();
			case FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				return getDiagnosisReference();
			case FHIRPackage.CLAIM_DIAGNOSIS__TYPE:
				return getType();
			case FHIRPackage.CLAIM_DIAGNOSIS__ON_ADMISSION:
				return getOnAdmission();
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
			case FHIRPackage.CLAIM_DIAGNOSIS__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				setDiagnosisCodeableConcept((CodeableConcept)newValue);
				return;
			case FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				setDiagnosisReference((Reference)newValue);
				return;
			case FHIRPackage.CLAIM_DIAGNOSIS__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.CLAIM_DIAGNOSIS__ON_ADMISSION:
				setOnAdmission((CodeableConcept)newValue);
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
			case FHIRPackage.CLAIM_DIAGNOSIS__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				setDiagnosisCodeableConcept((CodeableConcept)null);
				return;
			case FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				setDiagnosisReference((Reference)null);
				return;
			case FHIRPackage.CLAIM_DIAGNOSIS__TYPE:
				getType().clear();
				return;
			case FHIRPackage.CLAIM_DIAGNOSIS__ON_ADMISSION:
				setOnAdmission((CodeableConcept)null);
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
			case FHIRPackage.CLAIM_DIAGNOSIS__SEQUENCE:
				return sequence != null;
			case FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				return diagnosisCodeableConcept != null;
			case FHIRPackage.CLAIM_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				return diagnosisReference != null;
			case FHIRPackage.CLAIM_DIAGNOSIS__TYPE:
				return type != null && !type.isEmpty();
			case FHIRPackage.CLAIM_DIAGNOSIS__ON_ADMISSION:
				return onAdmission != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimDiagnosisImpl
