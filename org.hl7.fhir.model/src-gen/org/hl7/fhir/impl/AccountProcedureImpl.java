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

import org.hl7.fhir.AccountProcedure;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AccountProcedureImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountProcedureImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountProcedureImpl#getDateOfService <em>Date Of Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountProcedureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountProcedureImpl#getPackageCode <em>Package Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountProcedureImpl#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountProcedureImpl extends BackboneElementImpl implements AccountProcedure {
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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference code;

	/**
	 * The cached value of the '{@link #getDateOfService() <em>Date Of Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfService()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateOfService;

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
	 * The cached value of the '{@link #getPackageCode() <em>Package Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> packageCode;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> device;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getAccountProcedure();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACCOUNT_PROCEDURE__SEQUENCE, oldSequence, newSequence);
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
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACCOUNT_PROCEDURE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACCOUNT_PROCEDURE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACCOUNT_PROCEDURE__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableReference newCode, NotificationChain msgs) {
		CodeableReference oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACCOUNT_PROCEDURE__CODE, oldCode, newCode);
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
	public void setCode(CodeableReference newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACCOUNT_PROCEDURE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACCOUNT_PROCEDURE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACCOUNT_PROCEDURE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDateOfService() {
		return dateOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateOfService(DateTime newDateOfService, NotificationChain msgs) {
		DateTime oldDateOfService = dateOfService;
		dateOfService = newDateOfService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACCOUNT_PROCEDURE__DATE_OF_SERVICE, oldDateOfService, newDateOfService);
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
	public void setDateOfService(DateTime newDateOfService) {
		if (newDateOfService != dateOfService) {
			NotificationChain msgs = null;
			if (dateOfService != null)
				msgs = ((InternalEObject)dateOfService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACCOUNT_PROCEDURE__DATE_OF_SERVICE, null, msgs);
			if (newDateOfService != null)
				msgs = ((InternalEObject)newDateOfService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACCOUNT_PROCEDURE__DATE_OF_SERVICE, null, msgs);
			msgs = basicSetDateOfService(newDateOfService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACCOUNT_PROCEDURE__DATE_OF_SERVICE, newDateOfService, newDateOfService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.ACCOUNT_PROCEDURE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getPackageCode() {
		if (packageCode == null) {
			packageCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.ACCOUNT_PROCEDURE__PACKAGE_CODE);
		}
		return packageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.ACCOUNT_PROCEDURE__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.ACCOUNT_PROCEDURE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FHIRPackage.ACCOUNT_PROCEDURE__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.ACCOUNT_PROCEDURE__DATE_OF_SERVICE:
				return basicSetDateOfService(null, msgs);
			case FHIRPackage.ACCOUNT_PROCEDURE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACCOUNT_PROCEDURE__PACKAGE_CODE:
				return ((InternalEList<?>)getPackageCode()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACCOUNT_PROCEDURE__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.ACCOUNT_PROCEDURE__SEQUENCE:
				return getSequence();
			case FHIRPackage.ACCOUNT_PROCEDURE__CODE:
				return getCode();
			case FHIRPackage.ACCOUNT_PROCEDURE__DATE_OF_SERVICE:
				return getDateOfService();
			case FHIRPackage.ACCOUNT_PROCEDURE__TYPE:
				return getType();
			case FHIRPackage.ACCOUNT_PROCEDURE__PACKAGE_CODE:
				return getPackageCode();
			case FHIRPackage.ACCOUNT_PROCEDURE__DEVICE:
				return getDevice();
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
			case FHIRPackage.ACCOUNT_PROCEDURE__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FHIRPackage.ACCOUNT_PROCEDURE__CODE:
				setCode((CodeableReference)newValue);
				return;
			case FHIRPackage.ACCOUNT_PROCEDURE__DATE_OF_SERVICE:
				setDateOfService((DateTime)newValue);
				return;
			case FHIRPackage.ACCOUNT_PROCEDURE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.ACCOUNT_PROCEDURE__PACKAGE_CODE:
				getPackageCode().clear();
				getPackageCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.ACCOUNT_PROCEDURE__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends Reference>)newValue);
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
			case FHIRPackage.ACCOUNT_PROCEDURE__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FHIRPackage.ACCOUNT_PROCEDURE__CODE:
				setCode((CodeableReference)null);
				return;
			case FHIRPackage.ACCOUNT_PROCEDURE__DATE_OF_SERVICE:
				setDateOfService((DateTime)null);
				return;
			case FHIRPackage.ACCOUNT_PROCEDURE__TYPE:
				getType().clear();
				return;
			case FHIRPackage.ACCOUNT_PROCEDURE__PACKAGE_CODE:
				getPackageCode().clear();
				return;
			case FHIRPackage.ACCOUNT_PROCEDURE__DEVICE:
				getDevice().clear();
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
			case FHIRPackage.ACCOUNT_PROCEDURE__SEQUENCE:
				return sequence != null;
			case FHIRPackage.ACCOUNT_PROCEDURE__CODE:
				return code != null;
			case FHIRPackage.ACCOUNT_PROCEDURE__DATE_OF_SERVICE:
				return dateOfService != null;
			case FHIRPackage.ACCOUNT_PROCEDURE__TYPE:
				return type != null && !type.isEmpty();
			case FHIRPackage.ACCOUNT_PROCEDURE__PACKAGE_CODE:
				return packageCode != null && !packageCode.isEmpty();
			case FHIRPackage.ACCOUNT_PROCEDURE__DEVICE:
				return device != null && !device.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccountProcedureImpl
