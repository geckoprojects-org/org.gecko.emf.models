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

import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.NutritionOrderAdministration;
import org.hl7.fhir.NutritionOrderSchedule2;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Ratio;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderAdministrationImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderAdministrationImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderAdministrationImpl#getRateQuantity <em>Rate Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderAdministrationImpl#getRateRatio <em>Rate Ratio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderAdministrationImpl extends BackboneElementImpl implements NutritionOrderAdministration {
	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected NutritionOrderSchedule2 schedule;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getRateQuantity() <em>Rate Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity rateQuantity;

	/**
	 * The cached value of the '{@link #getRateRatio() <em>Rate Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio rateRatio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getNutritionOrderAdministration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderSchedule2 getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(NutritionOrderSchedule2 newSchedule, NotificationChain msgs) {
		NutritionOrderSchedule2 oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__SCHEDULE, oldSchedule, newSchedule);
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
	public void setSchedule(NutritionOrderSchedule2 newSchedule) {
		if (newSchedule != schedule) {
			NotificationChain msgs = null;
			if (schedule != null)
				msgs = ((InternalEObject)schedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__SCHEDULE, null, msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__SCHEDULE, null, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__SCHEDULE, newSchedule, newSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getRateQuantity() {
		return rateQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateQuantity(Quantity newRateQuantity, NotificationChain msgs) {
		Quantity oldRateQuantity = rateQuantity;
		rateQuantity = newRateQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_QUANTITY, oldRateQuantity, newRateQuantity);
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
	public void setRateQuantity(Quantity newRateQuantity) {
		if (newRateQuantity != rateQuantity) {
			NotificationChain msgs = null;
			if (rateQuantity != null)
				msgs = ((InternalEObject)rateQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_QUANTITY, null, msgs);
			if (newRateQuantity != null)
				msgs = ((InternalEObject)newRateQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_QUANTITY, null, msgs);
			msgs = basicSetRateQuantity(newRateQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_QUANTITY, newRateQuantity, newRateQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getRateRatio() {
		return rateRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateRatio(Ratio newRateRatio, NotificationChain msgs) {
		Ratio oldRateRatio = rateRatio;
		rateRatio = newRateRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_RATIO, oldRateRatio, newRateRatio);
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
	public void setRateRatio(Ratio newRateRatio) {
		if (newRateRatio != rateRatio) {
			NotificationChain msgs = null;
			if (rateRatio != null)
				msgs = ((InternalEObject)rateRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_RATIO, null, msgs);
			if (newRateRatio != null)
				msgs = ((InternalEObject)newRateRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_RATIO, null, msgs);
			msgs = basicSetRateRatio(newRateRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_RATIO, newRateRatio, newRateRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__SCHEDULE:
				return basicSetSchedule(null, msgs);
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_QUANTITY:
				return basicSetRateQuantity(null, msgs);
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_RATIO:
				return basicSetRateRatio(null, msgs);
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
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__SCHEDULE:
				return getSchedule();
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__QUANTITY:
				return getQuantity();
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_QUANTITY:
				return getRateQuantity();
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_RATIO:
				return getRateRatio();
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
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__SCHEDULE:
				setSchedule((NutritionOrderSchedule2)newValue);
				return;
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_QUANTITY:
				setRateQuantity((Quantity)newValue);
				return;
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_RATIO:
				setRateRatio((Ratio)newValue);
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
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__SCHEDULE:
				setSchedule((NutritionOrderSchedule2)null);
				return;
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_QUANTITY:
				setRateQuantity((Quantity)null);
				return;
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_RATIO:
				setRateRatio((Ratio)null);
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
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__SCHEDULE:
				return schedule != null;
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__QUANTITY:
				return quantity != null;
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_QUANTITY:
				return rateQuantity != null;
			case FHIRPackage.NUTRITION_ORDER_ADMINISTRATION__RATE_RATIO:
				return rateRatio != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderAdministrationImpl
