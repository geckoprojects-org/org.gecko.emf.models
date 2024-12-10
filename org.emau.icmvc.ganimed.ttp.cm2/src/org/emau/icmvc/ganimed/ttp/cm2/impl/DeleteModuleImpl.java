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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.DeleteModule;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DeleteModuleImpl#getModuleKey <em>Module Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteModuleImpl extends MinimalEObjectImpl.Container implements DeleteModule {
	/**
	 * The cached value of the '{@link #getModuleKey() <em>Module Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleKey()
	 * @generated
	 * @ordered
	 */
	protected ModuleKeyDTO moduleKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getDeleteModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleKeyDTO getModuleKey() {
		return moduleKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleKey(ModuleKeyDTO newModuleKey, NotificationChain msgs) {
		ModuleKeyDTO oldModuleKey = moduleKey;
		moduleKey = newModuleKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.DELETE_MODULE__MODULE_KEY, oldModuleKey, newModuleKey);
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
	public void setModuleKey(ModuleKeyDTO newModuleKey) {
		if (newModuleKey != moduleKey) {
			NotificationChain msgs = null;
			if (moduleKey != null)
				msgs = ((InternalEObject)moduleKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.DELETE_MODULE__MODULE_KEY, null, msgs);
			if (newModuleKey != null)
				msgs = ((InternalEObject)newModuleKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.DELETE_MODULE__MODULE_KEY, null, msgs);
			msgs = basicSetModuleKey(newModuleKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DELETE_MODULE__MODULE_KEY, newModuleKey, newModuleKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.DELETE_MODULE__MODULE_KEY:
				return basicSetModuleKey(null, msgs);
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
			case Cm2Package.DELETE_MODULE__MODULE_KEY:
				return getModuleKey();
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
			case Cm2Package.DELETE_MODULE__MODULE_KEY:
				setModuleKey((ModuleKeyDTO)newValue);
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
			case Cm2Package.DELETE_MODULE__MODULE_KEY:
				setModuleKey((ModuleKeyDTO)null);
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
			case Cm2Package.DELETE_MODULE__MODULE_KEY:
				return moduleKey != null;
		}
		return super.eIsSet(featureID);
	}

} //DeleteModuleImpl
