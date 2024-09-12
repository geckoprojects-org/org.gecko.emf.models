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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.DefinitionProxyType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.IndirectEntryType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indirect Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.IndirectEntryTypeImpl#getDefinitionProxy <em>Definition Proxy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndirectEntryTypeImpl extends MinimalEObjectImpl.Container implements IndirectEntryType {
	/**
	 * The cached value of the '{@link #getDefinitionProxy() <em>Definition Proxy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionProxy()
	 * @generated
	 * @ordered
	 */
	protected DefinitionProxyType definitionProxy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndirectEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getIndirectEntryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionProxyType getDefinitionProxy() {
		return definitionProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionProxy(DefinitionProxyType newDefinitionProxy, NotificationChain msgs) {
		DefinitionProxyType oldDefinitionProxy = definitionProxy;
		definitionProxy = newDefinitionProxy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY, oldDefinitionProxy, newDefinitionProxy);
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
	public void setDefinitionProxy(DefinitionProxyType newDefinitionProxy) {
		if (newDefinitionProxy != definitionProxy) {
			NotificationChain msgs = null;
			if (definitionProxy != null)
				msgs = ((InternalEObject)definitionProxy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY, null, msgs);
			if (newDefinitionProxy != null)
				msgs = ((InternalEObject)newDefinitionProxy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY, null, msgs);
			msgs = basicSetDefinitionProxy(newDefinitionProxy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY, newDefinitionProxy, newDefinitionProxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY:
				return basicSetDefinitionProxy(null, msgs);
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
			case GMLPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY:
				return getDefinitionProxy();
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
			case GMLPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY:
				setDefinitionProxy((DefinitionProxyType)newValue);
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
			case GMLPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY:
				setDefinitionProxy((DefinitionProxyType)null);
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
			case GMLPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY:
				return definitionProxy != null;
		}
		return super.eIsSet(featureID);
	}

} //IndirectEntryTypeImpl
