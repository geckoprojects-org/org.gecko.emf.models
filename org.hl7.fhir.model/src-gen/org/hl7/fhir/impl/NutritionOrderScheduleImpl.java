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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.NutritionOrderSchedule;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderScheduleImpl#getTiming <em>Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderScheduleImpl#getAsNeeded <em>As Needed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderScheduleImpl#getAsNeededFor <em>As Needed For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderScheduleImpl extends BackboneElementImpl implements NutritionOrderSchedule {
	/**
	 * The cached value of the '{@link #getTiming() <em>Timing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiming()
	 * @generated
	 * @ordered
	 */
	protected EList<Timing> timing;

	/**
	 * The cached value of the '{@link #getAsNeeded() <em>As Needed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeeded()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean asNeeded;

	/**
	 * The cached value of the '{@link #getAsNeededFor() <em>As Needed For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededFor()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept asNeededFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getNutritionOrderSchedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Timing> getTiming() {
		if (timing == null) {
			timing = new EObjectContainmentEList<Timing>(Timing.class, this, FHIRPackage.NUTRITION_ORDER_SCHEDULE__TIMING);
		}
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAsNeeded() {
		return asNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeeded(org.hl7.fhir.Boolean newAsNeeded, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAsNeeded = asNeeded;
		asNeeded = newAsNeeded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED, oldAsNeeded, newAsNeeded);
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
	public void setAsNeeded(org.hl7.fhir.Boolean newAsNeeded) {
		if (newAsNeeded != asNeeded) {
			NotificationChain msgs = null;
			if (asNeeded != null)
				msgs = ((InternalEObject)asNeeded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED, null, msgs);
			if (newAsNeeded != null)
				msgs = ((InternalEObject)newAsNeeded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED, null, msgs);
			msgs = basicSetAsNeeded(newAsNeeded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED, newAsNeeded, newAsNeeded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAsNeededFor() {
		return asNeededFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeededFor(CodeableConcept newAsNeededFor, NotificationChain msgs) {
		CodeableConcept oldAsNeededFor = asNeededFor;
		asNeededFor = newAsNeededFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED_FOR, oldAsNeededFor, newAsNeededFor);
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
	public void setAsNeededFor(CodeableConcept newAsNeededFor) {
		if (newAsNeededFor != asNeededFor) {
			NotificationChain msgs = null;
			if (asNeededFor != null)
				msgs = ((InternalEObject)asNeededFor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED_FOR, null, msgs);
			if (newAsNeededFor != null)
				msgs = ((InternalEObject)newAsNeededFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED_FOR, null, msgs);
			msgs = basicSetAsNeededFor(newAsNeededFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED_FOR, newAsNeededFor, newAsNeededFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__TIMING:
				return ((InternalEList<?>)getTiming()).basicRemove(otherEnd, msgs);
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED:
				return basicSetAsNeeded(null, msgs);
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED_FOR:
				return basicSetAsNeededFor(null, msgs);
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
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__TIMING:
				return getTiming();
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED:
				return getAsNeeded();
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED_FOR:
				return getAsNeededFor();
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
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends Timing>)newValue);
				return;
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED:
				setAsNeeded((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED_FOR:
				setAsNeededFor((CodeableConcept)newValue);
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
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__TIMING:
				getTiming().clear();
				return;
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED:
				setAsNeeded((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED_FOR:
				setAsNeededFor((CodeableConcept)null);
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
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__TIMING:
				return timing != null && !timing.isEmpty();
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED:
				return asNeeded != null;
			case FHIRPackage.NUTRITION_ORDER_SCHEDULE__AS_NEEDED_FOR:
				return asNeededFor != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderScheduleImpl
