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
package org.apache.maven.pom.pom.impl;

import java.util.Collection;

import org.apache.maven.pom.pom.Developer;
import org.apache.maven.pom.pom.DevelopersType;
import org.apache.maven.pom.pom.POMPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Developers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.impl.DevelopersTypeImpl#getDeveloper <em>Developer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DevelopersTypeImpl extends MinimalEObjectImpl.Container implements DevelopersType {
	/**
	 * The cached value of the '{@link #getDeveloper() <em>Developer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeveloper()
	 * @generated
	 * @ordered
	 */
	protected EList<Developer> developer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return POMPackage.Literals.DEVELOPERS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Developer> getDeveloper() {
		if (developer == null) {
			developer = new EObjectContainmentEList<Developer>(Developer.class, this, POMPackage.DEVELOPERS_TYPE__DEVELOPER);
		}
		return developer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case POMPackage.DEVELOPERS_TYPE__DEVELOPER:
				return ((InternalEList<?>)getDeveloper()).basicRemove(otherEnd, msgs);
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
			case POMPackage.DEVELOPERS_TYPE__DEVELOPER:
				return getDeveloper();
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
			case POMPackage.DEVELOPERS_TYPE__DEVELOPER:
				getDeveloper().clear();
				getDeveloper().addAll((Collection<? extends Developer>)newValue);
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
			case POMPackage.DEVELOPERS_TYPE__DEVELOPER:
				getDeveloper().clear();
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
			case POMPackage.DEVELOPERS_TYPE__DEVELOPER:
				return developer != null && !developer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DevelopersTypeImpl
