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
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.MedicationIngredient;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Ratio;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationIngredientImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationIngredientImpl#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationIngredientImpl#getStrengthRatio <em>Strength Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationIngredientImpl#getStrengthCodeableConcept <em>Strength Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationIngredientImpl#getStrengthQuantity <em>Strength Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationIngredientImpl extends BackboneElementImpl implements MedicationIngredient {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference item;

	/**
	 * The cached value of the '{@link #getIsActive() <em>Is Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isActive;

	/**
	 * The cached value of the '{@link #getStrengthRatio() <em>Strength Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengthRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio strengthRatio;

	/**
	 * The cached value of the '{@link #getStrengthCodeableConcept() <em>Strength Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengthCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept strengthCodeableConcept;

	/**
	 * The cached value of the '{@link #getStrengthQuantity() <em>Strength Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengthQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity strengthQuantity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationIngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getMedicationIngredient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(CodeableReference newItem, NotificationChain msgs) {
		CodeableReference oldItem = item;
		item = newItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_INGREDIENT__ITEM, oldItem, newItem);
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
	public void setItem(CodeableReference newItem) {
		if (newItem != item) {
			NotificationChain msgs = null;
			if (item != null)
				msgs = ((InternalEObject)item).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_INGREDIENT__ITEM, null, msgs);
			if (newItem != null)
				msgs = ((InternalEObject)newItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_INGREDIENT__ITEM, null, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_INGREDIENT__ITEM, newItem, newItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsActive(org.hl7.fhir.Boolean newIsActive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_INGREDIENT__IS_ACTIVE, oldIsActive, newIsActive);
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
	public void setIsActive(org.hl7.fhir.Boolean newIsActive) {
		if (newIsActive != isActive) {
			NotificationChain msgs = null;
			if (isActive != null)
				msgs = ((InternalEObject)isActive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_INGREDIENT__IS_ACTIVE, null, msgs);
			if (newIsActive != null)
				msgs = ((InternalEObject)newIsActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_INGREDIENT__IS_ACTIVE, null, msgs);
			msgs = basicSetIsActive(newIsActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_INGREDIENT__IS_ACTIVE, newIsActive, newIsActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getStrengthRatio() {
		return strengthRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrengthRatio(Ratio newStrengthRatio, NotificationChain msgs) {
		Ratio oldStrengthRatio = strengthRatio;
		strengthRatio = newStrengthRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_RATIO, oldStrengthRatio, newStrengthRatio);
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
	public void setStrengthRatio(Ratio newStrengthRatio) {
		if (newStrengthRatio != strengthRatio) {
			NotificationChain msgs = null;
			if (strengthRatio != null)
				msgs = ((InternalEObject)strengthRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_RATIO, null, msgs);
			if (newStrengthRatio != null)
				msgs = ((InternalEObject)newStrengthRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_RATIO, null, msgs);
			msgs = basicSetStrengthRatio(newStrengthRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_RATIO, newStrengthRatio, newStrengthRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStrengthCodeableConcept() {
		return strengthCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrengthCodeableConcept(CodeableConcept newStrengthCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldStrengthCodeableConcept = strengthCodeableConcept;
		strengthCodeableConcept = newStrengthCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_CODEABLE_CONCEPT, oldStrengthCodeableConcept, newStrengthCodeableConcept);
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
	public void setStrengthCodeableConcept(CodeableConcept newStrengthCodeableConcept) {
		if (newStrengthCodeableConcept != strengthCodeableConcept) {
			NotificationChain msgs = null;
			if (strengthCodeableConcept != null)
				msgs = ((InternalEObject)strengthCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_CODEABLE_CONCEPT, null, msgs);
			if (newStrengthCodeableConcept != null)
				msgs = ((InternalEObject)newStrengthCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetStrengthCodeableConcept(newStrengthCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_CODEABLE_CONCEPT, newStrengthCodeableConcept, newStrengthCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getStrengthQuantity() {
		return strengthQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrengthQuantity(Quantity newStrengthQuantity, NotificationChain msgs) {
		Quantity oldStrengthQuantity = strengthQuantity;
		strengthQuantity = newStrengthQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_QUANTITY, oldStrengthQuantity, newStrengthQuantity);
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
	public void setStrengthQuantity(Quantity newStrengthQuantity) {
		if (newStrengthQuantity != strengthQuantity) {
			NotificationChain msgs = null;
			if (strengthQuantity != null)
				msgs = ((InternalEObject)strengthQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_QUANTITY, null, msgs);
			if (newStrengthQuantity != null)
				msgs = ((InternalEObject)newStrengthQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_QUANTITY, null, msgs);
			msgs = basicSetStrengthQuantity(newStrengthQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_QUANTITY, newStrengthQuantity, newStrengthQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.MEDICATION_INGREDIENT__ITEM:
				return basicSetItem(null, msgs);
			case FHIRPackage.MEDICATION_INGREDIENT__IS_ACTIVE:
				return basicSetIsActive(null, msgs);
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_RATIO:
				return basicSetStrengthRatio(null, msgs);
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_CODEABLE_CONCEPT:
				return basicSetStrengthCodeableConcept(null, msgs);
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_QUANTITY:
				return basicSetStrengthQuantity(null, msgs);
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
			case FHIRPackage.MEDICATION_INGREDIENT__ITEM:
				return getItem();
			case FHIRPackage.MEDICATION_INGREDIENT__IS_ACTIVE:
				return getIsActive();
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_RATIO:
				return getStrengthRatio();
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_CODEABLE_CONCEPT:
				return getStrengthCodeableConcept();
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_QUANTITY:
				return getStrengthQuantity();
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
			case FHIRPackage.MEDICATION_INGREDIENT__ITEM:
				setItem((CodeableReference)newValue);
				return;
			case FHIRPackage.MEDICATION_INGREDIENT__IS_ACTIVE:
				setIsActive((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_RATIO:
				setStrengthRatio((Ratio)newValue);
				return;
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_CODEABLE_CONCEPT:
				setStrengthCodeableConcept((CodeableConcept)newValue);
				return;
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_QUANTITY:
				setStrengthQuantity((Quantity)newValue);
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
			case FHIRPackage.MEDICATION_INGREDIENT__ITEM:
				setItem((CodeableReference)null);
				return;
			case FHIRPackage.MEDICATION_INGREDIENT__IS_ACTIVE:
				setIsActive((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_RATIO:
				setStrengthRatio((Ratio)null);
				return;
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_CODEABLE_CONCEPT:
				setStrengthCodeableConcept((CodeableConcept)null);
				return;
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_QUANTITY:
				setStrengthQuantity((Quantity)null);
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
			case FHIRPackage.MEDICATION_INGREDIENT__ITEM:
				return item != null;
			case FHIRPackage.MEDICATION_INGREDIENT__IS_ACTIVE:
				return isActive != null;
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_RATIO:
				return strengthRatio != null;
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_CODEABLE_CONCEPT:
				return strengthCodeableConcept != null;
			case FHIRPackage.MEDICATION_INGREDIENT__STRENGTH_QUANTITY:
				return strengthQuantity != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationIngredientImpl
