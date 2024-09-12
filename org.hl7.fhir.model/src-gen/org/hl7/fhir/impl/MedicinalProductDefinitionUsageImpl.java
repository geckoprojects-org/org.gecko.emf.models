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
import org.hl7.fhir.MedicinalProductDefinitionUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Definition Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionUsageImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionUsageImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDefinitionUsageImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductDefinitionUsageImpl extends BackboneElementImpl implements MedicinalProductDefinitionUsage {
	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept country;

	/**
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept jurisdiction;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept language;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductDefinitionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getMedicinalProductDefinitionUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(CodeableConcept newCountry, NotificationChain msgs) {
		CodeableConcept oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__COUNTRY, oldCountry, newCountry);
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
	public void setCountry(CodeableConcept newCountry) {
		if (newCountry != country) {
			NotificationChain msgs = null;
			if (country != null)
				msgs = ((InternalEObject)country).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__COUNTRY, null, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__COUNTRY, null, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__COUNTRY, newCountry, newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getJurisdiction() {
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJurisdiction(CodeableConcept newJurisdiction, NotificationChain msgs) {
		CodeableConcept oldJurisdiction = jurisdiction;
		jurisdiction = newJurisdiction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__JURISDICTION, oldJurisdiction, newJurisdiction);
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
	public void setJurisdiction(CodeableConcept newJurisdiction) {
		if (newJurisdiction != jurisdiction) {
			NotificationChain msgs = null;
			if (jurisdiction != null)
				msgs = ((InternalEObject)jurisdiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__JURISDICTION, null, msgs);
			if (newJurisdiction != null)
				msgs = ((InternalEObject)newJurisdiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__JURISDICTION, null, msgs);
			msgs = basicSetJurisdiction(newJurisdiction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__JURISDICTION, newJurisdiction, newJurisdiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(CodeableConcept newLanguage, NotificationChain msgs) {
		CodeableConcept oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__LANGUAGE, oldLanguage, newLanguage);
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
	public void setLanguage(CodeableConcept newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__COUNTRY:
				return basicSetCountry(null, msgs);
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__JURISDICTION:
				return basicSetJurisdiction(null, msgs);
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__LANGUAGE:
				return basicSetLanguage(null, msgs);
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
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__COUNTRY:
				return getCountry();
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__JURISDICTION:
				return getJurisdiction();
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__LANGUAGE:
				return getLanguage();
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
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__COUNTRY:
				setCountry((CodeableConcept)newValue);
				return;
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__JURISDICTION:
				setJurisdiction((CodeableConcept)newValue);
				return;
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__LANGUAGE:
				setLanguage((CodeableConcept)newValue);
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
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__COUNTRY:
				setCountry((CodeableConcept)null);
				return;
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__JURISDICTION:
				setJurisdiction((CodeableConcept)null);
				return;
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__LANGUAGE:
				setLanguage((CodeableConcept)null);
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
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__COUNTRY:
				return country != null;
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__JURISDICTION:
				return jurisdiction != null;
			case FHIRPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE__LANGUAGE:
				return language != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductDefinitionUsageImpl
