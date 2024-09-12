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
import org.hl7.fhir.SubstancePolymerMonomerSet;
import org.hl7.fhir.SubstancePolymerStartingMaterial;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Polymer Monomer Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerMonomerSetImpl#getRatioType <em>Ratio Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerMonomerSetImpl#getStartingMaterial <em>Starting Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstancePolymerMonomerSetImpl extends BackboneElementImpl implements SubstancePolymerMonomerSet {
	/**
	 * The cached value of the '{@link #getRatioType() <em>Ratio Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatioType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept ratioType;

	/**
	 * The cached value of the '{@link #getStartingMaterial() <em>Starting Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingMaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerStartingMaterial> startingMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstancePolymerMonomerSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getSubstancePolymerMonomerSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRatioType() {
		return ratioType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatioType(CodeableConcept newRatioType, NotificationChain msgs) {
		CodeableConcept oldRatioType = ratioType;
		ratioType = newRatioType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE, oldRatioType, newRatioType);
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
	public void setRatioType(CodeableConcept newRatioType) {
		if (newRatioType != ratioType) {
			NotificationChain msgs = null;
			if (ratioType != null)
				msgs = ((InternalEObject)ratioType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE, null, msgs);
			if (newRatioType != null)
				msgs = ((InternalEObject)newRatioType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE, null, msgs);
			msgs = basicSetRatioType(newRatioType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE, newRatioType, newRatioType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstancePolymerStartingMaterial> getStartingMaterial() {
		if (startingMaterial == null) {
			startingMaterial = new EObjectContainmentEList<SubstancePolymerStartingMaterial>(SubstancePolymerStartingMaterial.class, this, FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__STARTING_MATERIAL);
		}
		return startingMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE:
				return basicSetRatioType(null, msgs);
			case FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__STARTING_MATERIAL:
				return ((InternalEList<?>)getStartingMaterial()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE:
				return getRatioType();
			case FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__STARTING_MATERIAL:
				return getStartingMaterial();
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
			case FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE:
				setRatioType((CodeableConcept)newValue);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__STARTING_MATERIAL:
				getStartingMaterial().clear();
				getStartingMaterial().addAll((Collection<? extends SubstancePolymerStartingMaterial>)newValue);
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
			case FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE:
				setRatioType((CodeableConcept)null);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__STARTING_MATERIAL:
				getStartingMaterial().clear();
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
			case FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE:
				return ratioType != null;
			case FHIRPackage.SUBSTANCE_POLYMER_MONOMER_SET__STARTING_MATERIAL:
				return startingMaterial != null && !startingMaterial.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstancePolymerMonomerSetImpl
