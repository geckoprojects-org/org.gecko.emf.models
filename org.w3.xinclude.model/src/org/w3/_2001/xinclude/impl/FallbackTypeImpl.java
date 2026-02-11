/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.w3._2001.xinclude.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2001.xinclude.FallbackType;
import org.w3._2001.xinclude.IncludePackage;
import org.w3._2001.xinclude.IncludeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fallback Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001.xinclude.impl.FallbackTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.FallbackTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.FallbackTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.FallbackTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.FallbackTypeImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.FallbackTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FallbackTypeImpl extends MinimalEObjectImpl.Container implements FallbackType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FallbackTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IncludePackage.Literals.FALLBACK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, IncludePackage.FALLBACK_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(IncludePackage.Literals.FALLBACK_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IncludeType> getInclude() {
		return getGroup().list(IncludePackage.Literals.FALLBACK_TYPE__INCLUDE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(IncludePackage.Literals.FALLBACK_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny1() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(IncludePackage.Literals.FALLBACK_TYPE__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, IncludePackage.FALLBACK_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IncludePackage.FALLBACK_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case IncludePackage.FALLBACK_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case IncludePackage.FALLBACK_TYPE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case IncludePackage.FALLBACK_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case IncludePackage.FALLBACK_TYPE__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
			case IncludePackage.FALLBACK_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case IncludePackage.FALLBACK_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case IncludePackage.FALLBACK_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case IncludePackage.FALLBACK_TYPE__INCLUDE:
				return getInclude();
			case IncludePackage.FALLBACK_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case IncludePackage.FALLBACK_TYPE__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
			case IncludePackage.FALLBACK_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case IncludePackage.FALLBACK_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case IncludePackage.FALLBACK_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case IncludePackage.FALLBACK_TYPE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends IncludeType>)newValue);
				return;
			case IncludePackage.FALLBACK_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case IncludePackage.FALLBACK_TYPE__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
				return;
			case IncludePackage.FALLBACK_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case IncludePackage.FALLBACK_TYPE__MIXED:
				getMixed().clear();
				return;
			case IncludePackage.FALLBACK_TYPE__GROUP:
				getGroup().clear();
				return;
			case IncludePackage.FALLBACK_TYPE__INCLUDE:
				getInclude().clear();
				return;
			case IncludePackage.FALLBACK_TYPE__ANY:
				getAny().clear();
				return;
			case IncludePackage.FALLBACK_TYPE__ANY1:
				getAny1().clear();
				return;
			case IncludePackage.FALLBACK_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case IncludePackage.FALLBACK_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case IncludePackage.FALLBACK_TYPE__GROUP:
				return !getGroup().isEmpty();
			case IncludePackage.FALLBACK_TYPE__INCLUDE:
				return !getInclude().isEmpty();
			case IncludePackage.FALLBACK_TYPE__ANY:
				return !getAny().isEmpty();
			case IncludePackage.FALLBACK_TYPE__ANY1:
				return !getAny1().isEmpty();
			case IncludePackage.FALLBACK_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //FallbackTypeImpl
