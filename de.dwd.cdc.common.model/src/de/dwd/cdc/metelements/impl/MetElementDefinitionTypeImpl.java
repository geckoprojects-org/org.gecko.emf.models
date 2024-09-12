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
package de.dwd.cdc.metelements.impl;

import de.dwd.cdc.metelements.MetElementDefinitionType;
import de.dwd.cdc.metelements.MetElementType;
import de.dwd.cdc.metelements.MetElementsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Met Element Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.metelements.impl.MetElementDefinitionTypeImpl#getMetElement <em>Met Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetElementDefinitionTypeImpl extends MinimalEObjectImpl.Container implements MetElementDefinitionType {
	/**
	 * The cached value of the '{@link #getMetElement() <em>Met Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetElement()
	 * @generated
	 * @ordered
	 */
	protected EList<MetElementType> metElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetElementDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetElementsPackage.Literals.MET_ELEMENT_DEFINITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetElementType> getMetElement() {
		if (metElement == null) {
			metElement = new EObjectContainmentEList<MetElementType>(MetElementType.class, this, MetElementsPackage.MET_ELEMENT_DEFINITION_TYPE__MET_ELEMENT);
		}
		return metElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetElementsPackage.MET_ELEMENT_DEFINITION_TYPE__MET_ELEMENT:
				return ((InternalEList<?>)getMetElement()).basicRemove(otherEnd, msgs);
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
			case MetElementsPackage.MET_ELEMENT_DEFINITION_TYPE__MET_ELEMENT:
				return getMetElement();
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
			case MetElementsPackage.MET_ELEMENT_DEFINITION_TYPE__MET_ELEMENT:
				getMetElement().clear();
				getMetElement().addAll((Collection<? extends MetElementType>)newValue);
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
			case MetElementsPackage.MET_ELEMENT_DEFINITION_TYPE__MET_ELEMENT:
				getMetElement().clear();
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
			case MetElementsPackage.MET_ELEMENT_DEFINITION_TYPE__MET_ELEMENT:
				return metElement != null && !metElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetElementDefinitionTypeImpl
