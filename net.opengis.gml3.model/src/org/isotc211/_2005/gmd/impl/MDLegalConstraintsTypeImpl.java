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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDLegalConstraintsType;
import org.isotc211._2005.gmd.MDRestrictionCodePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Legal Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDLegalConstraintsTypeImpl#getAccessConstraints <em>Access Constraints</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDLegalConstraintsTypeImpl#getUseConstraints <em>Use Constraints</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDLegalConstraintsTypeImpl#getOtherConstraints <em>Other Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDLegalConstraintsTypeImpl extends MDConstraintsTypeImpl implements MDLegalConstraintsType {
	/**
	 * The cached value of the '{@link #getAccessConstraints() <em>Access Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<MDRestrictionCodePropertyType> accessConstraints;

	/**
	 * The cached value of the '{@link #getUseConstraints() <em>Use Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<MDRestrictionCodePropertyType> useConstraints;

	/**
	 * The cached value of the '{@link #getOtherConstraints() <em>Other Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> otherConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDLegalConstraintsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDLegalConstraintsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDRestrictionCodePropertyType> getAccessConstraints() {
		if (accessConstraints == null) {
			accessConstraints = new EObjectContainmentEList<MDRestrictionCodePropertyType>(MDRestrictionCodePropertyType.class, this, GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__ACCESS_CONSTRAINTS);
		}
		return accessConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDRestrictionCodePropertyType> getUseConstraints() {
		if (useConstraints == null) {
			useConstraints = new EObjectContainmentEList<MDRestrictionCodePropertyType>(MDRestrictionCodePropertyType.class, this, GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__USE_CONSTRAINTS);
		}
		return useConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getOtherConstraints() {
		if (otherConstraints == null) {
			otherConstraints = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__OTHER_CONSTRAINTS);
		}
		return otherConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__ACCESS_CONSTRAINTS:
				return ((InternalEList<?>)getAccessConstraints()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__USE_CONSTRAINTS:
				return ((InternalEList<?>)getUseConstraints()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__OTHER_CONSTRAINTS:
				return ((InternalEList<?>)getOtherConstraints()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__ACCESS_CONSTRAINTS:
				return getAccessConstraints();
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__USE_CONSTRAINTS:
				return getUseConstraints();
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__OTHER_CONSTRAINTS:
				return getOtherConstraints();
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
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__ACCESS_CONSTRAINTS:
				getAccessConstraints().clear();
				getAccessConstraints().addAll((Collection<? extends MDRestrictionCodePropertyType>)newValue);
				return;
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__USE_CONSTRAINTS:
				getUseConstraints().clear();
				getUseConstraints().addAll((Collection<? extends MDRestrictionCodePropertyType>)newValue);
				return;
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__OTHER_CONSTRAINTS:
				getOtherConstraints().clear();
				getOtherConstraints().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
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
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__ACCESS_CONSTRAINTS:
				getAccessConstraints().clear();
				return;
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__USE_CONSTRAINTS:
				getUseConstraints().clear();
				return;
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__OTHER_CONSTRAINTS:
				getOtherConstraints().clear();
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
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__ACCESS_CONSTRAINTS:
				return accessConstraints != null && !accessConstraints.isEmpty();
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__USE_CONSTRAINTS:
				return useConstraints != null && !useConstraints.isEmpty();
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE__OTHER_CONSTRAINTS:
				return otherConstraints != null && !otherConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDLegalConstraintsTypeImpl
