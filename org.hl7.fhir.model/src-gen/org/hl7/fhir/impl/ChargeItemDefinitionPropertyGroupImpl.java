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

import org.hl7.fhir.ChargeItemDefinitionApplicability;
import org.hl7.fhir.ChargeItemDefinitionPropertyGroup;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.MonetaryComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charge Item Definition Property Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemDefinitionPropertyGroupImpl#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemDefinitionPropertyGroupImpl#getPriceComponent <em>Price Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargeItemDefinitionPropertyGroupImpl extends BackboneElementImpl implements ChargeItemDefinitionPropertyGroup {
	/**
	 * The cached value of the '{@link #getApplicability() <em>Applicability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicability()
	 * @generated
	 * @ordered
	 */
	protected EList<ChargeItemDefinitionApplicability> applicability;

	/**
	 * The cached value of the '{@link #getPriceComponent() <em>Price Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<MonetaryComponent> priceComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargeItemDefinitionPropertyGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getChargeItemDefinitionPropertyGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChargeItemDefinitionApplicability> getApplicability() {
		if (applicability == null) {
			applicability = new EObjectContainmentEList<ChargeItemDefinitionApplicability>(ChargeItemDefinitionApplicability.class, this, FHIRPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY);
		}
		return applicability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonetaryComponent> getPriceComponent() {
		if (priceComponent == null) {
			priceComponent = new EObjectContainmentEList<MonetaryComponent>(MonetaryComponent.class, this, FHIRPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT);
		}
		return priceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				return ((InternalEList<?>)getApplicability()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				return ((InternalEList<?>)getPriceComponent()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				return getApplicability();
			case FHIRPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				return getPriceComponent();
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
			case FHIRPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				getApplicability().clear();
				getApplicability().addAll((Collection<? extends ChargeItemDefinitionApplicability>)newValue);
				return;
			case FHIRPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				getPriceComponent().clear();
				getPriceComponent().addAll((Collection<? extends MonetaryComponent>)newValue);
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
			case FHIRPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				getApplicability().clear();
				return;
			case FHIRPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				getPriceComponent().clear();
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
			case FHIRPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				return applicability != null && !applicability.isEmpty();
			case FHIRPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				return priceComponent != null && !priceComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChargeItemDefinitionPropertyGroupImpl
