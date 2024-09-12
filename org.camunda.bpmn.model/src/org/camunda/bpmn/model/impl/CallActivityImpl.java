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

import org.camunda.bpmn.model.CallActivity;
import org.camunda.bpmn.model.CamundaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.model.impl.CallActivityImpl#getCalledElement <em>Called Element</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.CallActivityImpl#getCalledElementBinding <em>Called Element Binding</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.CallActivityImpl#getCalledElementVersion <em>Called Element Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallActivityImpl extends org.omg.bpmn.bpmn2.impl.CallActivityImpl implements CallActivity {
	/**
	 * The default value of the '{@link #getCalledElement() <em>Called Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledElement()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLED_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalledElement() <em>Called Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledElement()
	 * @generated
	 * @ordered
	 */
	protected String calledElement = CALLED_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalledElementBinding() <em>Called Element Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledElementBinding()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLED_ELEMENT_BINDING_EDEFAULT = "latest";

	/**
	 * The cached value of the '{@link #getCalledElementBinding() <em>Called Element Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledElementBinding()
	 * @generated
	 * @ordered
	 */
	protected String calledElementBinding = CALLED_ELEMENT_BINDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalledElementVersion() <em>Called Element Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledElementVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CALLED_ELEMENT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalledElementVersion() <em>Called Element Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledElementVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer calledElementVersion = CALLED_ELEMENT_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamundaPackage.Literals.CALL_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCalledElement() {
		return calledElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalledElement(String newCalledElement) {
		String oldCalledElement = calledElement;
		calledElement = newCalledElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT, oldCalledElement, calledElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCalledElementBinding() {
		return calledElementBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalledElementBinding(String newCalledElementBinding) {
		String oldCalledElementBinding = calledElementBinding;
		calledElementBinding = newCalledElementBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT_BINDING, oldCalledElementBinding, calledElementBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCalledElementVersion() {
		return calledElementVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalledElementVersion(Integer newCalledElementVersion) {
		Integer oldCalledElementVersion = calledElementVersion;
		calledElementVersion = newCalledElementVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT_VERSION, oldCalledElementVersion, calledElementVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT:
				return getCalledElement();
			case CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT_BINDING:
				return getCalledElementBinding();
			case CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT_VERSION:
				return getCalledElementVersion();
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
			case CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT:
				setCalledElement((String)newValue);
				return;
			case CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT_BINDING:
				setCalledElementBinding((String)newValue);
				return;
			case CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT_VERSION:
				setCalledElementVersion((Integer)newValue);
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
			case CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT:
				setCalledElement(CALLED_ELEMENT_EDEFAULT);
				return;
			case CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT_BINDING:
				setCalledElementBinding(CALLED_ELEMENT_BINDING_EDEFAULT);
				return;
			case CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT_VERSION:
				setCalledElementVersion(CALLED_ELEMENT_VERSION_EDEFAULT);
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
			case CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT:
				return CALLED_ELEMENT_EDEFAULT == null ? calledElement != null : !CALLED_ELEMENT_EDEFAULT.equals(calledElement);
			case CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT_BINDING:
				return CALLED_ELEMENT_BINDING_EDEFAULT == null ? calledElementBinding != null : !CALLED_ELEMENT_BINDING_EDEFAULT.equals(calledElementBinding);
			case CamundaPackage.CALL_ACTIVITY__CALLED_ELEMENT_VERSION:
				return CALLED_ELEMENT_VERSION_EDEFAULT == null ? calledElementVersion != null : !CALLED_ELEMENT_VERSION_EDEFAULT.equals(calledElementVersion);
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
		result.append(" (calledElement: ");
		result.append(calledElement);
		result.append(", calledElementBinding: ");
		result.append(calledElementBinding);
		result.append(", calledElementVersion: ");
		result.append(calledElementVersion);
		result.append(')');
		return result.toString();
	}

} //CallActivityImpl
