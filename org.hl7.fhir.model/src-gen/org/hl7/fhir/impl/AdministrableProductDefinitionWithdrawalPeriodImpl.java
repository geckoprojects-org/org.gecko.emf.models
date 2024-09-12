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

import org.hl7.fhir.AdministrableProductDefinitionWithdrawalPeriod;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrable Product Definition Withdrawal Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionWithdrawalPeriodImpl#getTissue <em>Tissue</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionWithdrawalPeriodImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionWithdrawalPeriodImpl#getSupportingInformation <em>Supporting Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdministrableProductDefinitionWithdrawalPeriodImpl extends BackboneElementImpl implements AdministrableProductDefinitionWithdrawalPeriod {
	/**
	 * The cached value of the '{@link #getTissue() <em>Tissue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTissue()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept tissue;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Quantity value;

	/**
	 * The cached value of the '{@link #getSupportingInformation() <em>Supporting Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String supportingInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministrableProductDefinitionWithdrawalPeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getAdministrableProductDefinitionWithdrawalPeriod();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTissue() {
		return tissue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTissue(CodeableConcept newTissue, NotificationChain msgs) {
		CodeableConcept oldTissue = tissue;
		tissue = newTissue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__TISSUE, oldTissue, newTissue);
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
	public void setTissue(CodeableConcept newTissue) {
		if (newTissue != tissue) {
			NotificationChain msgs = null;
			if (tissue != null)
				msgs = ((InternalEObject)tissue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__TISSUE, null, msgs);
			if (newTissue != null)
				msgs = ((InternalEObject)newTissue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__TISSUE, null, msgs);
			msgs = basicSetTissue(newTissue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__TISSUE, newTissue, newTissue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Quantity newValue, NotificationChain msgs) {
		Quantity oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__VALUE, oldValue, newValue);
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
	public void setValue(Quantity newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSupportingInformation() {
		return supportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportingInformation(org.hl7.fhir.String newSupportingInformation, NotificationChain msgs) {
		org.hl7.fhir.String oldSupportingInformation = supportingInformation;
		supportingInformation = newSupportingInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION, oldSupportingInformation, newSupportingInformation);
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
	public void setSupportingInformation(org.hl7.fhir.String newSupportingInformation) {
		if (newSupportingInformation != supportingInformation) {
			NotificationChain msgs = null;
			if (supportingInformation != null)
				msgs = ((InternalEObject)supportingInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION, null, msgs);
			if (newSupportingInformation != null)
				msgs = ((InternalEObject)newSupportingInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION, null, msgs);
			msgs = basicSetSupportingInformation(newSupportingInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION, newSupportingInformation, newSupportingInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__TISSUE:
				return basicSetTissue(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__VALUE:
				return basicSetValue(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION:
				return basicSetSupportingInformation(null, msgs);
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
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__TISSUE:
				return getTissue();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__VALUE:
				return getValue();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION:
				return getSupportingInformation();
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
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__TISSUE:
				setTissue((CodeableConcept)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__VALUE:
				setValue((Quantity)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION:
				setSupportingInformation((org.hl7.fhir.String)newValue);
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
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__TISSUE:
				setTissue((CodeableConcept)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__VALUE:
				setValue((Quantity)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION:
				setSupportingInformation((org.hl7.fhir.String)null);
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
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__TISSUE:
				return tissue != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__VALUE:
				return value != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION:
				return supportingInformation != null;
		}
		return super.eIsSet(featureID);
	}

} //AdministrableProductDefinitionWithdrawalPeriodImpl
