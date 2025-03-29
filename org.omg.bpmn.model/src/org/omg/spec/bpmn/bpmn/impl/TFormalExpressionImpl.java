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
package org.omg.spec.bpmn.bpmn.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TFormalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFormal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TFormalExpressionImpl#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TFormalExpressionImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFormalExpressionImpl extends TExpressionImpl implements TFormalExpression {
	/**
	 * The default value of the '{@link #getEvaluatesToTypeRef() <em>Evaluates To Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluatesToTypeRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName EVALUATES_TO_TYPE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvaluatesToTypeRef() <em>Evaluates To Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluatesToTypeRef()
	 * @generated
	 * @ordered
	 */
	protected QName evaluatesToTypeRef = EVALUATES_TO_TYPE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFormalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTFormalExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getEvaluatesToTypeRef() {
		return evaluatesToTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvaluatesToTypeRef(QName newEvaluatesToTypeRef) {
		QName oldEvaluatesToTypeRef = evaluatesToTypeRef;
		evaluatesToTypeRef = newEvaluatesToTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TFORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF, oldEvaluatesToTypeRef, evaluatesToTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TFORMAL_EXPRESSION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMNPackage.TFORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
				return getEvaluatesToTypeRef();
			case BPMNPackage.TFORMAL_EXPRESSION__LANGUAGE:
				return getLanguage();
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
			case BPMNPackage.TFORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
				setEvaluatesToTypeRef((QName)newValue);
				return;
			case BPMNPackage.TFORMAL_EXPRESSION__LANGUAGE:
				setLanguage((String)newValue);
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
			case BPMNPackage.TFORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
				setEvaluatesToTypeRef(EVALUATES_TO_TYPE_REF_EDEFAULT);
				return;
			case BPMNPackage.TFORMAL_EXPRESSION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
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
			case BPMNPackage.TFORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
				return EVALUATES_TO_TYPE_REF_EDEFAULT == null ? evaluatesToTypeRef != null : !EVALUATES_TO_TYPE_REF_EDEFAULT.equals(evaluatesToTypeRef);
			case BPMNPackage.TFORMAL_EXPRESSION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
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
		result.append(" (evaluatesToTypeRef: ");
		result.append(evaluatesToTypeRef);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //TFormalExpressionImpl
