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

import org.hl7.fhir.AdministrableProductDefinitionRouteOfAdministration;
import org.hl7.fhir.AdministrableProductDefinitionTargetSpecies;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Ratio;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrable Product Definition Route Of Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionRouteOfAdministrationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionRouteOfAdministrationImpl#getFirstDose <em>First Dose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionRouteOfAdministrationImpl#getMaxSingleDose <em>Max Single Dose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionRouteOfAdministrationImpl#getMaxDosePerDay <em>Max Dose Per Day</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionRouteOfAdministrationImpl#getMaxDosePerTreatmentPeriod <em>Max Dose Per Treatment Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionRouteOfAdministrationImpl#getMaxTreatmentPeriod <em>Max Treatment Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionRouteOfAdministrationImpl#getTargetSpecies <em>Target Species</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdministrableProductDefinitionRouteOfAdministrationImpl extends BackboneElementImpl implements AdministrableProductDefinitionRouteOfAdministration {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getFirstDose() <em>First Dose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstDose()
	 * @generated
	 * @ordered
	 */
	protected Quantity firstDose;

	/**
	 * The cached value of the '{@link #getMaxSingleDose() <em>Max Single Dose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSingleDose()
	 * @generated
	 * @ordered
	 */
	protected Quantity maxSingleDose;

	/**
	 * The cached value of the '{@link #getMaxDosePerDay() <em>Max Dose Per Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDosePerDay()
	 * @generated
	 * @ordered
	 */
	protected Quantity maxDosePerDay;

	/**
	 * The cached value of the '{@link #getMaxDosePerTreatmentPeriod() <em>Max Dose Per Treatment Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDosePerTreatmentPeriod()
	 * @generated
	 * @ordered
	 */
	protected Ratio maxDosePerTreatmentPeriod;

	/**
	 * The cached value of the '{@link #getMaxTreatmentPeriod() <em>Max Treatment Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTreatmentPeriod()
	 * @generated
	 * @ordered
	 */
	protected Duration maxTreatmentPeriod;

	/**
	 * The cached value of the '{@link #getTargetSpecies() <em>Target Species</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSpecies()
	 * @generated
	 * @ordered
	 */
	protected EList<AdministrableProductDefinitionTargetSpecies> targetSpecies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministrableProductDefinitionRouteOfAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getAdministrableProductDefinitionRouteOfAdministration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getFirstDose() {
		return firstDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstDose(Quantity newFirstDose, NotificationChain msgs) {
		Quantity oldFirstDose = firstDose;
		firstDose = newFirstDose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__FIRST_DOSE, oldFirstDose, newFirstDose);
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
	public void setFirstDose(Quantity newFirstDose) {
		if (newFirstDose != firstDose) {
			NotificationChain msgs = null;
			if (firstDose != null)
				msgs = ((InternalEObject)firstDose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__FIRST_DOSE, null, msgs);
			if (newFirstDose != null)
				msgs = ((InternalEObject)newFirstDose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__FIRST_DOSE, null, msgs);
			msgs = basicSetFirstDose(newFirstDose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__FIRST_DOSE, newFirstDose, newFirstDose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getMaxSingleDose() {
		return maxSingleDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxSingleDose(Quantity newMaxSingleDose, NotificationChain msgs) {
		Quantity oldMaxSingleDose = maxSingleDose;
		maxSingleDose = newMaxSingleDose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_SINGLE_DOSE, oldMaxSingleDose, newMaxSingleDose);
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
	public void setMaxSingleDose(Quantity newMaxSingleDose) {
		if (newMaxSingleDose != maxSingleDose) {
			NotificationChain msgs = null;
			if (maxSingleDose != null)
				msgs = ((InternalEObject)maxSingleDose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_SINGLE_DOSE, null, msgs);
			if (newMaxSingleDose != null)
				msgs = ((InternalEObject)newMaxSingleDose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_SINGLE_DOSE, null, msgs);
			msgs = basicSetMaxSingleDose(newMaxSingleDose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_SINGLE_DOSE, newMaxSingleDose, newMaxSingleDose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getMaxDosePerDay() {
		return maxDosePerDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDosePerDay(Quantity newMaxDosePerDay, NotificationChain msgs) {
		Quantity oldMaxDosePerDay = maxDosePerDay;
		maxDosePerDay = newMaxDosePerDay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_DAY, oldMaxDosePerDay, newMaxDosePerDay);
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
	public void setMaxDosePerDay(Quantity newMaxDosePerDay) {
		if (newMaxDosePerDay != maxDosePerDay) {
			NotificationChain msgs = null;
			if (maxDosePerDay != null)
				msgs = ((InternalEObject)maxDosePerDay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_DAY, null, msgs);
			if (newMaxDosePerDay != null)
				msgs = ((InternalEObject)newMaxDosePerDay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_DAY, null, msgs);
			msgs = basicSetMaxDosePerDay(newMaxDosePerDay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_DAY, newMaxDosePerDay, newMaxDosePerDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getMaxDosePerTreatmentPeriod() {
		return maxDosePerTreatmentPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDosePerTreatmentPeriod(Ratio newMaxDosePerTreatmentPeriod, NotificationChain msgs) {
		Ratio oldMaxDosePerTreatmentPeriod = maxDosePerTreatmentPeriod;
		maxDosePerTreatmentPeriod = newMaxDosePerTreatmentPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_TREATMENT_PERIOD, oldMaxDosePerTreatmentPeriod, newMaxDosePerTreatmentPeriod);
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
	public void setMaxDosePerTreatmentPeriod(Ratio newMaxDosePerTreatmentPeriod) {
		if (newMaxDosePerTreatmentPeriod != maxDosePerTreatmentPeriod) {
			NotificationChain msgs = null;
			if (maxDosePerTreatmentPeriod != null)
				msgs = ((InternalEObject)maxDosePerTreatmentPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_TREATMENT_PERIOD, null, msgs);
			if (newMaxDosePerTreatmentPeriod != null)
				msgs = ((InternalEObject)newMaxDosePerTreatmentPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_TREATMENT_PERIOD, null, msgs);
			msgs = basicSetMaxDosePerTreatmentPeriod(newMaxDosePerTreatmentPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_TREATMENT_PERIOD, newMaxDosePerTreatmentPeriod, newMaxDosePerTreatmentPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getMaxTreatmentPeriod() {
		return maxTreatmentPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxTreatmentPeriod(Duration newMaxTreatmentPeriod, NotificationChain msgs) {
		Duration oldMaxTreatmentPeriod = maxTreatmentPeriod;
		maxTreatmentPeriod = newMaxTreatmentPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_TREATMENT_PERIOD, oldMaxTreatmentPeriod, newMaxTreatmentPeriod);
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
	public void setMaxTreatmentPeriod(Duration newMaxTreatmentPeriod) {
		if (newMaxTreatmentPeriod != maxTreatmentPeriod) {
			NotificationChain msgs = null;
			if (maxTreatmentPeriod != null)
				msgs = ((InternalEObject)maxTreatmentPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_TREATMENT_PERIOD, null, msgs);
			if (newMaxTreatmentPeriod != null)
				msgs = ((InternalEObject)newMaxTreatmentPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_TREATMENT_PERIOD, null, msgs);
			msgs = basicSetMaxTreatmentPeriod(newMaxTreatmentPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_TREATMENT_PERIOD, newMaxTreatmentPeriod, newMaxTreatmentPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdministrableProductDefinitionTargetSpecies> getTargetSpecies() {
		if (targetSpecies == null) {
			targetSpecies = new EObjectContainmentEList<AdministrableProductDefinitionTargetSpecies>(AdministrableProductDefinitionTargetSpecies.class, this, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__TARGET_SPECIES);
		}
		return targetSpecies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__FIRST_DOSE:
				return basicSetFirstDose(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_SINGLE_DOSE:
				return basicSetMaxSingleDose(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_DAY:
				return basicSetMaxDosePerDay(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_TREATMENT_PERIOD:
				return basicSetMaxDosePerTreatmentPeriod(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_TREATMENT_PERIOD:
				return basicSetMaxTreatmentPeriod(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__TARGET_SPECIES:
				return ((InternalEList<?>)getTargetSpecies()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__CODE:
				return getCode();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__FIRST_DOSE:
				return getFirstDose();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_SINGLE_DOSE:
				return getMaxSingleDose();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_DAY:
				return getMaxDosePerDay();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_TREATMENT_PERIOD:
				return getMaxDosePerTreatmentPeriod();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_TREATMENT_PERIOD:
				return getMaxTreatmentPeriod();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__TARGET_SPECIES:
				return getTargetSpecies();
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
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__FIRST_DOSE:
				setFirstDose((Quantity)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_SINGLE_DOSE:
				setMaxSingleDose((Quantity)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_DAY:
				setMaxDosePerDay((Quantity)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_TREATMENT_PERIOD:
				setMaxDosePerTreatmentPeriod((Ratio)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_TREATMENT_PERIOD:
				setMaxTreatmentPeriod((Duration)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__TARGET_SPECIES:
				getTargetSpecies().clear();
				getTargetSpecies().addAll((Collection<? extends AdministrableProductDefinitionTargetSpecies>)newValue);
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
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__FIRST_DOSE:
				setFirstDose((Quantity)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_SINGLE_DOSE:
				setMaxSingleDose((Quantity)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_DAY:
				setMaxDosePerDay((Quantity)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_TREATMENT_PERIOD:
				setMaxDosePerTreatmentPeriod((Ratio)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_TREATMENT_PERIOD:
				setMaxTreatmentPeriod((Duration)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__TARGET_SPECIES:
				getTargetSpecies().clear();
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
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__CODE:
				return code != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__FIRST_DOSE:
				return firstDose != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_SINGLE_DOSE:
				return maxSingleDose != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_DAY:
				return maxDosePerDay != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_DOSE_PER_TREATMENT_PERIOD:
				return maxDosePerTreatmentPeriod != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__MAX_TREATMENT_PERIOD:
				return maxTreatmentPeriod != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION__TARGET_SPECIES:
				return targetSpecies != null && !targetSpecies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdministrableProductDefinitionRouteOfAdministrationImpl
