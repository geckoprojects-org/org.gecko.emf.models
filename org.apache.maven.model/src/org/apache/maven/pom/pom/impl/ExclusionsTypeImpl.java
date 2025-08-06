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

import org.apache.maven.pom.pom.Exclusion;
import org.apache.maven.pom.pom.ExclusionsType;
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
 * An implementation of the model object '<em><b>Exclusions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.impl.ExclusionsTypeImpl#getExclusion <em>Exclusion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExclusionsTypeImpl extends MinimalEObjectImpl.Container implements ExclusionsType {
	/**
	 * The cached value of the '{@link #getExclusion() <em>Exclusion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusion()
	 * @generated
	 * @ordered
	 */
	protected EList<Exclusion> exclusion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return POMPackage.Literals.EXCLUSIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Exclusion> getExclusion() {
		if (exclusion == null) {
			exclusion = new EObjectContainmentEList<Exclusion>(Exclusion.class, this, POMPackage.EXCLUSIONS_TYPE__EXCLUSION);
		}
		return exclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case POMPackage.EXCLUSIONS_TYPE__EXCLUSION:
				return ((InternalEList<?>)getExclusion()).basicRemove(otherEnd, msgs);
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
			case POMPackage.EXCLUSIONS_TYPE__EXCLUSION:
				return getExclusion();
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
			case POMPackage.EXCLUSIONS_TYPE__EXCLUSION:
				getExclusion().clear();
				getExclusion().addAll((Collection<? extends Exclusion>)newValue);
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
			case POMPackage.EXCLUSIONS_TYPE__EXCLUSION:
				getExclusion().clear();
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
			case POMPackage.EXCLUSIONS_TYPE__EXCLUSION:
				return exclusion != null && !exclusion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExclusionsTypeImpl
