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
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SpecimenDefinitionAdditive;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Definition Additive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionAdditiveImpl#getAdditiveCodeableConcept <em>Additive Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionAdditiveImpl#getAdditiveReference <em>Additive Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenDefinitionAdditiveImpl extends BackboneElementImpl implements SpecimenDefinitionAdditive {
	/**
	 * The cached value of the '{@link #getAdditiveCodeableConcept() <em>Additive Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept additiveCodeableConcept;

	/**
	 * The cached value of the '{@link #getAdditiveReference() <em>Additive Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveReference()
	 * @generated
	 * @ordered
	 */
	protected Reference additiveReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenDefinitionAdditiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getSpecimenDefinitionAdditive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAdditiveCodeableConcept() {
		return additiveCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditiveCodeableConcept(CodeableConcept newAdditiveCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldAdditiveCodeableConcept = additiveCodeableConcept;
		additiveCodeableConcept = newAdditiveCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_CODEABLE_CONCEPT, oldAdditiveCodeableConcept, newAdditiveCodeableConcept);
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
	public void setAdditiveCodeableConcept(CodeableConcept newAdditiveCodeableConcept) {
		if (newAdditiveCodeableConcept != additiveCodeableConcept) {
			NotificationChain msgs = null;
			if (additiveCodeableConcept != null)
				msgs = ((InternalEObject)additiveCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_CODEABLE_CONCEPT, null, msgs);
			if (newAdditiveCodeableConcept != null)
				msgs = ((InternalEObject)newAdditiveCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetAdditiveCodeableConcept(newAdditiveCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_CODEABLE_CONCEPT, newAdditiveCodeableConcept, newAdditiveCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAdditiveReference() {
		return additiveReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditiveReference(Reference newAdditiveReference, NotificationChain msgs) {
		Reference oldAdditiveReference = additiveReference;
		additiveReference = newAdditiveReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_REFERENCE, oldAdditiveReference, newAdditiveReference);
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
	public void setAdditiveReference(Reference newAdditiveReference) {
		if (newAdditiveReference != additiveReference) {
			NotificationChain msgs = null;
			if (additiveReference != null)
				msgs = ((InternalEObject)additiveReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_REFERENCE, null, msgs);
			if (newAdditiveReference != null)
				msgs = ((InternalEObject)newAdditiveReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_REFERENCE, null, msgs);
			msgs = basicSetAdditiveReference(newAdditiveReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_REFERENCE, newAdditiveReference, newAdditiveReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_CODEABLE_CONCEPT:
				return basicSetAdditiveCodeableConcept(null, msgs);
			case FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_REFERENCE:
				return basicSetAdditiveReference(null, msgs);
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
			case FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_CODEABLE_CONCEPT:
				return getAdditiveCodeableConcept();
			case FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_REFERENCE:
				return getAdditiveReference();
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
			case FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_CODEABLE_CONCEPT:
				setAdditiveCodeableConcept((CodeableConcept)newValue);
				return;
			case FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_REFERENCE:
				setAdditiveReference((Reference)newValue);
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
			case FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_CODEABLE_CONCEPT:
				setAdditiveCodeableConcept((CodeableConcept)null);
				return;
			case FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_REFERENCE:
				setAdditiveReference((Reference)null);
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
			case FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_CODEABLE_CONCEPT:
				return additiveCodeableConcept != null;
			case FHIRPackage.SPECIMEN_DEFINITION_ADDITIVE__ADDITIVE_REFERENCE:
				return additiveReference != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenDefinitionAdditiveImpl
