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
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.SubstanceDefinitionMoiety;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Definition Moiety</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionMoietyImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionMoietyImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionMoietyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionMoietyImpl#getStereochemistry <em>Stereochemistry</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionMoietyImpl#getOpticalActivity <em>Optical Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionMoietyImpl#getMolecularFormula <em>Molecular Formula</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionMoietyImpl#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionMoietyImpl#getAmountString <em>Amount String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionMoietyImpl#getMeasurementType <em>Measurement Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceDefinitionMoietyImpl extends BackboneElementImpl implements SubstanceDefinitionMoiety {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept role;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getStereochemistry() <em>Stereochemistry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereochemistry()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept stereochemistry;

	/**
	 * The cached value of the '{@link #getOpticalActivity() <em>Optical Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpticalActivity()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept opticalActivity;

	/**
	 * The cached value of the '{@link #getMolecularFormula() <em>Molecular Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularFormula()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String molecularFormula;

	/**
	 * The cached value of the '{@link #getAmountQuantity() <em>Amount Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity amountQuantity;

	/**
	 * The cached value of the '{@link #getAmountString() <em>Amount String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String amountString;

	/**
	 * The cached value of the '{@link #getMeasurementType() <em>Measurement Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept measurementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceDefinitionMoietyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getSubstanceDefinitionMoiety();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(CodeableConcept newRole, NotificationChain msgs) {
		CodeableConcept oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__ROLE, oldRole, newRole);
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
	public void setRole(CodeableConcept newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStereochemistry() {
		return stereochemistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStereochemistry(CodeableConcept newStereochemistry, NotificationChain msgs) {
		CodeableConcept oldStereochemistry = stereochemistry;
		stereochemistry = newStereochemistry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__STEREOCHEMISTRY, oldStereochemistry, newStereochemistry);
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
	public void setStereochemistry(CodeableConcept newStereochemistry) {
		if (newStereochemistry != stereochemistry) {
			NotificationChain msgs = null;
			if (stereochemistry != null)
				msgs = ((InternalEObject)stereochemistry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__STEREOCHEMISTRY, null, msgs);
			if (newStereochemistry != null)
				msgs = ((InternalEObject)newStereochemistry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__STEREOCHEMISTRY, null, msgs);
			msgs = basicSetStereochemistry(newStereochemistry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__STEREOCHEMISTRY, newStereochemistry, newStereochemistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOpticalActivity() {
		return opticalActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpticalActivity(CodeableConcept newOpticalActivity, NotificationChain msgs) {
		CodeableConcept oldOpticalActivity = opticalActivity;
		opticalActivity = newOpticalActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__OPTICAL_ACTIVITY, oldOpticalActivity, newOpticalActivity);
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
	public void setOpticalActivity(CodeableConcept newOpticalActivity) {
		if (newOpticalActivity != opticalActivity) {
			NotificationChain msgs = null;
			if (opticalActivity != null)
				msgs = ((InternalEObject)opticalActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__OPTICAL_ACTIVITY, null, msgs);
			if (newOpticalActivity != null)
				msgs = ((InternalEObject)newOpticalActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__OPTICAL_ACTIVITY, null, msgs);
			msgs = basicSetOpticalActivity(newOpticalActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__OPTICAL_ACTIVITY, newOpticalActivity, newOpticalActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getMolecularFormula() {
		return molecularFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMolecularFormula(org.hl7.fhir.String newMolecularFormula, NotificationChain msgs) {
		org.hl7.fhir.String oldMolecularFormula = molecularFormula;
		molecularFormula = newMolecularFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MOLECULAR_FORMULA, oldMolecularFormula, newMolecularFormula);
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
	public void setMolecularFormula(org.hl7.fhir.String newMolecularFormula) {
		if (newMolecularFormula != molecularFormula) {
			NotificationChain msgs = null;
			if (molecularFormula != null)
				msgs = ((InternalEObject)molecularFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MOLECULAR_FORMULA, null, msgs);
			if (newMolecularFormula != null)
				msgs = ((InternalEObject)newMolecularFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MOLECULAR_FORMULA, null, msgs);
			msgs = basicSetMolecularFormula(newMolecularFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MOLECULAR_FORMULA, newMolecularFormula, newMolecularFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getAmountQuantity() {
		return amountQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountQuantity(Quantity newAmountQuantity, NotificationChain msgs) {
		Quantity oldAmountQuantity = amountQuantity;
		amountQuantity = newAmountQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_QUANTITY, oldAmountQuantity, newAmountQuantity);
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
	public void setAmountQuantity(Quantity newAmountQuantity) {
		if (newAmountQuantity != amountQuantity) {
			NotificationChain msgs = null;
			if (amountQuantity != null)
				msgs = ((InternalEObject)amountQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_QUANTITY, null, msgs);
			if (newAmountQuantity != null)
				msgs = ((InternalEObject)newAmountQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_QUANTITY, null, msgs);
			msgs = basicSetAmountQuantity(newAmountQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_QUANTITY, newAmountQuantity, newAmountQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getAmountString() {
		return amountString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountString(org.hl7.fhir.String newAmountString, NotificationChain msgs) {
		org.hl7.fhir.String oldAmountString = amountString;
		amountString = newAmountString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_STRING, oldAmountString, newAmountString);
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
	public void setAmountString(org.hl7.fhir.String newAmountString) {
		if (newAmountString != amountString) {
			NotificationChain msgs = null;
			if (amountString != null)
				msgs = ((InternalEObject)amountString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_STRING, null, msgs);
			if (newAmountString != null)
				msgs = ((InternalEObject)newAmountString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_STRING, null, msgs);
			msgs = basicSetAmountString(newAmountString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_STRING, newAmountString, newAmountString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMeasurementType() {
		return measurementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementType(CodeableConcept newMeasurementType, NotificationChain msgs) {
		CodeableConcept oldMeasurementType = measurementType;
		measurementType = newMeasurementType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MEASUREMENT_TYPE, oldMeasurementType, newMeasurementType);
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
	public void setMeasurementType(CodeableConcept newMeasurementType) {
		if (newMeasurementType != measurementType) {
			NotificationChain msgs = null;
			if (measurementType != null)
				msgs = ((InternalEObject)measurementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MEASUREMENT_TYPE, null, msgs);
			if (newMeasurementType != null)
				msgs = ((InternalEObject)newMeasurementType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MEASUREMENT_TYPE, null, msgs);
			msgs = basicSetMeasurementType(newMeasurementType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MEASUREMENT_TYPE, newMeasurementType, newMeasurementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__ROLE:
				return basicSetRole(null, msgs);
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__NAME:
				return basicSetName(null, msgs);
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__STEREOCHEMISTRY:
				return basicSetStereochemistry(null, msgs);
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__OPTICAL_ACTIVITY:
				return basicSetOpticalActivity(null, msgs);
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MOLECULAR_FORMULA:
				return basicSetMolecularFormula(null, msgs);
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_QUANTITY:
				return basicSetAmountQuantity(null, msgs);
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_STRING:
				return basicSetAmountString(null, msgs);
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MEASUREMENT_TYPE:
				return basicSetMeasurementType(null, msgs);
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
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__ROLE:
				return getRole();
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__NAME:
				return getName();
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__STEREOCHEMISTRY:
				return getStereochemistry();
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__OPTICAL_ACTIVITY:
				return getOpticalActivity();
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MOLECULAR_FORMULA:
				return getMolecularFormula();
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_QUANTITY:
				return getAmountQuantity();
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_STRING:
				return getAmountString();
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MEASUREMENT_TYPE:
				return getMeasurementType();
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
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__ROLE:
				setRole((CodeableConcept)newValue);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__STEREOCHEMISTRY:
				setStereochemistry((CodeableConcept)newValue);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__OPTICAL_ACTIVITY:
				setOpticalActivity((CodeableConcept)newValue);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MOLECULAR_FORMULA:
				setMolecularFormula((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_QUANTITY:
				setAmountQuantity((Quantity)newValue);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_STRING:
				setAmountString((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MEASUREMENT_TYPE:
				setMeasurementType((CodeableConcept)newValue);
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
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__ROLE:
				setRole((CodeableConcept)null);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__STEREOCHEMISTRY:
				setStereochemistry((CodeableConcept)null);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__OPTICAL_ACTIVITY:
				setOpticalActivity((CodeableConcept)null);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MOLECULAR_FORMULA:
				setMolecularFormula((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_QUANTITY:
				setAmountQuantity((Quantity)null);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_STRING:
				setAmountString((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MEASUREMENT_TYPE:
				setMeasurementType((CodeableConcept)null);
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
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__ROLE:
				return role != null;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__IDENTIFIER:
				return identifier != null;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__NAME:
				return name != null;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__STEREOCHEMISTRY:
				return stereochemistry != null;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__OPTICAL_ACTIVITY:
				return opticalActivity != null;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MOLECULAR_FORMULA:
				return molecularFormula != null;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_QUANTITY:
				return amountQuantity != null;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__AMOUNT_STRING:
				return amountString != null;
			case FHIRPackage.SUBSTANCE_DEFINITION_MOIETY__MEASUREMENT_TYPE:
				return measurementType != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceDefinitionMoietyImpl
