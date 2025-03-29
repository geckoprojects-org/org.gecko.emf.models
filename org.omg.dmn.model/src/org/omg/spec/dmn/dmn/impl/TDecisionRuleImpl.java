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
package org.omg.spec.dmn.dmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TDecisionRule;
import org.omg.spec.dmn.dmn.TLiteralExpression;
import org.omg.spec.dmn.dmn.TRuleAnnotation;
import org.omg.spec.dmn.dmn.TUnaryTests;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDecision Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionRuleImpl#getInputEntry <em>Input Entry</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionRuleImpl#getOutputEntry <em>Output Entry</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionRuleImpl#getAnnotationEntry <em>Annotation Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDecisionRuleImpl extends TDMNElementImpl implements TDecisionRule {
	/**
	 * The cached value of the '{@link #getInputEntry() <em>Input Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<TUnaryTests> inputEntry;

	/**
	 * The cached value of the '{@link #getOutputEntry() <em>Output Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<TLiteralExpression> outputEntry;

	/**
	 * The cached value of the '{@link #getAnnotationEntry() <em>Annotation Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<TRuleAnnotation> annotationEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDecisionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TDECISION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TUnaryTests> getInputEntry() {
		if (inputEntry == null) {
			inputEntry = new EObjectContainmentEList<TUnaryTests>(TUnaryTests.class, this, DMNPackage.TDECISION_RULE__INPUT_ENTRY);
		}
		return inputEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLiteralExpression> getOutputEntry() {
		if (outputEntry == null) {
			outputEntry = new EObjectContainmentEList<TLiteralExpression>(TLiteralExpression.class, this, DMNPackage.TDECISION_RULE__OUTPUT_ENTRY);
		}
		return outputEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TRuleAnnotation> getAnnotationEntry() {
		if (annotationEntry == null) {
			annotationEntry = new EObjectContainmentEList<TRuleAnnotation>(TRuleAnnotation.class, this, DMNPackage.TDECISION_RULE__ANNOTATION_ENTRY);
		}
		return annotationEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TDECISION_RULE__INPUT_ENTRY:
				return ((InternalEList<?>)getInputEntry()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION_RULE__OUTPUT_ENTRY:
				return ((InternalEList<?>)getOutputEntry()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION_RULE__ANNOTATION_ENTRY:
				return ((InternalEList<?>)getAnnotationEntry()).basicRemove(otherEnd, msgs);
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
			case DMNPackage.TDECISION_RULE__INPUT_ENTRY:
				return getInputEntry();
			case DMNPackage.TDECISION_RULE__OUTPUT_ENTRY:
				return getOutputEntry();
			case DMNPackage.TDECISION_RULE__ANNOTATION_ENTRY:
				return getAnnotationEntry();
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
			case DMNPackage.TDECISION_RULE__INPUT_ENTRY:
				getInputEntry().clear();
				getInputEntry().addAll((Collection<? extends TUnaryTests>)newValue);
				return;
			case DMNPackage.TDECISION_RULE__OUTPUT_ENTRY:
				getOutputEntry().clear();
				getOutputEntry().addAll((Collection<? extends TLiteralExpression>)newValue);
				return;
			case DMNPackage.TDECISION_RULE__ANNOTATION_ENTRY:
				getAnnotationEntry().clear();
				getAnnotationEntry().addAll((Collection<? extends TRuleAnnotation>)newValue);
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
			case DMNPackage.TDECISION_RULE__INPUT_ENTRY:
				getInputEntry().clear();
				return;
			case DMNPackage.TDECISION_RULE__OUTPUT_ENTRY:
				getOutputEntry().clear();
				return;
			case DMNPackage.TDECISION_RULE__ANNOTATION_ENTRY:
				getAnnotationEntry().clear();
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
			case DMNPackage.TDECISION_RULE__INPUT_ENTRY:
				return inputEntry != null && !inputEntry.isEmpty();
			case DMNPackage.TDECISION_RULE__OUTPUT_ENTRY:
				return outputEntry != null && !outputEntry.isEmpty();
			case DMNPackage.TDECISION_RULE__ANNOTATION_ENTRY:
				return annotationEntry != null && !annotationEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TDecisionRuleImpl
