/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom.impl;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ProofOfConceptType;
import org.cyclonedx.schema.bom.SupportingMaterialType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proof Of Concept Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ProofOfConceptTypeImpl#getReproductionSteps <em>Reproduction Steps</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ProofOfConceptTypeImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ProofOfConceptTypeImpl#getSupportingMaterial <em>Supporting Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProofOfConceptTypeImpl extends MinimalEObjectImpl.Container implements ProofOfConceptType {
	/**
	 * The default value of the '{@link #getReproductionSteps() <em>Reproduction Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReproductionSteps()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRODUCTION_STEPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReproductionSteps() <em>Reproduction Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReproductionSteps()
	 * @generated
	 * @ordered
	 */
	protected String reproductionSteps = REPRODUCTION_STEPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String environment = ENVIRONMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportingMaterial() <em>Supporting Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingMaterial()
	 * @generated
	 * @ordered
	 */
	protected SupportingMaterialType supportingMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProofOfConceptTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getProofOfConceptType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReproductionSteps() {
		return reproductionSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReproductionSteps(String newReproductionSteps) {
		String oldReproductionSteps = reproductionSteps;
		reproductionSteps = newReproductionSteps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PROOF_OF_CONCEPT_TYPE__REPRODUCTION_STEPS, oldReproductionSteps, reproductionSteps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvironment(String newEnvironment) {
		String oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PROOF_OF_CONCEPT_TYPE__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupportingMaterialType getSupportingMaterial() {
		return supportingMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportingMaterial(SupportingMaterialType newSupportingMaterial, NotificationChain msgs) {
		SupportingMaterialType oldSupportingMaterial = supportingMaterial;
		supportingMaterial = newSupportingMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.PROOF_OF_CONCEPT_TYPE__SUPPORTING_MATERIAL, oldSupportingMaterial, newSupportingMaterial);
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
	public void setSupportingMaterial(SupportingMaterialType newSupportingMaterial) {
		if (newSupportingMaterial != supportingMaterial) {
			NotificationChain msgs = null;
			if (supportingMaterial != null)
				msgs = ((InternalEObject)supportingMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PROOF_OF_CONCEPT_TYPE__SUPPORTING_MATERIAL, null, msgs);
			if (newSupportingMaterial != null)
				msgs = ((InternalEObject)newSupportingMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PROOF_OF_CONCEPT_TYPE__SUPPORTING_MATERIAL, null, msgs);
			msgs = basicSetSupportingMaterial(newSupportingMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PROOF_OF_CONCEPT_TYPE__SUPPORTING_MATERIAL, newSupportingMaterial, newSupportingMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.PROOF_OF_CONCEPT_TYPE__SUPPORTING_MATERIAL:
				return basicSetSupportingMaterial(null, msgs);
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
			case BOMPackage.PROOF_OF_CONCEPT_TYPE__REPRODUCTION_STEPS:
				return getReproductionSteps();
			case BOMPackage.PROOF_OF_CONCEPT_TYPE__ENVIRONMENT:
				return getEnvironment();
			case BOMPackage.PROOF_OF_CONCEPT_TYPE__SUPPORTING_MATERIAL:
				return getSupportingMaterial();
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
			case BOMPackage.PROOF_OF_CONCEPT_TYPE__REPRODUCTION_STEPS:
				setReproductionSteps((String)newValue);
				return;
			case BOMPackage.PROOF_OF_CONCEPT_TYPE__ENVIRONMENT:
				setEnvironment((String)newValue);
				return;
			case BOMPackage.PROOF_OF_CONCEPT_TYPE__SUPPORTING_MATERIAL:
				setSupportingMaterial((SupportingMaterialType)newValue);
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
			case BOMPackage.PROOF_OF_CONCEPT_TYPE__REPRODUCTION_STEPS:
				setReproductionSteps(REPRODUCTION_STEPS_EDEFAULT);
				return;
			case BOMPackage.PROOF_OF_CONCEPT_TYPE__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
			case BOMPackage.PROOF_OF_CONCEPT_TYPE__SUPPORTING_MATERIAL:
				setSupportingMaterial((SupportingMaterialType)null);
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
			case BOMPackage.PROOF_OF_CONCEPT_TYPE__REPRODUCTION_STEPS:
				return REPRODUCTION_STEPS_EDEFAULT == null ? reproductionSteps != null : !REPRODUCTION_STEPS_EDEFAULT.equals(reproductionSteps);
			case BOMPackage.PROOF_OF_CONCEPT_TYPE__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
			case BOMPackage.PROOF_OF_CONCEPT_TYPE__SUPPORTING_MATERIAL:
				return supportingMaterial != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (reproductionSteps: ");
		result.append(reproductionSteps);
		result.append(", environment: ");
		result.append(environment);
		result.append(')');
		return result.toString();
	}

} //ProofOfConceptTypeImpl
