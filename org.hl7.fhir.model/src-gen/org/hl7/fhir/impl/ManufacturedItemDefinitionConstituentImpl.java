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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.ManufacturedItemDefinitionConstituent;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manufactured Item Definition Constituent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ManufacturedItemDefinitionConstituentImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ManufacturedItemDefinitionConstituentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ManufacturedItemDefinitionConstituentImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ManufacturedItemDefinitionConstituentImpl#getHasIngredient <em>Has Ingredient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManufacturedItemDefinitionConstituentImpl extends BackboneElementImpl implements ManufacturedItemDefinitionConstituent {
	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> amount;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> location;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> function;

	/**
	 * The cached value of the '{@link #getHasIngredient() <em>Has Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIngredient()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> hasIngredient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufacturedItemDefinitionConstituentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getManufacturedItemDefinitionConstituent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Quantity> getAmount() {
		if (amount == null) {
			amount = new EObjectContainmentEList<Quantity>(Quantity.class, this, FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__AMOUNT);
		}
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getHasIngredient() {
		if (hasIngredient == null) {
			hasIngredient = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__HAS_INGREDIENT);
		}
		return hasIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__AMOUNT:
				return ((InternalEList<?>)getAmount()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__HAS_INGREDIENT:
				return ((InternalEList<?>)getHasIngredient()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__AMOUNT:
				return getAmount();
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__LOCATION:
				return getLocation();
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__FUNCTION:
				return getFunction();
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__HAS_INGREDIENT:
				return getHasIngredient();
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
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__AMOUNT:
				getAmount().clear();
				getAmount().addAll((Collection<? extends Quantity>)newValue);
				return;
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__HAS_INGREDIENT:
				getHasIngredient().clear();
				getHasIngredient().addAll((Collection<? extends CodeableReference>)newValue);
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
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__AMOUNT:
				getAmount().clear();
				return;
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__LOCATION:
				getLocation().clear();
				return;
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__FUNCTION:
				getFunction().clear();
				return;
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__HAS_INGREDIENT:
				getHasIngredient().clear();
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
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__AMOUNT:
				return amount != null && !amount.isEmpty();
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__LOCATION:
				return location != null && !location.isEmpty();
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__FUNCTION:
				return function != null && !function.isEmpty();
			case FHIRPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT__HAS_INGREDIENT:
				return hasIngredient != null && !hasIngredient.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManufacturedItemDefinitionConstituentImpl
