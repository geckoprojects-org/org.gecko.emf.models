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
package org.camunda.bpmn.model.impl;

import org.camunda.bpmn.model.CamundaPackage;
import org.camunda.bpmn.model.InType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.model.impl.InTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.InTypeImpl#getSourceExpression <em>Source Expression</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.InTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.InTypeImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.InTypeImpl#getBusinessKey <em>Business Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InTypeImpl extends EObjectImpl implements InType {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceExpression() <em>Source Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceExpression() <em>Source Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceExpression()
	 * @generated
	 * @ordered
	 */
	protected String sourceExpression = SOURCE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariables() <em>Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected String variables = VARIABLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusinessKey() <em>Business Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessKey()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessKey() <em>Business Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessKey()
	 * @generated
	 * @ordered
	 */
	protected String businessKey = BUSINESS_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamundaPackage.Literals.IN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.IN_TYPE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceExpression() {
		return sourceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceExpression(String newSourceExpression) {
		String oldSourceExpression = sourceExpression;
		sourceExpression = newSourceExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.IN_TYPE__SOURCE_EXPRESSION, oldSourceExpression, sourceExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.IN_TYPE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariables() {
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariables(String newVariables) {
		String oldVariables = variables;
		variables = newVariables;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.IN_TYPE__VARIABLES, oldVariables, variables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBusinessKey() {
		return businessKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusinessKey(String newBusinessKey) {
		String oldBusinessKey = businessKey;
		businessKey = newBusinessKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.IN_TYPE__BUSINESS_KEY, oldBusinessKey, businessKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamundaPackage.IN_TYPE__SOURCE:
				return getSource();
			case CamundaPackage.IN_TYPE__SOURCE_EXPRESSION:
				return getSourceExpression();
			case CamundaPackage.IN_TYPE__TARGET:
				return getTarget();
			case CamundaPackage.IN_TYPE__VARIABLES:
				return getVariables();
			case CamundaPackage.IN_TYPE__BUSINESS_KEY:
				return getBusinessKey();
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
			case CamundaPackage.IN_TYPE__SOURCE:
				setSource((String)newValue);
				return;
			case CamundaPackage.IN_TYPE__SOURCE_EXPRESSION:
				setSourceExpression((String)newValue);
				return;
			case CamundaPackage.IN_TYPE__TARGET:
				setTarget((String)newValue);
				return;
			case CamundaPackage.IN_TYPE__VARIABLES:
				setVariables((String)newValue);
				return;
			case CamundaPackage.IN_TYPE__BUSINESS_KEY:
				setBusinessKey((String)newValue);
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
			case CamundaPackage.IN_TYPE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case CamundaPackage.IN_TYPE__SOURCE_EXPRESSION:
				setSourceExpression(SOURCE_EXPRESSION_EDEFAULT);
				return;
			case CamundaPackage.IN_TYPE__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case CamundaPackage.IN_TYPE__VARIABLES:
				setVariables(VARIABLES_EDEFAULT);
				return;
			case CamundaPackage.IN_TYPE__BUSINESS_KEY:
				setBusinessKey(BUSINESS_KEY_EDEFAULT);
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
			case CamundaPackage.IN_TYPE__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case CamundaPackage.IN_TYPE__SOURCE_EXPRESSION:
				return SOURCE_EXPRESSION_EDEFAULT == null ? sourceExpression != null : !SOURCE_EXPRESSION_EDEFAULT.equals(sourceExpression);
			case CamundaPackage.IN_TYPE__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case CamundaPackage.IN_TYPE__VARIABLES:
				return VARIABLES_EDEFAULT == null ? variables != null : !VARIABLES_EDEFAULT.equals(variables);
			case CamundaPackage.IN_TYPE__BUSINESS_KEY:
				return BUSINESS_KEY_EDEFAULT == null ? businessKey != null : !BUSINESS_KEY_EDEFAULT.equals(businessKey);
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
		result.append(" (source: ");
		result.append(source);
		result.append(", sourceExpression: ");
		result.append(sourceExpression);
		result.append(", target: ");
		result.append(target);
		result.append(", variables: ");
		result.append(variables);
		result.append(", businessKey: ");
		result.append(businessKey);
		result.append(')');
		return result.toString();
	}

} //InTypeImpl
