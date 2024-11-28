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
package org.emau.icmvc.ganimed.ttp.cm2.config.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emau.icmvc.ganimed.ttp.cm2.QCProblemType;
import org.emau.icmvc.ganimed.ttp.cm2.QCProblemTypeAction;
import org.emau.icmvc.ganimed.ttp.cm2.QCType;

import org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage;
import org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Control Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.QualityControlConfigImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.QualityControlConfigImpl#getProblemType <em>Problem Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.QualityControlConfigImpl#getProblemTypeAction <em>Problem Type Action</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.QualityControlConfigImpl#getDefaultType <em>Default Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityControlConfigImpl extends MinimalEObjectImpl.Container implements QualityControlConfig {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<QCType> type;

	/**
	 * The cached value of the '{@link #getProblemType() <em>Problem Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemType()
	 * @generated
	 * @ordered
	 */
	protected EList<QCProblemType> problemType;

	/**
	 * The cached value of the '{@link #getProblemTypeAction() <em>Problem Type Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemTypeAction()
	 * @generated
	 * @ordered
	 */
	protected EList<QCProblemTypeAction> problemTypeAction;

	/**
	 * The default value of the '{@link #getDefaultType() <em>Default Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultType()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultType() <em>Default Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultType()
	 * @generated
	 * @ordered
	 */
	protected String defaultType = DEFAULT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityControlConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.QUALITY_CONTROL_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QCType> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<QCType>(QCType.class, this, ConfigPackage.QUALITY_CONTROL_CONFIG__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QCProblemType> getProblemType() {
		if (problemType == null) {
			problemType = new EObjectContainmentEList<QCProblemType>(QCProblemType.class, this, ConfigPackage.QUALITY_CONTROL_CONFIG__PROBLEM_TYPE);
		}
		return problemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QCProblemTypeAction> getProblemTypeAction() {
		if (problemTypeAction == null) {
			problemTypeAction = new EObjectContainmentEList<QCProblemTypeAction>(QCProblemTypeAction.class, this, ConfigPackage.QUALITY_CONTROL_CONFIG__PROBLEM_TYPE_ACTION);
		}
		return problemTypeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultType() {
		return defaultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultType(String newDefaultType) {
		String oldDefaultType = defaultType;
		defaultType = newDefaultType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.QUALITY_CONTROL_CONFIG__DEFAULT_TYPE, oldDefaultType, defaultType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.QUALITY_CONTROL_CONFIG__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case ConfigPackage.QUALITY_CONTROL_CONFIG__PROBLEM_TYPE:
				return ((InternalEList<?>)getProblemType()).basicRemove(otherEnd, msgs);
			case ConfigPackage.QUALITY_CONTROL_CONFIG__PROBLEM_TYPE_ACTION:
				return ((InternalEList<?>)getProblemTypeAction()).basicRemove(otherEnd, msgs);
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
			case ConfigPackage.QUALITY_CONTROL_CONFIG__TYPE:
				return getType();
			case ConfigPackage.QUALITY_CONTROL_CONFIG__PROBLEM_TYPE:
				return getProblemType();
			case ConfigPackage.QUALITY_CONTROL_CONFIG__PROBLEM_TYPE_ACTION:
				return getProblemTypeAction();
			case ConfigPackage.QUALITY_CONTROL_CONFIG__DEFAULT_TYPE:
				return getDefaultType();
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
			case ConfigPackage.QUALITY_CONTROL_CONFIG__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends QCType>)newValue);
				return;
			case ConfigPackage.QUALITY_CONTROL_CONFIG__PROBLEM_TYPE:
				getProblemType().clear();
				getProblemType().addAll((Collection<? extends QCProblemType>)newValue);
				return;
			case ConfigPackage.QUALITY_CONTROL_CONFIG__PROBLEM_TYPE_ACTION:
				getProblemTypeAction().clear();
				getProblemTypeAction().addAll((Collection<? extends QCProblemTypeAction>)newValue);
				return;
			case ConfigPackage.QUALITY_CONTROL_CONFIG__DEFAULT_TYPE:
				setDefaultType((String)newValue);
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
			case ConfigPackage.QUALITY_CONTROL_CONFIG__TYPE:
				getType().clear();
				return;
			case ConfigPackage.QUALITY_CONTROL_CONFIG__PROBLEM_TYPE:
				getProblemType().clear();
				return;
			case ConfigPackage.QUALITY_CONTROL_CONFIG__PROBLEM_TYPE_ACTION:
				getProblemTypeAction().clear();
				return;
			case ConfigPackage.QUALITY_CONTROL_CONFIG__DEFAULT_TYPE:
				setDefaultType(DEFAULT_TYPE_EDEFAULT);
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
			case ConfigPackage.QUALITY_CONTROL_CONFIG__TYPE:
				return type != null && !type.isEmpty();
			case ConfigPackage.QUALITY_CONTROL_CONFIG__PROBLEM_TYPE:
				return problemType != null && !problemType.isEmpty();
			case ConfigPackage.QUALITY_CONTROL_CONFIG__PROBLEM_TYPE_ACTION:
				return problemTypeAction != null && !problemTypeAction.isEmpty();
			case ConfigPackage.QUALITY_CONTROL_CONFIG__DEFAULT_TYPE:
				return DEFAULT_TYPE_EDEFAULT == null ? defaultType != null : !DEFAULT_TYPE_EDEFAULT.equals(defaultType);
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
		result.append(" (defaultType: ");
		result.append(defaultType);
		result.append(')');
		return result.toString();
	}

} //QualityControlConfigImpl
