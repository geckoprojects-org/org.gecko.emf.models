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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CoverageEligibilityRequestDiagnosis;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Eligibility Request Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestDiagnosisImpl#getDiagnosisCodeableConcept <em>Diagnosis Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestDiagnosisImpl#getDiagnosisReference <em>Diagnosis Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageEligibilityRequestDiagnosisImpl extends BackboneElementImpl implements CoverageEligibilityRequestDiagnosis {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEligibilityRequestDiagnosisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getCoverageEligibilityRequestDiagnosis();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT, oldDiagnosisCodeableConcept, newDiagnosisCodeableConcept);
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
				msgs = ((InternalEObject)diagnosisCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT, null, msgs);
			if (newDiagnosisCodeableConcept != null)
				msgs = ((InternalEObject)newDiagnosisCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetDiagnosisCodeableConcept(newDiagnosisCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT, newDiagnosisCodeableConcept, newDiagnosisCodeableConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_REFERENCE, oldDiagnosisReference, newDiagnosisReference);
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
				msgs = ((InternalEObject)diagnosisReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_REFERENCE, null, msgs);
			if (newDiagnosisReference != null)
				msgs = ((InternalEObject)newDiagnosisReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_REFERENCE, null, msgs);
			msgs = basicSetDiagnosisReference(newDiagnosisReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_REFERENCE, newDiagnosisReference, newDiagnosisReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				return basicSetDiagnosisCodeableConcept(null, msgs);
			case FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				return basicSetDiagnosisReference(null, msgs);
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
			case FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				return getDiagnosisCodeableConcept();
			case FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				return getDiagnosisReference();
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
			case FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				setDiagnosisCodeableConcept((CodeableConcept)newValue);
				return;
			case FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				setDiagnosisReference((Reference)newValue);
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
			case FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				setDiagnosisCodeableConcept((CodeableConcept)null);
				return;
			case FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				setDiagnosisReference((Reference)null);
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
			case FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				return diagnosisCodeableConcept != null;
			case FHIRPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				return diagnosisReference != null;
		}
		return super.eIsSet(featureID);
	}

} //CoverageEligibilityRequestDiagnosisImpl
