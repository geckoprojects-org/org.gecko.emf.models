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

import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.MedicationKnowledgeDosingGuideline;
import org.hl7.fhir.MedicationKnowledgeIndicationGuideline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Indication Guideline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeIndicationGuidelineImpl#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeIndicationGuidelineImpl#getDosingGuideline <em>Dosing Guideline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeIndicationGuidelineImpl extends BackboneElementImpl implements MedicationKnowledgeIndicationGuideline {
	/**
	 * The cached value of the '{@link #getIndication() <em>Indication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> indication;

	/**
	 * The cached value of the '{@link #getDosingGuideline() <em>Dosing Guideline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosingGuideline()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeDosingGuideline> dosingGuideline;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeIndicationGuidelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getMedicationKnowledgeIndicationGuideline();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getIndication() {
		if (indication == null) {
			indication = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FHIRPackage.MEDICATION_KNOWLEDGE_INDICATION_GUIDELINE__INDICATION);
		}
		return indication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeDosingGuideline> getDosingGuideline() {
		if (dosingGuideline == null) {
			dosingGuideline = new EObjectContainmentEList<MedicationKnowledgeDosingGuideline>(MedicationKnowledgeDosingGuideline.class, this, FHIRPackage.MEDICATION_KNOWLEDGE_INDICATION_GUIDELINE__DOSING_GUIDELINE);
		}
		return dosingGuideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.MEDICATION_KNOWLEDGE_INDICATION_GUIDELINE__INDICATION:
				return ((InternalEList<?>)getIndication()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE_INDICATION_GUIDELINE__DOSING_GUIDELINE:
				return ((InternalEList<?>)getDosingGuideline()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.MEDICATION_KNOWLEDGE_INDICATION_GUIDELINE__INDICATION:
				return getIndication();
			case FHIRPackage.MEDICATION_KNOWLEDGE_INDICATION_GUIDELINE__DOSING_GUIDELINE:
				return getDosingGuideline();
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
			case FHIRPackage.MEDICATION_KNOWLEDGE_INDICATION_GUIDELINE__INDICATION:
				getIndication().clear();
				getIndication().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_INDICATION_GUIDELINE__DOSING_GUIDELINE:
				getDosingGuideline().clear();
				getDosingGuideline().addAll((Collection<? extends MedicationKnowledgeDosingGuideline>)newValue);
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
			case FHIRPackage.MEDICATION_KNOWLEDGE_INDICATION_GUIDELINE__INDICATION:
				getIndication().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_INDICATION_GUIDELINE__DOSING_GUIDELINE:
				getDosingGuideline().clear();
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
			case FHIRPackage.MEDICATION_KNOWLEDGE_INDICATION_GUIDELINE__INDICATION:
				return indication != null && !indication.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE_INDICATION_GUIDELINE__DOSING_GUIDELINE:
				return dosingGuideline != null && !dosingGuideline.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeIndicationGuidelineImpl
