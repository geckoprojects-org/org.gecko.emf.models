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

import java.util.Collection;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.FairnessAssessmentType;
import org.cyclonedx.schema.bom.FairnessAssessmentsType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fairness Assessments Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.FairnessAssessmentsTypeImpl#getFairnessAssessment <em>Fairness Assessment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FairnessAssessmentsTypeImpl extends MinimalEObjectImpl.Container implements FairnessAssessmentsType {
	/**
	 * The cached value of the '{@link #getFairnessAssessment() <em>Fairness Assessment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFairnessAssessment()
	 * @generated
	 * @ordered
	 */
	protected EList<FairnessAssessmentType> fairnessAssessment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FairnessAssessmentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getFairnessAssessmentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FairnessAssessmentType> getFairnessAssessment() {
		if (fairnessAssessment == null) {
			fairnessAssessment = new EObjectContainmentEList<FairnessAssessmentType>(FairnessAssessmentType.class, this, BOMPackage.FAIRNESS_ASSESSMENTS_TYPE__FAIRNESS_ASSESSMENT);
		}
		return fairnessAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.FAIRNESS_ASSESSMENTS_TYPE__FAIRNESS_ASSESSMENT:
				return ((InternalEList<?>)getFairnessAssessment()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.FAIRNESS_ASSESSMENTS_TYPE__FAIRNESS_ASSESSMENT:
				return getFairnessAssessment();
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
			case BOMPackage.FAIRNESS_ASSESSMENTS_TYPE__FAIRNESS_ASSESSMENT:
				getFairnessAssessment().clear();
				getFairnessAssessment().addAll((Collection<? extends FairnessAssessmentType>)newValue);
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
			case BOMPackage.FAIRNESS_ASSESSMENTS_TYPE__FAIRNESS_ASSESSMENT:
				getFairnessAssessment().clear();
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
			case BOMPackage.FAIRNESS_ASSESSMENTS_TYPE__FAIRNESS_ASSESSMENT:
				return fairnessAssessment != null && !fairnessAssessment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FairnessAssessmentsTypeImpl
